import java.util.Scanner;

public class N_number {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a starting alphabet");
		char start_char=sc.next().charAt(0);
		
		System.out.println("Enter next alphabet count");
		int count=sc.nextInt();
		
		Integer characterInt=(int) start_char;
		
		for(int i=characterInt+1;i<=characterInt+count;i++)
		{
			System.out.print((char)i);
		}
		
	}
}
