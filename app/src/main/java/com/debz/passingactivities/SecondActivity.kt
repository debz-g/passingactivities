package com.debz.passingactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.debz.passingactivities.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val name= intent.getStringExtra("EXTRA_NAME")
//      These lines are getting the extra values from the intent
//        val age=intent.getIntExtra("EXTRA_AGE", 0)
//        val country=intent.getStringExtra("EXTRA_COUNTRY")
        val person= intent.getSerializableExtra("EXTRA_PERSON") as Person
//  If as Person was not added then getSerializable would have returned as Serializable
        binding.tvDetails.text=person.toString()

    }
}