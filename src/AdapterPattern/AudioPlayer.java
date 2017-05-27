package AdapterPattern;

/**
 * Created by jzy on 2017/5/27.
 */
public class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    public void play(String audioType,String fileName)
    {
        if(audioType.equalsIgnoreCase("mp3"))
        {
            System.out.println("Playing mp3 file.name"+fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc")||audioType.equalsIgnoreCase("MP4"))
        {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
    }
}
