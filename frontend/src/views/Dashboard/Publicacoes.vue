<template>
    <el-container>
        <Breadcrumb :professor='professor'></Breadcrumb>
    </el-container>
</template>

<script>
import Breadcrumb from '@/components/Breadcrumb.vue';

export default {
    name: "Publicacoes",
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