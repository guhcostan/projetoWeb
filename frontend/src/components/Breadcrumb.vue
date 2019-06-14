<template>
    <div class="head">
        <el-breadcrumb class="breadcrumb" separator="/">
            <el-breadcrumb-item class="padding-left">Home</el-breadcrumb-item>
            <el-breadcrumb-item :key="index" v-for="(path, index) in currentPath">{{
                path.replace(/_/g, '
                ') }}
            </el-breadcrumb-item>
        </el-breadcrumb>
        <div class="professor">
            <p>{{professor}}</p>
            <img @click="logOut()" alt="" class="back-btn" src="../assets/icons/go-cinza.png">
        </div>
    </div>
</template>

<script>
    export default {
        name: 'Breadcrumb',
        data() {
            return {
                currentPath: ''
            }
        },
        props: {
            professor: String
        },
        methods: {
            logOut() {
                this.$root.$emit('is-logged');
                this.$router.push('/');
            }
        },
        watch: {
            '$route'(to, from) {
                this.currentPath = this.$route.path.split('/').splice(1);
            }
        },
        mounted() {
            const path = this.$route.path.split('/').splice(1);
            this.currentPath = path;
        }
    }
</script>

<style lang="scss" scoped>
    .head {
        background-color: #F9F9FA;
        display: flex;

        .breadcrumb {
            color: #D9DCE1;
            flex: 1;
            line-height: 15vh;
            font-size: 1.4rem !important;

            .padding-left {
                padding-left: 4rem;
            }
        }

        .professor {
            flex: 0 0 18%;
            color: #6D6E76;
            height: inherit;
            line-height: 15vh;

            p {
                font-size: 1.8rem;
                text-transform: none;
                margin: 0;
                display: inline-block;
            }

            .back-btn {
                position: absolute;
                top: 7.5%;
                transform: translateY(-50%);
                width: 1.8rem;
                cursor: pointer;
            }
        }
    }
</style>
