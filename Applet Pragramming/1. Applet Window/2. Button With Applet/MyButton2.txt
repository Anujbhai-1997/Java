import java.applet.*;
import java.awt.*;

public class MyButton extends Applet
{
	Button B1,B2,B3,B4;
	public void init()
	{
		B1 = new Button("Button 1");
		B2 = new Button("Button 2");
		B3 = new Button("Button 3");
		B4 = new Button("Button 4");
		add(B1);
		add(B2);
		add(B3);
		add(B4);
	}
}