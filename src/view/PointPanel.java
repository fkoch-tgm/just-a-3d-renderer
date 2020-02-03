package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PointPanel extends JPanel {
	public final int canvasX;
	public final int canvasY;
	private JPanel canvas;
	private JPanel sidebar;

	public PointPanel(int canvasX,int canvasY) {
		if(!(canvasX > 0 && canvasY > 0)) throw new IllegalArgumentException("Invalid Canvas Size");
		this.canvasX = canvasX;
		this.canvasY = canvasY;
		
		this.setLayout(new BorderLayout());
		//Canvas-Container:
		canvas = new JPanel(new BorderLayout());
		canvas.setPreferredSize(new Dimension(canvasX, canvasY));
		this.add(canvas);
		
		//Sidebar:
		sidebar = new JPanel();
		sidebar.setPreferredSize(new Dimension(50,canvasY));
		sidebar.add(new JLabel("Work in Progress"));
		sidebar.setBackground(Color.DARK_GRAY);
		this.add(sidebar, BorderLayout.EAST);
	}
	
	/**
	 * Sets a new PointCanvas
	 * @param pointCanvas
	 */
	public void setPointCanvas(PointCanvas pointCanvas) {
		canvas.add(pointCanvas);
		this.repaint();
		this.revalidate();
	}
}	
