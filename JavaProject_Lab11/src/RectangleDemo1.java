import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		double widthInput = Double.parseDouble(
				JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(
				JOptionPane.showInputDialog("Input length"));
		String colorInput = JOptionPane.showInputDialog("Input color");
		
		//Send 3 arguments to Constructor
		Rectangle rec = new Rectangle(widthInput,lengthInput,colorInput);
		
		//Show the width, length & color
		JOptionPane.showMessageDialog(null, rec 
						+ "\nArea of Rectangle = "
						+ rec.getArea());
	}

}
