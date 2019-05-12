<template>
    <router-link to="/" class="home-card">
        <div> 
            <img :src="require(`@/assets/icons/${urlIcon}`)"/>
        </div>
        <h3>{{title}}</h3>
    </router-link>
</template>

<script>
export default {
    name: 'homeCard',
    props: {
        urlIcon: String,
        title: String,
        urlRoute: String
    },
}
</script>

<style scoped lang="scss">
    .home-card { 
        margin: 0 2%;
        text-align: center;
        text-decoration: none;
        div {
            position: relative;
            margin: 0 auto;
            border-radius: 100%;
            height: 11rem;
            width: 11rem;
            background-color: #112A37;
            box-shadow: 0px 0px 20px 0px rgba(0,0,0,0.75);
            img { 
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                width: 5.4rem; 
                margin: auto;
            }
        }
        h3 {
            margin: 1rem 0;
            color: #112A37;

        }
    }
</style>
