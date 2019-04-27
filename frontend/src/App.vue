<template lang="pug">
  #app
    div
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
