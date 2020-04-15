package app.draw.shape;

import java.util.Scanner;

public class Circle implements IShape {
	
	public static String name = "Circle";
	double radius;
	/*
	Point center;
	
	public Circle(double centerX, double centerY, double radius)
	{
		Point center = new Point(centerX, centerY);
		this.center = center;
		this.radius = radius;
	}
	*/
	
	@Override
	public void draw() {
		String symbol = "*";
		
		System.out.println();
		System.out.println("Circle with radius " + radius + ";");
		
		double thickness = 0.2;
        double rIn = radius - thickness, rOut = radius + thickness;

        for (double y = radius; y >= -radius; --y)
        {
        	System.out.println();
            for (double x = -radius; x < rOut; x += 0.5)
            {
                double value = x * x + y * y;
                if (value >= rIn * rIn && value <= rOut * rOut)
                {
                    System.out.print(symbol);
                }
                else
                {
                	System.out.print(" ");
                }
            }
        }
        System.out.println();
	}

	@Override
	public void read() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Radius:");
		double radius = input.nextDouble();
		
		this.radius = radius;
		
		System.out.println("Shape added - Circle");
		System.out.println("Radius: " + radius + ";");
		System.out.println("");
		
	}

	@Override
	public String getName() {
		return name;
	}

}
