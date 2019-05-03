<template lang="pug">
    #formularioAluno
        h1 Formulario de {{tipo}}
        el-input(label="Nome")
        el-input(label="Cpf")
        el-input(label="Sobrenome")
        el-button Cadastrar aluno
</template>

<script>
    export default {
        name: "FormularioAluno",
        props: {
            tipo: {
                type: String,
                required: true
            }
        }
    }
</script>

<style scoped>

</style>