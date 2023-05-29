package com.example.app.collections

import android.util.Log

class CollectionHomeWork {

    init {
        // example1()
        example2()
    }

    private fun example1() {
        val list = mutableListOf<Int>()

        for (i in 1..10) {
            list.add(i)
        }

        Log.i("Bayastan", list.toString())
    }

    private fun example2() {
        val list = mutableListOf<Int>()
        var sum = 0
        for (i in 1..30) {
            list.add(i)
        }

        list.forEach {
            if (it % 3 ==0) {
                sum += it
            }
        }


        Log.i("Bayastan", sum.toString())
    }
    private fun exemple3() {
        val list = mutableListOf<Int>()
        var sum = 0
        for (i in 1..20) {
            list.add(i)
        }
        list.forEach {
                list.remove(it % 2 )



        }
    }
}