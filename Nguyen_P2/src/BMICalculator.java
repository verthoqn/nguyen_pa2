import java.util.Scanner;

public class BMICalculator {
	int unit;
	private int Weight;
	private int Height;
	private int Bmi;
	private String BmiCategory;
	

	public static void main(String[] args) {
	    BMICalculator app = new BMICalculator();
	    app.readUserData();
	    app.calculateBmi();
	    app.displayBmi();
	}
	
	private readUnitType() {
		System.out.println("Select 0 for imperial units, or 1 for metric units:");
		Scanner input = new Scanner(System.in);
		unit = input.nextInt();
	}
	
	private void readMeasurementData() {
		if(unit == 0) {
			readImperialData();
		}
		else if (unit ==1) {
			readMetricData();
		}
	}
	
	public int getWeight() {
		return this.Weight;
	}
	
	private void setWeight() {
		if(Weight < 0) {
			System.exit(0); 
		}
	}
	
	public int getHeight() {
		return this.Height;
	}
	
	private void setHeight() {
		if(Height < 0) {
			System.exit(0); 
		}
	}
	
	public int getBmi() {
		return this.Bmi;
	}
	
	public String getBmiCategory() {
		return BmiCategory;
	}
	
	private readImperialData() {
		
	}
	
	private readMetricData() {
		
	}
	
	public readUserData() {
		
	}
	
	public calculateBmi() {
		
	}
	
	public calculateBmiCategory() {
		
	}
	
	public displayBmi() {
		
	}	
	
}
