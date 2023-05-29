package com.example.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.app.collections.CollectionHomeWork

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // WhenClassWork()
        // ForWhileClassWork()
        //ForWhileHomeWork()
//        WhenHomework()
        //  ArraysClasswork()
        // ArrayClassworkd()
        CollectionHomeWork()
    }
}