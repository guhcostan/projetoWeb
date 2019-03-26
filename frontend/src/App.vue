<template lang="pug">
  #app
    el-container
      AppHeader
      .view
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
    .view{
      width: 100%;
    }
  }
</style>
