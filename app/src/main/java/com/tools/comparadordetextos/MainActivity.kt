package com.tools.comparadordetextos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import android.widget.EditText
import androidx.activity.viewModels
import com.tools.comparadordetextos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel.texts.observe(this) {
            binding.resultView.text = "Los textos son ${it.result}"
        }

        binding.button1.setOnClickListener {
            val text1 = findViewById<EditText>(R.id.textBox1).text.toString()
            val text2 = findViewById<EditText>(R.id.textBox2).text.toString()
            mainViewModel.compareTwoTexts(text1, text2)
        }
    }
}