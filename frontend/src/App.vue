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
    
    <main>
      <RouterView />
      <FooterToDo/>
    </main>
  </div>
</template>

<style >

.fondo {
  background-image: url("./assets/fondo.jpg");
  background-repeat: no-repeat;
  background-size: cover;
  height: 100vh;
}
</style>
