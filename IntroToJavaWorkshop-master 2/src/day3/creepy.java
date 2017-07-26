package day3;

import javax.swing.JOptionPane;

public class creepy {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "if you complete this quiz you will recieve a free mac book");
	String ans=JOptionPane.showInputDialog("how much money do you have?");
	String creepy=JOptionPane.showInputDialog("what room do you sleep in?");
	String ant=JOptionPane.showInputDialog("what is your credit card number?");
	String cheese=JOptionPane.showInputDialog("what is your social security number?");
	String hi=JOptionPane.showInputDialog("when does your credit card expire?");
	String pok=JOptionPane.showInputDialog("where do you live?");
	JOptionPane.showConfirmDialog(null, "your answers are" +ans+ creepy+ ant+ cheese+ hi+ pok+);
}}
