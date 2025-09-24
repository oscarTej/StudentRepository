package edu.iesam.studentplayground.students.Domain

class UpdateStudentUseCase(private val studentRepository: StudentRepository) {

    operator fun invoke(student: Student){
        studentRepository.updateStudent(student)
    }
}