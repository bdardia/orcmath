package guiPlayer;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.Graphic;
import guiTeacher.components.TextArea;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class ChristmasScreen extends FullFunctionScreen
{

	private Button nextButton;
	private TextArea text;
	private Graphic image;
	
	public ChristmasScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) 
	{
		text = new TextArea(0, 20, 200, 40, "you have a cake");
		viewObjects.add(text);
		text = new TextArea(0, 60, 500, 40, "click on the box to view the cake");
		viewObjects.add(text);
		nextButton = new Button(40, 100, 300, 215, "", new Action() {
			
			@Override
			public void act() 
			{
				Sampler.sample.setScreen(Sampler.secondScreen);
			}
		});
		viewObjects.add(nextButton);
		
		image = new Graphic(40, 100, 0.25, "resources/cake.jpg");
		viewObjects.add(image);
		
		text = new TextArea(0, 300, 200, 40, "happy holidays");
		viewObjects.add(text);
	}

}
