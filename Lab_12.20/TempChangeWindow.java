import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempChangeWindow  extends JFrame implements ActionListener {
    
    private Container pane;
    private JTextField fieldC, fieldF;
    private JButton buttonToC, buttonToF;
    private JLabel labelC, labelF;

    public TempChangeWindow () {
	
	this.setTitle("Temperature Conversion");
	this.setSize(100, 200);
	this.setLocation(100, 100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane,BoxLayout.Y_AXIS));

	buttonToC = new JButton("F to C");
	buttonToC.addActionListener(this);
	buttonToC.setActionCommand("F to C");
	
	buttonToF = new JButton("C to F");
	buttonToF.addActionListener(this);
	buttonToF.setActionCommand("C to F");

	fieldC = new JTextField(12);
	fieldF = new JTextField(12);
	labelC = new JLabel("Temperature in C", null, JLabel.CENTER);
	labelF = new JLabel("Temperature in F", null, JLabel.CENTER);

	pane.add(labelF);
	pane.add(fieldF);
	pane.add(buttonToC);
	pane.add(labelC);
	pane.add(fieldC);
	pane.add(buttonToF);

    }

    public void actionPerformed (ActionEvent e) {
	String event = e.getActionCommand();
	if (event.equals("F to C")) {
	    int F = Integer.parseInt(fieldF.getText());
	    fieldC.setText("" + TempChange.FtoC(0.0 + F));
	}
	if (event.equals("C to F")) {
	    int C = Integer.parseInt(fieldC.getText());
	    fieldF.setText("" + TempChange.CtoF(0.0 + C));
	}
    }

    public static void main (String[] args) {

	TempChangeWindow window = new TempChangeWindow();;
	window.setVisible(true);

    }
	
}
