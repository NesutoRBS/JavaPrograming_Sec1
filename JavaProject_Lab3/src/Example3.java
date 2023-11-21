import javax.swing.JOptionPane;

public class Example3 {

	public static void main(String[] args) {
		double weight = Double.parseDouble(
				JOptionPane.showInputDialog("Input Weight:"));
		double height = Double.parseDouble(
				JOptionPane.showInputDialog("Input Height:"));
		double BMI = weight/Math.pow((height/100),2);
		String group;
		if(BMI >= 30)
			group = "Obesity";
		else if(BMI >= 25)
			group = "Overweight";
		else if(BMI >= 18.5)
			group = "Normal-weight";
		else
			group = "Underweight";
		JOptionPane.showMessageDialog(null,
					"BMI = " 
					+ String.format("%.1f",BMI) //ไม่ต้อง Import ให้วุ่นวาย
					+ "\nYou're " 
					+ group,"BMI",JOptionPane.WARNING_MESSAGE);
	}

}
