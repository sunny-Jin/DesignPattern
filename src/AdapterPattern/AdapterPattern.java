package AdapterPattern;

/**
 * Created by jzy on 2017/5/27.
 */
public class AdapterPattern {
    public static void main(String args[])
    {
        AudioPlayer audioPlayer =new AudioPlayer();
        audioPlayer.play("mp3","beyond");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far far away");
        audioPlayer.play("avi","mind me");

    }
}
