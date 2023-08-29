<script setup>
//para hacer la ruta del boton de ADD EVENT a FormPage
// import ToDoTask from '../components/ToDoTask.vue'
import { useRouter } from 'vue-router';              

const router = useRouter();                         

const goToFormPage = () => {                       
  const dataToPass = 'Hello from HomeView';
  router.push({ name: 'form', params: { dataToPass } });
};

</script>

<template>
  <div>
    <!-- <ToDoTask /> -->
    <h1>Es de HV</h1>

    <button @click="goToFormPage" type="submit" class="btn1 btn-primary rounded ">Add Task from HV</button>

    
  </div>
</template>


