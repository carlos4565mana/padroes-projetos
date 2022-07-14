package com.carlos.gof.strategy.frete.impl;

import com.carlos.gof.strategy.frete.Frete;

public class Sedex implements Frete {

	public double calcularPreco(int distancia) {
		
		return  distancia * 1.45 + 12 ;
	}

}
