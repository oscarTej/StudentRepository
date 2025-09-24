package edu.iesam.studentplayground.students.Presentation

import androidx.lifecycle.ViewModel
import edu.iesam.studentplayground.students.Domain.FindByExpUseCase
import edu.iesam.studentplayground.students.Domain.RemoveStudentUseCase
import edu.iesam.studentplayground.students.Domain.SaveStudentUseCase
import edu.iesam.studentplayground.students.Domain.ShowAllStudentUseCase
import edu.iesam.studentplayground.students.Domain.Student
import edu.iesam.studentplayground.students.Domain.UpdateStudentUseCase

class StudentViewModel (private val saveStudentUseCase: SaveStudentUseCase, private val findByExpUseCase: FindByExpUseCase,
private val showAllStudentUseCase: ShowAllStudentUseCase, private val removeStudentUseCase: RemoveStudentUseCase, private val updateStudentUseCase: UpdateStudentUseCase): ViewModel(){

    fun saveClicked(exp: String,name: String) : Student?{
      //  saveStudentUseCase.invoke(Student (exp,name))
          val s = Student(exp, name)
          saveStudentUseCase(s)
          return s
    }

    fun findByExpClicked(expediente:String): Student? {
        return findByExpUseCase.invoke(expediente)
    }

    fun showAllClicked() : List<Student>{
        return showAllStudentUseCase.invoke()


    }

    fun removeStudentClicked(expediente: String){
        removeStudentUseCase.invoke(expediente)
    }
    fun updateStudentClicked (student: Student){
        updateStudentUseCase.invoke(student)
    }
}