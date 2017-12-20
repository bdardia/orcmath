package mystuff;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.Button;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogueScreen extends FullFunctionScreen {

	private TextField nameField;
	private Button addButton;
	
	public CatalogueScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) 
	{
		nameField = new TextField(40, 40, 230, 30, "Text goes here", "Name");
		viewObjects.add(nameField);
		nameField = new TextField(40, 90, 230, 30, "Text goes here", "Complexity");
		viewObjects.add(nameField);
		nameField = new TextField(40, 140, 230, 30, "Text goes here", "Type");
		viewObjects.add(nameField);
		nameField = new TextField(40, 190, 230, 30, "Text goes here", "Price");
		viewObjects.add(nameField);
		
		addButton = new Button(40, 240, 100, 40, "Add item", new Action() {
			
			@Override
			public void act() 
			{
				nameField.setText("You pressed the button");
			}
		});
	}

}
