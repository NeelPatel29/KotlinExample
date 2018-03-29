package com.neel.kotlinexample

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_recycler_view_adapter.view.*

class RecyclerViewAdapter(private val number: ArrayList<Int>, val context:Context) :
        RecyclerView.Adapter<ViewHolder>() {

    override fun getItemCount(): Int {
        return number.size
    }

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_recycler_view_adapter, parent, false))
    }

    // Binds each animal in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.textnumber?.text = number.get(position).toString()
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val textnumber = view.txtNumber
}
