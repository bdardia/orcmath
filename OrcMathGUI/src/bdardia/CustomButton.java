package bdardia;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics2D;

import guiTeacher.components.Button;

public class CustomButton extends Button implements CustomLabel
{

	public CustomButton(int x, int y) {
		super(x,y, 300,100,"",null);
		update();
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
	
	@Override
	public void drawButton(Graphics2D g, boolean hover)
	{
		g.setColor(Color.BLACK);
		FontMetrics fm = g.getFontMetrics();
		
		g.setColor(getForeground());
		String t = "Save";
		//just in case text is too wide, cut off
		int cutoff = t.length();
		while(cutoff > 0 && fm.stringWidth(t) > getWidth()){
			cutoff --;
			t = t.substring(0,cutoff); 
		}
		g.drawString(t, (getWidth()-fm.stringWidth(t))/2, 
				(getHeight()+fm.getHeight()-fm.getDescent())/2);
	}
	
	
	
}
