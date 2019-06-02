package com.hackathon_urpay.cfpo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.core.graphics.component1
import kotlinx.android.synthetic.main.activity_modelagem.*
import org.jetbrains.anko.find

class Modelagem : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modelagem)
        var metodo : Spinner = findViewById(R.id.Metodo) as Spinner
        var reposicao  : Spinner = findViewById(R.id.ReposicaoEstoque) as Spinner
        var caixatual  : Spinner = findViewById(R.id.Caixatual) as Spinner
        var view : TextView = findViewById(R.id.view) as TextView

        var optionsMetodos = arrayOf("ESCOLHA O METODO DE PAGAMENTO","Crédito","Débito")

        metodo.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,optionsMetodos)

        metodo.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(parent!!.getItemAtPosition(0)!=null) {

                }
                var p = parent!!.getItemAtPosition(position).toString()

                Log.e("Teste",p)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }

        var optionsCaixa = arrayOf("QUAL SUA SITUAÇÃO DO CAIXA ATUAL ?","Bom","Regular","Insuficiente")

        caixatual.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,optionsCaixa)

        caixatual.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(parent!!.getItemAtPosition(0)!=null) {
                }
                var p = parent!!.getItemAtPosition(position).toString()

                Log.e("Teste",p)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }



        var optionsReposicao = arrayOf("POSSUÍ FUNDO DE RISCOS?","Bom","Regular","Insuficiente")

        reposicao.adapter = ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,optionsReposicao)

        reposicao.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if(parent!!.getItemAtPosition(0)!=null) {
                }
                var p = parent!!.getItemAtPosition(position).toString()

                    Log.e("Teste",p)
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

        }
    }
}
