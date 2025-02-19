package br.com.tvflix.di

import br.com.tvflix.data.remote.datasource.MoviesDataSource
import br.com.tvflix.data.remote.datasource.MoviesDataSourceImpl
import br.com.tvflix.data.remote.repository.MoviesRepositoryImpl
import br.com.tvflix.domain.repository.MoviesRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindMoviesRepository(repository: MoviesRepositoryImpl): MoviesRepository

    @Binds
    fun bindMoviesDataSource(dataSource: MoviesDataSourceImpl): MoviesDataSource
}