const webpack = require('webpack');
const production = process.env.NODE_ENV === 'production';

module.exports = {

    indexPath: 'target/dist/index.html',
    outputDir: 'target/dist',
    assetsDir: 'static',
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
