<script>
import { RouterView } from 'vue-router';
import FormView from './views/FormView.vue';
import FooterToDo from './components/FooterToDo.vue';



export default {
  name: 'App',
  components: {
    RouterView,
    FormView,
    FooterToDo 
  }
}
</script>
<template>
  <div class="fondo">
    <h1 class="display-4 text-center mt-5">TO DO LIST</h1>
    <main>
      <RouterView />
    </main>
    
    <FormView></FormView>
    <FooterToDo> </FooterToDo>
  </div>
</template>



<style>
/* .fondo {
  background-image: url("./assets/fondo.jpg");
  background-repeat: no-repeat;
  background-size: cover;
  height: 100vh;
} */
</style>
