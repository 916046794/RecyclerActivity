package edu.temple.simplerecyclerview

import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter(private val randomArray: Array<Int>): RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): NumberViewHolder {
        val myNumberViewHolder = NumberViewHolder(
            TextView(parent.context)
        )
        return myNumberViewHolder
    }

    override fun onBindViewHolder(
        holder: NumberViewHolder,
        position: Int
    ) {
        holder.textView.textSize = randomArray[position].toFloat()
    }

    override fun getItemCount()= randomArray.size

    class NumberViewHolder (val textView: TextView) : RecyclerView.ViewHolder (textView) {}

}