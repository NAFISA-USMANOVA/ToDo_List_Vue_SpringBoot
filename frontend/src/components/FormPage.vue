<script setup>
import { ref } from 'vue';
import TaskServices from '../services/taskServices';



const id = ref('');
const newTask = ref('');
const description = ref('');
const date = ref(''); 

const saveTask = async () => {
    const formData = {
        task: newTask.value,
        description: description.value,
        date: date.value
       
    };
   
    try {
        TaskServices.create(formData)
        .then(response => {
            id.value = response.data.id;
            console.log(response.data);
        })
         
    } catch (error) {
        console.error(error);
    }
};

</script>



<template>
   
    <div class="d-flex justify-content-center align-items-center">
    <div class="m-3 p-3 ">
        <form @submit.prevent="saveTask">
            <!--<input type="text" class="form-control mb-2 " name="id" placeholder="#" v-model="id" disabled />-->
            <input class="form-control mb-2" type="text" v-model="newTask" placeholder="New Task" required />
            <input class="form-control mb-2" type="text" v-model="description" placeholder="Description" />
            
            <input type="date" class="form-control form-control-m mr-1" v-model="date" required />
            
                <router-link to="/"><button type="submit" class="btn btn-success btn-sm  rounded mt-3">Save</button></router-link>
              

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