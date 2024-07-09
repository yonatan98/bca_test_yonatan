package com.example.bca_test_yonatan.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bca_test_yonatan.data.model.SongData
import com.example.bca_test_yonatan.domain.model.Song
import com.example.bca_test_yonatan.domain.usecase.GetSongsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SongListViewModel @Inject constructor(
    private val getSongsUseCase: GetSongsUseCase
) : ViewModel() {

    private val _songs = MutableLiveData<List<Song>>()
    val songs: LiveData<List<Song>> = _songs

    init {
        fetchSongs()
    }

    fun fetchSongs() {
        viewModelScope.launch {
            try {
                _songs.value = getSongsUseCase()
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
}