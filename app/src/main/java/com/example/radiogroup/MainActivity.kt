package com.example.radiogroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.radiogroup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.butAnswer.setOnClickListener {
            if (binding.rdSphere.isChecked) binding.tvAnswer.text = "Правильно!"
            else binding.tvAnswer.text = "Неправильно!"
            if (binding.rgAnswers.checkedRadioButtonId == -1) binding.tvAnswer.text =
                "Неправильно!!!"
        }
        binding.btClear.setOnClickListener {
            binding.rgAnswers.clearCheck()
        }


    }
}