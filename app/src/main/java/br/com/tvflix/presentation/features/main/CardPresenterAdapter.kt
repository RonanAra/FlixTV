package br.com.tvflix.presentation.features.main

import android.view.ViewGroup
import androidx.leanback.widget.ImageCardView
import androidx.leanback.widget.Presenter
import br.com.tvflix.domain.entity.Movie
import br.com.tvflix.utils.extensions.loadUrl

class CardPresenterAdapter : Presenter() {
    override fun onCreateViewHolder(parent: ViewGroup): ViewHolder {
        return CardViewHolder(ImageCardView(parent.context))
    }

    override fun onBindViewHolder(
        viewHolder: ViewHolder,
        item: Any,
    ) {
        (viewHolder as CardViewHolder).bind(item as Movie)
    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder) {
        with(viewHolder.view as ImageCardView) {
            mainImage = null
        }
    }

    inner class CardViewHolder(
        private val cardView: ImageCardView,
    ) : ViewHolder(cardView) {
        fun bind(movie: Movie) = with(cardView) {
            titleText = movie.title
            contentText = movie.year.toString()
            setMainImageDimensions(176, 213)
            isFocusable = true
            isFocusableInTouchMode = true
            mainImageView.loadUrl(movie.poster)
        }
    }
}