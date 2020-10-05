
public class Main {

	public static void main(String[] args) {
		
		MyArray a = new ArrayC(5);
		
		a.add("elemento 1");
		a.add("elemento 2");
		a.add(3);
		a.add(5 + 0.8);
		a.add("elemento 5");
		a.add("elemento 6");
		
		a.remove(2);
		
		System.out.println("--Recupera um elemento--");
		System.out.println(a.getElementoIndex(3));
		
		System.out.println("--Mostrar todos elementos do array--");
		for(Object o : a.getArray() ) {
			System.out.println(o);
		}
		
	}
	
}

/*Exercicio:
Implementar uma Classe que se deverá manter um Array, por essa classe eu posso:
	
Adicionar um elemento
	Remover um elemento
	Recuperar um elemento

Sua classe deve ter 3 implementações :
	
	Ao adicionar um elemento e já estiver no limite, o array deverá dobrar de tamanho
	Ao adicionar um elemento e já estiver no limite, o array deverá aumentar em 50%
	Ao adicionar um elemento e já estiver no limite, o array não deverá permitir */

