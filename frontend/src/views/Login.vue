<template>
    <el-main class="container">
        <el-row class="row" type="flex" justify="center" align="middle">
            <el-col class="login-form" :span="12" :xs="22" :md="8">
                <div class="grid-content">
                    <h1>Login</h1>
                    <el-form ref="form" :model="loginForm">
                        <el-form-item>
                            <el-input v-model="loginForm.name" placeholder="User Name" suffix-icon="el-icon-date"></el-input>
                        </el-form-item>
                        <el-form-item>
                            <el-input type="password" v-model="loginForm.password" placeholder="************" suffix-icon="el-icon-lock"></el-input>
                        </el-form-item>
                        <el-form-item>
                            <el-button class="login-btn" @click="login()">Entrar</el-button>
                        </el-form-item>
                    </el-form>
                </div>
            </el-col>
        </el-row>
    </el-main>
</template>

<script>
export default {
    name: "Login",
    data() {
        return {
            loginForm: {
                name: '',
                password: ''
            }
        }
    },
    methods: {
        login() {
            this.$root.$emit('is-logged');
            this.$router.push('/dashboard');
        }
    }
}
</script>

<style lang="scss">
    .container {
        background-color: #E4E6E9;
        height: 75vh;
        color: #112A37;
        position: relative;
        margin: 0;
        padding: 0;
        .row {
            height: inherit;
            .login-form {
                border: 2px solid white;
                border-radius: 10px;
                padding: 3rem;
                ::placeholder { /* Chrome, Firefox, Opera, Safari 10.1+ */
                    color: grey;
                    opacity: 1; /* Firefox */
                    text-transform: uppercase;
                }
                h1 {
                    margin-bottom: 2rem;
                }
                input {
                    border-radius: 0;
                    border: 0 solid white;
                    text-transform: none;
                }
            }
            .login-btn {
                width: 100%;
                border-radius: 0;
                color: white;
                background-color: #63C3A8;
                font-size: 1.8rem;
            }
        }
    }
</style>