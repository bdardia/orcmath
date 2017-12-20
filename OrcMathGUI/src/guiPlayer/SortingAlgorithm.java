package guiPlayer;

import java.awt.Color;
import java.awt.Graphics2D;

import guiTeacher.components.AnimatedComponent;
import guiTeacher.components.Component;

public class SortingAlgorithm extends Component
{

	private String name;
	private String complexity;
	private String type;
	private int price;
	
	public SortingAlgorithm(String name, String complexity, String type, int price) 
	{
		super(40, 40, 30, 30);
		this.name = name;
		this.complexity = complexity;
		this.type = type;
		this.price = price;
		update();
	}

	@Override
	public void update(Graphics2D g) 
	{
//		g.setColor(Color.GREEN);
//		g.fillRect(0, 0, getWidth(), getHeight());
//		super.update();
	}
	
	@Override
	public String toString()
	{
		return this.name + "," + this.complexity + "," + this.type + "," + this.price;
	}

}
