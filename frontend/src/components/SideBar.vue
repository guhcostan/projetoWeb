<template>
    <el-row>
        <el-col :span="2">
            <el-menu
                class="sidebar"
                background-color="#112A37"
                text-color="#4F5B68"
                active-text-color="#63C3A8"
                default-active="0"
                :router="true">
                <el-row class="logo" type="flex" justify="center" align="middle">
                    <el-col :span="19">
                        <img src="../assets/logo_GA.png" alt="Logo Gestão de Atividades">
                    </el-col>
                </el-row>
                <el-menu-item class="sidebar-item" v-for="item in sidebarItems" :key="item.id" :index="item.id.toString()" :route="item.urlRoute">
                    <SidebarItem :urlIcon="item.src" :title="item.title"></SidebarItem>
                </el-menu-item>
            </el-menu>
        </el-col>
    </el-row>
</template>

<script>
    import SidebarItem from '@/components/SidebarItem.vue'

    export default {
        name: 'sideBar',
        data() {
            return {
                sidebarItems: [
                    { id: 0, src: "home-cinza.png", title: "Home", urlRoute: "/dashboard" },
                    { id: 1, src: "user-cinza.png", title: "Alunos", urlRoute: "/dashboard/alunos" },
                    { id: 2, src: "folder-cinza.png", title: "Projetos", urlRoute: "/dashboard/projetos" },
                    { id: 3, src: "lab-cinza.png", title: "Grupo de Pesquisa", urlRoute: "/dashboard/pesquisa" },
                    { id: 4, src: "document-cinza.png", title: "Publicações", urlRoute: "/dashboard/publicacoes" },
                    { id: 5, src: "edit-cinza.png", title: "Disciplinas", urlRoute: "/dashboard/disciplinas" }
                ]
            }
        },
        components: {
            SidebarItem
        }
    }
</script>

<style lang="scss">
    .logo {
        .el-col {
            display: flex;
            justify-content: center;
            align-items: center;
            text-align: center;
            border-bottom: 1px solid #4F5B68;
            // padding: 2rem 0 2rem 0;
            height: 15vh;
            img {
                width: 6rem; 
            }
        }
    }    
    .sidebar {
        height: 100vh;
    }
    .sidebar-item {
        height: auto !important;
    }
    .is-active {
        border-left: 3px solid #63C3A8;
        img {
            filter: hue-rotate(304deg) saturate(2.5) brightness(195%);
        }
    }
    .el-row:after, .el-row:before {
        display: none !important;
    }
</style>
