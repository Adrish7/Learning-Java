
// these audios only works for wav audio files and not MP3, have to convert the MP3 files into a wav file online
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;
public class PlayingAudio {

	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		File file = new File("Moonlight in Mexico - Jimena Contreras.wav");
		// how to access the below class 
		// need to create an audio input stream
		AudioInputStream audio_stream = AudioSystem.getAudioInputStream(file);
		// have to create a clip object
		Clip clip = AudioSystem.getClip();
		clip.open(audio_stream);
		
		 // this doesn't work as the computer only runs this in the background until the code ends
		// seeing as this code is short it ends so quickly the song doesn't even start
		// thus we need to create a way where the audio keeps running until the user inputs (tells) the computer
		// to start
		// we can do this by creating a scanner or GUI on the top 
		
		// since the program will keep it running till the code ends, and the code will end only with some user
		// input, we can put this input into a variable 
		
		String response = scanner.next();


	}

}
