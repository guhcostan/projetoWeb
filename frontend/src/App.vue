<template>
    <div id="app">
        <div v-if="!login">
            <AppHeader></AppHeader>
            <div class="view">
                <router-view></router-view>
            </div>
            <AppFooter></AppFooter>
        </div>
        <div v-else>
            <SideBar></SideBar>
            <div class="view">
                <router-view></router-view>
            </div>
        </div>
    </div>
</template>

<script>
  import AppHeader from "./components/Header";
  import AppFooter from "./components/Footer";
  import SideBar from "./components/SideBar";

  export default {
        props: {
            login: Boolean
        },
        methods: {
            isLogged() {
                this.login = !this.login;
            }
        },
        mounted() {
            this.$root.$on('is-logged', this.isLogged);
        },
        components: {AppHeader, AppFooter, SideBar}
    }
</script>


<style lang="scss">
    #app {
        .view {
            width: 100%;
        }
    }
</style>
