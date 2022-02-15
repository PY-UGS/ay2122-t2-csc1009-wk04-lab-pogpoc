package Pract4;

public class BMI {

	private static double weight;
	private static double height;
	private static double poundsConversion; 
	private static double inchesConversion;
	private double bmi;

	public BMI(double weight, double height) {
		this.weight = weight;
		this.height = height;
		this.poundsConversion = 0.45359237;
		this.inchesConversion = 0.0254;		
		
	}

	public double getWeight() {
		return weight;
	}

	public double getHeight() {
		return height;
	}

	public double getBMI() {
		return bmi = this.poundsConversion * this.weight / Math.pow(this.inchesConversion * this.height, 2);
	}

	public String getHealthStatus() {
		if (this.bmi < 18.5) {
			return "Underweight";
		} else if (this.bmi < 25.0) {
			return "Normal";
		} else if (this.bmi < 30.0) {
			return "Overweight";
		}

		return "Obese";
	}
}