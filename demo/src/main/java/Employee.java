import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee{
 
private Integer salary;
private String name;
 
 public Employee(String name,Integer salary){
	 this.salary=salary;
	 this.name=name;
 }
 
 


	
 public static void main(String[] arg) {
		List<Employee> list = new ArrayList<>();
		 
		list.add(new Employee("Modi", 55));
		list.add(new Employee("Trumph", 57));
		list.add(new Employee("Boris Johnson", 56));
		 
		/*JAva 7  Collections.sort(list, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getName().compareTo(o1.getName());
			}
			  
			  
		  }); */
		
		// Java 8
		Collections.sort(list,(e1,e2) -> e1.getName().compareTo(e2.getName()));
         
		  for(Employee e:list){
			  System.out.println(e.getName());
		  } 
		
	/*	Java 7
	 * printConditinally(list,new Condition() {
			
			@Override
			public boolean test(Employee e1) {
			
				return e1.getName().startsWith("M");
			}
		}); */
		
		  //Java 8
		printConditinally(list,e1 ->e1.getName().startsWith("M"));
}



	public Integer getSalary() {
		return salary;
	}




	public void setSalary(Integer salary) {
		this.salary = salary;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}
	
	interface Condition{
		boolean test(Employee e1);
	}
	public static void printConditinally(List<Employee> empList,Condition condition){
	 for(Employee e1:empList) {	
		if(condition.test(e1)) {
			System.out.println(e1.getName());
		}
	 }	
	}
}