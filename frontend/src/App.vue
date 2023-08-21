<script setup>
import FooterToDo from './components/FooterToDo.vue'
</script>

<template>
  <div class="app-container">
    <header></header>
    <main>
      <FooterToDo />
    </main>
  </div>
</template>

<style scoped>
.app-container {
  display: flex;
  flex-direction: column;
  min-height: vh;
}

main {
  flex: 1;
}
</style>
