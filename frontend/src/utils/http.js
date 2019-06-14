import loading from '@/utils/loading';
import axios from 'axios';
import alert from '@/utils/alert';

import router from '@/router';

const BASE_URL = process.env.VUE_APP_HTTP_PATH;

axios.defaults.timeout = 3600000;

let stackLoading = 0;

const HttpStatus = {
    UNAUTHORIZED: 401,
    FORBIDDEN: 403
};

const showLoading = (options) => {

    loading.show(options.lockMessage, options.lockElement);
    stackLoading++;
};

const hideLoading = () => {

    stackLoading--;

    if (stackLoading <= 0) {

        stackLoading = 0;
        loading.hide();
    }
};

export default class Http {

    static baseURL() {
        return BASE_URL;
    }

    static _getOptionValue(options, prop, defaultValue) {

        if (!options || !options.hasOwnProperty(prop)) {
            return defaultValue;
        } else {
            return options[prop];
        }
    }

    static _handleRequestPromisse(promisse, options) {

        setTimeout(function () {
            promisse.then(response => {
                if (options.lockScreen) {

                    hideLoading();
                }

                if (options.success) {
                    options.success(response.data);
                }

            }).catch(error => {

                if (options.lockScreen) {

                    hideLoading();
                }

                if (error.request.status === HttpStatus.UNAUTHORIZED) {

                    /**
                     * Redirecionamento para a página principal após a notificação sumir.
                     */

                    alert.error(error.response.data, {
                        onHidden: () => {
                            router.push({
                                path: '/'
                            });
                        }
                    });

                    return;
                }

                if (options.error) {

                    options.error(error.response);
                    return;
                }

                alert.error(error.response.data.texto);

            });
        }, 1000);
    }

    static _setDefaultOptions(options) {

        options = options || {};
        options.fullUrl = this.baseURL() + options.url;
        options.lockScreen = Http._getOptionValue(options, 'lockScreen', true);
        options.lockMessage = options.lockMessage || 'Carregando';

        return options;
    }

    static get(options) {

        options = Http._setDefaultOptions(options);

        if (options.lockScreen) {

            showLoading(options);
        }

        var promisse = options.data ? axios.get(options.fullUrl,
            { params: options.data }) : axios.get(
            options.fullUrl);

        Http._handleRequestPromisse(promisse, options);

        return promisse;
    }

    static post(options) {

        options = Http._setDefaultOptions(options);

        if (options.lockScreen) {

            showLoading(options);
        }

        var promisse = axios.post(options.fullUrl, options.data);

        Http._handleRequestPromisse(promisse, options);

        return promisse;
    }

    static delete(options) {

        options = Http._setDefaultOptions(options);

        if (options.lockScreen) {

            showLoading(options);
        }

        var promisse = options.data ? axios.delete(options.fullUrl,
            { params: options.data }) : axios.delete(options.fullUrl);

        Http._handleRequestPromisse(promisse, options);

        return promisse;
    }

    static put(options) {

        options = Http._setDefaultOptions(options);

        if (options.lockScreen) {

            showLoading(options);
        }

        var promisse = axios.put(options.fullUrl, options.data);

        Http._handleRequestPromisse(promisse, options);

        return promisse;
    }
}
