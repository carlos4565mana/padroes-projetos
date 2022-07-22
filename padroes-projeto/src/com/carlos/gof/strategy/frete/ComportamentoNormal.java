package com.carlos.gof.strategy.frete;

import com.carlos.gof.strategy.robo.Comportamento;

public class ComportamentoNormal implements Comportamento {

	@Override
	public void mover() {
		System.out.println("Movendo-se Normalmente...");
		
	}

}
