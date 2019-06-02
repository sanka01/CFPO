package com.hackathon_urpay.cfpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    val CitacaoList: MutableList<Citacao> = mutableListOf(
          Citacao("Cleito Rasta","melhorquealok")
        , Citacao("Cleito Rasta","melhorquealok")
        , Citacao("Cleito Rasta","melhorquealok")
        , Citacao("Cleito Rasta","melhorquealok")
        , Citacao("Cleito Rasta","melhorquealok")
        , Citacao("Cleito Rasta","melhorquealok")
        , Citacao("Cleito Rasta","melhorquealok")
        , Citacao("Cleito Rasta","melhorquealok")
        , Citacao("Cleito Rasta","melhorquealok")
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
