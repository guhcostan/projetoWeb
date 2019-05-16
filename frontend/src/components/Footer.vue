<template >
    <div class="footer">
        <p>Universidade Federal de Lavras</p>
        <p>Departamento de Ciência da Computação</p>
    </div>
</template>

<script>
export default {
  name: 'Footer'
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">

    .footer{
        display: flex;
        justify-content: center;
        flex-direction: column;
        align-items: center;
        height: 9.8vh;
        border-top: #112A37 solid 2px;
        color: #112A37;
        background-color: #D6D6D6;
        p {
            margin: 0;
        }
    }
</style>
