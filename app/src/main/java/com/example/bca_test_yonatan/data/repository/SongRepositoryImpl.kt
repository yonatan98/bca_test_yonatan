package com.example.bca_test_yonatan.data.repository

import android.util.Log
import com.example.bca_test_yonatan.data.mapper.toDomainModel
import com.example.bca_test_yonatan.data.model.SongData
import com.example.bca_test_yonatan.data.model.SongResponse
import com.example.bca_test_yonatan.data.network.ApiService
import com.example.bca_test_yonatan.domain.model.Song
import com.example.bca_test_yonatan.domain.repository.SongRepository
import com.google.gson.Gson
import com.google.gson.annotations.SerializedName
import org.json.JSONObject

class SongRepositoryImpl(private val apiService: ApiService) : SongRepository {
    override suspend fun getSong(): List<Song> {
        val jsonData: SongResponse = apiService.getSongs()
        Log.d("TAG", jsonData.toString())

        val songsList: List<SongData> = jsonData.results

        val finalResult: List<Song> = songsList.map { it.toDomainModel() }
        Log.d("TAG", finalResult.toString())
        return finalResult
    }
}

fun mapJsonToSongData(json: String): List<SongData> {
    val gson = Gson()
    val songDataResponse = gson.fromJson(json, SongDataResponse::class.java)
    return songDataResponse.results
}

data class SongDataResponse(
    @SerializedName("resultCount") val resultCount: Int,
    @SerializedName("results") val results: List<SongData>
)