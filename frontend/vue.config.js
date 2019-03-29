const webpack = require('webpack');
const production = process.env.NODE_ENV === 'production';

module.exports = {

    outputDir: 'dist/',
    indexPath: './index.html',
    assetsDir:'static/',
    publicPath: production ? '/projetoweb' : '.',
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
                changeOrigin: false,
                ws: false
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
