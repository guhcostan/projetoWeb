<template>
    <el-container>
        <Breadcrumb :professor="professor"></Breadcrumb>
        <router-view class="content"></router-view>
    </el-container>
</template>

<script>
    import Breadcrumb from '@/components/Breadcrumb.vue';

    export default {
        name: "Dashboard",
        data() {
            return {
                quantitatives: [
                    {quantity: 0, title: "Alunos"},
                    {quantity: 2, title: "Projetos"},
                    {quantity: 1, title: "Publicações"},
                    {quantity: 3, title: "Disciplinas"},
                ],
                professor: 'Rafael Durelli'
            }
        },
        components: {
            Breadcrumb
        }
    }
</script>

<style lang="scss" scoped>
    .el-container {
        background-color: white;
        height: 100vh;
    }

    .row {
        height: 70vh;

        .dashboard-card {
            border: 1px solid white;
            border-radius: 15px;
            padding: 50px;

            h1 {
                font-size: 2rem;
                margin-bottom: 4rem;
                font-weight: lighter;
            }

            .quantitative-array {
                padding: 25px 0;
                background-color: #fff;
            }
        }
    }

    .content {
        padding: 20px;
        display: flex;
        height: fit-content;
        background-color: white;
    }
</style>
