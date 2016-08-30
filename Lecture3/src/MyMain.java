import javax.swing.JFrame;

public class MyMain
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		MyComponent theComponent = new MyComponent();
		
		frame.add(theComponent);
		
		frame.setSize(300, 400);
		frame.setTitle("-----Java Gurus------");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
