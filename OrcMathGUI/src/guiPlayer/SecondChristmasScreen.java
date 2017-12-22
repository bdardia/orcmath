package guiPlayer;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class SecondChristmasScreen extends FullFunctionScreen
{

	private TextArea text;
	private Graphic image;
	private Button backButton;
	
	public SecondChristmasScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) 
	{
		text = new TextArea(40, 40, 200, 50, "we tried");
		viewObjects.add(text);
		
		image = new Graphic(0, 0, "resources/tree.jpg");
		viewObjects.add(image);
		
		backButton = new Button(0, 0, getWidth(), getHeight(), "", new Action() {
			
			@Override
			public void act() 
			{
				Sampler.sample.setScreen(Sampler.mainScreen);
			}
		});
		viewObjects.add(backButton);
	}

}
