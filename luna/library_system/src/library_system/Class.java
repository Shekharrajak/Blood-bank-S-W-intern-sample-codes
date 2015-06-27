package library_system;


import javax.swing.JOptionPane;

public class Class {

 private static Driver driver;

 public static Driver getDriver() {
  return driver;
 }

 public static void setDriver(Driver driver) {
  Class.driver = driver;
 }

 private static Vehicle vehicle;
 private static Blood_Info blood_info;
 private static Warnings warning;

 private static WelcomeScreen welcomeScreen;
 private static LoginScreen loginScreen;

 static void drivers() {
  driver = new Driver();
 }

 static void vehicles() {
  vehicle = new Vehicle();
 }

 static void blood_info() {
  blood_info = new Blood_Info();
 }

 static void warnings() {
  warning = new Warnings();
 }

 static void Exit() {
  JOptionPane.showMessageDialog(null, "Good Bye");
  System.exit(0);
 }

 static void Logout() {
  JOptionPane.showMessageDialog(null, "Good Bye");
  loginScreen = new LoginScreen();
 }

 static void Back() {
  welcomeScreen = new WelcomeScreen();
 }
}
