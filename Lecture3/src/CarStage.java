import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class CarStage extends JComponent {

	private static final long serialVersionUID = 1L;

	static int counter = 0;

	MutableCar theCar = new MutableCar(0,0,Color.CYAN,10,1);

	boolean onAWall  = false;

	public void paintComponent (Graphics g) {

		theCar.draw(g);   
		if (onAWall){ //Que vaya en zigZag
			theCar.setPosition(theCar.getXPos(), theCar.getYPos() + 40);
			theCar.setHorizontalDirection(theCar.getHorizontalDirection()*-1);
			onAWall = false;
		}

		else
		{
			if (theCar.getXPos() + 60 >= this.getWidth() && theCar.getHorizontalDirection() > 0){ //Choca pared derecha
				theCar.setPosition(this.getWidth()-60, theCar.getYPos()); //dibujar el carro hasta que llegue al borde del frame

				theCar.setHorizontalDirection(-1);
			} else if(theCar.getXPos() <= 0 && theCar.getHorizontalDirection() <0){//Choca pared izquierda
				theCar.setPosition(0, theCar.getYPos());
				theCar.setHorizontalDirection(1);
			}
			else 
			{
				//MutableCar bottomRightCar = new MutableCar(getWidth()-60,getHeight()-30, Color.BLUE);
				theCar.setPosition(
						theCar.getXPos()+(theCar.getHorizontalDirection()*theCar.getHorizontalSpeed()), 
						theCar.getYPos());
			}
		}
		//-------------------------------------------------------------------------------------------------------------------------------

		//		Car bottomLeftCar = new Car(getWidth()-280,getHeight()-35);
		//		Car upperLeftCar = new Car(1,1);
		//		Car upperRightCar = new Car(getWidth()-65,1);
		//Debug - ID's son los object ids (mismo carro, mismas dimensiones con ids distintos)
		//Otra clase con carro mutable -  MutableCar
		//New -  crea objeto cada vez que redibuje la pantalla

		//bottomRightCar.setColor(Color.ORANGE);
		/*bottomRightCar.draw(g);
		bottomRightCar.setPosition(0, getHeight()-30);

		bottomRightCar.setColor(Color.BLUE);
		bottomRightCar.draw(g);
		bottomRightCar.setPosition(getWidth()-60, 0);

		bottomRightCar.setColor(Color.GREEN);
		bottomRightCar.draw(g);
		bottomRightCar.setPosition(0, 0);

		bottomRightCar.setColor(Color.MAGENTA);
		bottomRightCar.draw(g);
		bottomRightCar.setPosition(getWidth()-60, getHeight()-30);

		Random r = new Random(); //Crea un carrito en posición Random
		bottomRightCar.setPosition(r.nextInt(getWidth() - 60 resta el ancho del carrito), r.nextInt(getHeight() - 30));
		bottomRightCar.setColor(Color.BLACK);
		bottomRightCar.draw(g);*/

		//		bottomLeftCar.draw(g);
		//		upperRightCar.draw(g);
		//		upperLeftCar.draw(g);

		System.out.println(counter++);
	}
}
