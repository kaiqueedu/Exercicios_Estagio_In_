
public class ArrayB extends MyArray{

	private int count = 0;
	
	public ArrayB(int size) {
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
		array = new Object[ (int) (array.length * 1.5) ];
		copiarArray(aux);
	}	
	
	
}
