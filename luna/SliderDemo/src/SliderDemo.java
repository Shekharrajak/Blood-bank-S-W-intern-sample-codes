// SliderDemo Class

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


public class SliderDemo extends JFrame {
   private JSlider diameter;
   private OvalPanel myPanel;

   public SliderDemo() 
   {
      super( "Slider Demo" );

      myPanel = new OvalPanel();
      myPanel.setBackground( Color.yellow );

      diameter = new JSlider( SwingConstants.HORIZONTAL,
                              0, 200, 10 );
      diameter.setMajorTickSpacing( 10 );
      diameter.setPaintTicks( true );
      diameter.addChangeListener(
         new ChangeListener() {
            public void stateChanged( ChangeEvent e )
            {
               myPanel.setDiameter( diameter.getValue() );
            }
         }
      );

      Container c = getContentPane();
      c.add( diameter, BorderLayout.SOUTH );
      c.add( myPanel, BorderLayout.CENTER );

      setSize( 220, 270 );
      show();
   }

   public static void main( String args[] )
   {
      SliderDemo app = new SliderDemo();

      app.addWindowListener(
         new WindowAdapter() {
            public void windowClosing( WindowEvent e )
            {
               System.exit( 0 );
            }
         }
      );
   }
}
