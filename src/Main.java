// Main.java 的补充部分

public class Main{
    public static void main(String[] args) {
        
        MusicBox mbox = new MusicBox("S34TG65", 'Y', "Raindrops", "Misty", 
        "The path less traveled", "Country", "BZEE Music", "Rhythm Divine");

        System.out.println("Now playing the song");
        mbox.playSong(mbox.getSongID(), mbox.getPremiumSong(), 2);
        
        // --- TODO: 创建第二个MusicBox对象
        MusicBox mbox2 = new MusicBox("NEW1234", 'N', "Sunshine", "Sunny", 
        "Bright Days", "Pop", "Sun Records", "Solar Beats");
        
        System.out.println("Now playing another song");
        mbox2.playSong(mbox2.getSongID(), mbox2.getPremiumSong(), 1);
    }
}




