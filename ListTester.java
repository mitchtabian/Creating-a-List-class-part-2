package Lists;

public class ListTester {

	public static void main(String[] args) {
		List<String> peopleList = new List<String>(10);
		peopleList.add("Mitch");
		peopleList.add("Gary");
		peopleList.add("Raymond");
		peopleList.add("Blake");
		peopleList.add("Jess");
		System.out.println("The people in the list are: " + peopleList.toString());
		
		List<Integer> integerList = new List<Integer>(10);
		integerList.add(13);
		integerList.add(56);
		integerList.add(89);
		integerList.add(44);
		integerList.add(37);
		integerList.add(14);
		integerList.add(99);
		System.out.println("The numbers in the list are: " + integerList.toString());
		
		//find the maximum integer in the list
		System.out.println("The max number is: " + findMax(integerList));
	}
	
	//method for finding the max
	public static Integer findMax(List<Integer> list){
		int max = list.getObject(0);
		try{
		for(int i=0; i<list.getSize();i++){
			int temp = list.getObject(i);
			if(temp > max){
				max = temp;
			}
		}
		}catch(NullPointerException e){
			//System.out.println(e);
		}
		return max;
	}
	

}
