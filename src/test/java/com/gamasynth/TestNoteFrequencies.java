package GamaSynth;
import org.testng.Assert;
import org.testng.annotations.Test;
import GamaSynth.NoteGenerator;

@Test
public class TestNoteFrequencies {
  @Test(groups = { "notefrequency" })
  public void testA0frequency() {
	NoteGenerator noteGenerator = new NoteGenerator();
	double generatedNoteFrequency = noteGenerator.generateNoteFrequency("A0");
	Assert.assertEquals(generatedNoteFrequency, 27.50);
  }

  public void testC0frequency() {
	NoteGenerator noteGenerator = new NoteGenerator();
	double generatedNoteFrequency = noteGenerator.generateNoteFrequency("C0");
	Assert.assertEquals(generatedNoteFrequency, 16.35);
  }

  public void testF8frequency() {
	NoteGenerator noteGenerator = new NoteGenerator();
	double generatedNoteFrequency = noteGenerator.generateNoteFrequency("F8");
	Assert.assertEquals(generatedNoteFrequency, 5587.65);
  }

  public void testC10frequency() {
	NoteGenerator noteGenerator = new NoteGenerator();
	double generatedNoteFrequency = noteGenerator.generateNoteFrequency("C10");
	Assert.assertEquals(generatedNoteFrequency, 16744.04);
  }
  
  public void testCsharp8frequency() {
	NoteGenerator noteGenerator = new NoteGenerator();
	double generatedNoteFrequency = noteGenerator.generateNoteFrequency("C#8");
	Assert.assertEquals(generatedNoteFrequency, 4434.92);
  }

  public void testCsharp10frequency() {
	NoteGenerator noteGenerator = new NoteGenerator();
	double generatedNoteFrequency = noteGenerator.generateNoteFrequency("C#10");
	Assert.assertEquals(generatedNoteFrequency, 17739.69);
  }
}