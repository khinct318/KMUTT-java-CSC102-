public class Q3 {
    public static void main(String[] args) {
        Artist artist1 = new Artist("Artist 1", false);
        Artist artist2 = new Artist("Artist 2", false);
        Artist artist3 = new Artist("Artist 3", true);

        System.out.printf("%s %s %s\n", artist1.getName(), artist1.getDisplayName(), artist1.getNumAlbum());
        System.out.printf("%s %s %s\n", artist3.getName(), artist3.getDisplayName(), artist3.getNumAlbum());

        artist1.setName("Artist 1 Edited");
        artist2.setVerified(true);

        System.out.printf("%s %s %s\n", artist1.getName(), artist1.getDisplayName(), artist1.getNumAlbum());
        System.out.printf("%s %s %s\n", artist2.getName(), artist2.getDisplayName(), artist2.getNumAlbum());

        Album album1 = new Album("Album 1", new Artist[] { artist1, artist2 }, 2017);
        Album album2 = new Album("Album 2", new Artist[] { artist1, artist3 }, 2018);

        System.out.printf("%s %s %s\n", album1.getName(), album1.getReleaseYear(),
                album1.getArtistNames());
        System.out.printf("%d %d %d\n", artist1.getNumAlbum(), artist2.getNumAlbum(),
                artist3.getNumAlbum());

        Track track1 = new Track("Track 1", album1, true, 200);
        Track track2 = new Track("Track 2", album2, false, 210);

        System.out.printf("%s %s\n", track1.getId(), track1.getName());
        System.out.println(track1.getId());
        track1.printPreview();
        System.out.println(track2.getId());
        track2.printPreview();

        artist1.setVerified(true);
        artist3.setName("Artist 3 Edited");
        album1.setName("Album 1 Edited");
        track2.setName("Track 2 Edited");

        System.out.printf("%s %s %s\n", album1.getName(), album1.getReleaseYear(),
                album1.getArtistNames());
        track2.printPreview();
    }
}

class Artist {
    private String name;
    private boolean verified;
    private int numAlbum;

    public Artist(String name, boolean verified) {
        this.name = name;
        this.verified = verified;
        this.numAlbum = 0;
    }

    public String getName() {
        return this.name;
    }

    public String getDisplayName() {
        String display = "";
        if (verified) {
            display = getName() + " (/)";
        } else {
            display = getName();
        }
        return display;
    }

    public boolean isVerified() {
        return this.verified;
    }

    public int getNumAlbum() {
        return this.numAlbum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public void increaseNumAlbum() {
        this.numAlbum += 1;
    }
}

class Album {
    private String name;
    private Artist[] artists;
    private int releaseYear;

    public Album(String name, Artist[] artists, int releaseYear) {
        this.name = name;
        this.artists = artists;
        this.releaseYear = releaseYear;

        for (Artist a : this.artists) {
            a.increaseNumAlbum();
        }
    }

    public String getName() {
        return this.name;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public String getArtistNames() {
        String name = "";
        for (Artist a : artists) {
            name += a.getDisplayName() + ", ";
        }
        return name.substring(0, name.length() - 2);
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Track {
    private int trackId;
    private String trackName;
    private Album album;
    private boolean explicit;
    private int duration;
    private static int count = 0;

    public Track(String trackName, Album album, boolean explicit, int duration) {
        this.trackName = trackName;
        this.album = album;
        this.explicit = explicit;
        this.duration = duration;
        this.trackId = count;
        count++;
    }

    public int getId() {
        return trackId;
    }

    public String getName() {
        return this.trackName;
    }

    public void setName(String trackName) {
        this.trackName = trackName;
    }

    public void printPreview() {
        if (explicit) {
            System.out.println("(E) " + getName());
        } else {
            System.out.println(getName());
        }

        int sec = duration % 60;
        int min = duration / 60;

        if (sec < 10) {
            sec = Integer.parseInt("0" + sec);
        }

        if (min < 10) {
            min = Integer.parseInt("0" + min);
        }

        System.out.println(min + ":" + sec);
        System.out.println(album.getName());
        System.out.println(album.getArtistNames());
    }
}
