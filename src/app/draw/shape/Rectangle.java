package app.draw.shape;

import java.util.Scanner;

public class Rectangle implements IShape {

	
	/*
	Point leftUp;
	Point rightDown;
	
	public Rectangle(double leftX, double leftY, double rightX, double rightY)
	{
		Point leftUp = new Point(leftX, leftY);
		Point leftDown = new Point(rightX, rightY);
	}
	*/
	public static String name = "Rectangle";
	int width;
	int length;
	
	@Override
	public void draw() {
		String symbol = "*";
		
		System.out.println("Rectangle with Length " + length + " and width " + width + ";");
		for (int i = 0; i < this.length; i++)
        {
			System.out.println("");
            for (int j = 0; j < this.width; j++)
            {
                if (i == 0 || i == this.length - 1)
                {
                	System.out.print(symbol);
                }
                else if (j == 0 || j == this.width - 1)
                {
                	System.out.print(symbol);
                }
                else
                {
                	System.out.print(" ");
                }
            }
        }
		System.out.println("");
	}

	@Override
	public void read() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lenght and Width:");
		int lenght = input.nextInt();
		int width = input.nextInt();
		
		this.length = lenght;
		this.width = width;
		
		System.out.println("Shape added - Rectangle");
		System.out.println("Lenght: " + lenght + "; " + "Width: " + width + ";");
		System.out.println("");
	}

	@Override
	public String getName() {
		return name;
	}

}
