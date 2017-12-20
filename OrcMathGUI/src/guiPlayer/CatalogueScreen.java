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
	private TextField complexity;
	private TextField type;
	private TextField price;
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
			catalogueMaker = new CatalogueMaker();
			
			name = new TextField(40, 40, 230, 30, "", "Name");
			viewObjects.add(name);
			complexity = new TextField(40, 90, 230, 30, "", "Complexity");
			viewObjects.add(complexity);
			type = new TextField(40, 140, 230, 30, "", "Type");
			viewObjects.add(type);
			price = new TextField(40, 190, 230, 30, "", "Price");
			viewObjects.add(price);
			textArea = new TextArea(300, 40, 500, 500, "");
			viewObjects.add(textArea);
			
			add = new Button(40, 290, 50, 30, "Add", new Action() {
				
				@Override
				public void act() {
					addButtonClicked();
				}
			});
			viewObjects.add(add);
			
			price.setInputType(TextField.INPUT_TYPE_NUMERIC);
			
		}
			//Set styles

		public void addButtonClicked() 
		{
			sortingAlgorithm sorts = new sortingAlgorithm(name.getText(), complexity.getText(), type.getText(), Integer.parseInt(price.getText()));
			catalogueMaker.addNewItem(name.getText(), complexity.getText(), type.getText(), Integer.parseInt(price.getText()));
			String s = textArea.getText() + sorts.toString() + "\n";
			textArea.setText(s);
			
			name.setText("");
			complexity.setText("");
			type.setText("");
			price.setText("");
		}
}