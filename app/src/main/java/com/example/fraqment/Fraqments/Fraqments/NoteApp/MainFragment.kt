package com.example.fraqment.Fraqments.Fraqments.NoteApp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fraqment.R
import com.example.fraqment.databinding.FragmentMain2Binding
import com.example.fraqment.databinding.FragmentMainBinding
import com.example.note.NoteAdapter


class MainFragment : Fragment(),NoteAdapter.Listener {
    private var binding: FragmentMain2Binding? = null
    private var adapter=NoteAdapter(this)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentMain2Binding.inflate(layoutInflater,container,false)

        return binding?.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()

        binding?.savebutton?.setOnClickListener {
            openCreateNote()
        }

        parentFragmentManager.setFragmentResultListener(
            "result", viewLifecycleOwner,
        ) { key, result ->
            val text = result.getString("text")
            val title = result.getString("title")

            if (!text.isNullOrEmpty() && !title.isNullOrEmpty()) {
                listofNotes.add(Note(title.toString(), text.toString()))
                adapter.addNotes(listofNotes)
            }
        }

    }



    private fun openCreateNote() {

        parentFragmentManager.beginTransaction()
            .addToBackStack(MainFragment::class.java.canonicalName)
            .replace(R.id.fraqmentcontainer, CreateFragment())
            .commit()

    }

        private fun init(){
        binding?.recyclerList?.layoutManager=LinearLayoutManager(context)
        binding?.recyclerList?.adapter=adapter
        adapter?.addNotes(listofNotes)


    }

    private val listofNotes = mutableListOf<Note>(
        Note("nizam ", " eiubov"),
        Note(" jhfougyvp9igbpo ", " jsdjsfoidsfiowduf"),
        Note("jghfiytcuj", " jsdjsfoidsfiowduf"),
        Note("yogouj;hhb  ", " jsdjsfoidsfiowduf"),
    )

    override fun onClick(note: Note) {
        val bundle= bundleOf(
            "text" to note.content,
            "title" to note.title
        )
        val notefragment=NoteFragment()
        parentFragmentManager.beginTransaction()
            .addToBackStack(MainFragment::class.java.canonicalName)
            .replace(R.id.fraqmentcontainer,NoteFragment::class.java,bundle)
             .commit()

    }
}

