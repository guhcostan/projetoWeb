<template>
    <el-container>
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
        height: 100vh;
    }
</style>
