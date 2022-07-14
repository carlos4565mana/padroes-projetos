package com.carlos.gof.strategy.frete;

import com.carlos.gof.strategy.frete.impl.Normal;
import com.carlos.gof.strategy.frete.impl.Sedex;

public enum TipoFrete {

	NORMAL {
		
		@Override
		public Frete obterFrete() {
			return  new Normal();
		}
		
	},
	SEDEX {
		
		@Override
		public Frete obterFrete() {
			return new Sedex();
		}
		
	};
	
	public abstract Frete obterFrete();
}
