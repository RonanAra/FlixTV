package br.com.tvflix.ui

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import br.com.tvflix.R

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}