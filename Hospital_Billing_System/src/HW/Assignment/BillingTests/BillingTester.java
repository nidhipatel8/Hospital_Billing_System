package HW.Assignment.BillingTests;

import HW.Assignment.MedicalBilling.DoctorBill;
import HW.Assignment.MedicalBilling.LabBill;
import HW.Assignment.MedicalBilling.MedicalBill;



public class BillingTester {

	public static void main(String[] args) {

		MedicalBill bill[] = getBillingObjects();

		printDetails(bill);

	}



	public static MedicalBill[] getBillingObjects() {

		MedicalBill listOfBills[];

		MedicalBill singleBill1;

		MedicalBill singleBill2;

		

		listOfBills = new MedicalBill[2];

		singleBill1 = new LabBill("ZKS4455", 100.0, 25.50);

		singleBill2 = new DoctorBill("ASF6789","Alex", 3 );

		listOfBills[0] = singleBill1;

		listOfBills[1] = singleBill2;

		

		// Repeat this process to fill up the array with LabBill and DoctorBill objects

		return listOfBills;

	}

	

	public static void printDetails(MedicalBill[] billAry) {

		int lenOfAry = billAry.length;

		

		billAry = getBillingObjects();

		for (int i=0; i<lenOfAry; i++) {

			billAry[i].print();

		}

		

	}

}

