package co.edu.unbosque.edu.controller;

import co.edu.unbosque.view.VistaIngresar;
import co.edu.unbosque.view.VistaVentana;

public class Controller {
	private VistaVentana Vv;
	private VistaIngresar Vi;
	
	
	public Controller() {
		System.out.println("It's still Working");
		Interfaz();
	}
	
	public void Interfaz() {
		this.Vv = new VistaVentana();
		Vv.ventana();
	  
	    
	}

}
