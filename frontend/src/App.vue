<template>
  <div class="app-container">
    <header></header>
    <main></main>
    <FooterToDo />
  </div>
</template>

<script setup>
import FooterToDo from './components/FooterToDo.vue'
</script>

export default { name: 'App', components: { FooterToDo } }

<style>
.app-container {
  display: flex;
  flex-direction: column;
  min-height: vh;
}

main {
  flex: 1;
}
</style>
