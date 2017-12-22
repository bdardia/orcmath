package guiPlayer;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.IOException;

import guiTeacher.GUIApplication;
import guiTeacher.components.StyledComponent;


public class Sampler extends GUIApplication {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2452328323352199392L;
	static Sampler sample;
	static ChristmasScreen mainScreen;
	static SecondChristmasScreen secondScreen;
	private static File file;
	private static Font font;

	public Sampler(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		sample = new Sampler(500, 500);
		Thread go = new Thread(sample);
		go.start();
	}

	@Override
	public void initScreen() {
//		CatalogueScreen s = new CatalogueScreen(getWidth(), getHeight());
		try
		{
			file = new File("resources/COMIC.TTF");
			font = Font.createFont(Font.TRUETYPE_FONT, file);
			Font baseFont = font.deriveFont(20f);
			
			StyledComponent.setBaseFont(baseFont);
		}
		catch(Exception e)
		{
			System.err.println("rickrolled");
		}
		
		Sampler.mainScreen = new ChristmasScreen(getWidth(), getHeight());
		Sampler.secondScreen = new SecondChristmasScreen(getWidth(), getHeight());
		
		setScreen(mainScreen);
	}
}