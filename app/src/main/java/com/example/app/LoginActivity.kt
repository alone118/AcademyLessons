package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.app.collections.CollectionHomeWork
import com.example.app.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.enteButton.setOnClickListener {
            val loginText = binding.loginEditText.text.toString()
            val passwordText = binding.loginEditText.text.toString()
            when {
                loginText.isEmpty() -> {
                    showToast("Заполните поле ввода для логина")
                }
                !loginText.contains("@gmail.com") -> {
                    showToast("Неправильный ввод логина")
                }

                passwordText.isEmpty() -> {
                    showToast("Заполните поле ввода для пароля")
                }

                passwordText.length <= 8 -> {
                    showToast("Пароль должен содержать не менее 8 символов")
                }
                else -> {
                    showToast("Добро пожаловать")
                    navigateToMusicListActivity()

                }
            }

        }
        binding.registrationText.setOnClickListener {
            val registedText = binding.registrationText.text.toString()
            navigateToSignUpActivity()
        }
    }

    private fun navigateToSignUpActivity() {
        val intent = Intent(this, SignUpActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }

    private fun navigateToMusicListActivity() {
        val intent = Intent(this, MusicListActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    }
}