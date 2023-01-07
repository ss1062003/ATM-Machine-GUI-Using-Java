import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

public class ATMFrame {

	private Card Account;
	private JFrame frame;
	private JTextField textField;
	private JTextField textFieldBalance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATMFrame window = new ATMFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ATMFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		Card c1 = new Card(1, 4652, 1550);
		Card c2 = new Card(2, 5678, 4670);
		Card c3 = new Card(3, 2365, 12000);	
		Card[] cardsList = {c1, c2, c3};
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1200, 739);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(240, 248, 255));
		panel.setBounds(299, 60, 408, 214);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEnterAmountW = new JLabel("Enter amount to withdraw: ");
		lblEnterAmountW.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterAmountW.setBounds(114, 84, 193, 14);
		panel.add(lblEnterAmountW);
		lblEnterAmountW.setVisible(false);
		
		textField = new JTextField();
		textField.setVisible(false);
		textField.setBounds(140, 109, 126, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblBalance = new JLabel("Balance");
		lblBalance.setVisible(false);
		lblBalance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBalance.setBounds(10, 27, 55, 14);
		panel.add(lblBalance);
		
		JLabel lblWithdrawal = new JLabel("Withdrawal");
		lblWithdrawal.setVisible(false);
		lblWithdrawal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWithdrawal.setBounds(10, 177, 77, 15);
		panel.add(lblWithdrawal);
		
		JLabel lblBack = new JLabel("Back");
		lblBack.setVisible(false);
		lblBack.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBack.setBounds(362, 27, 36, 14);
		panel.add(lblBack);
		
		JLabel lblDeposit = new JLabel("Deposit");
		lblDeposit.setVisible(false);
		lblDeposit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDeposit.setBounds(352, 172, 56, 20);
		panel.add(lblDeposit);
		
		JLabel lblEnterPin = new JLabel("Enter PIN:");
		lblEnterPin.setVisible(false);
		lblEnterPin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterPin.setBounds(165, 84, 68, 14);
		panel.add(lblEnterPin);
		
		JLabel lblInco = new JLabel("Incorrect PIN!");
		lblInco.setForeground(Color.GRAY);
		lblInco.setVisible(false);
		lblInco.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInco.setBounds(150, 147, 94, 14);
		panel.add(lblInco);
		
		JLabel lblAccountBalance = new JLabel("Account Balance:");
		lblAccountBalance.setVisible(false);
		lblAccountBalance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAccountBalance.setBounds(146, 84, 120, 14);
		panel.add(lblAccountBalance);
		
		textFieldBalance = new JTextField();
		textFieldBalance.setVisible(false);
		textFieldBalance.setColumns(10);
		textFieldBalance.setBounds(140, 109, 126, 27);
		panel.add(textFieldBalance);
		
		JLabel lblInsufficient = new JLabel("Insufficient funds!");
		lblInsufficient.setForeground(Color.GRAY);
		lblInsufficient.setVisible(false);
		lblInsufficient.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInsufficient.setEnabled(false);
		lblInsufficient.setBounds(140, 147, 126, 14);
		panel.add(lblInsufficient);
		
		JLabel lblTransaction = new JLabel("Transaction completed successfully!");
		lblTransaction.setVisible(false);
		lblTransaction.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTransaction.setBounds(83, 109, 233, 23);
		panel.add(lblTransaction);
		
		JLabel lblWelcome = new JLabel("Welcome to APSIT BANK!");
		lblWelcome.setVisible(false);
		lblWelcome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblWelcome.setBounds(124, 109, 162, 14);
		panel.add(lblWelcome);
		
		JLabel lblEnterAmountD = new JLabel("Enter amount to deposit:");
		lblEnterAmountD.setVisible(false);
		lblEnterAmountD.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblEnterAmountD.setBounds(124, 81, 167, 20);
		panel.add(lblEnterAmountD);
		
		JLabel lblInsert = new JLabel("INSERT CARD");
		lblInsert.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInsert.setBounds(156, 113, 94, 14);
		panel.add(lblInsert);
		
		JLabel lblExit = new JLabel("Do you want to exit?");
		lblExit.setVisible(false);
		lblExit.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblExit.setBounds(140, 109, 136, 23);
		panel.add(lblExit);
		
		JLabel lblYes = new JLabel("Yes");
		lblYes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblYes.setVisible(false);
		lblYes.setBounds(373, 113, 25, 14);
		panel.add(lblYes);
		
		JLabel lblNo = new JLabel("No");
		lblNo.setVisible(false);
		lblNo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNo.setBounds(10, 113, 25, 14);
		panel.add(lblNo);
		
		JLabel lblTake = new JLabel("TAKE YOUR CARD");
		lblTake.setVisible(false);
		lblTake.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTake.setBounds(140, 113, 126, 14);
		panel.add(lblTake);
		
		JLabel lblExit_btn = new JLabel("Exit");
		lblExit_btn.setVisible(false);
		lblExit_btn.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblExit_btn.setBounds(373, 27, 25, 14);
		panel.add(lblExit_btn);
		
		JButton btnBalance = new JButton("");
		btnBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblAccountBalance.setVisible(true);
				textFieldBalance.setText(Integer.toString(Account.getCardBalance()) + "₹");
				textFieldBalance.setVisible(true);
				lblBalance.setVisible(false);
				lblWithdrawal.setVisible(false);
				lblDeposit.setVisible(false);
				lblWelcome.setVisible(false);
				lblBack.setVisible(true);
				lblExit_btn.setVisible(false);
			}
		});
		btnBalance.setBounds(189, 60, 89, 58);
		frame.getContentPane().add(btnBalance);
		
		JButton btnWithdrawal = new JButton("");
		btnWithdrawal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblBalance.setVisible(false);
				lblWithdrawal.setVisible(false);
				lblDeposit.setVisible(false);
				lblWelcome.setVisible(false);
				lblBack.setVisible(false);
				lblExit_btn.setVisible(false);
				textField.setVisible(true);
				lblEnterAmountW.setVisible(true);
				lblInsufficient.setVisible(false);
			}
		});
		btnWithdrawal.setBounds(189, 216, 89, 58);
		frame.getContentPane().add(btnWithdrawal);
		
		JButton btnBack = new JButton("");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblWelcome.isShowing() == false) {
					lblBalance.setVisible(true);
					lblWithdrawal.setVisible(true);
					lblDeposit.setVisible(true);
					textFieldBalance.setVisible(false);
					lblAccountBalance.setVisible(false);
					lblEnterAmountW.setVisible(false);
					lblTransaction.setVisible(false);
					lblWelcome.setVisible(true);
					lblExit_btn.setVisible(true);
					lblBack.setVisible(false);
				}
				else {
					lblBalance.setVisible(false);
					lblWithdrawal.setVisible(false);
					lblDeposit.setVisible(false);
					lblWelcome.setVisible(false);
					lblExit.setVisible(true);
					lblBack.setVisible(false);
					lblExit_btn.setVisible(false);
					lblNo.setVisible(true);
					lblYes.setVisible(true);
				}
			}
		});
		btnBack.setBounds(730, 60, 89, 58);
		frame.getContentPane().add(btnBack);
		
		JButton btnDeposit = new JButton("");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblBalance.setVisible(false);
				lblWithdrawal.setVisible(false);
				lblDeposit.setVisible(false);
				lblWelcome.setVisible(false);
				lblBack.setVisible(false);
				lblEnterAmountD.setVisible(true);
				textField.setVisible(true);
				lblExit_btn.setVisible(false);
			}
		});
		btnDeposit.setBounds(730, 216, 89, 58);
		frame.getContentPane().add(btnDeposit);
		
		JButton btnNo = new JButton("");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblExit.setVisible(false);
				lblNo.setVisible(false);
				lblYes.setVisible(false);
				lblBalance.setVisible(true);
				lblWithdrawal.setVisible(true);
				lblDeposit.setVisible(true);
				lblWelcome.setVisible(true);
				lblBack.setVisible(false);
				lblExit_btn.setVisible(true);
			}
		});
		btnNo.setBounds(189, 139, 89, 58);
		frame.getContentPane().add(btnNo);	
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, Color.DARK_GRAY, null, Color.DARK_GRAY));
		panel_1_1.setBackground(Color.LIGHT_GRAY);
		panel_1_1.setBounds(872, 139, 239, 135);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBounds(10, 93, 219, 26);
		panel_1_1.add(panel_1_2);
		panel_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(64, 64, 64), null, new Color(64, 64, 64)));
		panel_1_2.setBackground(Color.GRAY);
		
		JLabel lblCard = new JLabel("CARD");
		lblCard.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(lblTake.isShowing() == true) {
					frame.dispose();
				}
				else {
					lblInsert.setVisible(false);
					lblEnterPin.setVisible(true);
					textField.setVisible(true);
					lblCard.setVisible(false);
				}
			}
		});
		lblCard.setBounds(897, 274, 190, 240);
		frame.getContentPane().add(lblCard);
		lblCard.setFont(new Font("Tahoma", Font.BOLD, 15));
		Image image = new ImageIcon(this.getClass().getResource("images/debit-card.png")).getImage();	
		lblCard.setIcon(new ImageIcon(image));
		
		JLabel lblMoney = new JLabel("MONEY");
		lblMoney.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblBalance.setVisible(true);
				lblWithdrawal.setVisible(true);
				lblDeposit.setVisible(true);
				lblWelcome.setVisible(true);
				lblTransaction.setVisible(false);
				lblMoney.setVisible(false);
				lblExit_btn.setVisible(true);
				lblBack.setVisible(false);
			}
		});
		Image image_money = new ImageIcon(this.getClass().getResource("images/money.png")).getImage().getScaledInstance(350, 150, Image.SCALE_DEFAULT);
		lblMoney.setVisible(false);
		lblMoney.setBounds(330, 324, 352, 144);
		frame.getContentPane().add(lblMoney);
		lblMoney.setIcon(new ImageIcon(image_money));
		
		JButton btnYes = new JButton("");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNo.setVisible(false);
				lblYes.setVisible(false);
				lblExit.setVisible(false);
				lblCard.setVisible(true);
				lblTake.setVisible(true);
			}
		});
		btnYes.setBounds(730, 139, 89, 58);
		frame.getContentPane().add(btnYes);
		
		JPanel panel_buttons = new JPanel();
		panel_buttons.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_buttons.setBounds(299, 368, 408, 286);
		frame.getContentPane().add(panel_buttons);
		panel_buttons.setLayout(null);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + "1";
				textField.setText(Enternumber);
			}
		});
		btn1.setBounds(10, 11, 89, 58);
		panel_buttons.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + "2";
				textField.setText(Enternumber);
			}
		});
		btn2.setBounds(109, 11, 89, 58);
		panel_buttons.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + "3";
				textField.setText(Enternumber);
			}
		});
		btn3.setBounds(208, 11, 89, 58);
		panel_buttons.add(btn3);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancel.setBackground(new Color(255, 0, 0));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblEnterPin.isShowing() == false && lblInsert.isShowing() == false) {
					lblEnterAmountW.setVisible(false);
					lblEnterAmountD.setVisible(false);
					lblAccountBalance.setVisible(false);
					textFieldBalance.setVisible(false);
					textField.setVisible(false);
					textField.setText("");
					lblBalance.setVisible(true);
					lblWithdrawal.setVisible(true);
					lblDeposit.setVisible(true);
					lblWelcome.setVisible(true);
					lblBack.setVisible(false);
					lblInsufficient.setVisible(false);
					lblTransaction.setVisible(false);
					lblExit_btn.setVisible(true);
				}
			}
		});
		btnCancel.setBounds(307, 11, 89, 58);
		panel_buttons.add(btnCancel);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + "4";
				textField.setText(Enternumber);
			}
		});
		btn4.setBounds(10, 80, 89, 58);
		panel_buttons.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + "5";
				textField.setText(Enternumber);
			}
		});
		btn5.setBounds(109, 80, 89, 58);
		panel_buttons.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + "6";
				textField.setText(Enternumber);
			}
		});
		btn6.setBounds(208, 80, 89, 58);
		panel_buttons.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + "7";
				textField.setText(Enternumber);
			}
		});
		btn7.setBounds(10, 149, 89, 58);
		panel_buttons.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + "8";
				textField.setText(Enternumber);
			}
		});
		btn8.setBounds(109, 149, 89, 58);
		panel_buttons.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + "9";
				textField.setText(Enternumber);
			}
		});
		btn9.setBounds(208, 149, 89, 58);
		panel_buttons.add(btn9);
		
		JButton btnEnter = new JButton("ENTER");
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblEnterPin.isShowing() == true) {
					int inputPin = Integer.parseInt(textField.getText());
					int found = 0;
					for (Card card : cardsList) {
						if(card.getCardPin() == inputPin) {
							found = 1;
							Account = card;
							lblEnterPin.setVisible(false);
							textField.setVisible(false);
							textField.setText("");
							lblBalance.setVisible(true);
							lblWithdrawal.setVisible(true);
							lblDeposit.setVisible(true);
							lblBack.setVisible(false);
							lblExit_btn.setVisible(true);
							lblWelcome.setVisible(true);
						}
					}
					if(found == 0) {
						lblInco.setVisible(true);
					}
				}
				else if(lblEnterAmountW.isShowing() == true) {
					int inputAmount = Integer.parseInt(textField.getText());
					if(inputAmount > Account.getCardBalance())
						lblInsufficient.setVisible(true);
					else {
						int money = Account.getCardBalance();
						money -= inputAmount;
						Account.setCardBalance(money);
						lblTransaction.setVisible(true);
						textField.setVisible(false);
						textField.setText("");
						lblEnterAmountW.setVisible(false);
						lblBack.setVisible(true);
						lblMoney.setVisible(true);
					}
				}
				else if(lblEnterAmountD.isShowing() == true) {
					int inputAmount = Integer.parseInt(textField.getText());
					int money = Account.getCardBalance();
					money += inputAmount;
					Account.setCardBalance(money);
					lblTransaction.setVisible(true);
					lblBack.setVisible(true);
					textField.setVisible(false);
					textField.setText("");
					lblEnterAmountD.setVisible(false);
				}
			}
		});
		btnEnter.setBackground(Color.GREEN);
		btnEnter.setBounds(307, 149, 89, 58);
		panel_buttons.add(btnEnter);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + "0";
				textField.setText(Enternumber);
			}
		});
		btn0.setBounds(109, 217, 89, 58);
		panel_buttons.add(btn0);
		
		JButton btnClear = new JButton("CLEAR");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				lblInco.setVisible(false);
				lblInsufficient.setVisible(false);
			}
		});
		btnClear.setBackground(Color.YELLOW);
		btnClear.setBounds(307, 80, 89, 58);
		panel_buttons.add(btnClear);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, new Color(64, 64, 64), null, new Color(64, 64, 64)));
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(299, 305, 408, 35);
		frame.getContentPane().add(panel_1);
	}
}
