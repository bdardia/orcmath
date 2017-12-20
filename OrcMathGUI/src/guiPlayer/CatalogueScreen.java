package guiPlayer;

import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Button;
import guiTeacher.components.TextArea;
import guiTeacher.components.TextField;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.FullFunctionScreen;

public class CatalogueScreen extends FullFunctionScreen{

	
	private CatalogueMaker catalogueMaker;
	
	private TextArea textArea;
	private TextField name;
	private Button add;
		/**
		 * 
		 */
		private static final long serialVersionUID = 258186143576427947L;

		public CatalogueScreen(int width, int height) 
		{
			super(width, height);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void initAllObjects(List<Visible> viewObjects) 
		{
			name = new TextField(40, 40, 230, 30, "Text goes here", "Name");
			viewObjects.add(name);
			name = new TextField(40, 90, 230, 30, "Text goes here", "Complexity");
			viewObjects.add(name);
			name = new TextField(40, 140, 230, 30, "Text goes here", "Type");
			viewObjects.add(name);
			name = new TextField(40, 190, 230, 30, "Text goes here", "Price");
			viewObjects.add(name);
			textArea = new TextArea(40, 240, 230, 30, "Add new items");
			viewObjects.add(textArea);
			add = new Button(40, 290, 50, 30, "Add", new Action() {
				
				@Override
				public void act() {
					addButtonClicked();
					
				}
			});
			viewObjects.add(add);
			
		}
			//Set styles

		protected void addButtonClicked() 
		{
			
		}
}