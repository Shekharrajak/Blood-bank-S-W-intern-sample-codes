

//import Blood_bank_vehicle_module.Screen;

/**
 
 * 
 * 
 */

public class Warnings extends Screen {
 Warnings() {

  super("Warnings", new String[] { "ID: ", "BookId:", "Name:", "SNN:",
    "Borrow Date:", "Return Date:", "Phone:", "Adress:", "E-mail:",
    "Faculty:", "Class:", "Fine:" }, 12);
  super.btnAdd.setVisible(false);
  super.btnDelete.setVisible(false);
  super.btnModify.setVisible(false);
  super.btnSave.setVisible(false);
   super.table.setBounds(MAXIMIZED_BOTH, ABORT, 60, 90);
  super.btnSearch.setVisible(false);
  super.comboBox.setVisible(false);
  super.searchField.setVisible(false);
  super.lblSearch.setVisible(false);
  super.table(conn.Warnings());

 }

}
