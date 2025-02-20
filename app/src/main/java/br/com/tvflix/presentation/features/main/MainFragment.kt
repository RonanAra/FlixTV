package br.com.tvflix.presentation.features.main

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.ArrayObjectAdapter
import androidx.leanback.widget.HeaderItem
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.ListRowPresenter
import br.com.tvflix.R
import br.com.tvflix.domain.entity.CategoryMovies
import br.com.tvflix.domain.entity.Movie
import br.com.tvflix.presentation.features.common.error.ErrorActivity
import br.com.tvflix.presentation.features.common.error.ErrorFragment
import br.com.tvflix.presentation.features.main.adapter.CardPresenterAdapter
import br.com.tvflix.presentation.features.main.viewmodel.MainUiState
import br.com.tvflix.presentation.features.main.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BrowseSupportFragment() {

    private val viewModel: MainViewModel by viewModels()
    private val menuCategoryAdapter by lazy { ArrayObjectAdapter(ListRowPresenter()) }
    private val itemListAdapter by lazy { ArrayObjectAdapter(CardPresenterAdapter()) }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?,
    ) {
        super.onViewCreated(
            view,
            savedInstanceState
        )
        setView()
        setupAdapter()
        setObservers()
    }

    override fun onResume() {
        super.onResume()
        viewModel.loadMovies()
    }

    private fun setObservers() {
        viewModel.uiState.observe(viewLifecycleOwner) { state ->
            when (state) {
                is MainUiState.Error -> showError(state.message)
                is MainUiState.Loading -> {}
                is MainUiState.Success -> setupMovieRows(
                    popularMovies = state.popularMovies,
                    topRatedMovies = state.topRatedMovies,
                    recommendedMovies = state.recommendedMovies
                )
            }
        }
    }

    private fun setupAdapter() {
        adapter = menuCategoryAdapter
    }

    private fun setupMovieRows(
        popularMovies: List<Movie>,
        topRatedMovies: List<Movie>,
        recommendedMovies: List<Movie>
    ) {
        CategoryMovies.entries.forEachIndexed { index, category ->
            val categoryHeader = HeaderItem(
                index.toLong(),
                getString(category.titleRes)
            )

            val movies = when (category) {
                CategoryMovies.POPULAR -> popularMovies
                CategoryMovies.TOP_RATED -> topRatedMovies
                CategoryMovies.RECOMMENDED -> recommendedMovies
            }
            itemListAdapter.addAll(0, movies)

            val categoryRow = ListRow(categoryHeader, itemListAdapter)

            menuCategoryAdapter.add(categoryRow)
        }
    }

    private fun setView() {
        title = getString(R.string.app_name)
    }

    private fun showError(message: String) {
        val intent = Intent(
            requireContext(),
            ErrorActivity::class.java
        ).apply {
            putExtra(
                ErrorFragment.MESSAGE_ARGUMENT,
                message
            )
        }
        startActivity(intent)
    }
}