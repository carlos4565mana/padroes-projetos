package com.carlos.gof.strategy.robo;

public class ComportamentoAgressivo implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se Agressivamente...");
		
	}

}
