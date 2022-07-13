package com.carlos.gof;

import com.carlos.gof.facade.Facade;
import com.carlos.gof.singleton.SingletonEager;
import com.carlos.gof.singleton.SingletonLazy;
import com.carlos.gof.singleton.SingletonLazyHolder;
import com.carlos.gof.strategy.Comportamento;
import com.carlos.gof.strategy.ComportamentoAgressivo;
import com.carlos.gof.strategy.ComportamentoDefensivo;
import com.carlos.gof.strategy.ComportamentoNormal;
import com.carlos.gof.strategy.Robo;

public class Test {

	public static void main(String[] args) {

		// Singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		//Strategy
		
		Comportamento defensivo =  new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(normal);
		robo.mover();
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Carlos", "123456754");

	}

}
