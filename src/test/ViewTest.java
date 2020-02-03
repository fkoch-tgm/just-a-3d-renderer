package test;

import model.PointList;
import view.*;
public class ViewTest {

	public static void main(String[] args) {
		PointPanel panel = new PointPanel(300, 200);
		PointFrame frame = new PointFrame(panel);
		
		PointList list = new PointList();
		list.fillList(300, 200);
		
		PointCanvas canvas = new PointCanvas(list);
		
		panel.setPointCanvas(canvas);
	}

}
