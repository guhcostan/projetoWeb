import toastr from 'toastr';

toastr.options = {
    'closeButton': false,
    'debug': false,
    'newestOnTop': false,
    'progressBar': false,
    // 'positionClass': 'toast-top-center',
    'preventDuplicates': false,
    'onclick': null,
    'showDuration': '300',
    'hideDuration': '1000',
    'timeOut': '5000',
    'extendedTimeOut': '1000',
    'showEasing': 'swing',
    'hideEasing': 'linear',
    'showMethod': 'fadeIn',
    'hideMethod': 'fadeOut'
};

export default class Alert {

    static success(msg) {
        toastr.success(msg, 'Sucesso');
    }

    static error(msg, options) {
        toastr.error(msg, 'Erro', options || {});
    }

    static info(msg) {
        toastr.info(msg, 'Aviso');
    }

    static warning(msg) {
        toastr.info(msg, 'Aviso');
    }

}
