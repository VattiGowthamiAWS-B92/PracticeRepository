import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getEmployeename().compareTo(o2.getEmployeename());
	}
	
}

public class Result {
	public static void main(String[] args) {
		List<Employee> emplst=new ArrayList<Employee>();
		emplst.add(new Employee(11, "A", 20, "NURSING", 'F'));
		emplst.add(new Employee(92, "G", 21, "Service", 'M'));
		emplst.add(new Employee(36, "H", 22, "Marketing", 'F'));
		emplst.add(new Employee(77, "D", 25, "IT", 'M'));
		emplst.add(new Employee(16, "E", 23, "RND", 'F'));
		emplst.add(new Employee(86, "B", 27, "Finance", 'M'));
		
		Collections.sort(emplst);
		System.out.println("===========ID==========");
		for(Employee employee:emplst) {
			System.out.println(employee);
		}
		Collections.sort(emplst , new SortByName());
		System.out.println("===========NAME==========");
		for(Employee employee:emplst) {
			System.out.println(employee);
		}
Collections.sort(emplst, new Comparator<Employee>() {

	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.getEmployeeGender().compareTo(o2.getEmployeeGender());
	}
	
});;
System.out.println("===========GENDER==========");
for(Employee employee:emplst) {
	System.out.println(employee);
}

Collections.sort(emplst,(o1,o2)->o1.getEmployeeDepartment().compareTo(o2.getEmployeeDepartment()));
System.out.println("===========DEPARTMENT==========");
for(Employee employee:emplst) {
	System.out.println(employee);
}

}
}