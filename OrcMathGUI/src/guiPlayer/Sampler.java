import guiTeacher.GUIApplication;


public class Sampler extends GUIApplication {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2452328323352199392L;

	public Sampler(int width, int height) {
		super(width, height);
		setVisible(true);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args){
		Sampler sample = new Sampler(800, 550);
		Thread go = new Thread(sample);
		go.start();
	}

	@Override
	public void initScreen() {
		SampleScreen s = new SampleScreen(getWidth(), getHeight());
		setScreen(s);
	}
}