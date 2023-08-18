<template>
  <footer class="footer">
    <p>&copy; {{ currentYear }} Mi Increíble App de Tareas</p>
  </footer>
</template>

<script>
export default {
  data() {
    return {
      currentYear: new Date().getFullYear()
    }
  }
}
</script>

<style scoped>
footer {
  background-color: #2e594c58;
  color: white;
  text-align: center;
  padding: 1rem;
}
</style>
