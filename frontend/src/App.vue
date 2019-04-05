<template lang="pug">
el-container#app.is-vertical
  AppHeader
  el-main
    router-view
  AppFooter
</template>

<script>
  import AppHeader from "./components/Header";
  import AppFooter from "./components/Footer";
  export default {
    components: {AppHeader, AppFooter}
  }
</script>


<style lang="scss">
  #app{
      background-color: #E9EEF3;
      color: #333;
      text-align: center;
  }
</style>
