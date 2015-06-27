package library_system;
/**
 * Vehicle.java 
 * 
 * A child of @Screen that handles the vehicles of the system. Can add, edit, view, delete vehicles of the system,
 * 
 * @author Mohamed Habib
 */


public class Vehicle extends Screen {

 public Vehicle() {
  /**
   * sends the header of the screen, an array of strings that contains the
   * labels and an integer contains, the number of labels and text fields
   * and combo box
   */

  super("Vehicle", new String[] { "Vehicle ID:", "Vehicle Model Name:", "Vehicle No:", "Driver ID:",
    "Vehicle Divisio :" }, 5);

  for (int i = 0; i < textFields.length; i++) {

   labels[i].setText(getStr(i));

   textFields[i].setToolTipText("Enter" + getStr(i) + "Here!");

  }

  textFields[0].setBounds(131, 8, 156, 20);
  textFields[1].setBounds(419, 8, 156, 20);
  textFields[2].setBounds(706, 8, 156, 20);
  textFields[3].setBounds(131, 46, 156, 20);
  textFields[4].setBounds(418, 46, 156, 20);

  labels[0].setBounds(10, 11, 98, 14);
  labels[1].setBounds(297, 11, 98, 14);
  labels[2].setBounds(585, 14, 98, 14);
  labels[3].setBounds(10, 49, 98, 14);
  labels[4].setBounds(297, 49, 98, 14);
  super.table(conn.VehicleView());
  // getTable().setBounds(0, 180, 581, 239);
  // Object rowData[][] = { { "", "", "" }, { "", "", "" } };
  // Object columnNames[] = str;
  //
  // scrollPane.setBounds(0, 192, 581, 227);

 }
}
