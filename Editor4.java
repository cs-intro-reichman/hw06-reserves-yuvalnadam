import java.awt.Color;

/**
 * Demonstrates the morphing operation featured by Runigram.java. 
 * The program recieves a command-line arguments: a string representing the name
 * of the PPM file of a source image.
 * java Editor4 uses grayScaled to morph an image into its grescaled version
 */
public class Editor4 {

	public static void main (String[] args) {
		String source = args[0];
		Color[][] sourceImage = Runigram.read(source);
		Runigram.setCanvas(sourceImage);
		Color[][] grayedImage = Runigram.grayScaled(sourceImage);
		Runigram.display(grayedImage);
	}
}
