<template>
  <footer class="footer">
    <div>
      <h4>&copy; {{ currentYear }} Equipo Desarrolladores</h4>
      <div>
        <a class="developers" href="https://github.com/Angela-Coello">Angela</a>
        <a class="developers" href="https://github.com/NAFISA-USMANOVA">Nafisa</a>
        <a class="developers" href="https://github.com/ANDREASIERRA55">Andrea</a>
        <a class="developers" href="https://github.com/soniaonis">Sonia</a>
        <a class="developers" href="https://github.com/drawmakerr">Miguel</a>
      </div>
    </div>
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
.footer {
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
  background-color: rgb(123, 53, 130);
  padding: 5px;
  text-align: center;
  position: fixed;
  bottom: 0;
  left: 0;
  width: 100%;
}
.developers {
  margin: 15px;
  text-decoration: none;
  color: white;
}
h4 {
  color: white;
}
</style>
