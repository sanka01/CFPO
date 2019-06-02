package com.hackathon_urpay.cfpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    val CitacaoList: MutableList<Citacao> = mutableListOf(
          Citacao("Thomas Edison","Eu não falhei. Eu apenas encontrei 10 mil soluções que não deram certo")
        , Citacao("Gandhi , Indira","Nenhum bom empreendedor deveria desejar sacrificar os rendimentos a longo prazo devido para que tenha maiores lucros a curto prazo.")
        , Citacao("Dell , Michael","Os empreendedores reais têm o que eu chamo de três Ps (e, acreditem-me, nenhum deles significa 'permissão'). Os empreendedores reais têm uma 'paixão' por aquilo que estão a fazer, um 'problema' que precisa de ser resolvido, e um 'propósito' que os impulsiona para a frente.")
        , Citacao("Robert Kiyosaki","Os pobres e a classe média trabalham pelo dinheiro. Os ricos fazem o dinheiro trabalhar para eles.")
        , Citacao("Robert Kiyosaki","Gente demais se preocupa excessivamente com dinheiro e não com sua maior riqueza, a educação.")
    )

    lateinit var CitacaoAdapter: CitacaoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        setSupportActionBar(toolbar)



        CitacaoAdapter = CitacaoAdapter(this, CitacaoList)
        recyclerViewCitacao.adapter = CitacaoAdapter
        recyclerViewCitacao.layoutManager = LinearLayoutManager(this)
        recyclerViewCitacao.smoothScrollToPosition(CitacaoList.size)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
//        return when (item.itemId) {
//            R.id.action_settings -> true
//            else -> super.onOptionsItemSelected(item)
//        }
        return false
    }
}
