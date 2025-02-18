package br.com.tvflix.presentation.features.main

import android.view.ViewGroup
import androidx.leanback.widget.ImageCardView
import androidx.leanback.widget.Presenter

class CardPresenterAdapter : Presenter() {
    override fun onCreateViewHolder(parent: ViewGroup?): ViewHolder {
        val cardView = ImageCardView(parent?.context).apply {
            isFocusable = true
            isFocusableInTouchMode = true
        }
        return CardViewHolder(cardView)
    }

    override fun onBindViewHolder(
        viewHolder: ViewHolder?,
        item: Any?,
    ) {
        (viewHolder as? CardViewHolder)?.bind(item as String)
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder?) {}

    inner class CardViewHolder(
        private val cardView: ImageCardView
    ) : ViewHolder(cardView) {
        fun bind(title: String) = with(cardView) {
            titleText = title
            setMainImageDimensions(176, 213)
        }
    }
}