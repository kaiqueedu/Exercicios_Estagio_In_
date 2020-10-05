
public class ArrayC extends MyArray{

	private int count = 0;
	
	public ArrayC(int size) {
		super(size);
	}

	@Override
	public void add(Object o) {		
		if( array.length == count ) {
			return;
		}
			
		array[count] = o;
		count++;		
	}
	
}
