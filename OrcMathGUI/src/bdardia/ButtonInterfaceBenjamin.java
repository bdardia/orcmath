package bdardia;

import java.awt.Color;

import guiTeacher.components.Action;
import guiTeacher.interfaces.Clickable;

public interface ButtonInterfaceBenjamin extends Clickable 
{
	public void setColor(Color color);
	public void setAction(Action a);
	public void setX(int x);
	public void setY(int y);
}
