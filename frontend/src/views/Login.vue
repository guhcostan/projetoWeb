<template>
    <el-main class="container">
        <el-row align="middle" class="row" justify="center" type="flex">
            <el-col :md="8" :span="12" :xs="22" class="login-form">
                <div class="grid-content">
                    <h1>Login</h1>
                    <el-form :model="loginForm" ref="form">
                        <el-form-item>
                            <el-input placeholder="User Name" suffix-icon="el-icon-date"
                                      v-model="loginForm.name"></el-input>
                        </el-form-item>
                        <el-form-item>
                            <el-input placeholder="************" suffix-icon="el-icon-lock"
                                      type="password"
                                      v-model="loginForm.password"></el-input>
                        </el-form-item>
                        <el-form-item>
                            <el-button @click="login()" class="login-btn">Entrar</el-button>
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
                this.$router.push('/dashboard/home');
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
