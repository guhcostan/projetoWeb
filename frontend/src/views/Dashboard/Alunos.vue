<template>
    <el-container>
        <el-breadcrumb class="breadcrumb" separator="/">
            <el-breadcrumb-item :to="{ path: '/' }">homepage</el-breadcrumb-item>
            <el-breadcrumb-item><a href="/">promotion management</a></el-breadcrumb-item>
            <el-breadcrumb-item>promotion list</el-breadcrumb-item>
            <el-breadcrumb-item>promotion detail</el-breadcrumb-item>
        </el-breadcrumb>
    </el-container>
</template>

<script>
export default {
    name: "Alunos",
}
</script>

<style lang="scss">
    .el-container {
        height: 100vh;
    }
</style>