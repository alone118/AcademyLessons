package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.widget.Toast
import com.example.app.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivitySignUpBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.createButton.setOnClickListener {
            val nameText = binding.firstNameText.text.toString()
            val lastnameText = binding.lastNameText.text.toString()
            val emailText = binding.emailText.text.toString()
            val passwordText = binding.passwordText.text.toString()
            when {
                nameText.isEmpty() -> {
                    showToast("Заполните поле ввода для имя")
                }
                lastnameText.isEmpty() -> {
                    showToast("Заполните поле ввода для фамилии")
                }
                !emailText.contains("@gmail.com") -> {
                    showToast("Неправильный ввод логина")
                }
                passwordText.isEmpty() -> {
                    showToast("Заполните поле ввода для пароля")
                }
                passwordText.length <= 8 -> {
                    showToast("Пароль должен содержать не менее 8 символов")
                }
                else -> {
                    navuigateToLoginAtivity()
                    showToast("Аккаунт успешно создан")
                }
            }
        }
        binding.tvLogin.setOnClickListener {
            val tvlogin = binding.tvLogin.text.toString()
            navuigateToLoginAtivity()
        }
    }

    private fun navuigateToLoginAtivity() {
       val intent = Intent(this, LoginActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }
        private fun showToast(message: String) {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
