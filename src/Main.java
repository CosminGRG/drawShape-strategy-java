import app.draw.shape.*;

public class Main {

	public static void main(String[] args) {
		Canvas canvas = new Canvas();
		DrawController drawController = new DrawController(canvas);
		AppMenu applicationMenu = new AppMenu(drawController);
		
		applicationMenu.Init();
	}
}
