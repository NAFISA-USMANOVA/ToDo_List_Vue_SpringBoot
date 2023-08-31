<!-- 

<template>
    <div class="container">
        <div class="row">
            <div class="col-lg-8 offset-lg-2 mt-5">
                <input type="text" class="form-control form-control-lg" placeholder="Enter Task.." v-model="taskName" v-on:keyup.enter="addTask()" />
                <br>
            </div>
        </div>

        <div class="row">
            <div class="col-lg-8 offset-lg-2">
                <div class="card p-2" v-if="tasks.length === 0">
                    <h6>No tasks to display</h6>
                </div>
                <button class="btn btn-secondary mt-3" @click="resetList">Reset List</button>
                <ul class="list-group" v-for="(task, index) in tasks" v-bind:key="index">
                    <li class="list-group-item d-flex justify-content-between">
                        <span class="cursor" @click="updateTask(task)">
                            <i class="fa fa-circle" v-if="!task.completed"></i>
                            <i class="fas fa-check-circle" v-else :class="{'text-success': task.completed}"></i>
                        </span>
                        <h5>
                            {{ task.name }} - <span :class="{'text-danger': !task.completed, 'text-success': task.completed}">{{ task.completed ? 'Completed' : 'Pending' }}</span>
                        </h5>

                        <input type="date" v-model="task.dueDate" class="form-control form-control-sm mr-1 small-input">
                        <input type="time" v-model="task.dueTime" class="form-control form-control-sm mr-1 small-input">
                        <span class="cursor text-danger" @click="deleteTask(index)">
                            <i class="fa fa-trash-alt"></i>
                        </span>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</template>

<script setup>
import { ref } from 'vue';

const tasks = ref([]);
const taskName = ref('');

const addTask = () => {
  const task = {
    name: taskName.value,
    completed: false,
    dueDate: null,
    dueTime: null
  };
  tasks.value.push(task);
  taskName.value = '';
};

const deleteTask = (index) => {
    tasks.value.splice(index, 1);
};

const updateTask = (task) => {
    task.completed = !task.completed;
};

const resetList = () => {
    tasks.value = [];
    taskName.value = '';
}
</script>

<style scoped>
input {
    text-align: center;
}

.form-control {
    width: 500px;
}

.cursor {
    cursor: pointer;
}

.list-group-item {
    align-items: center;
}

.small-input {
    font-size: 15px;
    padding: 0.2rem 0.4rem;
    width: 150px;
}
</style> -->





<script setup>

import { ref, onBeforeMount } from 'vue';
import taskServices from '../services/taskServices';
const tasks = ref([]);
const lastId = ref();


const editIndex = ref(null);
const editTask = (index) => {
    editIndex.value = index;
};
const deleteTask = async(id) => {
    await taskServices.delete(id);
    tasks.value.data.pop(id);
};


onBeforeMount(async() => {
   tasks.value = await taskServices.getAll();
   lastId.value = tasks.value.data[tasks.value.data.length - 1].id + 1;
})



</script>




<template>
    <div class="d-flex justify-content-center align-items-center p-2 ">
        <div class="m-3 ">
            <router-link :to="'/update/' + lastId"><button type="submit" class="btn btn-primary btn-sm  rounded mt-3">Add
                    Task</button></router-link>

            <div class="mt-2   ">
                <div class="table-responsive">
                    <table class=" table ">
                        <thead class="">
                            <tr>
                                <th class="rounded-start">ID</th>
                                <th>Event</th>
                                <th>Description</th>
                                <th>Date</th>
                                <th class="rounded-end">Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr v-for="(task, index) in tasks.data" :key="index">
                                <td class="rounded-start">{{ task.id }}</td>
                                <td>{{ task.event }}</td>
                                <td>
                                    <div class="dropdown">
                                        <div class="dropdown">
                                            <button class="btn btn-secondary dropdown-toggle py-1 px-2" type="button"
                                                id="dropdownMenu2" data-bs-toggle="dropdown" aria-expanded="false">
                                            </button>
                                            <ul class="dropdown-menu" aria-labelledby="dropdownMenu2">
                                                <li><button class="dropdown-item" type="button">{{ task.description }}
                                                        </button></li>
                                            </ul>
                                        </div>
                                    </div>
                                </td>
                                <td>{{ task.date }}</td>
                                <td class="rounded-end">
                                    <a @click="editTask(index)" class="btn btn-warning  fa-solid fa-pen-to-square"></a>
                                    <a @click="deleteTask(task.id)" class="btn btn-danger fa fa-trash-alt"></a>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</template>







<style scoped>
h1 {
    color: rgb(31, 161, 161);
}




.btn1 {
    background-color: rgb(49, 168, 168);
}
</style>


  
  
  
  
  







