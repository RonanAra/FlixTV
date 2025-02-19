package br.com.tvflix.di

import br.com.tvflix.domain.usecase.GetPopularUseCase
import br.com.tvflix.domain.usecase.GetPopularUseCaseImpl
import br.com.tvflix.domain.usecase.GetRecommendUseCase
import br.com.tvflix.domain.usecase.GetRecommendUseCaseImpl
import br.com.tvflix.domain.usecase.GetTopRatedUseCase
import br.com.tvflix.domain.usecase.GetTopRatedUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
interface UseCasesModule {

    @Binds
    fun bindGetPopularUseCase(useCaseImpl: GetPopularUseCaseImpl): GetPopularUseCase

    @Binds
    fun bindGetTopRatedUseCase(useCaseImpl: GetTopRatedUseCaseImpl): GetTopRatedUseCase

    @Binds
    fun bindGetRecommendedUseCase(useCaseImpl: GetRecommendUseCaseImpl): GetRecommendUseCase
}