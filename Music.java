//import edu.princeton.cs.algs4.Insertion;
import java.util.*;

public class Music implements Comparable<Music> {

    private String artist;
    private String song;
    private String album;
    private String songLength;
    private  String description;
    private String sort;

public Music(String[] inputarray, String description) {
    this.description = description;
    String [] desc = description.split(" ");
    for(int i=0; i<desc.length;i++){
        if(desc[i].contains("Artist")) artist = inputarray[i];
        if(desc[i].contains("Album")) album = inputarray[i];
        if(desc[i].contains("Song")) song = inputarray[i];
        if(desc[i].contains("Length") || desc[i].contains("Seconds")) songLength = inputarray[i];
    }
       }

public void setSort(String sort){
    this.sort = sort;
}
@Override 
public String toString(){
    String print = "";
    if(this.artist!=null)  print = print + this.artist;
    if(this.album!=null)  print = print + " " + this.album;
    if(this.song!=null)   print = print + " " + this.song;
    if(this.songLength!=null)  print = print + " " + this.songLength;
    return print;
}

@Override
public int compareTo (Music that) {
    if(that.sort.contains("Artist")&& this.artist!=null){
            if (this.artist.compareTo(that.artist)>0) return 1;
            if(this.artist.compareTo(that.artist)<0) return -1;
            if (this.artist.compareTo(that.artist)==0) return 0;
    } else if(that.sort.contains("Album")&& this.album!=null){
            if(this.album.compareTo(that.album)>0) return 1;
            if (this.album.compareTo(that.album)<0) return -1;
            if (this.album.compareTo(that.album)==0) return 0;
    } else if(that.sort.contains("Song")&&this.song!=null){
            if(this.song.compareTo(that.song)>0) return 1;
            if (this.song.compareTo(that.song)<0) return -1;
            if (this.song.compareTo(that.song)==0) return 0;
    } else if(that.sort.contains("Length")|| that.sort.contains("Seconds")&& this.songLength!=null){
            if (this.songLength.compareTo(that.songLength)<0) return -1;
            if (this.songLength.compareTo(that.songLength)>0) return 1;
            if (this.songLength.compareTo(that.songLength)==0) return 0;
}
return 0;
}

public static void sort(Comparable[] a) {
    int n = a.length;
    for (int i = 1; i < n; i++) {
        for (int j = i; j > 0 && less(a[j], a[j-1]); j--) {
            exch(a, j, j-1);
        }
        assert isSorted(a, 0, i);
    }
    assert isSorted(a);
}

private static boolean less(Comparable v, Comparable w) {
    return v.compareTo(w) < 0;
}

private static void exch(Object[] a, int i, int j) {
    Object swap = a[i];
    a[i] = a[j];
    a[j] = swap;
}

private static boolean isSorted(Comparable[] a) {
    return isSorted(a, 0, a.length);
}

private static boolean isSorted(Object[] a, Comparator comparator) {
    return isSorted(a, 0, a.length, comparator);
}

private static boolean isSorted(Comparable[] a, int lo, int hi) {
    for (int i = lo + 1; i < hi; i++)
        if (less(a[i], a[i-1])) return false;
    return true;
}

private static boolean isSorted(Object[] a, int lo, int hi, Comparator comparator) {
    for (int i = lo + 1; i < hi; i++)
        if (less(a[i], a[i-1], comparator)) return false;
    return true;
}

// is v < w ?
private static boolean less(Object v, Object w, Comparator comparator) {
    return comparator.compare(v, w) < 0;
}


public static void main (String[] args) {

    //Scanner sc = new Scanner("Artist Album Song_Title Length_seconds\n5\nTchaikovsky Piano_Favorites November 163\nJames_Taylor Dad_Loves_His_Work Hard_Times 192\nJames_Taylor Dad_Loves_His_Work London_Town 236\nJames_Taylor Dad_Loves_His_Work Summers_Here 163\nGeorge_Winston Summer Lullaby 215\n3\nArtist\nAlbum\nSong_Title");
    Scanner sc = new Scanner("Artist_Name Song\n2\nChopin Scherzo_no_1_in_B_minor\nChopin Polonaise_no_3_in_A\n2\nArtist_Name\nSong"); 
    //Scanner sc = new Scanner(System.in);
    String description = sc.nextLine();
    int records = sc.nextInt();
    Music [] music = new Music[records];
    sc.nextLine();
    for (int i=0; i< records; i++) {
        String input = sc.nextLine();
        String [] arr = input.split(" ");
                Music ms = new Music(arr, description);
                music [i] = ms;
        } 
  
        int n = Integer.parseInt(sc.nextLine());
    for (int i=0; i<n; i++) {
        System.out.println(description);
            String sort =  sc.nextLine();
            for (Music  object : music) object.setSort(sort);
           Music.sort(music);
            for(int j=0; j<music.length; j++){
                System.out.println((music[j]));
        }
        System.out.println();
    }
    
}
}


