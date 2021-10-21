package com.example.myapplication.ui

import kotlin.random.Random

class Repository {
    fun rand(): Int {
        val start = 1
        val end = 6

        val rand = Random(System.nanoTime())
        return (start..end).random(rand)
    }


}