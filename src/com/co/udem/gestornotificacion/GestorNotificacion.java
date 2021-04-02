package com.co.udem.gestornotificacion;

import java.util.List;

import com.co.udem.notificador.INotificador;
import com.co.udem.notificador.NEmail;
import com.co.udem.notificador.NEmpresarial;
import com.co.udem.notificador.NFacebook;
import com.co.udem.notificador.NSms;

public class GestorNotificacion {

	private List<String> destinatarios;

	private String mensaje;

	private List<String> notificadores;

	public GestorNotificacion(List<String> destinatarios, String mensaje, List<String> notificadores) {
		this.destinatarios = destinatarios;
		this.mensaje = mensaje;
		this.notificadores = notificadores;
	}

	public void enviarMensajes() {
		//este metodo instancia la clase y envia el mensaje segun lo que traiga la lista de notificadores
		for (String notificador : this.notificadores) {

			switch (notificador) {
			case "C":
				INotificador Nemail = new NEmail();
				Nemail.enviar(this.destinatarios,this.mensaje);
				break;

			case "F":
				INotificador NFacebook = new NFacebook();
				NFacebook.enviar(this.destinatarios,this.mensaje);
				break;

			case "S":
				INotificador NSms = new NSms();
				NSms.enviar(this.destinatarios,this.mensaje);
				break;

			case "E":
				INotificador Nempresarial = new NEmpresarial();
				Nempresarial.enviar(this.destinatarios,this.mensaje);
				break;

			default:
				System.out.println("----------------");
				System.out.println("Notificador: "+notificador+" no  valido");
				break;
			}
		}
	}

}
