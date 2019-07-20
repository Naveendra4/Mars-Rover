package marsrover;

/**
 * 
 * @author naveendra
 *
 */
public enum Direction {

	// Direction Enum

	N(0, "N"), E(1, "E"), S(2, "S"), W(3, "W");

	private final int directionId;
	private final String directionName;

	/**
	 * 
	 * @param directionId
	 * @param directionName
	 */
	Direction(final int directionId, final String directionName) {
		this.directionId = directionId;
		this.directionName = directionName;
	}

	/**
	 * 
	 * get direction id
	 * 
	 * @return
	 */
	public int getDirectionId() {

		return directionId;
	}

	/**
	 * get direction name
	 * 
	 * @return
	 */
	public String getDirectionName() {
		return directionName;
	}

	/**
	 * get direction from integer
	 * 
	 * @param value
	 * @return
	 */
	public static Direction getDirectionfromInt(int value) {
		for (Direction directions : Direction.values()) {
			if (directions.directionId == (value)) {
				return directions;
			}
		}
		return null;
	}

}
