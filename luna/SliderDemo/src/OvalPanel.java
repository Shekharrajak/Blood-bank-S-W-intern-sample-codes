
//  OvalPanel Class

import java.awt.*;
import javax.swing.*;

public class OvalPanel extends JPanel {
   private int diameter = 10;

   public void paintComponent( Graphics g )
   {
      super.paintComponent( g );
      g.fillOval( 10, 10, diameter, diameter );
   }

   public void setDiameter( int d )
   {
      diameter = ( d >= 0 ? d : 10 );  // default diameter 10
      repaint();
   }

   // the following methods are used by layout managers
   public Dimension getPreferredSize()
   {
      return new Dimension( 200, 200 );
   }

   public Dimension getMinimumSize()
   {
      return getPreferredSize();
   }
}