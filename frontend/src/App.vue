<script >
import HomeView from './views/HomeView.vue';


export default {
  name: 'App',
  components: {
    HomeView
}

}

</script>
<template>
  
  <div class="fondo">
   <HomeView/> 
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
