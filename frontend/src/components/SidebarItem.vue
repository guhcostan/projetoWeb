<template>
    <el-row align="middle" justify="center" type="flex">
        <el-col>
            <img :src="require(`@/assets/icons/${urlIcon}`)" class="sidebar-icon"/>
            <p class="title">{{title}}</p>
        </el-col>
    </el-row>
</template>

<script>
    export default {
        name: 'sidebarItem',
        props: {
            urlIcon: String,
            title: String,
            urlRoute: String
        }
    }
</script>

<style lang="scss">
    .sidebar-item {
        text-align: center;
        line-height: normal !important;

        .sidebar-icon {
            padding-top: 1rem;
            width: 4rem;
            height: 4rem;
        }

        .title {
            border-bottom: 1px solid #4F5B68;
            margin: 0;
            padding: 1rem 0;
            white-space: normal;
        }
    }
</style>
