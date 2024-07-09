package com.example.bca_test_yonatan.domain.repository

import com.example.bca_test_yonatan.data.model.SongData
import com.example.bca_test_yonatan.domain.model.Song

interface SongRepository {
    suspend fun getSong(): List<Song>
}