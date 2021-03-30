package com.co.udem.gestornotificacion;

import java.util.List;

import com.co.udem.notificador.Notificador;
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
		for (String notificador : this.notificadores) {

			switch (notificador) {
			case "C":
				Notificador Nemail = new NEmail();
				Nemail.enviar(this.mensaje);
				break;

			case "F":
				Notificador NFacebook = new NFacebook();
				NFacebook.enviar(this.mensaje);
				break;

			case "S":
				Notificador NSms = new NSms();
				NSms.enviar(this.mensaje);
				break;

			case "E":
				Notificador Nempresarial = new NEmpresarial();
				Nempresarial.enviar(this.mensaje);
				break;

			default:
				break;
			}
		}
	}

}
