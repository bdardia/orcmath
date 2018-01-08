package bdardia;

import guiTeacher.GUIApplication;

public class SimonGameBenjamin extends GUIApplication 
{
	private static SimonScreenBenjamin simonScreen;
	
	public static void main(String[] args)
	{
		SimonGameBenjamin screen = new SimonGameBenjamin(1000, 1000);
		screen.initScreen();
	}
	
	public SimonGameBenjamin(int width, int height)
	{
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen()
	{
		SimonGameBenjamin.simonScreen = new SimonScreenBenjamin(getWidth(), getHeight());
		setScreen(simonScreen);
	}

}
