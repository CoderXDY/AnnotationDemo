import java.lang.reflect.InvocationTargetException;

import com.annotationdemo.handler.DecorationHandler;


public class App {

	/**
	 * @param args
	 * @throws InstantiationException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 */
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
	
		new DecorationHandler().decorate();

	}

}
