<script setup>


</script>

<template>
<div id="form_page_bg">
    <h2>Form Page</h2>

    <form>
        <input type="text" class="form-control mb-2" name="id" placeholder="#" v-model="id" disabled/>
        <input class="form-control mb-2" type="text" v-model="newTask" placeholder="New Event" required />
        <input class="form-control mb-2" type="text"  v-model="description" placeholder="Description" />
        <!-- <input class="form-control mb-2" placeholder="Date" required /> -->
        <input type="date" class="form-control form-control-m mr-1" v-model="date">
        <button type="button" class="btn btn-success mt-3 mb-3">
            Save</button>
    </form>


    <div>
        <h2>Form Page</h2>
        <p>Data from HomeView: {{ dataToPass }}</p>
    </div>
</div>


    
</template>

<style>
p{
    font-size: 50px;
    font-weight: 100;
}
</style>