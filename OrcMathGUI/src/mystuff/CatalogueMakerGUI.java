package mystuff;

import guiTeacher.GUIApplication;

public class CatalogueMakerGUI extends GUIApplication 
{

	public CatalogueMakerGUI(int width, int height) 
	{
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() 
	{
		CatalogueScreen s = new CatalogueScreen(getWidth(), getHeight());
		setScreen(s);
	}

	public static void main(String[] args)
	{
		CatalogueMakerGUI sample = new CatalogueMakerGUI(800, 550);
		Thread go = new Thread(sample);
		go.start();
	}

}
