<template lang="pug">
    #helloWorld
        el-button(@click="pingBack()") Teste
</template>

<script>
import http from "../utils/http";

export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
    methods: {
        pingBack(){
            http.get({url: '/teste'}).then((data) =>
            {
                console.log(data)
            });
        }
    }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
    #helloWorld{
        text-align: center;
    }
</style>
