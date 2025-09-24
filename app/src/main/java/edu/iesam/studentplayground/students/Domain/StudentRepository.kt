package edu.iesam.studentplayground.students.Domain

interface StudentRepository {


    // vamos a crear la funcion que me permite guardar un alumno

    fun save (student: Student)

    fun findByExp(expediente: String) : Student?

    fun showAll (): List<Student>

    fun removeStudent(expediente : String)

    fun updateStudent (student: Student)

}

