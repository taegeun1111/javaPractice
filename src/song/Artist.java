package song;

import bookLogin.StringList;

public class Artist {
    private static String name;
    private static StringList songList;

    public Artist(String name, StringList songList) {
        this.name = name;
        this.songList = songList;
    }

    public Artist() {
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Artist.name = name;
    }

    public static StringList getSongList() {
        return songList;
    }

    public static void setSongList(StringList songList) {
        Artist.songList = songList;
    }
}
