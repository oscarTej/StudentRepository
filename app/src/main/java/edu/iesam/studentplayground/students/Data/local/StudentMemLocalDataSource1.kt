package edu.iesam.studentplayground.students.Data.local

import edu.iesam.studentplayground.students.Domain.Student

class StudentMemLocalDataSource1 {

    private val dataSource : MutableMap<String, Student> = mutableMapOf() // ponemos el mapOF preguntar porque que no me ha quedado claro

    // hay que implementar los metodos del repositorio que lo conectas
    fun save(student: Student) {
        // preguntar esto tambien
        dataSource.put(student.exp,student);
    }
    fun findByExp( expediente : String) : Student?{
       return dataSource.get(expediente)
    }

    fun showAll(): List<Student>{
        return dataSource.values.toList()
    }

    fun removeStudent(expediente: String){
        dataSource.remove(expediente)
    }

    fun updateStudent(student: Student){
        dataSource.put(student.exp,student)
    }
}