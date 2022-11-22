import { useEffect, useState } from 'react'
import axios from 'axios'
import { createServer, Model } from 'miragejs'

import './styles.css'

createServer({
  models: {
    course: Model
  },
  seeds(server) {
    server.create('course', {
      name: 'Desenvolvimento Frontend',
      duration: 80,
      teacher: 'Wesley'
    })
    server.create('course', {
      name: 'Desenvolvimento Mobile',
      duration: 100,
      teacher: 'Bruno'
    })
    server.create('course', {
      name: 'Desenvolvimento FullStack',
      duration: 80,
      teacher: 'Ana'
    })
  },
  routes() {
    this.namespace = 'api/courses'

    this.get('/', (schema, request) => {
      return schema.courses.all()
    })

    this.get('/:id', (schema, request) => {
      let id = request.params.id
      return schema.courses.find(id)
    })

    this.post('/', (schema, request) => {
      let attrs = JSON.parse(request.requestBody)
      return schema.courses.create(attrs)
    })

    this.put('/:id', (schema, request) => {
      let newAttrs = JSON.parse(request.requestBody)
      let id = request.params.id
      let course = schema.courses.find(id)
      return course.update(newAttrs)
    })

    this.delete('/:id', (schema, request) => {
      let id = request.params.id
      return schema.courses.find(id).destroy()
    })
  }
})

export function App() {
  const [courses, setCourses] = useState([])

  useEffect(() => {
    getCourses()
  }, [])

  //Metodo GET com Axios
  async function getCourses() {
    const response = await axios.get('http://127.0.0.1:5173/api/courses')
    setCourses(response.data.courses)
  }

  //Metodo POST Salvando 
  async function newCourse() {
    try {
      const res = await axios.post('http://127.0.0.1:5173/api/courses', {
        name: 'ReactJs',
        duration: 120,
        teacher: 'Diego F',
      });

      setCourses([...courses, res.data.course]);
      alert("Curso salvo com sucesso");
      
    } catch (error) {
      alert("Erro ao salvar curso");
    }
  }

  //Metodo GET Buscando por id
  async function getCourseById() {
    const response = await axios.get('http://127.0.0.1:5173/api/courses/2')
    console.log(">>>>>" + JSON.stringify(response.data))
  }

  //Metodo Put Editando curso por id 
  async function editCourse() {
    try {
      const response = await axios.put('http://127.0.0.1:5173/api/courses/2', {
        name:'Infra',
        duration: 50,
        teacher: 'Nídio',
      })
      console.log(response)
      getCourses()
      alert("Curso editado com sucesso");
    } catch (error) {
      alert("Erro ao editar curso" + error);
    }
  }

  //Metodo Delete por id 
  async function deleteCourse() {
    try {
      await axios.delete('http://127.0.0.1:5173/api/courses/1')
      alert("Curso deletado com sucesso!")
      getCourses();
    } catch (error) {
      alert("Não foi possível deletar curso!" + error)
    }    
  }

  useEffect(() => {
    getCourseById();
  },[])

  return (
    <div>
      {courses.length <= 0 ? (
        <h1>Carregando...</h1>
      ) : (
        courses.map((course) => (
          <div className="content" key={course.id}>
            <div>
            <h3>
              <strong>NOME: {course.name}</strong>
            </h3>
            <p>DURAÇÂO: {course.duration}</p>
            <p>PROFESSOR: {course.teacher}</p>
            </div>
          </div>
        ))
      )}

      <button onClick={newCourse}>Adicionar Curso</button>
      <button onClick={editCourse}>Editar Curso</button>
      <button onClick={deleteCourse}>Excluir Curso</button>
    </div>
  )
}
