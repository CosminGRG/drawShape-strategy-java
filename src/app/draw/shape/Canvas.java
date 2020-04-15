package app.draw.shape;

import java.util.ArrayList;

public class Canvas {
	private IShape shape;
	private ArrayList<IShape> shapeList = new ArrayList<IShape>();
	
	public void AddShape()
	{
		shape.read();
		shapeList.add(shape);
	}
	
	public void DrawShape()
	{
		shape.draw();
	}
	
	public void setShape(IShape shape)
	{
		this.shape = shape;
	}
	
	public ArrayList<IShape> getShapeList()
	{
		return shapeList;
	}
	
	public void ViewCanvasAsList()
	{
		if (shapeList.size() == 0)
		{
			System.out.println("");
			System.out.println("Canvas is empty.");
			System.out.println("");
		}
		int index = 0;
		for (IShape item : shapeList)
		{
			System.out.println("Index : Shape Type");
			System.out.println(index + " : " + item.getName());
			index++;
		}
		System.out.println("");
	}
	
	public void ViewCanvas()
	{
		if (shapeList.size() == 0)
		{
			System.out.println("");
			System.out.println("Canvas is empty.");
			System.out.println("");
		}
		for (IShape item : shapeList)
		{
			item.draw();
		}
		System.out.println("");
	}
}
