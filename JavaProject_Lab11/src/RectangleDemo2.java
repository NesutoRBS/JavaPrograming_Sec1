import javax.swing.*;
public class RectangleDemo2 {

	public static void main(String[] args) {
		double widthInput = Double.parseDouble(
				JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(
				JOptionPane.showInputDialog("Input length"));
		
		//Send 3 arguments to Constructor
		Rectangle2 rec = new Rectangle2(widthInput,lengthInput);
		
		//Show the width, length & color
		JOptionPane.showMessageDialog(null, rec + "]"
						+ "\nArea of Rectangle = " 
						+ rec.getArea());
	}

}

