import java.awt.Color;

import javax.swing.JFrame;

public class MyMain
{
	public static void main(String[] args) throws InterruptedException
	{
		JFrame frame = new JFrame();

		CarStage theComponent = new CarStage();

		frame.add(theComponent);

		frame.getContentPane().setBackground( Color.PINK );
		frame.setSize(300, 400);
		frame.setLocation(400, 100);
		frame.setTitle("-----Java CAR------");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		while (true){
			frame.repaint();
			Thread.sleep(100);
		}
	}
}
