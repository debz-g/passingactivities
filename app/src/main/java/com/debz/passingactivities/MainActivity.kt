package com.debz.passingactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.debz.passingactivities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnApply.setOnClickListener(){
            val name= binding.etName.text.toString()
//            These lines convert the data taken input from the user into string and stores them in variables
            val age= binding.etAge.text.toString().toInt()
//            First we convert app to string and then we convert it to Integer
            val country=binding.etCountry.toString()
            val person= Person(name, age, country)

            binding.btnApply.setOnClickListener(){
                Intent(this, SecondActivity::class.java).also {
                    it.putExtra("EXTRA_PERSON", person)
//  The object person we created can be called in putExtra bcoz it is being inherited from serializable in Person.kt
//  When we put extra stuff inside an intent, we need to provide a specific function with it.

                    startActivity(it)
                }
            }

            }
        }
    }
