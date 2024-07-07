package com.example.bca_test_yonatan.domain.usecase

import com.example.bca_test_yonatan.domain.model.Song
import com.example.bca_test_yonatan.domain.repository.SongRepository

class GetSongsUseCase (private val songRepository: SongRepository){
    suspend operator fun invoke():List<Song>{
        return songRepository.getSong()
    }
}