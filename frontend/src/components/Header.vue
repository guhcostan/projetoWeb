<template lang="html">
    <header class="el-header">
        <router-link to="/" class="logo"><img src="../assets/logo_GA.png"></router-link>
        <nav class="navbar">
            <router-link to="/">Home</router-link>
            <router-link to="about">Sobre</router-link>
            <router-link to="contact">Contato</router-link>
        </nav>
        <router-link to="login" class="login-btn">Login</router-link>
    </header>
</template>

<script>

export default {
  name: 'Header'
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped lang="scss">
    .el-header{
        height: 12vh;
        background-color: #35495E;
        color: #D0D3D6;
        font-size: 2em;
        display: flex;
        align-items: center;
        box-shadow: 0 5px 5px rgba($color: #000000, $alpha: 0.5);
        .logo {
            width: 14rem;
            img {
                padding: 30px 40px;
                width: 38%; 
            }
        }
    }
    .navbar {
        a {
            padding: 1rem;
            text-decoration: none;
            color: #D0D3D6;
        }
    }
    .login-btn {
          margin-left: auto;
          margin-right: 5rem;
          text-decoration: none;
          color: #D0D3D6;
          background-color: #41B883;
          padding: 8px;
          border-radius: 10px;
          border: #D0D3D6 solid 2px;
    }
</style>
