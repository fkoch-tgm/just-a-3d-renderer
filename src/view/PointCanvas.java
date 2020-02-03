package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import model.PointList;

public class PointCanvas extends JPanel {
	private PointList points;
	
	public PointCanvas(PointList pointList) {
		this.points = pointList;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		points.draw(g);
	}
}
