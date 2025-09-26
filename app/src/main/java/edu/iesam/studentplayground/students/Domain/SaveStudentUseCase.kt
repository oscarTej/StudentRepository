package edu.iesam.studentplayground.students.Domain

class SaveStudentUseCase(val studentRepository: StudentRepository) {

    // preguntar porque invoke operator y tal
    //
    operator fun invoke (student: Student){
        studentRepository.save(student)
    }

}