package app.draw.shape;

import app.menu.*;

public class AppMenu {
	private Menu mainMenu = new Menu("= Main Menu =");
	private Menu addShapeMenu = new Menu("= Add Shape Menu =");
	private DrawController drawController;
	
	public AppMenu(DrawController drawController)
	{
		this.drawController = drawController;
	}
	
	public void Init()
	{
		mainMenu.AddSubMenu(1, "Add Shape", addShapeMenu);
		mainMenu.AddMenuItem(2, "Delete Shape", (parameters) -> {
			drawController.DeleteShape();
		});
		mainMenu.AddMenuItem(3, "Modify", (parameters) -> {
			drawController.ModifyShape();
		});
		mainMenu.AddMenuItem(4, "View Canvas ", (parameters) -> {
			drawController.getCanvas().ViewCanvas();
		});
		addShapeMenu.AddMenuItem(1, "Add Circle", (parameters) -> {
			drawController.ReadCircle();
		});
		addShapeMenu.AddMenuItem(2, "Add Rectangle", (parameters) -> {
			drawController.ReadRectangle();
		});
		
		mainMenu.InitMenu();
	}
}
