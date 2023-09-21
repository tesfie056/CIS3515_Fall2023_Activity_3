package edu.temple.inclassuiacvitivity

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class TextSizeAdapter(private val textSizes: Array<Int>) : BaseAdapter () {

    override fun getCount()= textSizes.size
    override fun getItem(p0: Int) = textSizes[p0]
    override fun getItemId(p0: Int) = p0.toLong()

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")
    }

}