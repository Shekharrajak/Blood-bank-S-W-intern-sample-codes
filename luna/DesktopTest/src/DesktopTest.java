import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class DesktopTest extends JFrame {
   public DesktopTest()
   {
      super( "Using a JDesktopPane" );

      JMenuBar bar = new JMenuBar();
      JMenu addMenu = new JMenu( "Add" );
      JMenuItem newFrame = new JMenuItem( "Internal Frame" );
      addMenu.add( newFrame );      
      bar.add( addMenu );
      setJMenuBar( bar );      

      final JDesktopPane theDesktop = new JDesktopPane();
      getContentPane().add( theDesktop );
    
      newFrame.addActionListener(
         new ActionListener() {
            public void actionPerformed( ActionEvent e ) {
               JInternalFrame frame =
                  new JInternalFrame(
                     "Internal Frame",
                     true, true, true, true );

               Container c = frame.getContentPane();
               MyJPanel panel = new MyJPanel();

               c.add( panel, BorderLayout.CENTER );
               frame.setSize(
                  panel.getImageWidthHeight().width,
                  panel.getImageWidthHeight().height );
               frame.setOpaque( true );
               theDesktop.add( frame );
            }
         }
      );

      setSize( 500, 400 );
      show();
   }

   public static void main( String args[] )
   {     
      DesktopTest app = new DesktopTest();

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

class MyJPanel extends JPanel {
    private ImageIcon imgIcon;

    public MyJPanel()
    {
       imgIcon = new ImageIcon( "jhtp3.gif" );
    }

    public void paintComponent( Graphics g )
    {
       imgIcon.paintIcon( this, g, 0, 0 );
    }

    public Dimension getImageWidthHeight()
    {
       return new Dimension( imgIcon.getIconWidth(),
                             imgIcon.getIconHeight() );  
    }
}