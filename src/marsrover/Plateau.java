package marsrover;

/**
 * 
 * @author naveendra
 *
 */
public class Plateau {
	private int x;
	private int y;

	/**
	 * constructor 
	 * 
	 * @param x
	 * @param y
	 */
	public Plateau(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
    /**
     * 
     * validate coordinates
     * 
     * @param xCod
     * @param yCode
     * @return
     */
	public boolean checkValidtyOdCords(int xCod, int yCode) {
		if (this.x >= xCod && this.y >= yCode) {
			return true;
		} else {
			return false;
		}
	}

}
