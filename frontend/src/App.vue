<script >
import TaskToDo from './components/TaskToDo.vue';

export default {
  name: 'App',
  components: {
  TaskToDo
  }

}
</script>

<template>
  <div class="fondo">
    <TaskToDo/>
  </div>
  
  

</template>

<style >

.fondo {
  background-image: url("./assets/starsfont.jpg");
  background-repeat: no-repeat;
  background-size: cover;
  height: 100vh;
}
</style>
