package com.example.fraqment.Fraqments.Fraqments.NoteApp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fraqment.databinding.FragmentNoteBinding



class NoteFragment : Fragment() {
    private var binding: FragmentNoteBinding? = null
    private var title: String? = null
    private var text: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = arguments?.getString("title")
        text = arguments?.getString("text")
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNoteBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.backbutton?.setOnClickListener {
            parentFragmentManager.popBackStack()

        }

        binding?.content?.text = title
        binding?.title?.text = text

        }



}