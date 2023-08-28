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

<template>
    <div class="d-flex justify-content-center align-items-center vh-100"> 
        <div>
            <h1 class="display-4 text-center mt-5">TO DO LIST</h1> 
            <form @submit.prevent="agregarTarea">
            <input v-model="nuevaTarea" class="form-control mb-2" placeholder="New task" required />
            <button type="submit" class="btn1 btn-primary">Add Task</button>
        </form>
            <div class="mt-4">
                <table class="table table-lg"> >
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>DAY</th>
                            <th>EVENT</th>
                            <th>ACTIONS</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td>
                                <a class="btn btn-warning  fa-solid fa-pen-to-square" ></a>
                                <a class="btn btn-danger fa fa-trash-alt"></a>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
    </template>
    

 <script setup>



</script>
  
  



  <style>

  h1 {
    color: rgb(31, 161, 161);
  }
 
 .table {
    width: 500px;
    
 }

 
 .btn1 {
    background-color: rgb(49, 168, 168);
 }
  </style>


  
  
  
  
  







