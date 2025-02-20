package br.com.tvflix.presentation.features.common.error

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import br.com.tvflix.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ErrorActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val message = intent.extras?.getString(ErrorFragment.MESSAGE_ARGUMENT).orEmpty()

            supportFragmentManager
                .beginTransaction()
                .replace(
                    R.id.main_browse_fragment,
                    ErrorFragment.newInstance(message)
                )
                .commit()
        }
    }
}