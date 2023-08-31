<script>
import { RouterView } from 'vue-router';
import FooterToDo from './components/FooterToDo.vue';
import NavToDo from './components/NavToDo.vue';


export default {
  name: 'App',
  components: {
    RouterView,
    FooterToDo ,
    NavToDo
  }
}
</script>
<template>
  <div  class="fondo ">
    
    <main>
      <NavToDo/>

      <div class="d-flex justify-content-center align-items-center">
    <div class="text-center ">
      <h1 class="title display-4 my-3 font-weight-bold ">ASTRALIST</h1>
    </div>
  </div>
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
  background-position: center center;
  height: 100vh;
}

.title {
  color: rgb(224, 222, 228);
  font-weight: bold;
}


  

</style>
