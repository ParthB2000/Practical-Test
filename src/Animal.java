import java.util.*;
import java.util.List;
import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" how many animals are you want to add first.");
		int count=sc.nextInt();
		
		for(int i=0;i<=4;i++)
		{
			Scanner scm=new Scanner(System.in);
			System.out.println("Enter name of animal");
			String s=scm.next();
			System.out.println("Enter cageno of animal");
			int countm=scm.nextInt();
			System.out.println("Enter age of animal");
			int countn=scm.nextInt();
			System.out.println("Enter gender of animal");
			String str=scm.next();
		}
		
		Model_Animal a1=new Model_Animal();
		List<Model_Animal> list=new ArrayList<Model_Animal>();
		a1.setID(1);
		a1.setName("Lion");
		a1.setCageNo(1);
		a1.setAge(10);
		a1.setGender("Male");
		
		list.add(a1);
	}
}
