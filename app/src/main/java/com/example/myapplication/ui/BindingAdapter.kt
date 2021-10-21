package com.example.myapplication.ui

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.myapplication.R

@BindingAdapter(value = ["image"])
fun image(view: ImageView?, value: Int) {
    when (value) {
        1 ->
            view?.setImageResource(R.drawable.alea_1)
        2 ->
            view?.setImageResource(R.drawable.two)
        3 ->
            view?.setImageResource(R.drawable.three)
        4 ->
            view?.setImageResource(R.drawable.four)
        5 ->
            view?.setImageResource(R.drawable.five)
        6 ->
            view?.setImageResource(R.drawable.alea_6)
    }
}