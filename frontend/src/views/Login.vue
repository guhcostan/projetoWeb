<template>
    <el-main class="container">
        <el-row class="row-bg login-form">
            <el-col :span="24">
                <div class="grid-content">
                    <h3>Login</h3>
                    <el-form ref="form" :model="form">
                        <el-form-item>
                            <el-input v-model="form.name" placeholder="Activity name"></el-input>
                            <i class="el-icon-user-solid"></i>
                        </el-form-item>
                        <el-form-item>
                            <el-input v-model="form.password" placeholder="Activity name"></el-input>
                        </el-form-item>
                        <el-form-item>
                            <el-button @click="onSubmit">Login</el-button>
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
            form: {
                name: '',
                password: ''
            }
        }
    },
    methods: {
      onSubmit() {
        console.log('submit!');
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
        .login-form {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            border: 2px solid white;
            border-radius: 10px;
            padding: 3rem;
            h3 {
                margin-bottom: 0.6rem;
            }
        }
    }
</style>