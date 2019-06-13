<template>
    <el-container>
        <Breadcrumb :professor="professor"></Breadcrumb>
        <el-row class="row" type="flex" justify="space-between" align="middle">
            <el-col class="aluno-head" :span="25">
                <h1>Alunos</h1>
            </el-col>
            <el-col :span="25">
                <router-link to="/cadastrar_aluno" class="cadastrar-aluno-btn">Cadastrar</router-link>
            </el-col>
        </el-row>
    </el-container>
</template>

<script>
import Breadcrumb from '@/components/Breadcrumb.vue';

export default {
    name: "Alunos",
    data() {
        return {
            professor: 'Rafael Durelli'
        }
    },
    components: {
        Breadcrumb
    }
}
</script>

<style lang="scss">
    .el-container {
        height: 70vh;
    }
    .row {
        padding: 25px 0px;
        h1 {
                padding: 60px;
                font-size: 2rem;
                font-weight: lighter;
            }
        .cadastrar-aluno-btn {
            margin-right: 60px;
            text-decoration: none;
            color: #FFFFFF;
            background-color: #63C3A8;
            padding: 1rem 2.6rem;
            font-size: 1.2em;
        }
    }
</style>