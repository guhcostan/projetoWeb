<template lang="html">
    <header class="header">
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
    .header{
        height: 15vh;
        background-color: #112A37;
        color: #D6D6D6;
        font-size: 1.8em;
        font-weight: 400; 
        display: flex;
        align-items: center;
        box-shadow: 0 5px 5px rgba($color: #000000, $alpha: 0.5);
        .logo {
            padding: 2rem 3.2rem;
            img {
                width: 6rem; 
            }
        }
    }
    .navbar {
        a {
            font-weight: lighter;
            padding: 1rem;
            margin: 0.8rem 1.72rem;
            text-decoration: none;
            color: #D6D6D6;
        }
    }
    .login-btn {
          margin-left: auto;
          margin-right: 5rem;
          text-decoration: none;
          color: #D6D6D6;
          background-color: #63C3A8;
          padding: 1rem 2.6rem;
          font-size: 0.8em;
    }
</style>
