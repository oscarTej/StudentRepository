package edu.iesam.studentplayground.students.Data.Remote

import edu.iesam.studentplayground.students.Domain.Student
import edu.iesam.studentplayground.students.Domain.StudentRepository

class StudentApiRemoteDataSource : StudentRepository {


    override fun save(student: Student) {
        TODO("Not yet implemented")
    }

    override fun findByExp(expediente: String): Student? {
        TODO("Not yet implemented")
    }

    override fun showAll(): List<Student> {
        TODO("Not yet implemented")
    }

    override fun removeStudent(expediente: String) {
        TODO("Not yet implemented")
    }

    override fun updateStudent(student: Student) {
        TODO("Not yet implemented")
    }


}