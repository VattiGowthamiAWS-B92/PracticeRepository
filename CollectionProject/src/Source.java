import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Source {

	public static void main(String[] args) {
		List lst=new ArrayList();
	List<String> names=new ArrayList<String>();
	List<Integer> marks=new ArrayList<Integer>();
	List<Double> perc=new ArrayList<Double>();
	List numbers=new  ArrayList();
	
	names.add("gowthami");
	names.add(0, "VATTI");
	marks.add(44);
	marks.add(88);
	perc.add(88.09);
	perc.add(67.87);
	names.add( "hen");
	names.add( "fun");
	numbers.addAll(names);
	System.out.println(numbers);
	lst.addAll(perc);
	System.out.println(lst);
	lst.addAll(names);
	System.out.println(lst);
	lst.addAll(marks);
	System.out.println(lst);
	//perc.addAll(marks);
	System.out.println(lst);
	lst.add(3, 554);
	System.out.println(lst);
names.remove("VATTI");
System.out.println(names);

System.out.println(lst);
Collections.sort(names);
System.out.println(names);
	}
}
