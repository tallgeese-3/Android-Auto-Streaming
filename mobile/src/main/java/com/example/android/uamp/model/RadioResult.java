package com.example.android.uamp.model;

import java.util.List;

/**
 * Created by ewilliams on 10/22/15.
 */
public class RadioResult {
    public int count;
    public String next;
    public String previous;
    public Results[] results;

    public class Results {
        public String id;
        public String artist;
        public boolean is_song;
        public String track_artist;
        public String track_title;
        public MelvilContent[] melvil_content;
        public Track track;
    }

    public class MelvilContent {
        public String teaseimage_url;
        public Track track;
    }

    public class Track {
        public Artist[] artists;
    }

    public class Artist {
        public String large_image;
    }
}
