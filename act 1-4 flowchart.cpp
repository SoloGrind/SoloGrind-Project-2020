#include <iostream>

using namespace std;

int main() {

	int overtime, hours, overtimePay, outcome, regular, perHour, regularPay;
	string name;
	int tax = 10;
	float outcomePay;
	float overtimeBonus = 1.25;
    char option = '\0';
    
	//display title
	cout <<  " Activity 2-1 1\n ";

	cout  << " By Angelo Gabrielle D. Rodriguez\n ";

	cout  << " 1st year BSIT student\n ";

	// operation
    cout << "Enter your name : ";
    cin >> name;
    cout << "Enter your pay per hour : ";
    cin >> perHour;
    cout << "Name : " << name << "\n" << "Pay per hour : " << perHour << "\n";
    cout << "==========================================================\n";
    cout << "Enter your Regular hours : ";
    cin >> regular;
    regularPay = regular * perHour;
    cout << "Your regular pay : " << regularPay << "\n" << "Enter your overtime hours : ";
    cin >> overtime;
    overtimePay = overtime * perHour;
    cout << "Your overtime pay : " << overtimePay << "\n";
    overtimePay = overtimePay * overtimeBonus;
    cout << "Your overtime pay & 1.25 bonus : " << overtimePay << "\n";
    outcome = overtimePay + regularPay;
    cout << "The overall pay without tax : " << outcome << "\n";
    outcomePay = outcome / tax;
    cout << "The overall pay with tax : " << outcomePay << "\n";
    cout << "==========================================================\n";
    cout << "Name : " << name << "\n Regular pay: " << regularPay << "\n Overtime pay : " << overtimePay << "\n Total Pay : " << outcome << "\nTotal pay with tax : " << outcomePay;
   
      
	return 0;

}



