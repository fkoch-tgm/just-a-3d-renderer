package view;

import javax.swing.*;

public class PointFrame extends JFrame {
	public PointFrame(JPanel panel) {
		super("Simple Points");
		this.add(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
