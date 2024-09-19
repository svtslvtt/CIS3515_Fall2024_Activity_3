package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _numberArray: Array<Int>) : BaseAdapter() {

   private val context = _context
   private val numberArray = _numberArray

    override fun getCount(): Int {
        return numberArray.size
    }

    override fun getItem(position: Int): Any {
        return numberArray[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }


}