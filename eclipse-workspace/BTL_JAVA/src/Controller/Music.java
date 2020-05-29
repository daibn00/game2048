package Controller;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class Music {
	
	public static void main(String[] args) {
		Music m = new Music();
		m.playMusic("./assets/music.wav");
	}
	
	public  void playMusic(String filePath) {
		
		File f = new File(filePath);

        if(f.exists()) {
        	try {
    			AudioInputStream audioInput = AudioSystem.getAudioInputStream(f);
    	        Clip clip = null;
    			try {
    				clip = AudioSystem.getClip();
    			} catch (LineUnavailableException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    	        try {
    				clip.open(audioInput);
    			} catch (LineUnavailableException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    	        clip.start();
            	System.out.println(111);
    	        clip.loop(Clip.LOOP_CONTINUOUSLY);
    		} catch (UnsupportedAudioFileException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
        }

		
	}
	

}
