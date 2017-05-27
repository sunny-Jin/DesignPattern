package AdapterPattern;

/**
 * Created by jzy on 2017/5/27.
 */
public class MP4Player implements AdvanceMediaPlayer {
    public void playVlc(String fileName)
    {

    }

    public void playMP4(String fileName)
    {
        System.out.println("Playing vlc file. Name:"+fileName);
    }
}
