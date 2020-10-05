package models;

import Interface.Imposto;

public class ICMS implements Imposto{

	@Override
	public double calcular(double valor) {
		return valor * 0.18;
	}
	
	

}
