
public abstract class MyArray {

	public Object[] array;
	
	public MyArray(int size) {
		array = new Object[size];
	}
	
	public void add(Object o) {
	}	
	
	public void remove(int index){
		array[index] = null;
	}
	
	public Object getElementoIndex(int index) {
		return array[index];
	}
	
	public void copiarArray(Object[] aux) {
		int i = 0;		
		for( Object o : aux ) {
			array[i] = o;
			i++;
		}		
	}
		
	public Object[] getArray() {
		return this.array;
	}
	
}
