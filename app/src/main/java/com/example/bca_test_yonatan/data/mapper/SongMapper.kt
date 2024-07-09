package com.example.bca_test_yonatan.data.mapper

import com.example.bca_test_yonatan.data.model.SongData
import com.example.bca_test_yonatan.domain.model.Song

fun SongData.toDomainModel(): Song {
    return Song(
        wrapperType = this.wrapperType,
        kind = this.kind,
        artistId = this.artistId,
        collectionId = this.collectionId,
        trackId = this.trackId,
        artistName = this.artistName,
        collectionName = this.collectionName,
        trackName = this.trackName,
        collectionCensoredName = this.collectionCensoredName,
        trackCensoredName = this.trackCensoredName,
        artistViewUrl = this.artistViewUrl,
        collectionViewUrl = this.collectionViewUrl,
        trackViewUrl = this.trackViewUrl,
        previewUrl = this.previewUrl,
        artworkUrl30 = this.artworkUrl30,
        artworkUrl60 = this.artworkUrl60,
        artworkUrl100 = this.artworkUrl100,
        collectionPrice = this.collectionPrice,
        trackPrice = this.trackPrice,
        releaseDate = this.releaseDate,
        collectionExplicitness = this.collectionExplicitness,
        trackExplicitness = this.trackExplicitness,
        discCount = this.discCount,
        discNumber = this.discNumber,
        trackCount = this.trackCount,
        trackNumber = this.trackNumber,
        trackTimeMillis = this.trackTimeMillis,
        country = this.country,
        currency = this.currency,
        primaryGenreName = this.primaryGenreName,
        isStreamable = this.isStreamable,
        contentAdvisoryRating = this.contentAdvisoryRating,
    )
}
