package com.example.app.arrays

import android.util.Log
import java.util.Arrays

class ArrayClassworkd {

    init {
        val arrayBlockNumbers: Array<Int> = arrayOf(500852424, 942494294, 328742234)

        for (i in arrayBlockNumbers) {
            Log.i("Bayastan", arrayBlockNumbers.get(1).toString())
        }
    }
}

    fun printBankCustomers(){
        val arrayBankCustomers = mutableListOf<String>()

        arrayBankCustomers.add("Баястан")
        arrayBankCustomers.add("Абдурахман")
        arrayBankCustomers.add("Жылдыз")

        Log.i("Bayastan", arrayBankCustomers.toString())
    }

    fun printBlockNumbers(){
        val arrayBlockNumbers: Array<Int> = arrayOf(500852424, 942494294, 328742234)

        Log.i("Bayastan", Arrays.toString(arrayBlockNumbers))

        for (i in arrayBlockNumbers) {
            Log.i("Bayastan", i.toString())
        }
    }

