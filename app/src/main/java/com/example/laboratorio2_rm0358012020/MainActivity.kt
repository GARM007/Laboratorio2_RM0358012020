package com.example.laboratorio2_rm0358012020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    var Nombre:EditText?=null
    var Edad:EditText?=null
    var Departamento:EditText?=null
   lateinit var Boton:Button
   lateinit var txv_Nom:TextView
   lateinit var txv_Edad:TextView
   lateinit var txv_Dep:TextView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ///////////////////////////////////////
        Nombre=findViewById(R.id.Edt_Nombre)
        Edad=findViewById(R.id.Edt_Edad)
        Departamento=findViewById(R.id.Edt_Departamento)
        Boton=findViewById(R.id.Btt_Agregar)
        txv_Nom= findViewById(R.id.Txv_Nombre)




    }

    fun Operacion(V:View)
    {

        val Nombres = Nombre?.text.toString()
        val Edades = Edad?.text.toString()
        val Departamentos= Departamento?.text.toString()
        val Edades_Int =Edades.toInt()
        if (Nombres.length == 0) {
            Toast.makeText(this, "Ingresar nombre", Toast.LENGTH_LONG).show()
        }
        if (Edades.length == 0) {
            Toast.makeText(this, "Ingresar edad", Toast.LENGTH_LONG).show()
        }
        if (Departamentos.length == 0) {
            Toast.makeText(this, "Ingresar departamento", Toast.LENGTH_LONG).show()
        }
        if (Nombres.length != 0 && Edades.length != 0 && Departamentos.length != 0) {
            Toast.makeText(this, "Registro en proceso....", Toast.LENGTH_LONG).show()

        }
       txv_Nom.text = ("Su nombre es "+ Nombres +"tiene la edad de "+ Edades +"Y vive en el departamento de "+ Departamentos)

    }
    }