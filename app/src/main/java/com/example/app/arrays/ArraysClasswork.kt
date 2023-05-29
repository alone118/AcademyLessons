package com.example.app.arrays

import android.util.Log

class ArraysClasswork {
    init {
        //exampleFirst()
        //exampleSecond()
        //exempleThird()
        //exempleFour()
        exempleFifth()
    }

    fun exampleFirst() {
        val array: Array<Int> = arrayOf(1, 2, 3, 4)

        for (element in array) {
            Log.i("Bayastan", element.toString())
        }
    }

    fun exampleSecond() {
        val names: Array<String> = arrayOf("Bob", "Keane", "Michel")


        val bob: String = names[2]
        Log.i("Bayastan", bob)
    }

    fun exempleThird() {
        var i = 1
        val numbers: Array<Int> = Array(10, { i++ * 3 })
        for (number in numbers) {
            Log.i("Bayastan", number.toString())
        }
    }

    fun exempleFour() {
        var array = mutableListOf<String>()
        Log.i(
            "Bayastan", "Количество элементов в массиве = ${array.size}"
        )
        array.add("Bob")
        array.add("Michel")
        array.add(2, "Tom")
        array.add(0, "Jerry")
        Log.i(
            "Bayastan", "Количество элементов в массиве = ${array.size}"
        )

        for (name in array) {
            Log.i(
                "Bayastan", "Элемент = $name"
            )
        }
    }

    fun exempleFifth() {
        val array = mutableListOf<Double>()
        array.add(0.11)
        array.add(0.10)

        if (array.isNotEmpty()) {
            Log.i("Bayastan", array.first().toString())
        } else {
            Log.i("Bayasatn", "Массив пустой")
        }
        array.removeAt(1)
        for (element in array) {
            Log.i("Bayastan", element.toString())
        }
    }
}