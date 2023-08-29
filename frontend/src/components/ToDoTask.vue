<script setup>

</script>
<template>
    <div>
        <h1>Hola desde ToDoTask</h1>
    <!-- <button @click="goToFormPage">ADD EVENT</button> -->
    <div class="mt-4">
                <table class="table table-lg"> 
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Event</th>
                            <th>Description</th>
                            <th>Date</th>
                            <th>ACTIONS</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td>
                              <a class="btn btn-success fas fa-pen" ></a>
                              <a class="btn btn-danger fa fa-trash-alt"></a>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </div>
    </div>
</template>

<style>

  h1 {
    color: rgb(31, 161, 161);
  }
 
 .table {
    width: 500px;
    font-family:'Trebuchet MS', 'Lucida Sans Unicode', 'Lucida Grande', 'Lucida Sans', Arial, sans-serif;
 }
 
 /* .btn1 {
    background-color: rgb(49, 168, 168);
 } */
  </style>