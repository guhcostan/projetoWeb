<template>
    <el-container>
        <el-row align="middle" class="row" justify="center" type="flex">
            <el-col :span="20" class="dashboard-card">
                <el-row>
                    <h1>Informações Gerais</h1>
                    <el-col :key="index" :span="6" class="quantitative-array"
                            v-for="(quantitative, index) in quantitatives">
                        <Quantitative
                            :isFirst="index === 0 ? true : false"
                            :isLast="index === (quantitatives.length - 1) ? true : false"
                            :quantity="quantitative.quantity"
                            :title="quantitative.title">
                        </Quantitative>
                    </el-col>
                </el-row>
            </el-col>
        </el-row>
    </el-container>
</template>

<script>
    export default {
        name: "Home"
    }
</script>

<style scoped>

</style>
