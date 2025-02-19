package br.com.tvflix.presentation.features.common.error

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.leanback.app.ErrorSupportFragment
import br.com.tvflix.R

class ErrorFragment : ErrorSupportFragment() {

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(
            view,
            savedInstanceState
        )
        setView()
        setListeners()
    }

    private fun setView() {
        val messageArgs = arguments?.getString(MESSAGE_ARGUMENT)
        title = resources.getString(R.string.app_name)
        message = resources.getString(
            R.string.custom_error_fragment_message,
            messageArgs.orEmpty()
        )
        setDefaultBackground(true)
        buttonText = resources.getString(R.string.dismiss_error)
    }

    private fun setListeners() {
        buttonClickListener = View.OnClickListener {
            parentFragmentManager
                .beginTransaction()
                .remove(this@ErrorFragment)
                .commit()
        }
    }

    companion object {
        private const val MESSAGE_ARGUMENT = "message"

        fun newInstance(message: String) = ErrorFragment().apply {
            arguments = bundleOf(
                MESSAGE_ARGUMENT to message
            )
        }
    }
}