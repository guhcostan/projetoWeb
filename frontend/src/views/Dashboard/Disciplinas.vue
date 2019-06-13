<template>
    <el-container>
        <el-table :data="aulas">
            <el-table-column label="ID" prop="id"></el-table-column>
            <el-table-column label="NOME" prop="nome"></el-table-column>
            <el-table-column label="TIPO" prop="tipo"></el-table-column>
        </el-table>
    </el-container>
</template>

<script>
    import Breadcrumb from '@/components/Breadcrumb.vue';
    import disciplinaService from '../../services/disciplinaService';

    export default {
        name: 'Sisciplinas',
        data() {
            return {
                professor: 'Rafael Durelli',
                aulas: []
            }
        },
        mounted() {
            disciplinaService.getAulas().then((result) => {
                this.aulas = result.data;
                console.log(result)
            })
        },
        components: {
            Breadcrumb
        }
    }
</script>
