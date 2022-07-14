package com.carlos.gof.strategy.frete.impl;

import com.carlos.gof.strategy.frete.Frete;

public class Normal implements Frete {

	
	public double calcularPreco(int distancia) {
		
		return distancia * 1.25 + 10;
	}

}
