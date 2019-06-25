package HW.Assignment.MedicalBilling;

public class MedicalBill {

	 String patientChartNumber;

	double billAmount;

	double insuranceAmount;



	public MedicalBill(String num) {

		boolean condition1 = false;

		boolean condition2 = false;



		char charOfNum = ' ';

		int lenOfStr = num.length();



		for (int i = 0; i < lenOfStr - 4; i++) {

			if (lenOfStr == 7) {

				condition1 = true;

			} else {

				condition1 = false;

				break;

			}

			charOfNum = num.charAt(i);

			if (Character.isLetter(charOfNum)) {

				condition1 = true;

			} else {

				condition1 = false;

				break;

			}

		}

		for (int j = 3; j < 7; j++) {

			charOfNum = num.charAt(j);

			if (Character.isDigit(charOfNum)) {

				condition2 = true;

			} else {

				condition2 = false;

				break;

			}

		}

		patientChartNumber = num;

		billAmount = 0.0;

		insuranceAmount = 0.0;

	}



	public void setbillAmount(double newBillAmount) {

		billAmount = newBillAmount;

	}



	public double getbillAmount() {

		return billAmount;

	}



	public void setinsuranceAmount(double newinsuranceAmount) {

		insuranceAmount = newinsuranceAmount;

	}



	public double getinsuranceAmount() {

		return insuranceAmount;

	}

	public void print() {

		System.out.println("Patient Chart Number: " + patientChartNumber);

	}

}


