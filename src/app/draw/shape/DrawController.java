package app.draw.shape;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DrawController {
	private Canvas canvas;
	
	public DrawController(Canvas canvas)
	{
		this.canvas = canvas;
	}
	
	void ReadRectangle()
	{
		canvas.setShape(new Rectangle());
		canvas.AddShape();
	}
	
	void ReadCircle()
	{
		canvas.setShape(new Circle());
		canvas.AddShape();
	}
	
	void DeleteShape()
	{
		canvas.ViewCanvasAsList();
		int option = 0;
		try
		{
			System.out.println("Insert index to delete shape:");
			
			option = ReadOption();
			
			if (canvas.getShapeList().get(option) != null)
			{
				canvas.getShapeList().remove(option);
				System.out.println("Shape deleted.");
			}
		}
		catch (InputMismatchException error)
		{
			System.out.println("Input Mismatch.");
		}
		catch (IndexOutOfBoundsException error)
		{
			System.out.println("Index out of bounds.");
			System.out.println("");
		}
	}
	
	public void ModifyShape()
	{
		canvas.ViewCanvasAsList();
		int option = 0;
		try
		{
			System.out.println("Insert index to delete shape:");
			
			option = ReadOption();
			
			if (canvas.getShapeList().get(option) != null)
			{
				canvas.getShapeList().get(option).read();
				System.out.println("Shape modified.");
			}
		}
		catch (InputMismatchException error)
		{
			System.out.println("Input Mismatch.");
		}
		catch (IndexOutOfBoundsException error)
		{
			System.out.println("Index out of bounds.");
			System.out.println("");
		}
	}
	
	public Canvas getCanvas()
	{
		return canvas;
	}
	
	private int ReadOption()
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int option = input.nextInt();
		
		return option;
	}
}
