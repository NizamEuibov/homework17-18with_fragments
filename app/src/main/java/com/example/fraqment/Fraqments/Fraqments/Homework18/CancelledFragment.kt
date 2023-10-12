package com.example.fraqment.Fraqments.Fraqments.Homework18

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fraqment.R
import com.example.fraqment.databinding.FragmentCancelledBinding

class CancelledFragment : Fragment() {

    private var binding: FragmentCancelledBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =FragmentCancelledBinding.inflate(layoutInflater,container,false)
            return binding?.root
    }
    
}

