<template>
    <el-container id="alunos">
        <el-row class="row" type="flex" justify="space-between" align="middle">
            <el-col class="aluno-head" :span="24" :md="5">
                <h1>Alunos</h1>
            </el-col>
            <el-col :span="24" :md="5">
                <el-button class="cadastrar-aluno-btn" @click="$router.push('/cadastrar_aluno');"> Cadastrar</el-button>
            </el-col>
        </el-row>
    </el-container>
</template>

<script>
    export default {
        name: "Alunos",
        data() {
            return {
                professor: 'Rafael Durelli'
            }
        }
    }
</script>

<style lang="scss">
    #alunos {

        .el-container {
            height: 70vh;
        }

        .row {
            padding: 20px 0px;
            width: 100%;

            h1 {
                padding: 60px;
                font-size: 2rem;
                font-weight: lighter;
            }

            .cadastrar-aluno-btn {
                border-radius: 0;
                text-decoration: none;
                color: #FFFFFF;
                background-color: #63C3A8;
                padding: 1rem 2.6rem;
                font-size: 1.2em;
            }
        }
    }
</style>
