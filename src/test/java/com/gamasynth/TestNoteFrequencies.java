package GamaSynth;
import org.testng.Assert;
import org.testng.annotations.Test;
import GamaSynth.NoteGenerator;

@Test
public class TestNoteFrequencies {
  @Test(groups = { "notefrequency" })
  public void testA0() {
	NoteGenerator noteGenerator = new NoteGenerator();
	double generatedNoteFrequency = noteGenerator.generateNoteFrequency("A0");
	Assert.assertEquals(27.50, generatedNoteFrequency);
  }
}