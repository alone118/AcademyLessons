package com.example.app.splash_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.app.MusicListActivity
import com.example.app.R
import com.example.app.SignUpActivity
import com.example.app.models.User

class SplashActivity : AppCompatActivity() {

    private val userCache: UserCacheManager by lazy {
        UserCacheManager(this)
    }

    private val user: User by lazy {
        userCache.getUser() ?: User.unknown()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var intent = if (user.isAuth) {
            Intent(this, MusicListActivity::class.java)
        } else {
            Intent(this, SignUpActivity::class.java)
        }
        startActivity(intent)
    }
}
