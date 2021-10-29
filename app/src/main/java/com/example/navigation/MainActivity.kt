package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun main() {
            val states = arrayOf("Starting", "Doing Task 1", "Doing Task 2", "Ending")
            repeat(3) {
                GlobalScope.launch {
                    println("${Thread.currentThread()} has started")
                    for (i in states) {
                        println("${Thread.currentThread()} - $i")
                        delay(5000)
                    }
                }
            }
        }
    }
}