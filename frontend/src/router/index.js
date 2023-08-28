import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import FormView from '../views/FormView.vue'
// import FormPage from '../components/FormPage.vue' no hace falta?

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/update',
      name: 'form',
      // route level code-splitting
      // this generates a separate chunk (About.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component:FormView
    }
  ]
})

export default router
