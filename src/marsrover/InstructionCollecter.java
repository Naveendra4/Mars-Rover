package marsrover;

/**
 * 
 * @author naveendra
 *
 */
public class InstructionCollecter {

	/**
	 * Create the Plateau as given x y codes
	 * 
	 * @param instructionString
	 * @return
	 * @throws Exception
	 */
	public Plateau parsePlateau(String instructionString) throws Exception {

		String[] coordinates = null;
		if (instructionString.matches("[a-zA-z0-9]+[ ][a-zA-Z0-9]+")) {
			coordinates = instructionString.split(" ");

			return new Plateau(Integer.parseInt(coordinates[0]), Integer.parseInt(coordinates[1]));
		} else {
			throw new Exception("invalid input for Plateau Area Creation");
		}
	}

	/**
	 * Create a rover object for given position
	 * 
	 * @param plateauArea
	 * @param positionString
	 * @return
	 * @throws Exception
	 */
	public Rover roverPosition(Plateau plateauArea, String positionString) throws Exception {

		String[] positionArray = positionString.split(" ");
		int xCode = Integer.parseInt(positionArray[0]);
		int yCode = Integer.parseInt(positionArray[1]);
		Direction direction = Direction.valueOf(positionArray[2]);

		boolean valid = plateauArea.checkValidtyOdCords(xCode, yCode);
		if (valid) {
			return new Rover(plateauArea, xCode, yCode, direction);
		} else {
			throw new Exception("invalid cordinates for rover position");
		}
	}

}
