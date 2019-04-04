const webpack = require('webpack');
const development = process.env.NODE_ENV === 'development';
const httpPath = process.env.VUE_APP_HTTP_PATH;

module.exports = {

    outputDir: '../backend/src/main/resources/public/',
    assetsDir: 'static',
    publicPath: development ? '/' : httpPath,
    runtimeCompiler: true,

    // configure webpack-dev-server behavior
    devServer: {
        open: process.platform === 'darwin',
        host: '0.0.0.0',
        port: 8080,
        https: false,
        hotOnly: false,
        proxy: {
            '/': {
                target: 'http://localhost:9666',
                changeOrigin: true,
                ws: true
            }
        },

    },

    css: {
        loaderOptions: {
            sass: {
                data: `
   
        `
            }
        }
    },

    configureWebpack: {
        plugins: [
            new webpack.ProvidePlugin({
                '$': 'jquery',
                jQuery: 'jquery'
            })
        ]
    }
};
