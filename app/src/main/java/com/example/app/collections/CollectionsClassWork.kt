package com.example.app.collections

import android.util.Log

class CollectionsClassWork {

    init {
        //  exempleFirst()
        //  exempleSecond()
        //  exempleThid()
        exempleFour()

    }

    private fun exempleFirst() {
        // создание типа лист
        val list = listOf<Short>()

        // создание типа мютаблист
        val mutableList = mutableListOf<String>()

        // Объект лист мы в дальнейшем не можем изменять
        // list.add - отсуствует
        // list.remove- отсуствует

        // Обычное добавление
        mutableList.add(element = "Bob")

        // Выборочное добавление
        mutableList.add(index = 0, element = "Tom")

        // Обычное удаление объекта
        mutableList.remove(element = "Bob")

        // Обычное удаление с помощью индекса
        mutableList.removeAt(index = 0)

        // Пример добавление одного списка к другому
        val secondeMutableList = mutableListOf<String>()
        secondeMutableList.add("Taxi")
        secondeMutableList.add("NARUTO")

        mutableList.addAll(elements = secondeMutableList)
        mutableList.add("passenger")

        Log.i("Bayastan", mutableList.toString())

        mutableList.clear()
        Log.i("Bayastan", mutableList.toString())

        //Способ перебирать объекты  помошью for
        for (element in mutableList) {

            //Способ перебирать объекты  помощью forEach
            mutableList.forEach { element ->

            }
        }
    }

    private fun exempleSecond() {
        val set = setOf<String>()
        val mutableSet = mutableSetOf<String>()

        mutableSet.add("Bob")
        mutableSet.add("Bob")

        val map = mutableMapOf<Int, Int>()

        map.put(key = 7, value = 786)
        map.put(key = 7, value = 98)

        Log.i("Bayastan ", mutableSet.toString())

        mutableSet.remove("Bob")

        mutableSet.forEach { element ->
        }

        mutableSet.forEachIndexed { index, element ->

        }

    }

    private fun exempleThid() {
        val map = mapOf<String, Int>()
        val mutableMap = mutableMapOf<String, Int>()

        mutableMap.put(key = "1234", value = 9)
        mutableMap.put(key = "12345", value = 10)

        val nine = mutableMap[""]

        Log.i("Bayastan", nine.toString())

    }

    private fun exempleFour() {
        val hashSet = hashSetOf<String>()
        hashSet.add("dd")
        hashSet.add("dd")
        Log.i("Bayastan", hashSet.toString())
    }

}
