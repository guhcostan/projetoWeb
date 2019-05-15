import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router)

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
      component: () => import('./views/Dashboard/Dashboard.vue'),
    },
    {
      path: '/dashboard/alunos',
      name: 'alunos',
      component: () => import('./views/Dashboard/Alunos.vue')
    },
    {
      path: '/dashboard/projetos',
      name: 'projetos',
      component: () => import('./views/Dashboard/Projetos.vue')
    },
    {
      path: '/dashboard/pesquisa',
      name: 'pesquisa',
      component: () => import('./views/Dashboard/Pesquisa.vue')
    },
    {
      path: '/dashboard/publicacoes',
      name: 'publicacoes',
      component: () => import('./views/Dashboard/Publicacoes.vue')
    },
    {
      path: '/dashboard/disciplinas',
      name: 'disciplinas',
      component: () => import('./views/Dashboard/Disciplinas.vue')
    }
  ]
})
