const webpack = require('webpack');
const httpPath = process.env.VUE_APP_HTTP_PATH;
const development = process.env.NODE_ENV === 'development';

module.exports = {

    outputDir: './target/public',
    indexPath: './index.html',
    publicPath: development ? '/' : httpPath ,
    runtimeCompiler: true,


    // configure webpack-dev-server behavior
    devServer: {
        open: process.platform === 'darwin',
        host: '0.0.0.0',
        port: 8080,
        https: false,
        hotOnly: false,
        proxy: {
            [httpPath]: {
                target: 'http://localhost:9655/',
                changeOrigin: false
            }
        }
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
