package chapter12;
import javax.swing.*;
import java.awt.event.*;// actionListener and actionEvent are in
//simpleguilb implements the interface this says "an instance of simpleGuiB IS-A actionListener
public class SimpleGuilB implements ActionListener {
	JButton button;
	
	public static void main(String[] args){
		SimpleGuilB gui = new SimpleGuilB();
		gui.go();
	}
	
	public void go(){
	
		JFrame frame = new JFrame();
		button = new JButton("cllick me");
		//register your interest with the button.This says to the button."Add me to your list of listeners"
		//The argument you pass  must be an object from a class that implemnts actionlistener.
		button.addActionListener(this);
		
		
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		frame.setVisible(false);

	}
	//Implements the actionListener interface's actionperformed() method.this is the actual event handling method
	public void actionPerformed(ActionEvent event){
		//this button call this method to let you know an event happened. It sends you an actionEvent object as the argument,
		//but we do not need it.
		//knowing the event happened is enough infor for us
		button.setText("I've been clicked");
	}
	

}
