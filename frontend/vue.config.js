const webpack = require('webpack');
const production = process.env.NODE_ENV === 'production';

module.exports = {

    indexPath: path.resolve(__dirname, '../target/dist/index.html'),
    assetsDir: path.resolve(__dirname, '../target/dist'),
    outputDir: 'dist/',
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
