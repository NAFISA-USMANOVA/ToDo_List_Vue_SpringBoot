import http from '../http-common';

class TaskDataService {
    getAll() {
      return http.get(`/tasks`);
    }
  
    get(id) {
      return http.get(`/tasks/${id}`);
    }
  
    create(taskData) {
      return http.post(`/tasks`, taskData);
    }
  
    update(id, taskData) {
      return http.put(`/tasks/update/${id}`, taskData);
    }
  
    delete(id) {
      return http.delete(`/tasks/delete/${id}`);
    }
  }
  
  export default new TaskDataService();
