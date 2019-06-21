import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);

export default new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [
        {
            path: '/',
            name: 'home',
            component: () => import('./views/Home.vue')
        },
        {
            path: '/about',
            name: 'about',
            component: () => import('./views/About.vue')
        },
        {
            path: '/contact',
            name: 'contact',
            component: () => import('./views/Contact.vue')
        },
        {
            path: '/login',
            name: 'login',
            component: () => import('./views/Login.vue')
        },
        {
            path: '/dashboard',
            name: 'dashboard',
            component: () => import('./views/Dashboard.vue'),
            children: [
                {
                    path: 'home',
                    name: 'home',
                    component: () => import('./views/Dashboard/Home.vue')
                },
                {
                    path: 'alunos',
                    name: 'alunos',
                    component: () => import('./views/Dashboard/Alunos.vue')
                },
                {
                    path: 'projetos',
                    name: 'projetos',
                    component: () => import('./views/Dashboard/Projetos.vue')
                },
                {
                    path: 'grupo_de_pesquisa',
                    name: 'pesquisa',
                    component: () => import('./views/Dashboard/Pesquisa.vue')
                },
                {
                    path: '/cadastrar_aluno',
                    name: 'cadastrar_aluno',
                    component: () => import('./views/Dashboard/CadastrarAluno.vue')
                },
                {
                    path: 'publicacoes',
                    name: 'publicacoes',
                    component: () => import('./views/Dashboard/Publicacoes.vue')
                },
                {
                    path: 'disciplinas',
                    name: 'disciplinas',
                    component: () => import('./views/Dashboard/Disciplinas.vue')
                }
            ]
        }
    ]
})
