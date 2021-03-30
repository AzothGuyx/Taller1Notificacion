package com.co.udem.notificador;

public class NEmpresarial extends Notificador{

	@Override
	public void enviar(String msg) {
		System.out.println("----------------");
		System.out.println("mensaje: " + msg);
		System.out.println("mensaje enviado por plataforma empresarial");
		
	}

}
