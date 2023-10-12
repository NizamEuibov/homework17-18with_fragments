package com.example.fraqment.Fraqments.Fraqments.NoteApp

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import com.example.fraqment.databinding.FragmentCreateBinding



class CreateFragment : Fragment() {

    private var binding: FragmentCreateBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCreateBinding.inflate(layoutInflater, container, false)
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.savebutton?.setOnClickListener {
            save()
        }

        binding?.backbutton1?.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        binding?.backbutton1?.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

    }


    fun save() {

        parentFragmentManager.setFragmentResult(
            "result", bundleOf(
                "title" to binding?.editcontent?.text.toString(),
                "text" to binding?.edittitle?.text.toString()
            )
        )
        parentFragmentManager.popBackStack()


    }
}