package com.example.bca_test_yonatan.data.network

import com.example.bca_test_yonatan.data.model.SongData
import com.example.bca_test_yonatan.data.model.SongResponse
import retrofit2.http.GET

interface ApiService {
    @GET("search?term=yoasobi")
    suspend fun getSongs(): SongResponse
}