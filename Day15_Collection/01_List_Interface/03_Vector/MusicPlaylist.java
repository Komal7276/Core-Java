import java.util.Vector;

public class MusicPlaylist {

    public static void main(String[] args) {

        Vector<String> playlist = new Vector<>();

        // Add songs to playlist
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        System.out.println("Current Playlist:");
        System.out.println(playlist);

        // Play first song
        if (!playlist.isEmpty()) {
            String playingNow = playlist.remove(0);
            System.out.println("\nNow Playing: " + playingNow);
        }

        // Next song
        if (!playlist.isEmpty()) {
            System.out.println("Next Song: " + playlist.firstElement());
        }

        System.out.println("\nUpdated Playlist:");
        System.out.println(playlist);
    }
}