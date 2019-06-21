export default class Loading {
    static _getSpinnerHTML(msg) {

        return '<div class="spinner">' +
            '<div class="rect1"></div>' +
            '<div class="rect2"></div>' +
            '<div class="rect3"></div>' +
            '<div class="rect4"></div>' +
            '<div class="rect5"></div>' +
            '</div>' +
            '<span class="spinner-text">' + msg + '</span>';
    }

    static show(msg, element) {

        msg = msg || 'Carregando';

        var options = {
            message: this._getSpinnerHTML(msg),
            baseZ: 10000,
            overlayCSS: {
                backgroundColor: '#FFFFFF',
                opacity: 0.8,
                cursor: 'wait'
            },
            css: {
                backgroundColor: 'transparent',
                border: 'none'
            }
        };

        if (!element) {

            $.blockUI(options);

        } else {

            options.css.width = '100%';
            $(element).block(options);
        }
    }

    static hide(element) {

        if (!element) {
            $.unblockUI();
        } else {
            $(element).unblock();
        }
    }
}
