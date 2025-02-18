package br.com.tvflix.presentation.features.main

import android.os.Bundle
import android.view.View
import androidx.leanback.app.BrowseSupportFragment
import androidx.leanback.widget.ArrayObjectAdapter
import androidx.leanback.widget.HeaderItem
import androidx.leanback.widget.ListRow
import androidx.leanback.widget.ListRowPresenter
import br.com.tvflix.R

class MainFragment : BrowseSupportFragment() {

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
    }

    private fun setupAdapter() {
        val menuCategoryAdapter = ArrayObjectAdapter(ListRowPresenter())

        (1..5).forEach { categoryId ->
            val categoryTitle = "Category $categoryId"

            val itemListAdapter = ArrayObjectAdapter(CardPresenterAdapter())
            itemListAdapter.addAll(0, (1..10).map { "Item $it" })

            val categoryHeader = HeaderItem(categoryId.toLong(), categoryTitle)
            val categoryRow = ListRow(categoryHeader, itemListAdapter)

            menuCategoryAdapter.add(categoryRow)
        }
        adapter = menuCategoryAdapter
    }


    private fun setView() {
        title = getString(R.string.app_name)
    }
}