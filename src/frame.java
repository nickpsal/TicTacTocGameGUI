import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class frame extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private JLabel labe;
	private JPanel panel;
	private JButton btplay;
	private JButton btinfo;
	private JButton btexit;
	
	public frame() {
		panel = new JPanel();
		labe = new JLabel("", SwingConstants.CENTER); 
		labe.setText("ΠΑΙΧΝΙΔΙ ΤΡΙΛΙΖΑ 2 ΠΑΙΧΤΩΝ");
		btplay = new JButton("ΑΣ ΠΑΙΞΟΥΜΕ");
		btinfo = new JButton("ΠΛΗΡΟΦΟΡΙΕΣ");
		btexit = new JButton("ΕΞΟΔΟΣ");
		
	    Font button = new Font("Verdana", Font.PLAIN, 35);   
	    Font label = new Font("Verdana", Font.PLAIN, 30);
		
		panel.add(labe);
		labe.setFont(label);
		panel.add(btplay);
		btplay.setFont(button);
		panel.add(btinfo);
		btinfo.setFont(button);
		panel.add(btexit);
		btexit.setFont(button);
		
		ButtonListener listener = new ButtonListener();
		btplay.addActionListener(listener);
		btinfo.addActionListener(listener);
		btexit.addActionListener(listener);
		
		this.setContentPane(panel);
		this.setVisible(true);
		this.setSize(550, 550);
		this.setResizable(false);
		this.setTitle("ΠΑΙΧΝΙΔΙ ΤΡΙΛΙΖΑ!!!!");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if (e.getSource().equals(btplay)) {
				new myFrame();
			}else if (e.getSource().equals(btinfo)) {
				JOptionPane.showMessageDialog(panel, "Προγραμματιστης : Ψαλτακης Νικολαος StormRideR "
						+ "(c)2019",
						"ΠΛΗΡΟΦΟΡΙΕΣ", JOptionPane.INFORMATION_MESSAGE);
			}else {
				setVisible(false); //αορατο
				dispose(); //Καταστροφη του JFrame
			}
		}
	}
}
