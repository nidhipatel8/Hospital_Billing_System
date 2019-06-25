package HW.Assignment.MedicalBilling;

public class LabBill extends MedicalBill {

	protected double techFee;

	protected double labFee;



	public LabBill(String patientChartNumber, double newTechFee, double newLabFee) {

		super(patientChartNumber);



		techFee = newTechFee;

		labFee = newLabFee;



	}

	public double getTechFee() {

		return techFee;

	}

	public double getLabFee() {

		return labFee;

	}

	public void print() {

		System.out.println("Patient Chart Number: " + patientChartNumber);

		super.print();

		System.out.println("Technician Fee: " + techFee);

		System.out.println("Lab Fee: " + labFee);

		

	}



}


