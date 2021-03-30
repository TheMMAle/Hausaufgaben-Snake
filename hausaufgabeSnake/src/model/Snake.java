package model;

/**
 * 
 * @author Alessandro und Sarujan
 *
 */



/**
 * Variablen der Snake-Klasse
 */
public class Snake {
	int xPos;
	int yPos;
	int length = 1;
	
	
	/**
	 * Konstruktor fuer Snake Objekt
	 */
	public Snake(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	
	
	/**
	 * Wird benutzt um Snake nach oben zu bewegen.
	 * @param yPos
	 */
	public void moveUp (int yPos) {
		if(yPos > 0) {
			this.yPos = this.yPos - yPos;
		}
	}
	
	
	/**
	 * Wird benutzt um Snake nach unten zu bewegen.
	 * @param yPos
	 */
	public void moveDown (int yPos) {
		if(yPos > 0) {
			this.yPos = this.yPos + yPos;
		}
	}
	
	
	/**
	 * Wird benutzt um Snake nach Links zu bewegen.
	 * @param xPos
	 */
	public void moveLeft (int xPos) {
		if(xPos > 0) {
			this.xPos = this.xPos - xPos;
		}
	}
	
	
	/**
	 * Wird benutzt um Snake nach Rechts zu bewegen.
	 * @param xPos
	 */
	public void moveRight (int xPos) {
		if(xPos > 0) {
			this.xPos = this.xPos + xPos;
		}
	}
	
	
	/**
	 * Return um den Wert der Methoden zurueckzugeben.
	 */
	public int getYpos() {
		return yPos;
	}
	
	public int getXpos() {
		return xPos;
	}
	
	

}
