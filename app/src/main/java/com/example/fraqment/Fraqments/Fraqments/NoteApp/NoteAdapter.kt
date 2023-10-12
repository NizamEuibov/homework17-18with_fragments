package com.example.note

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.fraqment.Fraqments.Fraqments.NoteApp.Note
import com.example.fraqment.R
import com.example.fraqment.databinding.NoteExampleFragmentBinding

class NoteAdapter(val listener: Listener): RecyclerView.Adapter<NoteAdapter.NoteHolder>() {

    private val notes = mutableListOf<Note>()

    fun addNotes(newList: List<Note>){
        notes.clear()
        notes.addAll(newList)
        notifyDataSetChanged()
    }




    class NoteHolder(item: View): RecyclerView.ViewHolder(item) {
    val binding = NoteExampleFragmentBinding.bind(item)
    fun bind(note: Note, listener: Listener) = with(binding){
        tvtitle.text = note.title
        itemView.setOnClickListener {
            listener.onClick(note)
        }
    }
}

override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteHolder {
    val view = LayoutInflater.from(parent.context).inflate(R.layout.note_example_fragment,parent,false)
    return NoteHolder(view)
}

override fun getItemCount(): Int {
    return notes.size
}

override fun onBindViewHolder(holder: NoteHolder, position: Int) {
    holder.bind(notes[position], listener)
}

interface Listener{
    fun onClick(note:Note)
    }
}


