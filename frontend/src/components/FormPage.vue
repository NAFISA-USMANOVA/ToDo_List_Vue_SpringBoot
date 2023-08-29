<script setup>
    // <input type="date" v-model="tarea.fechaLimite" class="form-control form-control-sm mr-1 small-input"/>
</script>

<template>
<div class="d-flex justify-content-center align-items-center">
    <form>
        <input type="text" class="form-control" v-model="id" disabled/>
        <input class="form-control mb-2" type="text" v-model="newTask" placeholder="New Event" required />
        <input class="form-control mb-2" type="text"  v-model="description" placeholder="Description" />
        <!-- <input class="form-control mb-2" placeholder="Date" required /> -->
        <input type="date" class="form-control form-control-sm mr-1" v-model="date">
        <button type="button" class="btn btn-success mt-3 mb-3">
            Save</button>
    </form>


</div>
</template>

<style scoped>
</style>