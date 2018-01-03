package bdardia;

import java.util.ArrayList;
import java.util.List;

import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenBenjamin extends ClickableScreen implements Runnable 
{
	private ProgressInterfaceBenjamin progress;
	private ArrayList<MoveInterfaceBenjamin> buttons;
	private int roundNumber;
	private boolean userInput;
	
	public SimonScreenBenjamin(int width, int height) 
	{
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void initAllObjects(List<Visible> viewObjects)
	{
		// TODO Auto-generated method stub

	}

}
