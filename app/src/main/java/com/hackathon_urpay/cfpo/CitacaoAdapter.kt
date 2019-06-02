package com.hackathon_urpay.cfpo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.citacao_item.view.*

class CitacaoAdapter(private val context: Context, private var citacaoList: MutableList<Citacao>):
    RecyclerView.Adapter<CitacaoAdapter.ClienteViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClienteViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.citacao_item, parent, false)
        return ClienteViewHolder(view)
    }

    override fun getItemCount() = citacaoList.size

    override fun onBindViewHolder(holder: ClienteViewHolder, position: Int) {
        holder.bindView(citacaoList[position])
    }

    class ClienteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val textViewNome = itemView.textViewNome
        val textViewCitacao = itemView.textViewCitacao


        fun bindView(citacao: Citacao) {
            textViewNome.text = citacao.nome
            textViewCitacao.text = citacao.citacao



        }
    }
}