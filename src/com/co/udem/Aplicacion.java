package com.co.udem;

import java.util.ArrayList;
import java.util.List;

import com.co.udem.gestornotificacion.GestorNotificacion;

public class Aplicacion {

	public static void main(String[] args) {
		//Lista de destinatarios, que son quienes reciben el mensaje 
		List<String> destinatarios = new ArrayList<String>();
		//Lista de notificadores, que son los canales para enviar el mensaje
		//se representa con una letra
		List<String> notificadores = new ArrayList<String>();
		
		String mensaje;
		//clase que nos sirve para instanciar las clases y enviar los metodos
		GestorNotificacion gestorNotificacion;

		//agregamos destinatarios
		destinatarios.add("Juan");
		destinatarios.add("Sofia");
		destinatarios.add("Sara");
		
		//agregamos notificadores
		notificadores.add("C");
		notificadores.add("F");
		notificadores.add("S");
		notificadores.add("E");
		//este notificador no existe solo es para probar en caso de que se mande un notificador que no exista
		notificadores.add("J");
		
		mensaje = "Mensaje de Bienvenida";
		
		gestorNotificacion = new GestorNotificacion(destinatarios, mensaje, notificadores);
		
		gestorNotificacion.enviarMensajes();
	}

}
