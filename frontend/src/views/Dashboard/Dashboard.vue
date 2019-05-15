<template>
    <el-container>
        <Breadcrumb :professor="professor"></Breadcrumb>
        <el-row class="row" type="flex" justify="center" align="middle">
            <el-col class="dashboard-card" :span="20">
                <el-row>
                    <h1>Informações Gerais</h1>
                    <el-col class="quantitative-array" v-for="(quantitative, index) in quantitatives" :key="index" :span="6">
                        <Quantitative 
                            :isFirst="index === 0 ? true : false" 
                            :quantity="quantitative.quantity" :isLast="index === (quantitatives.length - 1) ? true : false" 
                            :title="quantitative.title">
                        </Quantitative>
                    </el-col>
                </el-row>
            </el-col>
        </el-row>
    </el-container>
</template>

<script>
import Quantitative from '@/components/Quantitative.vue';
import Breadcrumb from '@/components/Breadcrumb.vue';

export default {
    name: "Dashboard",
    data() {
        return {
            quantitatives: [
                { quantity: 0, title: "Alunos" },
                { quantity: 2, title: "Projetos" },
                { quantity: 1, title: "Publicações" },
                { quantity: 3, title: "Disciplinas" },
            ],
            professor: 'Rafael Durelli'
        }
    },
    components: {
        Quantitative,
        Breadcrumb
    }
}
</script>

<style lang="scss" scoped>
    .el-container {
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
</style>