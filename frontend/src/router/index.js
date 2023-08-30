import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import FormPage from '../components/FormPage.vue'
import TaskToDo from '../components/TaskToDo.vue'


const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },

    {
      path: '/',
      name: 'table',
      component: TaskToDo
    },

    
    
    

    {
      
        path: '/update',
        name: 'form',
        component:FormPage
        
    }

   

  ]
});

export default router
