import java.awt.EventQueue;
import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.NoFixedFacet;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;



public class GUI extends JFrame{


	private JTextField tfMoviePrice;
	private JTextField tfSeatPrice;
	private JTextField tfDrinkPrice;
	private JTextField tfSnackPrice;
	private JTextField tfTotal;
	private JTextField textFieldseatsava;
	private double total;
	private JTextField textFieldtheater;

	//Creating the application

	public GUI() {
		getContentPane().setBackground(UIManager.getColor("PasswordField.selectionBackground"));
		initialize();
	}


	private void initialize() {
		getContentPane().setLayout(null);

		// call the classes to populate the combo box with the strings within my Theatre class


		Theater movieList = new Theater();
		Theater seatsList = new Theater();
		Theater numberList = new Theater();
		Theater dateList = new Theater();
		Theater snacksList = new Theater();
		Theater drinkList = new Theater();

		// declaring JcomboBox


		JComboBox comboBoxSnacks = new JComboBox(snacksList.snacks);
		JComboBox comboBoxNoOfTickets = new JComboBox(numberList.number);
		JComboBox comboBoxNoOfDrinks = new JComboBox(numberList.number);
		JComboBox comboBoxSeat = new JComboBox(seatsList.seatsList);
		JComboBox comboBoxDrinks = new JComboBox(drinkList.drinks);
		JComboBox comboBoxNoOfSnacks = new JComboBox(numberList.number);
		JComboBox comboBoxMovie = new JComboBox(movieList.movieList);
		JComboBox comboBoxDate = new JComboBox(dateList.date);

		//declaring JLabels


		JLabel lblPictureBox = new JLabel();
		JLabel lblTitle = new JLabel("TFML Cinema");
		lblTitle.setForeground(Color.WHITE);
		JLabel lblSubTitle = new JLabel("Welcome to TFML Cinema! We hope you Enjoy your movie.");
		lblSubTitle.setForeground(Color.WHITE);
		JLabel lblSeatTitle = new JLabel("Select Seats");
		lblSeatTitle.setForeground(Color.WHITE);
		JLabel lblNoOfTicketsTitle = new JLabel("No. of Tickets");
		lblNoOfTicketsTitle.setForeground(Color.WHITE);
		lblNoOfTicketsTitle.setBackground(Color.WHITE);
		JLabel lblSnacks = new JLabel("Snacks");
		lblSnacks.setForeground(Color.WHITE);
		JLabel lblNoOfSnacks = new JLabel("No. of Snacks");
		lblNoOfSnacks.setForeground(Color.WHITE);
		JLabel lblSeatsAva = new JLabel("Seats Available");
		lblSeatsAva.setForeground(Color.WHITE);
		JLabel lblMovieTitle = new JLabel("Select a Movie");
		lblMovieTitle.setForeground(Color.WHITE);
		JLabel lblSnacksAndDrinksTitle = new JLabel("Snacks and Drinks");
		lblSnacksAndDrinksTitle.setForeground(Color.WHITE);
		JLabel lblNoOfDrinks = new JLabel("No. of Drinks");
		lblNoOfDrinks.setForeground(Color.WHITE);
		JLabel lblDateTitle = new JLabel("Date");
		lblDateTitle.setForeground(Color.WHITE);
		JLabel lblPg = new JLabel("");
		JLabel lblMoviePriceTitle = new JLabel("Movie Price");
		lblMoviePriceTitle.setBackground(Color.WHITE);
		lblMoviePriceTitle.setForeground(Color.WHITE);
		JLabel lblSeatPriceTitle = new JLabel("Seat Price");
		lblSeatPriceTitle.setForeground(Color.WHITE);
		JLabel lblDrinksPrice = new JLabel("Drink Price");
		lblDrinksPrice.setForeground(Color.WHITE);
		JLabel lblSnacksPrice = new JLabel("Snack Price");
		lblSnacksPrice.setForeground(Color.WHITE);
		JLabel lblTheaterTitle = new JLabel("Theater");
		lblTheaterTitle.setForeground(Color.WHITE);

		// declaring text fields

		tfMoviePrice = new JTextField();
		tfSeatPrice = new JTextField();
		tfDrinkPrice = new JTextField();
		tfSnackPrice = new JTextField();
		textFieldseatsava = new JTextField("30");
		tfTotal = new JTextField();
		textFieldtheater = new JTextField();
		textFieldtheater.setEditable(false);

		// setting fonts and bonds (designing).

		lblTitle.setFont(new Font("Baskerville Old Face", Font.BOLD, 20));
		lblTitle.setBounds(322, 12, 155, 26);
		getContentPane().add(lblTitle);


		lblSubTitle.setFont(new Font("Baskerville Old Face", Font.PLAIN, 16));
		lblSubTitle.setBounds(189, 50, 422, 18);
		getContentPane().add(lblSubTitle);


		lblPictureBox.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblPictureBox.setBounds(624, 151, 142, 167);
		getContentPane().add(lblPictureBox);

		// adding information to other JLabels and text fields depending on the index of the movie combo box.
		// adding images and text to correct JLabels/text fields

		comboBoxMovie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textFieldseatsava.setText("30");
				comboBoxSeat.setSelectedIndex(0);
				comboBoxNoOfTickets.setSelectedIndex(0);
				comboBoxNoOfDrinks.setSelectedIndex(0);
				comboBoxDrinks.setSelectedIndex(0);
				comboBoxSnacks.setSelectedIndex(0);
				comboBoxNoOfSnacks.setSelectedIndex(0);


				if (comboBoxMovie.getSelectedIndex()==0)
				{
					tfMoviePrice.setText("0.00");
					textFieldtheater.setText("");


				}
				if (comboBoxMovie.getSelectedIndex()==1)
				{
					tfMoviePrice.setText("3.50");
					textFieldtheater.setText("Theater:A1");
					lblPictureBox.setIcon(new ImageIcon(getClass().getResource("DarkKnight.png")));
					lblPg.setIcon(new ImageIcon(getClass().getResource("pg13.png")));
				}
				if (comboBoxMovie.getSelectedIndex()==2)
				{
					tfMoviePrice.setText("3.50");
					textFieldtheater.setText("Theater:B2");
					lblPictureBox.setIcon(new ImageIcon(getClass().getResource("Inception.png")));
					lblPg.setIcon(new ImageIcon(getClass().getResource("pg13.png")));
				}
				if (comboBoxMovie.getSelectedIndex()==3)
				{
					tfMoviePrice.setText("3.50");
					textFieldtheater.setText("Theater:C3");
					lblPictureBox.setIcon(new ImageIcon(getClass().getResource("Matrix.png")));
					lblPg.setIcon(new ImageIcon(getClass().getResource("pg16.png")));
				}
				if (comboBoxMovie.getSelectedIndex()==4)
				{
					tfMoviePrice.setText("3.50");
					textFieldtheater.setText("Theater:D4");
					lblPictureBox.setIcon(new ImageIcon(getClass().getResource("Interstellar.png")));
					lblPg.setIcon(new ImageIcon(getClass().getResource("pg13.png")));
				}
				if (comboBoxMovie.getSelectedIndex()==5)
				{
					tfMoviePrice.setText("3.50");
					textFieldtheater.setText("Theater:E5");
					lblPictureBox.setIcon(new ImageIcon(getClass().getResource("Avengers.png")));
					lblPg.setIcon(new ImageIcon(getClass().getResource("pg13.png")));
				}
				if (comboBoxMovie.getSelectedIndex()==6)
				{
					tfMoviePrice.setText("5.00");
					textFieldtheater.setText("Theater:F6");
					lblPictureBox.setIcon(new ImageIcon(getClass().getResource("Logan.png")));
					lblPg.setIcon(new ImageIcon(getClass().getResource("pg16.png")));
				}
				if (comboBoxMovie.getSelectedIndex()==7)
				{
					tfMoviePrice.setText("5.00");
					textFieldtheater.setText("Theater:G7");
					lblPictureBox.setIcon(new ImageIcon(getClass().getResource("Suicide_Squad.png")));
					lblPg.setIcon(new ImageIcon(getClass().getResource("p.png")));
				}
				if (comboBoxMovie.getSelectedIndex()==8)
				{
					tfMoviePrice.setText("5.00");
					textFieldtheater.setText("Theater:H8");
					lblPictureBox.setIcon(new ImageIcon(getClass().getResource("xXx.png")));
				}
				if (comboBoxMovie.getSelectedIndex()==9)
				{
					tfMoviePrice.setText("5.00");
					textFieldtheater.setText("Theater:I9");
					lblPictureBox.setIcon(new ImageIcon(getClass().getResource("Moonlight.png")));
				}
				if (comboBoxMovie.getSelectedIndex()==10)
				{
					tfMoviePrice.setText("5.00");
					textFieldtheater.setText("Theater:J10");
					lblPictureBox.setIcon(new ImageIcon(getClass().getResource("Spiderman_Homecoming.png")));
				}
			}
		});
		comboBoxMovie.setBounds(26, 116, 155, 18);
		getContentPane().add(comboBoxMovie);


		lblMovieTitle.setFont(new Font("Baskerville", Font.PLAIN, 13));
		lblMovieTitle.setBounds(193, 116, 89, 16);
		getContentPane().add(lblMovieTitle);

		// depending on what index has been selected, add text to the text field.
		// standard seats = £1, premium seats = £2.50
		comboBoxSeat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxSeat.getSelectedIndex()==0)
				{
					tfSeatPrice.setText("0.00");

				}
				if (comboBoxSeat.getSelectedIndex()==1)
				{
					tfSeatPrice.setText("1.00");

				}
				if (comboBoxSeat.getSelectedIndex()==2)
				{
					tfSeatPrice.setText("2.50");

				}
				if (comboBoxSeat.getSelectedIndex()==3)
				{
					tfSeatPrice.setText("3.50");

				}
			}
		});
		comboBoxSeat.setBounds(294, 116, 155, 18);
		getContentPane().add(comboBoxSeat);

		lblSeatTitle.setFont(new Font("Baskerville", Font.PLAIN, 13));
		lblSeatTitle.setBounds(461, 116, 74, 18);
		getContentPane().add(lblSeatTitle);


		comboBoxNoOfTickets.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		comboBoxNoOfTickets.setBounds(26, 222, 65, 18);
		getContentPane().add(comboBoxNoOfTickets);


		lblNoOfTicketsTitle.setFont(new Font("Baskerville", Font.PLAIN, 13));
		lblNoOfTicketsTitle.setBounds(103, 222, 89, 18);
		getContentPane().add(lblNoOfTicketsTitle);



		lblSeatsAva.setFont(new Font("Baskerville", Font.PLAIN, 13));
		lblSeatsAva.setBounds(664, 335, 94, 18);
		getContentPane().add(lblSeatsAva);

		lblSnacksAndDrinksTitle.setFont(new Font("Baskerville", Font.PLAIN, 16));
		lblSnacksAndDrinksTitle.setBounds(213, 283, 123, 18);
		getContentPane().add(lblSnacksAndDrinksTitle);

		// depending on what index has been selected, add text to the text field.
		comboBoxDrinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBoxDrinks.getSelectedIndex()==0)
				{
					tfDrinkPrice.setText("0.00");

				}
				if (comboBoxDrinks.getSelectedIndex()==1)
				{
					tfDrinkPrice.setText("1.00");

				}
				if (comboBoxDrinks.getSelectedIndex()==2)
				{
					tfDrinkPrice.setText("1.00");

				}
				if (comboBoxDrinks.getSelectedIndex()==3)
				{
					tfDrinkPrice.setText("1.00");

				}
			}
		});
		comboBoxDrinks.setBounds(294, 330, 155, 18);
		getContentPane().add(comboBoxDrinks);

		JLabel lblDrinks = new JLabel("Drinks");
		lblDrinks.setForeground(Color.WHITE);
		lblDrinks.setFont(new Font("Baskerville", Font.PLAIN, 13));
		lblDrinks.setBounds(461, 330, 36, 18);
		getContentPane().add(lblDrinks);


		comboBoxNoOfDrinks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {



			}
		});
		comboBoxNoOfDrinks.setBounds(294, 415, 59, 18);
		getContentPane().add(comboBoxNoOfDrinks);

		lblNoOfDrinks.setFont(new Font("Baskerville", Font.PLAIN, 13));
		lblNoOfDrinks.setBounds(365, 415, 74, 18);
		getContentPane().add(lblNoOfDrinks);
		// depending on what index has been selected, add text to the text field.
		comboBoxSnacks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (comboBoxSnacks.getSelectedIndex()==0)
				{
					tfSnackPrice.setText("0.00");

				}
				if (comboBoxSnacks.getSelectedIndex()==1)
				{
					tfSnackPrice.setText("0.50");

				}
				if (comboBoxSnacks.getSelectedIndex()==2)
				{
					tfSnackPrice.setText("1.00");

				}
				if (comboBoxSnacks.getSelectedIndex()==3)
				{
					tfSnackPrice.setText("1.00");

				}
			}
		});
		comboBoxSnacks.setBounds(26, 330, 155, 18);
		getContentPane().add(comboBoxSnacks);

		comboBoxNoOfSnacks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		comboBoxNoOfSnacks.setBounds(26, 415, 59, 18);
		getContentPane().add(comboBoxNoOfSnacks);


		lblSnacks.setFont(new Font("Baskerville", Font.PLAIN, 13));
		lblSnacks.setBounds(194, 330, 36, 18);
		getContentPane().add(lblSnacks);


		lblNoOfSnacks.setFont(new Font("Baskerville", Font.PLAIN, 13));
		lblNoOfSnacks.setBounds(103, 415, 79, 18);
		getContentPane().add(lblNoOfSnacks);

		comboBoxDate.setBounds(294, 222, 155, 18);
		getContentPane().add(comboBoxDate);

		lblDateTitle.setFont(new Font("Baskerville", Font.PLAIN, 13));
		lblDateTitle.setBounds(461, 222, 36, 18);
		getContentPane().add(lblDateTitle);

		lblPg.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblPg.setHorizontalAlignment(SwingConstants.CENTER);
		lblPg.setBounds(559, 259, 59, 59);
		getContentPane().add(lblPg);

		lblMoviePriceTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoviePriceTitle.setFont(new Font("Baskerville", Font.PLAIN, 13));
		lblMoviePriceTitle.setBounds(178, 177, 79, 18);
		getContentPane().add(lblMoviePriceTitle);


		tfMoviePrice.setEditable(false);
		tfMoviePrice.setBounds(36, 172, 135, 26);
		getContentPane().add(tfMoviePrice);
		tfMoviePrice.setColumns(10);

		tfSeatPrice.setEditable(false);
		tfSeatPrice.setColumns(10);
		tfSeatPrice.setBounds(294, 172, 135, 26);
		getContentPane().add(tfSeatPrice);

		lblSeatPriceTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeatPriceTitle.setFont(new Font("Baskerville", Font.PLAIN, 13));
		lblSeatPriceTitle.setBounds(432, 177, 79, 18);
		getContentPane().add(lblSeatPriceTitle);

		tfDrinkPrice.setEditable(false);
		tfDrinkPrice.setColumns(10);
		tfDrinkPrice.setBounds(309, 368, 130, 26);
		getContentPane().add(tfDrinkPrice);

		tfSnackPrice.setEditable(false);
		tfSnackPrice.setColumns(10);
		tfSnackPrice.setBounds(26, 368, 130, 26);
		getContentPane().add(tfSnackPrice);

		lblDrinksPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblDrinksPrice.setFont(new Font("Baskerville", Font.PLAIN, 13));
		lblDrinksPrice.setBounds(456, 373, 79, 18);
		getContentPane().add(lblDrinksPrice);

		lblSnacksPrice.setHorizontalAlignment(SwingConstants.CENTER);
		lblSnacksPrice.setFont(new Font("Baskerville", Font.PLAIN, 13));
		lblSnacksPrice.setBounds(178, 373, 79, 18);
		getContentPane().add(lblSnacksPrice);

		tfTotal.setEditable(false);
		tfTotal.setColumns(10);
		tfTotal.setBounds(103, 496, 130, 26);
		getContentPane().add(tfTotal);


		//making calculations in an action listener to work out my total. i have used a method  
		//which allows me to change my text into an integer and work out the total. i have then
		//converted the final total integer back into a string, to be displayed into the correct text field. 


		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double moviePrice, seatPrice, drinkPrice, snackDrinkPrice, ticketsAVA;
				int noOfSeats;

				int ticketIndex=comboBoxNoOfTickets.getSelectedIndex();
				int drinkIndex=comboBoxNoOfDrinks.getSelectedIndex();
				int snackIndex=comboBoxNoOfSnacks.getSelectedIndex();


				seatPrice=Double.parseDouble(tfSeatPrice.getText());
				moviePrice=Double.parseDouble(tfMoviePrice.getText());
				drinkPrice=Double.parseDouble(tfDrinkPrice.getText());
				snackDrinkPrice=Double.parseDouble(tfSnackPrice.getText());
				ticketsAVA=Double.parseDouble(textFieldseatsava.getText());



				total=(moviePrice+seatPrice)*ticketIndex+drinkPrice*drinkIndex+snackDrinkPrice*snackIndex;

				tfTotal.setText("£"+Double.toString(total));


				if (ticketIndex != 0 ){
					noOfSeats = 30-ticketIndex;
					textFieldseatsava.setText(Integer.toString(noOfSeats));

				}


			}	
		});
		btnTotal.setFont(new Font("Baskerville", Font.PLAIN, 13));
		btnTotal.setBounds(238, 497, 117, 29);
		getContentPane().add(btnTotal);


		textFieldseatsava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


			}
		});



		JButton btnCashReceipt = new JButton("Cash/Receipt");
		btnCashReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// below i have added an if statements which allows the user to input a value. this is for the cash payment of the order.
				// if the input is same or higher than the total value, the payment is accepted and the change is give.
				// if the payment is less than the value, the payment is not accepted.
				double amount = total;

				String input =JOptionPane.showInputDialog("Please pay for your order. Thank you.");
				double money = Double.parseDouble(input);


				if(money == amount){
					JOptionPane.showMessageDialog(btnCashReceipt, "Accepted!");
				}
				else if(money<amount) {
					JOptionPane.showMessageDialog(btnCashReceipt, "Not Accepted!");
				}
				else if(money>amount) {
					double returnMoney = money - amount;
					JOptionPane.showMessageDialog(btnCashReceipt, "Change: £" + returnMoney);
				}

				// Here i have got the information from all the combo boxes and text fields, so that i can show what the user has selected.

				Object Receiptmovie = comboBoxMovie.getSelectedItem();
				Object Receiptseats = comboBoxSeat.getSelectedItem();
				Object Receiptnseats = comboBoxNoOfTickets.getSelectedItem();
				Object Receiptdrinks = comboBoxDrinks.getSelectedItem();
				Object Receiptndrinks = comboBoxNoOfDrinks.getSelectedItem();
				Object Receiptsnacks = comboBoxSnacks.getSelectedItem();
				Object Receiptnsnacks = comboBoxNoOfSnacks.getSelectedItem();
				Object Receiptdate = comboBoxDate.getSelectedItem();
				String Receiptmovieprice = tfMoviePrice.getText();
				String Receiptseatprice = tfSeatPrice.getText();
				String Receiptsnackprice = tfSnackPrice.getText();
				String Receiptdrinkprice = tfDrinkPrice.getText();
				String Receipttotalprice = tfTotal.getText();
				String Receipttheater = textFieldtheater.getText();

				// I have printed the receipt below and added all the important information for user to see. 

				String receipt = 
						"Movie:  " + (String) Receiptmovie + 
						"  Price:  " + (String) Receiptmovieprice +
						"\n" + (String) Receiptseats +
						"  Price:  " + (String) Receiptseatprice +
						"\nTickets: " + (String) Receiptnseats +
						"\nDate:  " + (String) Receiptdate +
						"\n" + (String) Receipttheater +
						"\n" + (String) Receiptdrinks +
						"  Price:  " + (String) Receiptdrinkprice +
						"\nQuantity: " + (String) Receiptndrinks +
						"\n" + (String) Receiptsnacks +
						"  Price:  " + (String) Receiptsnackprice +
						"\nQuantity: " + (String) Receiptnsnacks + 
						"\n************************************" +
						"\nTotal Price:" + (String) Receipttotalprice;

				JOptionPane.showMessageDialog(btnCashReceipt, receipt, "Receipt", JOptionPane.PLAIN_MESSAGE);

			}
		});
		btnCashReceipt.setFont(new Font("Baskerville", Font.PLAIN, 13));
		btnCashReceipt.setBounds(608, 497, 117, 29);
		getContentPane().add(btnCashReceipt);


		textFieldseatsava.setEditable(false);
		textFieldseatsava.setColumns(10);
		textFieldseatsava.setBounds(634, 330, 27, 26);
		getContentPane().add(textFieldseatsava);


		textFieldtheater.setBounds(664, 113, 103, 26);
		getContentPane().add(textFieldtheater);
		textFieldtheater.setColumns(10);

		lblTheaterTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTheaterTitle.setFont(new Font("Baskerville", Font.PLAIN, 13));
		lblTheaterTitle.setBounds(597, 116, 79, 18);
		getContentPane().add(lblTheaterTitle);

		JButton btnCardReceipt = new JButton("Card/Receipt");
		btnCardReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// below i have added an if statements which allows the user to input a value. this is for the card payment of the order.
				// if the input is same or higher than the total value, the payment is accepted and the change is give.
				// if the payment is less than the value, the payment is not accepted.
				double amount = total;
				String card =JOptionPane.showInputDialog("Please Enter Card Number Below");
				String input =JOptionPane.showInputDialog("Please pay for your order. Thank you.");
				double money = Double.parseDouble(input);


				if(money == amount){
					JOptionPane.showMessageDialog(btnCashReceipt, "Accepted!");
				}
				else if(money<amount) {
					JOptionPane.showMessageDialog(btnCashReceipt, "Not Accepted!");
				}
				else if(money>amount) {
					double returnMoney = money - amount;
					JOptionPane.showMessageDialog(btnCashReceipt, "Change: £" + returnMoney);
				}

				// Here i have got the information from all the combo boxes and text fields, so that i can show what the user has selected.

				Object Receiptmovie = comboBoxMovie.getSelectedItem();
				Object Receiptseats = comboBoxSeat.getSelectedItem();
				Object Receiptnseats = comboBoxNoOfTickets.getSelectedItem();
				Object Receiptdrinks = comboBoxDrinks.getSelectedItem();
				Object Receiptndrinks = comboBoxNoOfDrinks.getSelectedItem();
				Object Receiptsnacks = comboBoxSnacks.getSelectedItem();
				Object Receiptnsnacks = comboBoxNoOfSnacks.getSelectedItem();
				Object Receiptdate = comboBoxDate.getSelectedItem();
				String Receiptmovieprice = tfMoviePrice.getText();
				String Receiptseatprice = tfSeatPrice.getText();
				String Receiptsnackprice = tfSnackPrice.getText();
				String Receiptdrinkprice = tfDrinkPrice.getText();
				String Receipttotalprice = tfTotal.getText();
				String Receipttheater = textFieldtheater.getText();

				// I have printed the receipt below and added all the important information for user to see. 

				String receipt = 
						"Movie:  " + (String) Receiptmovie + 
						"  Price:  " + (String) Receiptmovieprice +
						"\n" + (String) Receiptseats +
						"  Price:  " + (String) Receiptseatprice +
						"\nTickets: " + (String) Receiptnseats +
						"\nDate:  " + (String) Receiptdate +
						"\n" + (String) Receipttheater +
						"\n" + (String) Receiptdrinks +
						"  Price:  " + (String) Receiptdrinkprice +
						"\nQuantity: " + (String) Receiptndrinks +
						"\n" + (String) Receiptsnacks +
						"  Price:  " + (String) Receiptsnackprice +
						"\nQuantity: " + (String) Receiptnsnacks + 
						"\n************************************" +
						"\nTotal Price:" + (String) Receipttotalprice;

				JOptionPane.showMessageDialog(btnCashReceipt, receipt, "Receipt", JOptionPane.PLAIN_MESSAGE);



			}
		});
		btnCardReceipt.setFont(new Font("Baskerville", Font.PLAIN, 13));
		btnCardReceipt.setBounds(474, 497, 117, 29);
		getContentPane().add(btnCardReceipt);

		JLabel lblBackground = new JLabel("");
		lblBackground.setBounds(-84, -93, 1026, 759);
		getContentPane().add(lblBackground);
		lblBackground.setIcon(new ImageIcon(getClass().getResource("BackGround.jpg")));
	}
}
