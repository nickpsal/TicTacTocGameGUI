import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class myFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private JLabel label;
	private JPanel containerPanel;
	private JPanel centralPanel;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JButton bt4;
	private JButton bt5;
	private JButton bt6;
	private JButton bt7;
	private JButton bt8;
	private JButton bt9;
	
	private String wpn,fp,sp,wp;
	
	public myFrame() {
		label = new JLabel("", SwingConstants.CENTER);
		bt1 = new JButton("1");
		bt2 = new JButton("2");
		bt3 = new JButton("3");
		bt4 = new JButton("4");
		bt5 = new JButton("5");
		bt6 = new JButton("6");
		bt7 = new JButton("7");
		bt8 = new JButton("8");
		bt9 = new JButton("9");
		containerPanel = new JPanel();
		centralPanel = new JPanel();
		
	    Font font = new Font("Verdana", Font.PLAIN, 30);   
	    Font button = new Font("Verdana", Font.PLAIN, 94);   

		
		GridLayout grid = new GridLayout(3,3);
		containerPanel.setLayout(grid);
		label.setFont(font);
		containerPanel.add(bt1);
		bt1.setFont(button);
		containerPanel.add(bt2);
		bt2.setFont(button);
		containerPanel.add(bt3);
		bt3.setFont(button);
		containerPanel.add(bt4);
		bt4.setFont(button);
		containerPanel.add(bt5);
		bt5.setFont(button);
		containerPanel.add(bt6);
		bt6.setFont(button);
		containerPanel.add(bt7);
		bt7.setFont(button);
		containerPanel.add(bt8);
		bt8.setFont(button);
		containerPanel.add(bt9);
		bt9.setFont(button);
		
		BorderLayout border = new BorderLayout();
		centralPanel.setLayout(border);
		
		centralPanel.add(label, BorderLayout.NORTH);
		centralPanel.add(containerPanel, BorderLayout.CENTER);
		
		ButtonListener listener = new ButtonListener();
		bt1.addActionListener(listener);
		bt2.addActionListener(listener);
		bt3.addActionListener(listener);
		bt4.addActionListener(listener);
		bt5.addActionListener(listener);
		bt6.addActionListener(listener);
		bt7.addActionListener(listener);
		bt8.addActionListener(listener);
		bt9.addActionListener(listener);
		
		this.setContentPane(centralPanel);
		
		Random rnd = new Random();
		int player = rnd.nextInt(2);
		
		if(player == 1) {
			wpn = "Παίχτης1";
			fp = "X";
			sp = "O";
			wp = "X";
			label.setText("Ο " +wpn + " παίζει");
		}else {
			wpn = "Παίχτης2";
			fp = "O";
			sp = "X";
			wp = "O";
			label.setText("Ο " +wpn + " παίζει");
		}

		this.setVisible(true);
		this.setSize(550, 550);
		this.setResizable(false);
		this.setTitle("ΠΑΙΧΝΙΔΙ ΤΡΙΛΙΖΑ!!!!");
	}
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton button = (JButton) e.getSource();
			if((!button.getText().equals("Χ")) && (!button.getText().equals("O"))) {
				button.setText(wp);
				if (wp.equals("X")) {
					wp = "O";
				}else {
					wp = "X";
				}
			}else {
				JOptionPane.showMessageDialog(centralPanel, "Το τετράγωνο είναι κατειλημμένο",
						"ΠΡΟΣΟΧΗ", JOptionPane.INFORMATION_MESSAGE);		
			}

			// Ελεγχος αν κερδισ εκαποιος
			if ((bt1.getText().equals(fp)) && (bt2.getText().equals(fp)) && (bt3.getText().equals(fp))){
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);		
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt4.getText().equals(fp)) && (bt5.getText().equals(fp)) && (bt6.getText().equals(fp))) {
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);	
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt7.getText().equals(fp)) && (bt8.getText().equals(fp)) && (bt9.getText().equals(fp))) {
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);	
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt1.getText().equals(fp)) && (bt4.getText().equals(fp)) && (bt7.getText().equals(fp))) {
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);	
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt2.getText().equals(fp)) && (bt5.getText().equals(fp)) && (bt8.getText().equals(fp))) {
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);	
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt3.getText().equals(fp)) && (bt6.getText().equals(fp)) && (bt9.getText().equals(fp))) {
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);	
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt1.getText().equals(fp)) && (bt5.getText().equals(fp)) && (bt9.getText().equals(fp))) {
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);	
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt3.getText().equals(fp)) && (bt5.getText().equals(fp)) && (bt7.getText().equals(fp))) {
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);	
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt1.getText().equals(sp)) && (bt2.getText().equals(sp)) && (bt3.getText().equals(sp))){
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);		
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt4.getText().equals(sp)) && (bt5.getText().equals(sp)) && (bt6.getText().equals(sp))) {
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);	
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt7.getText().equals(sp)) && (bt8.getText().equals(sp)) && (bt9.getText().equals(sp))) {
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);	
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt1.getText().equals(sp)) && (bt4.getText().equals(sp)) && (bt7.getText().equals(sp))) {
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt2.getText().equals(sp)) && (bt5.getText().equals(sp)) && (bt8.getText().equals(sp))) {
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);	
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt3.getText().equals(sp)) && (bt6.getText().equals(sp)) && (bt9.getText().equals(sp))) {
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);	
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt1.getText().equals(sp)) && (bt5.getText().equals(sp)) && (bt9.getText().equals(sp))) {
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);	
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else if ((bt3.getText().equals(sp)) && (bt5.getText().equals(sp)) && (bt7.getText().equals(sp))) {
				JOptionPane.showMessageDialog(centralPanel, "ΝΙΚΗΣΕ Ο " + wpn,
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);	
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			} else if ((!bt1.getText().equals("1")) && (!bt2.getText().equals("2")) && (!bt3.getText().equals("3")) && (!bt4.getText().equals("4")) && (!bt5.getText().equals("5")) && (!bt6.getText().equals("6")) && (!bt7.getText().equals("7")) && (!bt8.getText().equals("8")) && (!bt9.getText().equals("9"))) {
				JOptionPane.showMessageDialog(centralPanel, "ΙΣΟΠΑΛΙΑ",
						"ΑΠΟΤΕΛΕΣΜΑΤΑ", JOptionPane.INFORMATION_MESSAGE);	
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}else {
				if (wpn.equals("Παίχτης1")) {
					wpn = "Παίχτης2";
				}else {
					wpn = "Παίχτης1";
				}
				label.setText("Ο " +wpn + " παίζει");
			}			
		}
	}
}