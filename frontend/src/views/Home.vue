<template>
    <div class="container" id="home">
        <h1 class="title">Gestão de atividades</h1>
        <h2 class="professor">Professor Rafael Durelli</h2>
        <div class="cardContainer">
            <HomeCard :key="card.id" :title="card.title" :urlIcon="card.src"
                      v-for="card in homeCards"></HomeCard>
        </div>
    </div>
</template>

<script>
    // @ is an alias to /src
    import HomeCard from '@/components/HomeCard.vue'

    export default {
        name: 'home',
        data: function () {
            return {
                homeCards: [
                    { id: 0, src: "folder-cinza.png", title: "Projetos" },
                    { id: 1, src: "lab-cinza.png", title: "Grupo de Pesquisa" },
                    { id: 2, src: "document-cinza.png", title: "Publicações" },
                    { id: 3, src: "edit-cinza.png", title: "Disciplinas" }
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
        flex-direction: column;
        background-color: #E4E6E9;
        height: 75vh;
        color: #112A37;

        .title {
            text-align: center;
            font-weight: bolder;
            font-size: 3rem;
        }

        .professor {
            text-align: center;
        }
    }

    .cardContainer {
        display: flex;
        justify-content: center;
        align-items: center;
        margin: 5rem 0;
    }
</style>

