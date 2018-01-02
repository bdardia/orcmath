package bdardia;

import java.awt.Color;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class CustomButton extends Button implements CustomLabel
{

	public CustomButton(int x, int y) {
		super(x, y, 40, 200, "Save", new Action() {			
			@Override
			public void act() {
				// TODO Auto-generated method stub
				
			}
		});
		// TODO Auto-generated constructor stub
	}

	@Override
	public void updateString1(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateString2(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setIconColor(Color color) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
