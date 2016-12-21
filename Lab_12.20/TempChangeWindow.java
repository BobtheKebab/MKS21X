import javax.swing.*;
import java.awt.*;

public class TempChangeWindow  extends JFrame {
    
    private Container pane;
    private JTextField fieldC, fieldF;
    private JButton buttonToC, buttonToF;

    public TempChangeWindow () {
	this.setTitle("Temperature Conversion");
	this.setSize(500, 500);
	this.setLocation(100, 100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	
	

}
