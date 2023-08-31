<script setup>
import { ref } from 'vue';
import TaskServices from '../services/taskServices';
import { useRouter, useRoute } from 'vue-router'



const newTask = ref('');
const description = ref('');
const date = ref('');
const router = useRouter();
const route = useRoute();

const saveTask = async () => {
    const formData = {
        id: route.params.id,
        event: newTask.value,
        description: description.value,
        date: date.value
    };
   
    try 
    {
        await TaskServices.create(formData)
        console.log("entra aqui");
    }     
    catch (error) 
    {
        console.error(error);
    }
    router.push({name: 'home'});
}

</script>



<template>
   
    <div class="d-flex justify-content-center align-items-center">
    <div class="m-3 p-3 ">
        <form @submit.prevent="'default'">
            <!--<input type="text" class="form-control mb-2 " name="id" placeholder="#" v-model="id" disabled />-->
            <input class="form-control mb-2" type="text" v-model="newTask" placeholder="New Task" required />
            <input class="form-control mb-2" type="text" v-model="description" placeholder="Description" />
            
            <input type="date" class="form-control form-control-m mr-1" v-model="date" required />
            
            <!--<router-link to="/"><button type="submit" class="btn btn-success btn-sm  rounded mt-3">Save</button></router-link>-->
              <button type="submit" @click="saveTask()" class="btn btn-success btn-sm  rounded mt-3">Save</button>
              

        </form>
    </div>
    </div>

    
</template>

<style>
p {
    font-size: 50px;
    font-weight: 100;
}

button :hover {
    color: rgb(8, 31, 15);
}
</style>