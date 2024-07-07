package com.example.bca_test_yonatan.data.mapper

import com.example.bca_test_yonatan.data.model.SongData
import com.example.bca_test_yonatan.domain.model.Song

fun SongData.toDomainModel(): Song {
    return Song(
        wrapperType = wrapperType,
        kind = kind,
        artistId = artistId,
        collectionId = collectionId,
        trackId = trackId,
        artistName = artistName,
        collectionName = collectionName,
        trackName = trackName,
        collectionCensoredName = collectionCensoredName,
        trackCensoredName = trackCensoredName,
        artistViewUrl = artistViewUrl,
        collectionViewUrl = collectionViewUrl,
        trackViewUrl = trackViewUrl,
        previewUrl = previewUrl,
        artworkUrl30 = artworkUrl30,
        artworkUrl60 = artworkUrl60,
        artworkUrl100 = artworkUrl100,
        collectionPrice = collectionPrice,
        trackPrice = trackPrice,
        releaseDate = releaseDate,
        collectionExplicitness = collectionExplicitness,
        trackExplicitness = trackExplicitness,
        discCount = discCount,
        discNumber = discNumber,
        trackCount = trackCount,
        trackNumber = trackNumber,
        trackTimeMillis = trackTimeMillis,
        country = country,
        currency = currency,
        primaryGenreName = primaryGenreName,
        isStreamable = isStreamable,
        contentAdvisoryRating = contentAdvisoryRating,
    )
}
