package com.example.app.splash_screen

import android.content.Context
import com.example.app.models.User
import com.google.gson.Gson

private const val USER_SHARED_PREFF_KEY = "USER_SHARED_PREFF_KEY"
private const val USER_PREFF_KEY = "USER_PREFF_KEY"

class UserCacheManager(
     context: Context
) {

    private val shaedPreferenes = context.getSharedPreferences(
        USER_SHARED_PREFF_KEY,
        Context.MODE_PRIVATE
    )

    fun getUser(): User? {
        val userString = shaedPreferenes.getString(
            USER_PREFF_KEY,
            null
        )
        val user = Gson().fromJson(userString, User::class.java) ?: null
        return user
    }

    fun saveNewUser(user: User) {
        val useGsonString = Gson().toJson(user)
        shaedPreferenes
            .edit()
            .putString(USER_PREFF_KEY,useGsonString)
            .apply()
    }

    fun removeCurrentUser() {
        shaedPreferenes
            .edit()
            .clear()
            .apply()
    }

}