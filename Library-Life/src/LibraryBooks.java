
import java.util.Scanner;



public class LibraryBooks {
	static Books[] books = new Books[10];
	//Create a scanner object each for text and numbers
		private static Scanner tInput = new Scanner(System.in);
		private static Scanner nInput = new Scanner(System.in);
		
		
		public static void main(String[] args) {
			
			//Add the books
			addBooks();
			
			for (int i = 0; i < books.length; i++ )
			{
				System.out.println(books[i].title() + ", by " + books[i].author());
			}
			
			/*do 
			{
			System.out.println("What is the maximum amount of customers you expect?");
			} while (!(Integer.parseInt(tInput.nextLine())>=minCustomers));
			*/

			
			
		}
		
		private static int addCustomer()
		{
			
			
			
			return 0;
		} 
		
		private static void addBooks()
		{
			for (int i = 0; i < books.length; i++ )
			{
				books[i] = new Books();
				System.out.println("Enter a book name");
				books[i].settitle(tInput.nextLine());
				System.out.println("the Author?");
				books[i].setauthor(tInput.nextLine());
				
			}
			

		}

	}


