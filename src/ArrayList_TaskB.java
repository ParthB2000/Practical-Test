import java.util.ArrayList;
import java.util.List;

public class ArrayList_TaskB {

	public static void main(String[] args) {
		
		List<String> list_1=new ArrayList<String>();
		//List<String> list_2= {"bye","you","birthday","world"};
	
		list_1.add("hello");
		list_1.add("happy");
		list_1.add("thank");
		list_1.add("good");
		
		//System.out.println(list_1.get(0));
		List<String> list_2=new ArrayList<String>();
		list_2.add("bye");
		list_2.add("you");
		list_2.add("birthday");
		list_2.add("world");
		
		List<String> list_output=new ArrayList<String>();
		list_output.add(list_1.get(0)+" "+list_2.get(3));
		list_output.add(list_1.get(1)+" "+list_2.get(2));
		list_output.add(list_1.get(2)+" "+list_2.get(1));
		list_output.add(list_1.get(3)+" "+list_2.get(0));
		
		System.out.println(list_output);
		
		
	}
}
