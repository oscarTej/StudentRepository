package edu.iesam.studentplayground.students.Domain

class ShowAllStudentUseCase (private val studentRepository: StudentRepository) {

    operator fun invoke() : List<Student> {
        return studentRepository.showAll()
    }
}