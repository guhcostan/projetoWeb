<template>
    <el-container>
        <Breadcrumb :professor='professor'></Breadcrumb>
        <el-row type="flex" justify="center" align="middle">
            <el-col class="cadastro-form" :span="14" :xs="24" :md="10">
                <div class="grid-content">
                    <h1>Cadastrar Aluno</h1>
                    <el-form ref="form" :label-position="top" :model="alunoForm">
                        <el-form-item label="Nome do Aluno:">
                            <el-input v-model="alunoForm.nome"></el-input>
                        </el-form-item>
                        <el-form-item label="Matrícula:">
                            <el-input v-model="alunoForm.matricula"></el-input>
                        </el-form-item>
                        <el-form-item class="display-categoria" label="Categoria:">
                            <el-select v-model="alunoForm.categoria" placeholder="Selecione a categoria">
                                <el-option label="Iniciação Científica" value="iniciacao-cientifica"></el-option>
                                <el-option label="Mestrado" value="mestrado"></el-option>
                                <el-option label="Doutorado" value="doutorado"></el-option>
                                <el-option label="Pós-Doutorado" value="pos-doutorado"></el-option>
                            </el-select>
                        </el-form-item>
                        <el-form-item>
                            <el-button class="cadastrar-btn" @click="onSubmit"> Salvar </el-button>
                            <el-button class="cadastrar-btn"> Cancelar </el-button>
                        </el-form-item>
                    </el-form>
                </div>
            </el-col>
        </el-row>
    </el-container>
</template>

<script>
import Breadcrumb from '@/components/Breadcrumb.vue';

export default {
    name: "Cadastrar",
    data() {
        return {
            professor: 'Rafael Durelli',
            alunoForm: {
                nome: '',
                matricula: '',
                categoria: ''
            }
        }
    },
    methods: {
        onSubmit() {
            console.log('submit!');
        }
    },
    components: {
        Breadcrumb
    }
}
</script>

<style lang="scss">
    .cadastro-form {
        margin: 60px;
        border: 1px solid white;
        border-radius: 10px;
        padding: 3rem, ;
        h1 {
            font-size: 2rem;
            font-weight: lighter;
            padding-bottom: 2rem;
        }
    }
    .cadastrar-btn {
        border-radius: 0;
        margin-top: 3rem;
        margin-left: 1rem;
        text-decoration: none;
        color: #FFFFFF;
        background-color: #63C3A8;
        padding: 1rem 2rem;
        font-size: 1em;
        float:right
    } 
    .display-categoria {
        display: inline-block;
    }

</style>