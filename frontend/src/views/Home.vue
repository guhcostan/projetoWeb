<template>
  <div id="home" class="container">
    <HomeCard v-for="icon in homeIcons" :icon="icon.src"></HomeCard>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
import HomeCard from '@/components/HomeCard.vue'

export default {
  name: 'home',
  data: function() {
    return {
      homeIcons: [
        { id: 0, src: "../assests/folder-cinza.png" },
        { id: 1, src: "img/lab-cinza.png" },
        { id: 2, src: "img/document-cinza.png" },
        { id: 3, src: "img/edit-cinza.png" }
      ]
    }
  },
  components: {
    HomeCard
  }
}
</script>

<style lang="scss" scoped>
  .container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 75vh;
    background-color: #f4f4f4;
  }
</style>

