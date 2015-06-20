
// CustomPanelText Class
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class CustomPanelTest extends JFrame {
   private JPanel buttonPanel;
   private CustomPanel myPanel;
   private JButton circle, square;

   public CustomPanelTest()
   {
      super( "CustomPanel Test" );

      myPanel = new CustomPanel();   // instantiate canvas
      myPanel.setBackground( Color.green );

      square = new JButton( "Square" );
      square.addActionListener(
         new ActionListener() {
            public void actionPerformed( ActionEvent e )
            {
               myPanel.draw( CustomPanel.SQUARE );
            }
         }
      );

      circle = new JButton( "Circle" );
      circle.addActionListener(
         new ActionListener() {
            public void actionPerformed( ActionEvent e )
            {
               myPanel.draw( CustomPanel.CIRCLE );
            }
         }
      );

      buttonPanel = new JPanel();
      buttonPanel.setLayout( new GridLayout( 1, 2 ) );
      buttonPanel.add( circle );
      buttonPanel.add( square );

      Container c = getContentPane();
      c.add( myPanel, BorderLayout.CENTER );  
      c.add( buttonPanel, BorderLayout.SOUTH );

      setSize( 300, 150 );
      show();
   }

   public static void main( String args[] )
   {
      CustomPanelTest app = new CustomPanelTest();

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
