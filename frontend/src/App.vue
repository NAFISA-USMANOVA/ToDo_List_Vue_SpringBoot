<script>
import { RouterView } from 'vue-router';
import FormView from './views/FormView.vue';
import FooterToDo from './components/FooterToDo.vue';



export default {
  name: 'App',
  components: {
    FormView,
    FooterToDo 
  }
}
</script>
<template>
  <div>
    <h1 class="display-4 text-center mt-5">TO DO LIST</h1>
    <main>
      <RouterView />
    </main>
    
    <FormView></FormView>
    <FooterToDo> </FooterToDo>
  </div>
</template>



<style></style>
