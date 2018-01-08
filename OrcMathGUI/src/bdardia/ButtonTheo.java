package bdardia;

import java.awt.Color;

import guiTeacher.components.Action;
import guiTeacher.components.Button;

public class ButtonTheo extends Button implements ButtonInterfaceBenjamin {

	public ButtonTheo(int x, int y, int w, int h, String text, Color color, Action action) {
		super(x, y, w, h, text, color, action);
		// TODO Auto-generated constructor stub
	}

	public ButtonTheo(int x, int y, int w, int h, String text, Action action) {
		super(x, y, w, h, text, action);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setColor(Color color) {
		this.setBackground(color);
		this.update();
	}
	

}
