package com.codinginflow.mvvmtodo.ui.deleteallcompleted

import android.app.Dialog
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DeleteAllCompletedDialogFragment : DialogFragment () {

    private val viewModel: DeleteAllCompletedViewModel by viewModels()

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog =
        AlertDialog.Builder(requireContext())
            .setTitle("CONFIRM DELETION")
            .setMessage("Do You Really Want To Delete All Completed Tasks?")
            .setNegativeButton("No, Cancel", null)
            .setPositiveButton("Yes, Delete") { _, _ ->
                //call viewModel
                viewModel.onConfirmClick()
            }
            .create()
}