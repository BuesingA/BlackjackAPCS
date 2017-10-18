package Methods;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString("SMILEY FACE LAB ", 35, 35);

      window.setColor(Color.YELLOW);
      window.fillOval( 210, 100, 400, 400 );

      window.setColor(Color.CYAN);
      window.fillOval(330, 230, 40, 50);
      
      window.setColor(Color.CYAN);
      window.fillOval(530, 230, 40, 50);
      
      window.setColor(Color.RED);
      window.drawArc(430, 350, 100, 50, 230, 100);


   }
}

