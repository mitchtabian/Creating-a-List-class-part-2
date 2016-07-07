package Lists;

public class List<T> {
	
	private T[] data;
	private int size;
	private int position;
	
	public List(int numObjects){
		size = numObjects;
		position = 0;
		data = (T[])new Object[size];
	}
	
	public void add(T object){
		data[position] = object;
		++position;
	}
	
	public String toString(){
		String object = "";
		for(int i=0; i<position; i++){
			object += "\n" + data[i];
		}
		return object;
	}
	
	public T getObject(int i){
		return data[i];
	}
	
	public Integer getSize(){
		return size;
	}
	
	

}
