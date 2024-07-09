package com.example.bca_test_yonatan

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.bca_test_yonatan.domain.model.Song
import com.example.bca_test_yonatan.viewmodel.SongListViewModel
import dagger.hilt.android.AndroidEntryPoint

import androidx.compose.foundation.layout.*
import com.example.bca_test_yonatan.data.model.SongData

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                topBar = {
                    TopAppBar(title = { Text(text = "Songs") })
                },
                content = { SongListContent() }
            )
        }
    }
}

@Composable
fun SongListContent() {
//    val viewModel: SongListViewModel = viewModel()
//    val songs by viewModel.songs.observeAsState(initial = emptyList())
//
//    LazyColumn {
//        items(songs) { song ->
//            SongItem(song)
//        }
//    }
}

@Composable
fun SongItem(song: Song) {
    Card(
        shape = RoundedCornerShape(8.dp),
        backgroundColor = Color.White,
        elevation = 4.dp,
        modifier = Modifier.padding(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = song.trackName,
                    modifier = Modifier.weight(1f)
                )
            }
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = song.artistName,
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = song.collectionName,
                    modifier = Modifier.weight(1f)
                )
            }
            // Add more rows for additional text fields if needed
        }
    }
}

