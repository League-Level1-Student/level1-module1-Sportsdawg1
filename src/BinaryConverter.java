import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{
	JFrame frame;
	JPanel panel;
	JTextField text;
	JButton button;
	JLabel letter;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryConverter converter = new BinaryConverter();
		converter.createUI();
		
		
	}
	
	void createUI() {
		frame = new JFrame();
		panel = new JPanel();
		text = new JTextField(20);
		button = new JButton("convert");
		letter = new JLabel();
		
		frame.add(panel);
		panel.add(text);
		panel.add(button);
		panel.add(letter);
		
		button.addActionListener(this);
		
		frame.setVisible(true);
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==button) {
			String answer = convert(text.getText());
			letter.setText(answer);
			frame.pack();
		}
	}
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
}
