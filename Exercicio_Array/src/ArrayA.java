
public class ArrayA extends MyArray{

	private int count = 0;
	
	public ArrayA(int size) {
		super(size);
	}

	@Override
	public void add(Object o) {		
		if( array.length == count ) {
			increasesSize();
		}
			
		array[count] = o;
		count++;		
	}
	
	private void increasesSize() {
		Object[] aux = array; 
		array = new Object[array.length * 2];
		copiarArray(aux);
	}	
	
	
}
