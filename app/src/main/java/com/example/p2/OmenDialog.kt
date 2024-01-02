package com.example.p2

import android.app.Dialog
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class OmenDialog(private val index: Int) : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        return activity?.let {
            val alertDialog = AlertDialog.Builder(it)
//            alertDialog.setView(
//                requireActivity().layoutInflater.inflate(
//                    R.layout.omen_dialog_main,
//                    null
//                )
//            )
            val newView = requireActivity().layoutInflater.inflate(
                R.layout.omen_dialog_main,
                null
            )
            alertDialog.setView(newView)
            val omenImage: ImageView = newView.findViewById(R.id.omen)

            val drawableResource = when (index) {
                1 -> R.drawable.p72
                2 -> R.drawable.p272
                3 -> R.drawable.p317
                4 -> R.drawable.p322
                5 -> R.drawable.p359
                6 -> R.drawable.p377
                7 -> R.drawable.p474
                8 -> R.drawable.p481
                9 -> R.drawable.p482
                else -> R.drawable.p487
            }

            omenImage.setImageResource(drawableResource)
            alertDialog.create()

        } ?: throw IllegalStateException("Activity is null!")

    }

    fun showOmen() {
    }


}