<script>
import { RouterView } from 'vue-router';
import FooterToDo from './components/FooterToDo.vue';



export default {
  name: 'App',
  components: {
    RouterView,
    FooterToDo 
  }
}
</script>
<template>
  <div  class="fondo">
    <h1 class="display-4 text-center mt-5">TO DO LIST desde APP.vue</h1>
    <main>
      <RouterView />
      <FooterToDo/>
    </main>
  </div>
</template>



<style>
/* .fondo{
  
  background-image: url(https://www.astrobitacora.com/wp-content/uploads/2017/09/big-bang.jpg);
  background-repeat: no-repeat;
  background-size: cover;
  height: 100vh;
  width: 100wv;
} */
</style>
