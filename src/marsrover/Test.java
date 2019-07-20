package marsrover;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author naveendra
 *
 */
public class Test {

	/**
	 * main method
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

		try {
			InstructionCollecter instructionCollecter = new InstructionCollecter();

			Scanner in = new Scanner(System.in); // Create a Scanner object
			System.out.println("Enter Plateau Area size with x and y");
			String girdSize = in.nextLine(); // Read user input
			Plateau plateauArea = instructionCollecter.parsePlateau(girdSize);
			System.out.println("Enter Rover Position with x and y codes with direction Ex :- 1 2 N ");

			while (in.hasNext()) {

				Rover rover = instructionCollecter.roverPosition(plateauArea, in.nextLine());
				System.out.println("Rover Instructions");
				rover.processInstructions(in.nextLine());
				rover.printPosition();
				System.out.println("Enter Rover Position with x and y codes with direction");
			}

		} catch (NumberFormatException e) {
			System.out.println("invalid input");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
