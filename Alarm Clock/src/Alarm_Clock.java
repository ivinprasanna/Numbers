import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Alarm_Clock {

	public static void main(String[] args) {
		try {
			String file = "C:/Users/viincy/Downloads/A_Life_Full_Of_Love.wav";
			Clip clip = AudioSystem.getClip();	
			clip.open(AudioSystem.getAudioInputStream(new File(file)));
		}
		catch(Exception exc) {
			exc.printStackTrace(System.out);
		}
	}	
}
