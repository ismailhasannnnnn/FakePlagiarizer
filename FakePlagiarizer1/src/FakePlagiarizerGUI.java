import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class FakePlagiarizerGUI {

	private JFrame frame;
	public static JTextArea txtTypeTextHere;
	public static JTextArea textArea;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FakePlagiarizerGUI window = new FakePlagiarizerGUI();
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
	public FakePlagiarizerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(500, 500, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblPlagiarismChecker = new JLabel("Plagiarism Checker");
		lblPlagiarismChecker.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtTypeTextHere = new JTextArea();
		txtTypeTextHere.setRows(500);
		txtTypeTextHere.setLineWrap(true);
		txtTypeTextHere.setWrapStyleWord(true);
		txtTypeTextHere.setText("Type text here....");
		txtTypeTextHere.setColumns(10);
		
		
		JButton btnCheckForPlagiarism = new JButton("Check for Plagiarism");
		btnCheckForPlagiarism.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(txtTypeTextHere.getText().length() <= 50) {
					textArea.setText("ERROR: Minimum Character Count Not Met (50 Characters)");
				}
				
				else if(Main.i == Main.n2 && Main.i <= 100) {
					textArea.setText(Main.rand.nextInt(20) + "% Plagiarism.");
				}else if(Main.i == Main.n2 && Main.i>= 101 && Main.i<=200) {
					textArea.setText((Main.rand.nextInt(20) + 20) + "% Plagiarism.");
				}else if(Main.i == Main.n2 && Main.i>=201) {
					textArea.setText(Main.rand.nextInt(20) + 40 + "% Plagiarism.");
				}else {
					textArea.setText(Main.n + "% Plagiarism.");
				}
			}
		});
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setRows(3);
		textArea.setEditable(false);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(21)
							.addComponent(txtTypeTextHere, GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
						.addComponent(lblPlagiarismChecker, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 434, GroupLayout.PREFERRED_SIZE)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnCheckForPlagiarism)
							.addGap(18)
							.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblPlagiarismChecker)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtTypeTextHere, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnCheckForPlagiarism)
							.addGap(19))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
