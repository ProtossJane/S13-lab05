package edu.ucsb.cs56.S13.drawings.wenjie.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.geom.AffineTransform; // translation, rotation, scale
import java.awt.Shape; // general class for shapes
import java.awt.geom.Point2D; 
import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.Rectangle;
import java.awt.geom.PathIterator;
import java.awt.geom.AffineTransform;

import edu.ucsb.cs56.S13.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.S13.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a laptop that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Wenjie
   @version for CS56, Spring 13, UCSB
   
*/
public class Laptop extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of upper left corner of laptop
       @param y y coord of upper left corner of laptop
       @param width width of the laptop screen
       @param height of laptop
     */
    public Laptop(double x, double y, double width, double height)
    {
    
        double keyBoardHeight = 0.75*height;
 
        Rectangle2D.Double screen = 
            new Rectangle2D.Double(x, y ,
                          width, height);
 
        Line2D.Double leftKey = 
            new Line2D.Double (x, y + height,
                               x - width/5.0, y + height+keyBoardHeight);
                               
        Line2D.Double rightKey =
            new Line2D.Double (x + width, y + height,
                               x + width + width/5.0, y + height+keyBoardHeight);

		Line2D.Double bottomKey = 
			new Line2D.Double (x - width/5.0, y + height+keyBoardHeight,
                               x + width + width/5.0, y + height+keyBoardHeight);
     
        GeneralPath myLaptop = this.get();
        myLaptop.append(screen, false);
        myLaptop.append(leftKey, false);
        myLaptop.append(rightKey, false); 
        myLaptop.append(bottomKey, false);
        
    }

}
