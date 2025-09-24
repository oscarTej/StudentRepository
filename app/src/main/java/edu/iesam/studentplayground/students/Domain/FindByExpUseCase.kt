package edu.iesam.studentplayground.students.Domain

class FindByExpUseCase (private val studentRepository: StudentRepository) {

    operator fun invoke(expediente:String): Student?{
        return studentRepository.findByExp(expediente)
    }
}