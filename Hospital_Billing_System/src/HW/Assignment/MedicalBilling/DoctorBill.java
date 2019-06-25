package HW.Assignment.MedicalBilling;

public class DoctorBill extends MedicalBill {

	protected int numOfMin;

	protected String DoctorName;

	

	public DoctorBill(String patientChartNumber, String newDocName, int newNumOfMin) {

		super(patientChartNumber);

		numOfMin = newNumOfMin;

		DoctorName = newDocName;

		

	}

	public String getNameOfDoctor() {

		return DoctorName;

	}

	public int getnumOfMin() {

		return numOfMin;

	}

	public void print() {

		System.out.println("Patient Chart Number: " + patientChartNumber);

		super.print();

		System.out.println("Number Of Minutes: " + numOfMin);

		System.out.println("Name Of Doctor: " + DoctorName);

	}

	

	

}
