<template>
    <el-container>
        <div class="head">
            <el-breadcrumb class="breadcrumb" separator="/">
                <el-breadcrumb-item class="padding-left" :to="{ path: '/' }">Home</el-breadcrumb-item>
                <el-breadcrumb-item>Dashboard</el-breadcrumb-item>
            </el-breadcrumb>
            <div class="professor">
                <p>{{professor}}</p>
                <img src="../../assets/icons/go-cinza.png" alt="" class="back-btn">
            </div>
        </div>
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
        Quantitative
    }
}
</script>

<style lang="scss" scoped>
    .el-container {
        height: 100vh;
    }
    .head {
        height: 15vh;
        background-color: #F9F9FA;
        display: flex;
        font-size: 1.4rem;
        .breadcrumb {
            color: #D9DCE1;
            flex: 1;
            height: inherit;
            line-height: 15vh;
            .padding-left {
                padding-left: 4rem;
            }
        }
        .professor {
            flex: 0 0 25%;
            color: #6D6E76;
            height: inherit;
            line-height: 15vh;
            p {
                margin: 0;
                display: inline-block;
            }
            .back-btn {
                position: absolute;
                top: 7.5%;
                transform: translateY(-50%);
                width: 1.8rem;
            }
        }
    }
    .row {
        height: 85vh;
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