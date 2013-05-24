package edu.ucsb.cs56.S13.drawings.wenjie.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes

// all imports below this line needed if you are implementing Shape
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;
import edu.ucsb.cs56.S13.drawings.wenjie.simple.Circle;
/**
   A Laptop with content on it's screen
      
   @author Wenjie
   @version for CS56, W11, UCSB, 02/23/2011
   
*/
public class LaptopWithScreen extends Laptop implements Shape
{
    /**
     * Constructor for LabtopWithScreen class
     *  @param x x coord of upper left corner of laptop
     *  @param y y coord of upper left corner of laptop
     *  @param width width of the laptop screen
     *  @param height of laptop
     */
    public LaptopWithScreen(double x, double y, double width, double height)
    {

	super(x,y,width,height);


	GeneralPath gp = this.get();


	double radius  = 0.25*Math.min(width, height);
	double centerX = x + 0.5*width;
	double centerY = y + 0.5*height;
	Circle circle  = new Circle ( centerX, centerY, radius );

        GeneralPath wholeLaptop = this.get();
        wholeLaptop.append(circle, false);

    }

}
