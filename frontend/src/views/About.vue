<template lang="pug">
    .sobre
        .titulo-pagina INFORMACOES
        .card-sobre
            el-row(type="flex")
                .title.texto PROFESSOR:
                .texto RAFAEL DURELLI
            el-row
                .title.texto FORMACAO:
                .texto DOUTORADO EM CIENCIAS DA COMPUTACAO E MATEMATICA COMPUTACIONAL. USP, BRASIL(2016).
            el-row(type="flex")
                .title.texto SALA:
            el-row(type="flex")
                .title.texto TELEFONE:
            el-row(type="flex")
                .title.texto EMAIL:
                .texto RAFAEL.DURELLI@UFLA.BR
</template>

<script>
    export default {
        name: "About"
    }
</script>

<style lang="scss">
    .sobre {
        width: 80%;
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
