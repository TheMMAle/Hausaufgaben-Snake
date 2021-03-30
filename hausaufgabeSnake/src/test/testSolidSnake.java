package test;

/**
 * @author Alessandro und Sarujan
 */

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import model.Snake;


public class testSolidSnake {

	/**
	 * Diese Methode testet ob die im Konstruktor uebergebenen Positionen
	 * auch wirklich so ausgefuehrt werden. Beinhaltet einen Konstruktoraufruf
	 * und die assertEquals-Funktion um den gewuenschten Wert mit der Referenz zu verleichen.
	 */
	@Test
	public void konstruktorTest() {
		Snake solid = new Snake(50, 50);
		assertEquals(50, solid.getXpos());
		assertEquals(50, solid.getYpos());
	}
	
	
	
	/**
	 * Diese Methode testet ob bei einer positiven yPos-Eingabe, sich Solid Snake an die gewuenschte Position bewegt. 
	 * Beinhaltet einen Konstruktoraufruf und die assertEquals-Funktion um den gewuenschten Wert mit der Referenz zu verleichen.
	 */
	@Test
	public void testUpPos() {
		Snake solid = new Snake (50, 50);
		solid.moveUp(30);
		assertEquals(20, solid.getYpos());
	}
	
	
	
	/**
	 * Diese Methode testet ob bei einer negativen yPos-Eingabe, sich Solid Snake nicht bewegt.
	 * Beinhaltet einen Konstruktoraufruf und die assertEquals-Funktion um den gewuenschten Wert mit der Referenz zu verleichen.
	 */
	@Test
	public void testUpNeg() {
		Snake solid = new Snake (50, 50);
		solid.moveUp(-100);
		assertEquals(50, solid.getYpos());
	}
	
	
	
	/**
	 * Diese Methode testet ob bei einer positiven yPos-Eingabe, sich Solid Snake an die gewuenschte Position bewegt.
	 * Beinhaltet einen Konstruktoraufruf und die assertEquals-Funktion um den gewuenschten Wert mit der Referenz zu verleichen.
	 */
	@Test
	public void testDownPos() {
		Snake solid = new Snake (50, 50);
		solid.moveDown(50);
		assertEquals(100, solid.getYpos());
	}
	
	
	
	/**
	 * Diese Methode testet ob bei einer negativen yPos-Eingabe, sich Solid Snake nicht bewegt.
	 * Beinhaltet einen Konstruktoraufruf und die assertEquals-Funktion um den gewuenschten Wert mit der Referenz zu verleichen.
	 */
	@Test
	public void testDownNeg() {
		Snake solid = new Snake (50, 50);
		solid.moveDown(-100);
		assertEquals(50, solid.getYpos());
	}
	
	
	
	/**
	 * Diese Methode testet ob bei einer positiven xPos-Eingabe, sich Solid Snake an die gewuenschte Position bewegt.
	 * Beinhaltet einen Konstruktoraufruf und die assertEquals-Funktion um den gewuenschten Wert mit der Referenz zu verleichen.
	 */
	@Test
	public void testRightPos() {
		Snake solid = new Snake (50, 50);
		solid.moveRight(50);
		assertEquals(100, solid.getXpos());
	}
	
	
	
	/**
	 * Diese Methode testet ob bei einer negativen xPos-Eingabe, sich Solid Snake nicht bewegt.
	 * Beinhaltet einen Konstruktoraufruf und die assertEquals-Funktion um den gewuenschten Wert mit der Referenz zu verleichen.
	 */
	@Test
	public void testRightNeg() {
		Snake solid = new Snake (50, 50);
		solid.moveRight(-100);
		assertEquals(50, solid.getXpos());
	}
	
	
	
	/**
	 * Diese Methode testet ob bei einer positiven xPos-Eingabe, sich Solid Snake an die gewuenschte Position bewegt.
	 * Beinhaltet einen Konstruktoraufruf und die assertEquals-Funktion um den gewuenschten Wert mit der Referenz zu verleichen.
	 */
	@Test
	public void testLeftPos() {
		Snake solid = new Snake (50, 50);
		solid.moveLeft(30);
		assertEquals(20, solid.getXpos());
	}
	
	
	
	/**
	 * Diese Methode testet ob bei einer negativen xPos-Eingabe, sich Solid Snake nicht bewegt.
	 * Beinhaltet einen Konstruktoraufruf und die assertEquals-Funktion um den gewuenschten Wert mit der Referenz zu verleichen.
	 */
	@Test
	public void testLeftNeg() {
		Snake solid = new Snake (50, 50);
		solid.moveLeft(-100);
		assertEquals(50, solid.getXpos());
	}

}
