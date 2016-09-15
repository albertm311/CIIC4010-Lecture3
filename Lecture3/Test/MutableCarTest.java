import static org.junit.Assert.*;
import java.awt.Color;
import org.junit.Test;

public class MutableCarTest {
	//Pruebas para probar el programa 
	@Test
	public void test()
	{
		//fail("Not yet implemented");
		MutableCar theCar = new MutableCar(1.0, 2.0,Color.BLUE);
		//theCar = null;
		assertNotNull("Reference is Null", theCar); //Prueba que el carro no sea nulo.
		assertTrue("X Position incorrect", theCar.getXPos() == 1.0); //Prueba la posición correcta
	}

	@Test
	public void testSetLocation()
	{
		MutableCar theCar = new MutableCar(1.0, 2.0,Color.BLUE);
		theCar.setPosition(3.0, 5.0);
		assertTrue("X Position incorrect", theCar.getXPos() == 3.0);
		assertTrue("Y Position incorrect", theCar.getYPos() == 5.0);
	}

}
