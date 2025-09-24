package edu.iesam.studentplayground.students.Domain

class RemoveStudentUseCase (private val studentRepository: StudentRepository) {

    operator fun invoke(expediente : String){
        studentRepository.removeStudent(expediente)
    }
}