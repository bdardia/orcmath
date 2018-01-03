package bdardia;

import guiTeacher.GUIApplication;

public class SimonGameBenjamin extends GUIApplication 
{
	private static SimonScreenBenjamin simonScreen;
	
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
