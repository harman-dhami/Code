#include <iostream>

using namespace std;

//Function Prototype
bool isLeapYear(int);
int getDaysInMonth(int, int);
string getMonthName(int);

int main()
{
    //Variables
    int year, month;
    
    //User enters year
    cout << "Enter a year: ";
    cin >> year;
    
    //User enters month
    cout << "Enter a month: ";
    cin >> month;
    
    //Call function
    int dayInMonth = getDaysInMonth(month, year);
    string getMonth = getMonthName(month);
    
    //Final Display
    cout << "There are " << dayInMonth << " days in " << getMonth << ", " << year << endl;
    
    return 0;
    
    
    
}

//Function to check for leap year
bool isLeapYear(int year)
{
    bool status;
    
    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
    status = true;
    else
    status = false;
    
    return status;
}

//Function to assign number of days to month
int getDaysInMonth(int month, int year)
{
    switch(month)
    {
        case 1:
        return 31;
        
        case 2:
        if (isLeapYear(year))
        return 29;
        else
        return 28;
        
        case 3:
        return 31;
        
        case 4:
        return 30;
        
        case 5:
        return 31;
        
        case 6:
        return 30;
        
        case 7:
        return 31;
        
        case 8:
        return 31;
        
        case 9:
        return 30;
        
        case 10:
        return 31;
        
        case 11:
        return 30;
        
        case 12:
        return 31;
    }
}

//Function to assign month to month number
string getMonthName(int month)
{
   switch (month)
   {
       case 1:
       return "January";
       
       case 2:
       return "February";
       
       case 3:
       return "March";
       
       case 4:
       return "April";
       
       case 5:
       return "May";
       
       case 6:
       return "June";
       
       case 7:
       return "July";
       
       case 8:
       return "August";
       
       case 9:
       return "September";
       
       case 10:
       return "October";
       
       case 11:
       return "November";
       
       case 12:
       return "December";
   }
}

