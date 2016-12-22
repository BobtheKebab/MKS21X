import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempChangeWindow  extends JFrame {
    
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

	fieldC = new JTextField(12);
	fieldF = new JTextField(12);
	buttonToC = new JButton("F to C");
	buttonToF = new JButton("C to F");
	labelC = new JLabel("Temperature in C", null, JLabel.CENTER);
	labelF = new JLabel("Temperature in F", null, JLabel.CENTER);

	pane.add(labelF);
	pane.add(fieldF);
	pane.add(buttonToC);
	pane.add(labelC);
	pane.add(fieldC);
	pane.add(buttonToF);

    }

    public static void main (String[] args) {

	TempChangeWindow wind = new TempChangeWindow();;
	wind.setVisible(true);

    }
	
}
