<template>
    <el-row>
        <el-col :span="2">
            <el-menu
                :router="true"
                active-text-color="#63C3A8"
                background-color="#112A37"
                class="sidebar"
                default-active="0"
                text-color="#4F5B68">
                <el-row align="middle" class="logo" justify="center" type="flex">
                    <el-col :span="19">
                        <img alt="Logo Gestão de Atividades" src="../assets/logo_GA.png">
                    </el-col>
                </el-row>
                <el-menu-item :index="item.id.toString()" :key="item.id" :route="item.urlRoute"
                              class="sidebar-item" v-for="item in sidebarItems">
                    <SidebarItem :title="item.title" :urlIcon="item.src"></SidebarItem>
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
                    { id: 0, src: "home-cinza.png", title: "Home", urlRoute: "/dashboard/home" },
                    {
                        id: 1,
                        src: "user-cinza.png",
                        title: "Alunos",
                        urlRoute: "/dashboard/alunos"
                    },
                    {
                        id: 2,
                        src: "folder-cinza.png",
                        title: "Projetos",
                        urlRoute: "/dashboard/projetos"
                    },
                    {
                        id: 3,
                        src: "lab-cinza.png",
                        title: "Grupo de Pesquisa",
                        urlRoute: "/dashboard/grupo_de_pesquisa"
                    },
                    {
                        id: 4,
                        src: "document-cinza.png",
                        title: "Publicações",
                        urlRoute: "/dashboard/publicacoes"
                    },
                    {
                        id: 5,
                        src: "edit-cinza.png",
                        title: "Disciplinas",
                        urlRoute: "/dashboard/disciplinas"
                    }
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
