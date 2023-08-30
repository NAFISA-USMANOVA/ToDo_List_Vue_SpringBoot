<script setup>
import TaskToDo from '../components/TaskToDo.vue';
//para hacer la ruta del boton de ADD EVENT a FormPage

//import { useRouter } from 'vue-router';
//const router = useRouter();
//const goToFormPage = () => {
 // const dataToPass = 'Hello from HomeView';
  //router.push({ name:'form', params: { dataToPass } });
//};
</script>

<template>
  
  <div>
  <!--<button @click="goToFormPage" type="submit" class="btn btn-primary rounded btn mt-3 mb-3">Add Task btn from HV</button>-->
    <TaskToDo  class="mt-5" />
</div>
  
</template>
