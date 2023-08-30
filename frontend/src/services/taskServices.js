import http from '../http-common';

class TaskDataService {
    getAll() {
      return http.get(`/tasks`);
    }
  
    get(id) {
      return http.get(`/${id}`);
    }
  
    create(taskData) {
      return http.post(`/save`, taskData);
    }
  
    update(id, taskData) {
      return http.put(`/update/${id}`, taskData);
    }
  
    delete(id) {
      return http.delete(`/delete/${id}`);
    }
  }
  
  export default new TaskDataService();
