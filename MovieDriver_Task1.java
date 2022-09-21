/*
Create a new object of type Scanner that reads from the keyboard
Create a new movie object
Prompt the user to enter the title of a movie 
Read in the line that the user types
Set the title in the movie object
Prompt the user to enter the movie’s rating
Read in the line that the user types
Set the rating in the movie object
Prompt the user to enter the number of tickets sold at a (unnamed) theater
Read in the integer that the user types
Set the number of tickets sold in the movie object
Print out the information using the movie’s toString method
*/
import java.util.*;


public class MovieDriver {
	public static void main(String[] args) {
		

		boolean loop = true;
		
		// New Scanner
		Scanner input = new Scanner(System.in);
		
		// New Movie Object
		Movie m = new Movie();
		
		while(loop) {
		// Read title and enter information
		System.out.println("Enter the title of a movie: ");
		m.setTitle(input.nextLine());
		
		// Read rating and enter information
		System.out.println("Enter the movie's rating: ");
		m.setRating(input.nextLine());
		
		//Read tickets sold and enter information
		System.out.println("Enter the number of tickets sold: ");
		m.setSoldTickets(input.nextInt());
		
		// Print title, rating, and tickets sold to user.
		System.out.println("Movie " + m.getTitle() + " has rating of " 
		+ m.getRating() + " and " + m.getSoldTickets() + " tickets sold.");	
		
		m.toString();
		
		System.out.println("Try again? Y or N");
		
		
		if (!input.next().equalsIgnoreCase("Y")) {
			loop = false;
			System.out.println("Goodbye");
		}
		
		input.nextLine();
		
		}
		
	input.close();
	
		
		
}}
