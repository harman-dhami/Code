#include <iostream>
#include <fstream>
#include <iomanip>

using namespace std;

int main()
{
    
    
    ofstream outputFile;
    int num;

    outputFile.open("Number.txt");

    for (num = 1; num <= 10; num++)
    outputFile << rand() % 100 << " ";

    outputFile.close();

    ifstream inputFile;
    
    //Recieves numbers and variables are declared
    inputFile.open("Number.txt");
    int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
    double average;
    int total;
    
    //Gets numbers
    inputFile >> num1;
    inputFile >> num2;
    inputFile >> num3;
    inputFile >> num4;
    inputFile >> num5;
    inputFile >> num6;
    inputFile >> num7;
    inputFile >> num8;
    inputFile >> num9;
    inputFile >> num10;
    
    //Shows the ten numbers
    cout << "The ten numbers are: " << num1 << " " << num2 << " " << num3 << " " << num4 << " ";
    cout <<  num5 << " " << num6 << " " << num7 << " " << num8 << " " << num9 << " " << num10 << endl;
    
    //Average is calculated and displayed
    cout << fixed << setprecision(2) << endl;
    average = (num1 + num2 + num3 + num3 + num4 + num5 + num6 + num7 + num8+ num9 + num10) / 10;
    cout << "The average is: " << average << endl;
    
    
    return 0;
}    
