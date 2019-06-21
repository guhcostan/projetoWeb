import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'

import 'jquery/dist/jquery.min.js';
import 'blockui/jquery.blockui.min';
import '@/styles/main.scss';

import ElementUI from 'element-ui';
import locale from 'element-ui/lib/locale/lang/en'

Vue.prototype.$bus = new Vue();

Vue.config.productionTip = false;

Vue.use(ElementUI, { locale });

new Vue({
    router,
    store,
    render: function (h) {
        return h(App)
    }
}).$mount('#app');
