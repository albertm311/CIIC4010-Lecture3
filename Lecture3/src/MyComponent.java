import java.awt.Graphics;
import javax.swing.JComponent;

public class MyComponent extends JComponent {

	private static final long serialVersionUID = 1L;

	static int counter = 0;

	public void paintComponent (Graphics g) {

		MutableCar bottomRightCar = new MutableCar(getWidth()-65,getHeight()-35);
//		Car bottomLeftCar = new Car(getWidth()-280,getHeight()-35);
//		Car upperLeftCar = new Car(1,1);
//		Car upperRightCar = new Car(getWidth()-65,1);
		//Debug - ID's son los object ids (mismo carro, mismas dimensiones con ids distintos)
		//Otra clase con carro mutable -  MutableCar
		//New -  crea objeto cada vez que redibuje la pantalla

		bottomRightCar.draw(g);
		bottomRightCar.setPosition(0, getHeight()-30);

//		bottomLeftCar.draw(g);
//		upperRightCar.draw(g);
//		upperLeftCar.draw(g);

		System.out.println(counter++);
	}
}
