<template>
    <div class="home-card"> 
        <img :src="home.icon"/>
    </div>
</template>

<script>
export default {
    name: 'homeCard',
    props: ['icon']
}
</script>

<style>
    .home-card {
        height: 11rem;
        width: 11rem;
        border-radius: 100%;
        background-color: #35495E;
        margin: 0 2%;
        box-shadow: 0px 0px 20px 0px rgba(0,0,0,0.75);
    }
</style>
