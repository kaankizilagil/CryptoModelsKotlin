package com.kaankizilagil.retrofitkotlin.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kaankizilagil.retrofitkotlin.R
import com.kaankizilagil.retrofitkotlin.model.CryptoModel
import kotlinx.android.synthetic.main.row_layout.view.*

class RecyclerViewAdapter(private val cryptoList: ArrayList<CryptoModel>, private val listener: Listener) : RecyclerView.Adapter<RecyclerViewAdapter.RowHolder>() {

    interface Listener {

        fun onItemClick(cryptoModel: CryptoModel)
    }

    private val colors: Array<String> = arrayOf("#71ACDA", "#FFCE61", "#39A2AE", "#FFA500", "#FF6347", "#00CED1")

    class RowHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(cryptoModel: CryptoModel, colors: Array<String>, position: Int, listener: Listener) {

            itemView.textName.text = cryptoModel.currency
            itemView.textPrice.text = cryptoModel.price

            itemView.setBackgroundColor(Color.parseColor(colors[position % 6]))

            itemView.setOnClickListener {

                listener.onItemClick(cryptoModel)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false)

        return RowHolder(view)
    }

    override fun getItemCount(): Int {

        return cryptoList.count()
    }

    override fun onBindViewHolder(holder: RowHolder, position: Int) {

        holder.bind(cryptoList[position], colors, position, listener)
    }
}
