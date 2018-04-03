import Vue from 'vue'
import Router from 'vue-router'
import home from '@/components/home'
import voice from '@/components/voice'
import menuList from '@/components/menu-list'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'home',
      component: home
    },
    {
      path: '/home',
      name: 'home',
      component: home
    },
    {
      path: '/voice',
      name: 'voice',
      component: voice
    },
    {
      path: '/menu-list',
      name: 'menu-list',
      component: menuList
    }
  ]
})
