//package Blood_bank_vehicle_module;
//import Blood_bank_vehicle_module.Screen;



public class Driver extends Screen {

 public Driver() {

  /**
   * sends the header of the screen, an array of strings that contains the
   * labels and an integer contains, the number of labels and text fields
   * and combo box
   */

  super("Driver", new String[] { "Driver ID", "Driver Name", "Contact No.", "Email ID",
    "DOB", "Address" }, 6);

  /**
   * 
   * sets the text to the labels and the tooltip text to the fields
   * 
   */

  for (int i = 0; i < textFields.length; i++) {
   labels[i].setText(getStr(i));
   textFields[i].setToolTipText("Enter " + getStr(i) + " Here!");
  }

  textFields[0].setBounds(131, 8, 156, 20);
  textFields[1].setBounds(419, 8, 156, 20);
  textFields[2].setBounds(706, 8, 156, 20);
  textFields[3].setBounds(131, 46, 156, 20);
  textFields[4].setBounds(418, 46, 156, 20);
  textFields[5].setBounds(706, 46, 156, 20);

  labels[0].setBounds(10, 11, 98, 14);
  labels[1].setBounds(297, 11, 98, 14);
  labels[2].setBounds(585, 14, 98, 14);
  labels[3].setBounds(10, 49, 98, 14);
  labels[4].setBounds(297, 49, 98, 14);
  labels[5].setBounds(585, 49, 98, 14);

   //super.textFields[0].setVisible(false);
  // super.labels[0].setVisible(false);
  super.table(conn.DriverView());

  // table(getStrArr(), d);

  // getTable().setBounds(0, 180, 581, 239);
  //
  //
  // Object rowData[][] = { { "", "", "" }, { "", "", "" } };
  // Object columnNames[] = str;
  //
  // scrollPane.setBounds(0, 192, 581, 227);
 }

}
