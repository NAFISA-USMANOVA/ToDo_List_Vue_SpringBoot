<script setup>
    // <input type="date" v-model="tarea.fechaLimite" class="form-control form-control-sm mr-1 small-input"/>
</script>

<template>
<div class="d-flex justify-content-center align-items-center">
    <form>
        <input class="form-control mb-2" placeholder="New Event" required />
        <input class="form-control mb-2" placeholder="Description" />
        <!-- <input class="form-control mb-2" placeholder="Date" required /> -->
        <input type="date" class="form-control form-control-sm mr-1">
        <button type="button" class="btn btn-success mt-3 mb-3">
            Save</button>
    </form>


</div>
</template>

<style scoped>
</style>