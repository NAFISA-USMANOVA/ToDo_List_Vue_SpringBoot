import axios from 'axios'

export default axios.create({
  baseURL: 'http://localhost:8080/tasks',
  Headers: {
    'content-type': 'application/json'
  }
})
