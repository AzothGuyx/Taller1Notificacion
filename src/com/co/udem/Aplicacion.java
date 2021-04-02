package com.co.udem;

import java.util.ArrayList;
import java.util.List;

import com.co.udem.gestornotificacion.GestorNotificacion;

public class Aplicacion {

	public static void main(String[] args) {
		
		List<String> destinatarios = new ArrayList<String>();
		List<String> notificadores = new ArrayList<String>();
		String mensaje;
		GestorNotificacion gestorNotificacion;

		
		destinatarios.add("Juan");
		destinatarios.add("Sofia");
		destinatarios.add("Sara");
		
		
		notificadores.add("C");
		notificadores.add("F");
		notificadores.add("S");
		notificadores.add("E");
		notificadores.add("J");
		
		mensaje = "Mensaje de Bienvenida";
		
		gestorNotificacion = new GestorNotificacion(destinatarios, mensaje, notificadores);
		
		gestorNotificacion.enviarMensajes();
	}

}
