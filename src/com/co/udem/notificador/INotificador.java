package com.co.udem.notificador;

import java.util.List;

public interface INotificador {
	
	public abstract void enviar(List<String> destinatarios,String msg);

}
