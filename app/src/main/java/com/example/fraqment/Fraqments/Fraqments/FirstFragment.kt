package com.example.fraqment.Fraqments.Fraqments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import com.example.fraqment.R
import com.example.fraqment.databinding.FragmentFirstBinding


class FirstFragment :Fragment(){
    private lateinit var binding:FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding=FragmentFirstBinding.inflate(layoutInflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addbuttonfraqment.setOnClickListener {
            binding.textfraqment.text="done"

            openNextPage()
        }

    }

    private fun openNextPage() {

        val bundle= bundleOf(
            "name" to "Nizam",
            "surname" to "Eiubov",
            "age" to 25
        )

        parentFragmentManager.beginTransaction()
            .addToBackStack(FirstFragment::class.java.canonicalName)
            .replace(R.id.fraqmentcontainer,SecondFragment::class.java, bundle)
            .commit()
    }
}

