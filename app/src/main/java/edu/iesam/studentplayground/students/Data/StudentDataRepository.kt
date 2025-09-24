package edu.iesam.studentplayground.students.Data

import android.R
import edu.iesam.studentplayground.students.Data.Remote.StudentApiRemoteDataSource
import edu.iesam.studentplayground.students.Data.local.StudentMemLocalDataSource1
import edu.iesam.studentplayground.students.Data.local.StudentXmlLocalDataSource
import edu.iesam.studentplayground.students.Domain.Student
import edu.iesam.studentplayground.students.Domain.StudentRepository

class StudentDataRepository(    private val xmlLocalDataSource: StudentXmlLocalDataSource,
                                private val memLocalDataSource : StudentMemLocalDataSource1,
                                private val apiRemoteDataSource: StudentApiRemoteDataSource
): StudentRepository {
    override fun save(student: Student) {
      memLocalDataSource.save(student)
      xmlLocalDataSource.save(student)
      apiRemoteDataSource.save(student)
    }

    override fun findByExp(expediente: String): Student? {
        memLocalDataSource.findByExp(expediente).let { student -> }
        xmlLocalDataSource.findByExp(expediente).let { student ->  }
        apiRemoteDataSource.findByExp(expediente).let { student ->  }
        return TODO("Provide the return value")
    }

    override fun showAll(): List<Student> {
        memLocalDataSource.showAll()
        xmlLocalDataSource.showAll()
        apiRemoteDataSource.showAll()

        return TODO("Provide the return value")
    }

    override fun removeStudent(expediente: String) {
        memLocalDataSource.removeStudent(expediente)
        xmlLocalDataSource.removeStudent(expediente)
        apiRemoteDataSource.removeStudent(expediente)
    }

    override fun updateStudent(student: Student) {
        memLocalDataSource.updateStudent(student)
        xmlLocalDataSource.updateStudent(student)
        apiRemoteDataSource.updateStudent(student)
    }


}