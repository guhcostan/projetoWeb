<template>
    <el-conainer>
        <SideBar></SideBar>
        <el-breadcrumb class="breadcrumb" separator="/">
            <el-breadcrumb-item :to="{ path: '/' }">homepage</el-breadcrumb-item>
            <el-breadcrumb-item><a href="/">promotion management</a></el-breadcrumb-item>
            <el-breadcrumb-item>promotion list</el-breadcrumb-item>
            <el-breadcrumb-item>promotion detail</el-breadcrumb-item>
        </el-breadcrumb>
    </el-conainer>
</template>

<script>
import SideBar from '@/components/SideBar.vue'

export default {
    name: "Dashboard"
}
</script>

<style lang="scss">
    .breadcrumb {
        height: 10vh;
    }
</style>