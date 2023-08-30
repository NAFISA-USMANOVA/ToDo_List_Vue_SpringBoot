import axios from 'axios'

export default axios.create({
  baseURL: 'http://localhost:8080/probar',
  Headers: {
    'content-type': 'application/json'
  }
})
