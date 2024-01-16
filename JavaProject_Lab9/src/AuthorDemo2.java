import java.util.*;

public class AuthorDemo2 {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		String[] author = new String[4];
		String[] email = new String[4];
		Author n1 = new Author();
		for (int i = 0;i < author.length ;i++) {
			System.out.println("Information Author " + (i+1));
			System.out.println("----------------------------------------------");
			System.out.print("Input author name   : ");
			author[i] = scan.nextLine();
			System.out.print("Input author e-mail : ");
			email[i] = scan.nextLine();
			System.out.println("----------------------------------------------");
		}
		
		for (int i = 0;i < author.length ;i++)
		{
			//WILL DONE NEXT WEEK
		}
	}

}
