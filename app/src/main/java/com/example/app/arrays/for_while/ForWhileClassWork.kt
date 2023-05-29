package com.example.app.arrays.for_while

import android.util.Log

class ForWhileClassWork {
    init {
        for (i in 0..100 step 100) {
                Log.i("ITAcademy", i.toString())
            }

        var x = 100
        while (x > 0){
            x--
            Log.i("ITAcademy", x.toString())
        }
        }
    }
