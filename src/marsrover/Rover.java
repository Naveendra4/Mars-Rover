package marsrover;

/**
 * 
 * @author naveendra
 *
 */
public class Rover {

	private Integer xCode;
	private Integer yCode;
	private Integer facingDirection;
	private Plateau plateauArea;

	/**
	 * constructor
	 * 
	 * @param plateauArea
	 * @param xCode
	 * @param yCode
	 * @param facingDirection
	 */
	public Rover(Plateau plateauArea, Integer xCode, Integer yCode, Direction facingDirection) {

		this.plateauArea = plateauArea;
		this.xCode = xCode;
		this.yCode = yCode;
		this.facingDirection = facingDirection.getDirectionId();
	}

	/**
	 * separate commands and feed as instructions
	 * 
	 * @param commands
	 */
	public void processInstructions(String commands) throws Exception {
		for (int index = 0; index < commands.length(); index++) {
			instructions(commands.charAt(index));
		}
	}

	/**
	 * move the rover according to instructions array
	 * 
	 * @param command
	 * @throws IllegalArgumentException
	 */
	private void instructions(Character command) throws Exception {
		if (command.equals('L')) {
			turnLeft();
		} else if (command.equals('R')) {
			turnRight();
		} else if (command.equals('M')) {
			move();
		} else {
			throw new IllegalArgumentException("invalid Command");
		}
	}

	/**
	 * rover turn left
	 */
	private void turnLeft() {
		if (facingDirection == Direction.N.getDirectionId()) {

			facingDirection = Direction.W.getDirectionId();

		} else if (facingDirection == Direction.W.getDirectionId()) {

			facingDirection = Direction.S.getDirectionId();

		} else if (facingDirection == Direction.S.getDirectionId()) {

			facingDirection = Direction.E.getDirectionId();
		} else if (facingDirection == Direction.E.getDirectionId()) {

			facingDirection = Direction.N.getDirectionId();
		}
	}

	/**
	 * rover turn right
	 */
	private void turnRight() {

		if (facingDirection == Direction.N.getDirectionId()) {

			facingDirection = Direction.E.getDirectionId();

		} else if (facingDirection == Direction.E.getDirectionId()) {

			facingDirection = Direction.S.getDirectionId();

		} else if (facingDirection == Direction.S.getDirectionId()) {

			facingDirection = Direction.W.getDirectionId();

		} else if (facingDirection == Direction.W.getDirectionId()) {

			facingDirection = Direction.N.getDirectionId();
		}
	}

	/**
	 * move rover
	 */
	private void move() throws Exception {
		boolean vaild = plateauArea.checkValidtyOdCords(xCode, yCode);

		if (vaild) {
			if (facingDirection == Direction.N.getDirectionId()) {
				yCode++;
			} else if (facingDirection == Direction.E.getDirectionId()) {
				xCode++;
			} else if (facingDirection == Direction.S.getDirectionId()) {
				yCode--;
			} else if (facingDirection == Direction.W.getDirectionId()) {
				xCode--;
			}
		} else {
			throw new Exception("invalid cordinates rover is going out of plateau");
		}
	}

	/**
	 * print rover position
	 */
	public void printPosition() {
		System.out.println("Current Position Of Rover :" + xCode + " " + yCode + " "
				+ Direction.getDirectionfromInt(facingDirection));
	}

}
