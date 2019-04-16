<template>
  <div id="home" class="container">
    <HomeCard v-for:"icon in homeIcons" :src="icon.src"></HomeCard>
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
        { id: 0, src: "@/assets/loo_GA.png" },
        { id: 1, src: "@/assets/loo_GA.png" },
        { id: 2, src: "@/assets/loo_GA.png" },
        { id: 3, src: "@/assets/loo_GA.png" }
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

