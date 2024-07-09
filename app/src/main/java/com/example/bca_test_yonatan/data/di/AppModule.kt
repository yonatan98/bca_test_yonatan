package com.example.bca_test_yonatan.data.di

import com.example.bca_test_yonatan.data.network.ApiService
import com.example.bca_test_yonatan.data.repository.SongRepositoryImpl
import com.example.bca_test_yonatan.domain.repository.SongRepository
import com.example.bca_test_yonatan.domain.usecase.GetSongsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApiService(): ApiService {
        return Retrofit.Builder().baseUrl("https://itunes.apple.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideSongRepository(apiService: ApiService): SongRepository {
        return SongRepositoryImpl(apiService)
    }

    @Provides
    @Singleton
    fun provideGetSongsUseCase(songRepository: SongRepository): GetSongsUseCase {
        return GetSongsUseCase(songRepository)
    }
}