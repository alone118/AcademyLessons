package com.example.app.`when`

import android.util.Log

class WhenClassWork {
    init {
        val temperature: Int = 10
        var temperatureMessage: String = ""

        when (temperature) {
            in 0..20 -> {
                temperatureMessage = "Холодная"
            }
            in 0 downTo -20 -> {
                temperatureMessage = "Мороз"
            }
            in 20..40 -> {
                temperatureMessage = "Жарко"
            }
            in -20 downTo -100 -> {
                temperatureMessage = "Анамальный холод"
            }
            in 40..100 -> {
                temperatureMessage = "Анамальная жара"
            }
        }
        Log.i("ITAcademy", temperatureMessage)
    }
}