<template >
    <div class="el-footer">
        <p>Universidade Federal e Lavras</p>
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

    .el-footer{
        display: flex;
        justify-content: center;
        flex-direction: column;
        height: 80px;
        border-top: #35495E solid 2px;
        color: #35495E;
        text-align: center;
    }
</style>
