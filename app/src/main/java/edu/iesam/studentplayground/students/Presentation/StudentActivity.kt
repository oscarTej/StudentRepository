package edu.iesam.studentplayground.students.Presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.iesam.studentplayground.R
import edu.iesam.studentplayground.students.Data.Remote.StudentApiRemoteDataSource
import edu.iesam.studentplayground.students.Data.StudentDataRepository
import edu.iesam.studentplayground.students.Data.local.StudentMemLocalDataSource1
import edu.iesam.studentplayground.students.Data.local.StudentXmlLocalDataSource
import edu.iesam.studentplayground.students.Domain.FindByExpUseCase
import edu.iesam.studentplayground.students.Domain.RemoveStudentUseCase
import edu.iesam.studentplayground.students.Domain.SaveStudentUseCase
import edu.iesam.studentplayground.students.Domain.ShowAllStudentUseCase
import edu.iesam.studentplayground.students.Domain.UpdateStudentUseCase

class StudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        initStudents()
    }

    fun initStudents() {
        val xml = StudentXmlLocalDataSource()
        val mem = StudentMemLocalDataSource1()
        val api = StudentApiRemoteDataSource()
        val dataRepository = StudentDataRepository(xml, mem, api)
        val saveUseCase = SaveStudentUseCase(dataRepository)
        val findbyExpUseCase = FindByExpUseCase(dataRepository)
        val showAllStudentUseCase = ShowAllStudentUseCase(dataRepository)
        val removeStudentUseCase = RemoveStudentUseCase(dataRepository)
        val updateStudentUseCase = UpdateStudentUseCase(dataRepository)

        val viewModel = StudentViewModel(saveUseCase, findbyExpUseCase,showAllStudentUseCase,removeStudentUseCase,updateStudentUseCase)
         viewModel.saveClicked("0001", "nombre1 apellido1 apellido1")

        val all = viewModel.showAllClicked()
        for (s in all) {
            Log.d("@dev", "ALUMNO -> ${s.exp} - ${s.name}")
        }


        //  viewModel.updateStudentClicked(student)  //
      //


      /*
        val found = viewModel.findByExpClicked("0001")
        Log.d("@dev", "Resultado búsqueda: " + found)

        Log.d("@dev", "Stop")


        Log.d("@dev", "Stop")

        viewModel.removeStudentClicked("0001")
       */
        Log.d("@dev", "Stop")



    }
}