import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Platformer implements Comparator<Employee>{
 
	
/*	public static void main(String[] arg) {
		/*
		 * String input="aabbbccddaaabbccceeff"; int len=input.length(); int countnew=1;
		 * int countprev=1; int b=0; HashMap<Character,Integer> inputOccur=new
		 * HashMap<Character,Integer>(); for(int i=0;i<len;i++) { char
		 * a=input.charAt(i); if(inputOccur.containsKey(a)) { if(b==0) {
		 * inputOccur.put(a,countnew++); }else {
		 * 
		 * inputOccur.put(a,countprev++); } }else { inputOccur.put(a,1); b=0;
		 * countnew=1; } }
		 * 
		 * for(Character i:inputOccur.keySet()) {
		 * System.out.println(inputOccur.get(i)+" "+i); }
		 */
            
	//	An array containing 0's and 1's,arrange all 1's on the left hand side and 
	//	all 0's on the right hand side,provided you can traverse the array only once"
		
		
	/*	int[] arr= {0,1,1,1,1,0,1};
		int len=arr.length;
		
		for(int i=0;i<len-1;i++) {
			
		}
		
		for(int i=0;i<len-1;i++) {
			System.out.println(arr[i]);
		}
		
	}*/
	public static void main(String[] arg) {
		List<Employee> list = new ArrayList<>();
		 
		list.add(new Employee("Modi", 55));
		list.add(new Employee("Trumph", 57));
		list.add(new Employee("Boris Johnson", 56));
		list.add(new Employee("Boris Johnson", 56));
		 
		Collections.sort(list,(e1,e2)-> e1.getName().compareTo(e2.getName())); 
		list.stream().distinct().forEach(e1->System.out.println(e1.getName()));
		//printList(list,e1->System.out.println(e1.getName()+"   "+e1.getSalary()));

}
	static void printList(List<Employee> list,Consumer<Employee> cn){
	 for(Employee emp:list) {	
		cn.accept(emp);
		
	 }		
	}

}