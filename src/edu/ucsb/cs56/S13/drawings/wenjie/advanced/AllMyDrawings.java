package edu.ucsb.cs56.S13.drawings.wenjie.advanced;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;  // single lines
import java.awt.geom.Ellipse2D;  // ellipses and circles
import java.awt.geom.Rectangle2D; // for the bounding box
import java.awt.Rectangle;  // squares and rectangles
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;


import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Wenjie Huang
 * @version for CS56, lab06, Spring 2013
 */


public class AllMyDrawings
{
    /** Draw a picture with a few laptops 
     */

    public static void drawPicture1(Graphics2D g2) {

	Laptop l1 = new Laptop(100,250,75,40);
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	g2.setStroke(thick);
	g2.setColor(Color.GREEN); g2.draw(l1);

	Shape l2 = ShapeTransforms.scaledCopyOfLL(l1,0.5,0.5);
	l2 = ShapeTransforms.translatedCopyOf(l2,150,0);
	g2.setColor(Color.BLACK); g2.draw(l2);
	

	l2 = ShapeTransforms.scaledCopyOfLL(l2,4,4);
	l2 = ShapeTransforms.translatedCopyOf(l2,150,0);
	
	
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(l2); 

	
	g2.drawString("A few laptops by Wenjie Huang", 20,20);
    }


    /** Draw a picture with a few houses and coffee cups
     */
    public static void drawPicture2(Graphics2D g2) {


	LaptopWithScreen ls1 = new LaptopWithScreen(50, 300, 75, 40);
	LaptopWithScreen ls2 = new LaptopWithScreen(100,100,150,80);
	g2.setColor(new Color(0x8F00FF));
	g2.draw(ls1);
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	g2.setStroke(thick);
	g2.setColor(Color.BLACK); 
	g2.draw(ls2);

	Shape ls3 = ShapeTransforms.translatedCopyOf(ls2,230,150);
	ls3 = ShapeTransforms.rotatedCopyOf(ls3, Math.PI/4.0);
	g2.setColor(Color.RED);
	g2.draw(ls3);

	
	g2.drawString("A few laptops with content on screen by Wenjie Huang", 20,20);
    }
  
    /** Draw a different picture with a few laptops and laptops with content on screen
     */

    public static void drawPicture3(Graphics2D g2) {
	
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	g2.setStroke(thick);
    Laptop l1 = new Laptop(150,200,75,40);
	g2.setColor(Color.RED); g2.draw(l1);

	Shape l2 = ShapeTransforms.scaledCopyOfLL(l1,0.7,0.7);
	l2 = ShapeTransforms.translatedCopyOf(l2,150,0);
	g2.setColor(Color.BLACK); g2.draw(l2);
	
	LaptopWithScreen ls1 = new LaptopWithScreen(50, 350, 75, 40);
	g2.setColor(Color.BLUE); g2.draw(ls1);
	Shape ls2 = ShapeTransforms.scaledCopyOfLL(ls1,0.5,0.5);
	ls2 = ShapeTransforms.translatedCopyOf(ls2,150,0);
	g2.setColor(Color.CYAN); g2.draw(ls2);
	g2.setColor(Color.BLACK);
	g2.drawString("laptops and laptos with content on screen by Wenjie Huang", 20,20);
    }
    

}
