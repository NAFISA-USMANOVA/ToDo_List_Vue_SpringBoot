<template>
    <div class="container ">
        <div class="row">
            <div class="col-lg-8 offset-lg-2 mt-5 ">
            <input type="text" class="form-control form-control-lg" placeholder="Ingresar Tarea.." v-model="nombreTarea" v-on:keyup.enter="agregarTarea()"/>
            <br>
        </div>
    </div>

    <div class="row">
        <div class="col-lg-8 offset-lg-2">
            <div class="card p-2" v-if="tareas.length === 0">
                <h6>No hay tareas para mostrar</h6>
            </div>
            <buton class="btn btn-secondary mt-3" @click="reiniciarLista">Reiniciar Lista</buton>
            <ul class="list-group" v-for="(tarea, index) in tareas" v-bind:key="index">
                <li class="list-group-item d-flex justify-content-between">
                    <span class="cursor" @click="actualizarTarea(tarea)">
                        <i class="fa fa-circle"  v-if="!tarea.estado"></i>
                        <i class="fas fa-check-circle" v-else  :class="{'text-success': tarea.estado}"></i>
                    </span>
                    <h5>
                        {{ tarea.nombre }} - <span :class="{ 'text-danger': !tarea.estado, 'text-success': tarea.estado}"> {{ tarea.estado ? 'Completada': 'Pendiente'}}</span>
                    </h5>

                    <input type="date" v-model="tarea.fechaLimite" class="form-control form-control-sm mr-1 small-input">
                    <input type="time" v-model="tarea.horaLimite" class="form-control form-control-smmr-1 small-input ">
                    <span class="cursor text-danger" @click="eliminarTarea(index)">
                        <i class="fa fa-trash-alt"></i>   
                    </span>
                </li>
            </ul>
        </div>
    </div>
    </div>
</template>




<script setup >
import { ref } from 'vue';

const tareas = ref([]);
const nombreTarea = ref('');

const agregarTarea = () => {
  const tarea = {
    nombre: nombreTarea.value,
    estado: false,
    fechaLimite: null ,
    horaLimite: null
  };
  tareas.value.push(tarea);
  nombreTarea.value = '';
};

const eliminarTarea = (index) => {
    tareas.value.splice(index, 1);

};

const actualizarTarea = (tarea) => {
    tarea.estado = !tarea.estado;
};

const reiniciarLista = () => {
    tareas.value = [];
    nombreTarea.value = '';
}





</script>

<style scoped>
input {
    text-align: center;
}

.form-control {
    width: 500px;
}


.cursor{
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

</style>