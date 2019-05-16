<template>
    <el-row type="flex" justify="center" align="middle">
        <el-col class="quantitative" :class="{ 'first-quantitative': isFirst, 'last-quantitative': isLast }" :span="24">
            <h1>{{quantity}}</h1>
            <p>{{title}}</p>
        </el-col>
    </el-row>
</template>

<script>
export default {
    name: 'Quantitative',
    props: {
        quantity: Number,
        title: String,
        isFirst: Boolean,
        isLast: Boolean
    }
}
</script>

<style lang="scss" scoped>
    .quantitative {
        text-align: center;
        color: #112A37;
        background-color: #FFF;
        border-right: 1px solid #112A37;
        h1 {
            font-size: 4.5rem;
            font-weight: bolder;
        }
        p {
            font-size: 1.4rem;
        }
    }
    .first-quantitative {
        border-left: 1px solid #112A37;
        margin-left: 20px;
    }
    .last-quantitative {
        margin-right: 20px;
    }
</style>
