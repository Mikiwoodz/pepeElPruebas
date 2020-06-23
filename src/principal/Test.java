package principal;

import controlador.ControladorJFPrincipal;
import view.JFPrincipal;

public class Test {

	public static void main(String[] args) {
			
		ControladorJFPrincipal controlador = new ControladorJFPrincipal(new JFPrincipal());		
		controlador.comenzar();

	}

}
