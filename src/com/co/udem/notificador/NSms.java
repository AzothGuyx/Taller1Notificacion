package com.co.udem.notificador;

import java.util.List;

public class NSms implements INotificador {


	@Override
	public void enviar(List<String> destinatarios,String msg) {
		System.out.println("----------------");
		System.out.println("mensaje: " + msg);
		System.out.println("mensaje enviado por SMS");
		System.out.println("enviado a: ");
		for (String destinatario : destinatarios) {
			System.out.println(destinatario);
		}

	}

}
