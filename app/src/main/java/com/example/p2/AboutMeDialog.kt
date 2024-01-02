package com.example.p2

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class AboutMeDialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val alertDialog = AlertDialog.Builder(it)
            alertDialog.setView(
                requireActivity().layoutInflater.inflate(R.layout.about_me_main,
                    null
                ))

            alertDialog.create()

        } ?: throw IllegalStateException("Activity is null!")
    }



}