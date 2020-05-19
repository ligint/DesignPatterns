public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String Filename) {

        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing m3 file. Name : " + Filename);
        } else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,Filename);
        } else {
            System.out.println("Invalid media ." + audioType + "format not supported");
        }
    }
}
