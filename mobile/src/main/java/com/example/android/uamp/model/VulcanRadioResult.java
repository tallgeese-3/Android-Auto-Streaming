package com.example.android.uamp.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class VulcanRadioResult {
    public List<RadioObject> results;

    public class RadioObject {
        private String id;
        private String artist;
        @SerializedName("is_song")
        private boolean isSong;
        @SerializedName("song_id")
        private String songId;
        private String timestamp;
        @SerializedName("timestamp_iso")
        private String timestampISO;
        private String title;
        @SerializedName("track_artist")
        private String trackArtist;
        @SerializedName("track_title")
        private String trackTitle;
        private Track track;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public boolean isSong() {
            return isSong;
        }

        public void setSong(boolean song) {
            isSong = song;
        }

        public String getSongId() {
            return songId;
        }

        public void setSongId(String songId) {
            this.songId = songId;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getTimestampISO() {
            return timestampISO;
        }

        public void setTimestampISO(String timestampISO) {
            this.timestampISO = timestampISO;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getTrackArtist() {
            return trackArtist;
        }

        public void setTrackArtist(String trackArtist) {
            this.trackArtist = trackArtist;
        }

        public String getTrackTitle() {
            return trackTitle;
        }

        public void setTrackTitle(String trackTitle) {
            this.trackTitle = trackTitle;
        }

        public Track getTrack() {
            return track;
        }

        public void setTrack(Track track) {
            this.track = track;
        }
    }

    public class Track {
        private String id;
        private String title;
        private String artist;
        @SerializedName("artists_names")
        private String artistsNames;
        private List<Artist> artists;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public String getArtistsNames() {
            return artistsNames;
        }

        public void setArtistsNames(String artistsNames) {
            this.artistsNames = artistsNames;
        }

        public List<Artist> getArtists() {
            return artists;
        }

        public void setArtists(List<Artist> artists) {
            this.artists = artists;
        }
    }

    public class Artist {
        private String id;
        private String name;

        @SerializedName("artist_safe_uuid")
        private String artistSafeUUID;
        private String thumbnail;
        @SerializedName("large_image")
        private String largeImage;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getArtistSafeUUID() {
            return artistSafeUUID;
        }

        public void setArtistSafeUUID(String artistSafeUUID) {
            this.artistSafeUUID = artistSafeUUID;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public String getLargeImage() {
            return largeImage;
        }

        public void setLargeImage(String largeImage) {
            this.largeImage = largeImage;
        }
    }
}
