package bdardia;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiTeacher.components.Action;
import guiTeacher.components.TextLabel;
import guiTeacher.interfaces.Visible;
import guiTeacher.userInterfaces.ClickableScreen;

public class SimonScreenBenjamin extends ClickableScreen implements Runnable 
{
	private static ProgressInterfaceBenjamin progress;
	private static ArrayList<MoveInterfaceBenjamin> buttonList;
	private static int roundNumber;
	private static boolean userInput;
	private static TextLabel roundText;
	private static ButtonInterfaceBenjamin[] buttons;
	private static int lastButton = 0;
	private static Color[] colors;
	
	public SimonScreenBenjamin(int width, int height) 
	{
		super(width, height);
		Thread game = new Thread(this);
		game.start();
	}

	@Override
	public void run() 
	{
		
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects)
	{
		roundNumber = 0;
		lastButton = -1;
		for (ButtonInterfaceBenjamin b: buttons)
		{
			viewObjects.add(b);
		}
		buttonList = new ArrayList<MoveInterfaceBenjamin>();
		addRandomMoves(2);
		roundText = new TextLabel(100, 200, 250, 50, "Round: " + roundNumber);
		viewObjects.add(roundText);
		
		for (int i = 0; i < buttons.length; i += 1)
		{
			buttons[i] = getButton();
			ButtonInterfaceBenjamin currentButton = buttons[i];
			Color currentColor = colors[i];
			int currentIndex = i;
			currentButton.setColor(currentColor);
			currentButton.setX(50);
			currentButton.setY(i * 20);
			currentButton.setAction(new Action() {
				
				@Override
				public void act() {
					if (userInput)
					{
						Thread flash = new Thread(new Runnable() {
							
							@Override
							public void run() {
								currentButton.setColor(currentColor.brighter());
								try {
									Thread.sleep(800);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								currentButton.setColor(currentColor);
							}
						});
						flash.start();
						if (currentButton == buttonList.get(currentIndex).getButton());
					}
					
				}
			});
		}
	}
	
	private ButtonInterfaceBenjamin getButton() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addRandomMoves(int numberOfMoves)
	{
		for (int i = 0; i < numberOfMoves; i += 1)
		{
			int index = (int)(Math.random() * buttons.length);
			
			if (index == lastButton)
			{
				i -= 1;
				continue;
			}
			
			buttonList.add(getMove(index));
			
		}
		
	}

	private MoveInterfaceBenjamin getMove(int index) 
	{
		return null;
	}

}
