<template lang="pug">
    .sobre
        .titulo-pagina CONTATO
        .card-sobre
            el-form
                el-form-item(label="NOME:")
                    el-input
                el-form-item(label="EMAIL:")
                    el-input
                el-form-item(label="MENSAGEM:")
                    el-input
                el-form-item
                    el-button.botao-enviar ENVIAR

</template>

<script>
    export default {
        name: "Contact"
    }
</script>

<style lang="scss">
    .sobre {
        width: 30%;
        margin: 0 auto;
        padding: 100px 0;
        color: #112A37;

        .card-sobre {
            border: solid white 2px;
            border-radius: 10px;
            padding: 40px 20px;
        }

        .texto {
            font-size: 25px;
            padding-left: 10px;

            font-weight: lighter;
        }

        .el-row {
            padding: 20px;
        }

        .title {
            font-weight: bold;
        }

        .titulo-pagina {
            padding-bottom: 30px;
            font-size: 50px;
            font-weight: lighter;
        }
    }
</style>
