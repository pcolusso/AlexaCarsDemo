package alexacars;

/*
Programmer: Christie-Anne Sansby
Course: Programming Fundamentals COIT 11222 T221
File: AlexaCarRentalsGUI.java
Purpose: Alexa Car Rental GUI windowed application
Date: 1 October 2021
*/


import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

// TODO -- create Customer class (separate file)

public class AlexaCarRentalsGUI extends JFrame implements ActionListener
{

	private JLabel titleLabel = new JLabel("Alexa Car Rental Management System"); // program title
	private JLabel nameLabel = new JLabel("Customer name: ");// for prompt
	private JTextField nameField = new JTextField(28);      // for name entry

	private JLabel daysLabel = new JLabel("Number of days: ");// for prompt
	private JTextField daysField = new JTextField(4);      // for number of days entry

	private JLabel distanceLabel = new JLabel("Distance travelled in km(s): ");// for prompt
	private JTextField distanceField = new JTextField(4);      // for Distance travelled entry

	private JTextArea displayTextArea = new JTextArea("", 16, 60); // declare text area
	private JScrollPane scrollPane; // scroll pane for the text area
	//  declare all of the buttons
	private JButton enterButton = new JButton("Enter"); // buttons
	private JButton displayButton = new JButton("Display All");
	private JButton searchButton = new JButton("Search");
	private JButton exitButton = new JButton("Exit");
        
    private Customer[ ] customerArray = new Customer[10];
    private int currentCustomer = 0;
    // TODO -- declare maximum Customers constant
	// TODO -- declare Customer object array
	// TODO -- declare and initialise current customer variable
        //Construstor 
	public AlexaCarRentalsGUI()
	{ // constructor create the Gui
		this.setLayout(new FlowLayout());			// set JFrame to FlowLayout

		titleLabel.setFont(new Font("Ariel", Font.BOLD, 22));
		add(titleLabel);
		add(nameLabel);
		add(nameField);
		add(daysLabel);
		add(daysField);
		add(distanceLabel);
		add(distanceField);

		// set text area to a monospaced font so the columns can be aligned using a format string
		displayTextArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
		displayTextArea.setEditable(false); 			// make text area read only
		scrollPane = new JScrollPane(displayTextArea); 	// add text area to the scroll pane
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER); // just need vertical scrolling

		add(scrollPane);

		add(enterButton);
		add(displayButton);
		add(searchButton);
		add(exitButton);

		enterButton.addActionListener(this);// add the action listener to the buttons
		displayButton.addActionListener(this);
		searchButton.addActionListener(this);
		exitButton.addActionListener(this);
		// when the user pushes the system close (X top right corner)
		addWindowListener( // override window closing method
			new WindowAdapter()
			{
				public void windowClosing(WindowEvent e)
				{
					exit();				// Attempt to exit application
				}
			}
		);
	}



	public void actionPerformed(ActionEvent e)
	{ // process the clicks on all of the buttons
		String command = e.getActionCommand();

		if (command.compareTo("Enter") == 0)
			enter();
		else if (command.compareTo("Display All") == 0)
			displayAll();
		else if (command.compareTo("Search") == 0)
			search();
		else if (command.compareTo("Exit") == 0)
			exit();
	}


	private void enter()
	{
		// TODO -- Read in customer name and number of days and distance travelled in km(s) and add to the booking array

		displayHeading();


		// TODO -- Display customer name, number of days and distance travelled in km(s) and the total charge to the text area (as per the specification)

		// TODO -- Clear input fields and return focus to the customer name field and increment current customer variable

		// TODO -- complete error message code (put this code at the beginning of the method)
	}


	private void displayHeading()
	{
		displayTextArea.setText(String.format("%-20s%-9s%-9s%-6s\n", "Customer Name", "Days", "kms", "Calculated Charge"));
		appendLine();
	}


	private void appendLine()
	{
		displayTextArea.append("-----------------------------------------------------------\n");
	}




	private void displayAll()
	{

		// TODO -- display all of the customer details entered so far

		// TODO -- display average days cars were rented and total charges collected and return focus to the customer name field

		// TODO -- complete error message code (put at the beginning of the method)


	}



	private void search()
	{
		// TODO -- read search key (customer name) from input dialog

		// TODO -- iterate through array to search for the search key

		// TODO -- display the entry if it exists or an error message if it doesn't

		// TODO -- complete error message code (put at the beginning of the method)

	}


	private void exit()
	{

		// TODO -- display exit message here

		System.exit(0);
	}




	// Main method create instance of class
	public static void main(String[] args)
	{
		AlexaCarRentalsGUI f = new AlexaCarRentalsGUI();	// Create instance of class
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);	// allow the code to close the program
		f.setBounds(200, 100, 480, 440);						// Define position and size of app
		f.setTitle("Alexa Car Rental Management System");	// Set the title of the app
		f.setVisible(true);			// Make the application visible
		f.setResizable(false);			// Make the window not resizable
	} // main

}