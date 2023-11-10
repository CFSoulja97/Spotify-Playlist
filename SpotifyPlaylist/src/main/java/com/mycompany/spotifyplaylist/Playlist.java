import java.util.ArrayList;
import java.util.List;

public class Playlist {
        private ArrayList<Song> playcounts;

/*
Constructor: purpose of method
*/
public Playlist() {
//Playcount playcounts = new ArrayList<>();

Song song1 = new Song(string:"Telephone Tough Guy", artist:"Cold Hard Truth", playcount:565543);
playcounts.add(e:song1);

Song song2 = new Song(string:"Closure", artist:"Splitknuckle", playcount:654232);
playcounts.add(e:song2);

Song song3 = new Song(string:"Evil Dead", artist:"Death", playcount:87966555);
playcounts.add(e:song3);

Song song4 = new Song(string:"Badder Den Dem", artist:"Burro Banton", playcount:7685433);
playcounts.add(e:song4);

Song song5 = new Song(string:"No Escape", artist:"Cycle of Abuse", playcount:6755432);
playcounts.add(e:song5);

Song song6 = new Song(string:"Chase The Sun", artist:"Planet Funk", playcount:1111000000);
playcounts.add(e:song6);

Song song7 = new Song(string:"10-71", artist:"Spawn of Disgust", playcount:7432849);
playcounts.add(e:song7);

Song song8 = new Song(string:"Drowning", artist:"No Zodiac", playcount:8787780);
playcounts.add(e:song8);

Song song9 = new Song(string:"Tear It Down", artist:"Hatebreed", playcount:112323210);
playcounts.add(e:song9);

Song song10 = new Song(string:"All I Have", artist:"Bulldoze", playcount:993424923);
playcounts.add(e:song10);

}

public Playcount findbyplaycount(int Playcount) {
    for(Playcount pc : playcounts) {
        if (pc.getPlaycount() == playcount) {
            return pc;
        }
    }
    return null;
        
    }
}

public Playcount remove(int Playcount) {
       Playcount pc = findbyplaycount (playcount);
       if (pc != null) {
           playcounts.remove(index: pc);
} else {
System.out.printIn(x: "playcount not found");
}
return pc;
}


import java.util.Scanner;
public class Main {
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (source:System.in);
        int choice;
        while (true) {
            System.out.printIn(x: "Press 1 to add a song");
            System.out.printIn(x: "Press 2 to remove a song");
            System.out.printIn(x: "Press 3 to print the playlist");
            System.out.printIn(x: "Press 4 to print a list of songs within a given number of plays");
            System.out.printIn(x: "Press 5 to exit");
            System.out.printIn(x: "Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.printIn(x: "Enter song name");
                    String songName = scanner.next();
                    System.out.printIn(x: "Enter song artist");
                    String artistName = scanner.next();
                    System.out.printIn(x: "Enter play count");
                    int playCount = scanner.nextInt();
                    System.out.printIn(x: "Song added");
                    // Code to add the song to the playlist
                    break;
                case 2:
                    System.out.printIn(x: "Enter song name to remove");
                    String songToRemove = scanner.next();
                    System.out.printIn(x: "Enter name of artist to remove");
                    String artistToRemove = scanner.next();
                    System.out.printIn(x: "Song removed");
                    // Code to remove the song from playlist
                    break;
                case 3:
                    System.out.printIn(x: "Print the playlist");
                    // Code to print the playlist
                    break;
                case 4:
                    System.out.printIn(x: "Enter the play count");
                    int plays = scanner.nextIn();
                    System.out.printIn(x: "Print songs within each play");
                    // Code to print a list of songs within a given number of plays
                    break;
                case 5:
                    System.out.printIn(x: "Exiting..");
                    return;
                default:
                    System.out.PrintIn(x: "Invalid choice");
                    break;
                    
                    
public class Song {
    private String name;
    private String artist;
    private int playcount;
    public Song(String name, String artist, int playcount) {
            this.name = name;
            this.artist = artist;
            this.playcount = playcount;
            
        }
        
        Song(String string, String Cold_Hard_Truth, int i, int i0, int i1) {
        
        }
        public void setName(String name) {
            this.name = name;
        
        }
        public String getName() {
            return name;
            
        }
        public void setArtist(String artist) {
            this.artist
        
            
        }
        public String getArtist() {
            return artist
            
        }
        public void setPlaycount(int playcount) {
            this.playcount
       
       
        }
        public String getPlaycount() {
            return playcount
        }
        public String toString(){
            return "Title: " + getName() + ", Artist:" = getArtist() + ", Play Count:" + getPlaycount();
        }
     
                 
            }
        }
    }
}
