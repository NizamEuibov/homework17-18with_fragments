package com.example.fraqment.Fraqments.Fraqments.NoteApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fraqment.R
import com.example.fraqment.databinding.ActivityMainBinding
import com.example.fraqment.databinding.ActivityNoteBinding

class NoteActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
          val mainFragment=MainFragment()


        supportFragmentManager.beginTransaction()
            .replace(R.id.fraqmentcontainer,mainFragment)
            .commit()
    }
}