import java.util.Scanner;

public class Library {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		VHSTapes[] tapes = new VHSTapes[10];
		
		for (int i = 0; i<tapes.length; i++)
		{
		
			tapes[i] = new VHSTapes();
		}
		
		
		
		for (int i = 0; i<tapes.length; i++)
		{
			System.out.println("Enter the Artist");
			tapes[i].setartist(input.nextLine()) ;
		}
		
		
		for (int i = 0; i<tapes.length; i++)
		{
			System.out.println(tapes[i].artist());
			
		}
		
	}

}
