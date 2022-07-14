package com.carlos.gof;

import java.math.BigDecimal;

import com.carlos.gof.builder.Pedido;
import com.carlos.gof.builder.PedidoBuilder;
import com.carlos.gof.facade.Facade;
import com.carlos.gof.singleton.SingletonEager;
import com.carlos.gof.singleton.SingletonLazy;
import com.carlos.gof.singleton.SingletonLazyHolder;
import com.carlos.gof.strategy.Comportamento;
import com.carlos.gof.strategy.ComportamentoAgressivo;
import com.carlos.gof.strategy.ComportamentoDefensivo;
import com.carlos.gof.strategy.ComportamentoNormal;
import com.carlos.gof.strategy.Robo;
import com.carlos.gof.strategy.frete.Frete;
import com.carlos.gof.strategy.frete.TipoFrete;

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
		
		TipoFrete tipoFrete = TipoFrete.values()[0];
		TipoFrete tipoFrete2 = TipoFrete.values()[1];
		
		Frete frete = tipoFrete.obterFrete();
		Frete frete2 = tipoFrete2.obterFrete();
		
		System.out.println("frete = "+frete.calcularPreco(100));
		System.out.println("frete2 = "+frete2.calcularPreco(100));
		
		//Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Carlos", "123456754");
		
		Pedido pedido = new PedidoBuilder()
						.setPedido("999")
						.setCliente(100,"Carlos","999-9999")
						.setVendedor(2, "João")
						.setProduto("Caderno", 1, new BigDecimal(12.00))
						.setProduto("Borracha",2, new BigDecimal(0.50))
						.builder();
		
		
		System.out.println(pedido);
					

	}

}
