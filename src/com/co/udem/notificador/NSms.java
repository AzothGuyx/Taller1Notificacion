package com.co.udem.notificador;

public class NSms extends Notificador {


	@Override
	public void enviar(String msg) {
		System.out.println("----------------");
		System.out.println("mensaje: " + msg);
		System.out.println("mensaje enviado por SMS");

	}

}
