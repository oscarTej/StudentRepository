package edu.iesam.studentplayground.students.Domain

import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

class SaveStudentUseCaseTest {

    @Test
    fun `when invoke then save student`() {
        // given de mock

        val studentRepositoryMock = mockk<StudentRepository>()

        val saveStudentUseCaseMock = SaveStudentUseCase(studentRepositoryMock)
        val studentMock = Student("321", "Oscar")

        // WHEN
        saveStudentUseCaseMock.invoke(studentMock)

        //THEN

        // el student en azul es la variable de la interfaz StudentRepository
        // el verify comprueba que el metodo save se ha llamado

        verify { studentRepositoryMock.save(student = studentMock) }

        /*
          // given
                val re
                val saveStudentUseCase = SaveStudentUseCase(repo)
                val student = Student("123","Arturo")

                // when
                saveStudentUseCase(student)

                // then



         */


    }

}