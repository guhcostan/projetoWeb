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
      children: [
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
          path: 'pesquisa',
          name: 'pesquisa',
          component: () => import('./views/Dashboard/Pesquisa.vue')
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
    },
  ]
})
