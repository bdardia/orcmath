package guiPlayer;

import guiTeacher.GUIApplication;


public class Sampler extends GUIApplication {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2452328323352199392L;
	static Sampler sample;
	static ChristmasScreen mainScreen;
	static SecondChristmasScreen secondScreen;

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
		Sampler.mainScreen = new ChristmasScreen(getWidth(), getHeight());
		Sampler.secondScreen = new SecondChristmasScreen(getWidth(), getHeight());
		
		setScreen(mainScreen);
	}
}