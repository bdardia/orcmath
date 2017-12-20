package guiPlayer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CatalogueMaker 
{

	private ArrayList<sortingAlgorithm> list;
	
	public CatalogueMaker() 
	{
		list = new ArrayList<sortingAlgorithm>();
		list.add(new sortingAlgorithm("Stooge Sort", "n^2.7", "anything", 1));
		list.add(new sortingAlgorithm("Bubble Sort", "n^2", "anything", 10));
		list.add(new sortingAlgorithm("Insertion Sort", "n^2", "anything", 100));
		list.add(new sortingAlgorithm("Radix LSD", "n * (k/d)", "integer/string", 1000));
		list.add(new sortingAlgorithm("Burstsort", "n * (k/d)", "string", 1500));
		list.add(new sortingAlgorithm("Spaghetti Sort", "n", "integer/string", 1000000));
	}
	
	public String getCsvContent()
	{
		String data = "name,complexity,type,price\n";
		
		for(sortingAlgorithm e: list)
		{
			data += e.toString() + "\n";
		}
		
		return data;
	}
	
	public void addNewItem(String name, String complexity, String type, int price)
	{
		list.add(new sortingAlgorithm(name, complexity, type, price));
	}
	
	public void testSaveContent(String fileName, String content) {
		try{    
			FileWriter fw=new FileWriter(fileName);    
			fw.write(content);    
			fw.close();    
			System.out.println("Success! File \""+fileName+"\" saved!");
		}catch(IOException e){
			System.out.println("An IOException was thrown. \nCheck to see that the directory where you tried to save the file actually exists.");
		}

	}
	
	public List<String> testFileLoading() {
		Scanner in = new Scanner(System.in);
		String fileName = "";
		List<String> content = new ArrayList<String>();
		//use this boolean to control the while loop. The user should have multiple chances to enter a correct filename
		boolean opened = false;
		while(!opened){
			try {
				System.out.println("Enter a file to open");
				fileName = in.nextLine();
				FileReader fileReader = new FileReader(new File(fileName));
				String line = "";
				//a BufferedReader enables us to read teh file one line at a time
				BufferedReader br = new BufferedReader(fileReader);
				while ((line = br.readLine()) != null) {

					content.add(line);

					/*
					 * useful later:
					 * split only a comma that has an even number of quotes ahead of it
 String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
					 */


				}
				br.close();
				opened = true;
			}catch (IOException e) {
				System.out.println("The file name you specified does not exist.");
			}
		}


		//close the Scanner
		in.close();
		return content;
	}
	
	public static void main(String[] args)
	{
		CatalogueMaker catalogue = new CatalogueMaker();
		System.out.println(catalogue.getCsvContent());
		
		catalogue.testSaveContent("sorting.csv", catalogue.getCsvContent());
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter name of item to add:");
//		String name = in.nextLine();
//		System.out.println("Enter complexity of item to add:");
//		String complexity = in.nextLine();
//		System.out.println("Enter type of item to add:");
//		String type = in.nextLine();
//		System.out.println("Enter price of item to add:");
//		int price = Integer.parseInt(in.nextLine());
//		catalogue.addNewItem(name, complexity, type, price);
//		System.out.println("Added new item.");
//		System.out.println(catalogue.getCsvContent());
		
		
	}

}
