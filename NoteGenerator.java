//Notes Reference http://marcgg.com/blog/2016/11/01/javascript-audio/
// 		C		C#		D		Eb		E		F		F#		G		G#		A		Bb		B
// 0	16.35	17.32	18.35	19.45	20.60	21.83	23.12	24.50	25.96	27.50	29.14	30.87
// 1	32.70	34.65	36.71	38.89	41.20	43.65	46.25	49.00	51.91	55.00	58.27	61.74
// 2	65.41	69.30	73.42	77.78	82.41	87.31	92.50	98.00	103.8	110.0	116.5	123.5
// 3	130.8	138.6	146.8	155.6	164.8	174.6	185.0	196.0	207.7	220.0	233.1	246.9
// 4	261.6	277.2	293.7	311.1	329.6	349.2	370.0	392.0	415.3	440.0	466.2	493.9
// 5	523.3	554.4	587.3	622.3	659.3	698.5	740.0	784.0	830.6	880.0	932.3	987.8
// 6	1047	1109	1175	1245	1319	1397	1480	1568	1661	1760	1865	1976
// 7	2093	2217	2349	2489	2637	2794	2960	3136	3322	3520	3729	3951
// 8	4186	4435	4699	4978	5274	5588	5920	6272	6645	7040	7459	7902

import net.beadsproject.beads.core.AudioContext;
import net.beadsproject.beads.data.Buffer;
import net.beadsproject.beads.ugens.Gain;
import net.beadsproject.beads.ugens.Glide;
import net.beadsproject.beads.ugens.WavePlayer;

public class NoteGenerator {
	
	public String currentNoteName;
	public String currentNoteFrequency;
	public int[] cNotesArray;
	public int[] cSNotesArray;
	public int[] dNotesArray;
	public int[] dSNotesArray;
	public int[] eNotesArray;
	public int[] fNotesArray;
	public int[] fSNotesArray;
	public int[] gNotesArray;
	public int[] gSNotesArray;
	public int[] aNotesArray;
	public int[] aSNotesArray;
	public int[] bNotesArray;

	public NoteGenerator(){
		cNotesArray = createNotesArray(1);
		cSNotesArray = createNotesArray(2);
		dNotesArray = createNotesArray(3);
		dSNotesArray = createNotesArray(4);
		eNotesArray = createNotesArray(5);
		fNotesArray = createNotesArray(6);
		fSNotesArray = createNotesArray(7);
		gNotesArray = createNotesArray(8);
		gSNotesArray = createNotesArray(9);
		aNotesArray = createNotesArray(10);
		aSNotesArray = createNotesArray(11);
		bNotesArray = createNotesArray(12);
	}

	//C Music Notes
	//https://en.wikipedia.org/wiki/C_(musical_note)

	public int[] createNotesArray(int noteNumber){
		int[] notesArray;
		notesArray = new int[11];
		notesArray[0] = noteNumber;
		for(int i = 1; i <= 10; i++){
			noteNumber = noteNumber + 12;
			notesArray[i] = noteNumber;
			System.out.println("Adding new notePosition to array " + noteNumber);
			System.out.println("On position " + i);
		}
		return notesArray;
	}

	//How to Generate Note Frequencies
	//https://pages.mtu.edu/~suits/NoteFreqCalcs.html

	public float generateNoteFrequency(String noteName) {
		float referenceFrequency = 440;
		float noteFrequency = referenceFrequency;

		return noteFrequency;
	}

	public void playNote(String noteName) {
		float noteFrequency = generateNoteFrequency(noteName);

		// create an AudioContext
  		AudioContext ac = new AudioContext();
  
		// create a sine generator
		WavePlayer sine = new WavePlayer(ac, noteFrequency, Buffer.SINE);

		// add the Gain as an input to the master output, ac.out
  		ac.out.addInput(sineGain);
  
  		// begin audio processing
  		ac.start();
	}
}