import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;


public class  calculator
{  
   // Components shared by main() and call back methods
   // must be defined OUTSIDE

   static private JTextArea inputArea;       // Text area for input
   static private JTextArea outputArea;      // Text area for output
   static private JButton actionButton;      // Button to trigger copy action

   public static void main(String[] args)
   {
      JFrame f = new JFrame("TextTest 2");


      // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
      // 1. Construct components in the GUI
      // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

      // =====================================================
      // 1. a text area for input
      //    The text area will hold 6 lines or 42 characters
      // =====================================================
      inputArea = new JTextArea(6, 42);        // Default is editable...

      // ****************************************************************
      // Picks a font for the inputArea
      // ****************************************************************
      inputArea.setFont( new Font("SansSerif", Font.BOLD, 17) );

      // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
      // Add scroll bars to JTextArea
      // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
      JScrollPane inputScrollArea =
        new JScrollPane(inputArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                                   JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

      // ===========================
      // 2. a text area for output
      // ===========================
      outputArea = new JTextArea(12, 42);
      outputArea.setEditable(false);     // No editing in output area....

      outputArea.setFont( new Font("Monospaced", Font.BOLD, 17) );

      // vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
      // Add scroll bars to JTextArea
      // ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
      JScrollPane outputScrollArea =
        new JScrollPane(outputArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                                    JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

      // ================================
      // 3. a button to start the show
      // ================================
      actionButton = new JButton("Copy !");


      // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
      // 2. Place the components in JFrame
      // +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

      // ======================================================
      // Pick Layout manager first !!!
      // ======================================================
      f.getContentPane().setLayout(new BorderLayout() );

      // ======================================================
      // Place the input in NORTH
      // ======================================================
      JPanel x = new JPanel();
      x.setLayout( new GridLayout(2,1) );
      x.add(inputScrollArea);
      x.add(outputScrollArea);

      f.getContentPane().add(x, "Center");

      // ======================================================
      // Place the button in SOUTH
      // ======================================================
      JPanel buttonPanel = new JPanel();
      buttonPanel.add(actionButton);
      f.getContentPane().add(buttonPanel, "South");


      f.setSize(500, 500);
      f.setVisible(true);
   }
}