package edu.iesam.studentplayground.students.Domain

import edu.iesam.studentplayground.students.Data.StudentDataRepository

class SaveStudentUseCase (val studentRepository: StudentDataRepository){

    // preguntar porque invoke operator y tal
    //
    operator fun invoke (student: Student){
        studentRepository.save(student)
    }

}