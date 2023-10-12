package com.example.fraqment.Fraqments.Fraqments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fraqment.R
import com.example.fraqment.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {


   private lateinit var binding:FragmentSecondBinding
   private var name:String?=null
    private var surname:String?=null
    private var age:Int?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        name= arguments?.getString("name")
        surname= arguments?.getString("surname")
        age= arguments?.getInt("age")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentSecondBinding.inflate(layoutInflater,container,false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.secondtextfraqment?.text="$name $surname $age"
        super.onViewCreated(view, savedInstanceState)
        binding.secondaddbuttonfraqment.setOnClickListener {

            parentFragmentManager.popBackStack()
        }
        }
    }


