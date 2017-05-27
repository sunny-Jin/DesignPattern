package AdapterPattern;

/**
 * Created by jzy on 2017/5/27.
 */
public class MediaAdapter implements MediaPlayer {
    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType)
    {
        if(audioType.equalsIgnoreCase("vlc"))
        {
            advanceMediaPlayer = new VicPlayer();
        }
        else if(audioType.equalsIgnoreCase("MP4"))
        {
            advanceMediaPlayer = new MP4Player();
        }
    }

    public void play(String audioType,String fileName)
    {
        if(audioType.equalsIgnoreCase("vlc"))
        {
            advanceMediaPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("Mp4"))
        {
            advanceMediaPlayer.playMP4(fileName);
        }

    }
}
