<script>
import { RouterView } from 'vue-router';


import FooterToDo from './components/FooterToDo.vue';
import FormView from './views/FormView.vue' ;


export default {
  name: 'App',
  components: {
    FooterToDo,
    FormView
  }
}
</script>
<template>
  <div>
    <header><h1>Tarea diarias</h1></header>
    <main>
      <RouterView />
    </main>
    <FooterToDo> </FooterToDo>
    <FormView></FormView>
  </div>
</template>



<style></style>
