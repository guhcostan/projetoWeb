import http from '../utils/http';

export default {

    getAulas() {

        return http.get({
            url: '/aulas',
            lockMessage: 'Aguarde carregando aulas ...'
        });

    }
};
