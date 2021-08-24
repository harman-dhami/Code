/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
#include <cmath>

using namespace std;

int main()
{
    //Constant variables
    const int CIRCLE_AREA = 1;
    const int RECTANGLE_AREA = 2;
    const int TRIANGLE_AREA = 3;
    const int QUIT = 4;
    const double PI = 3.14;
    
    //Circle Variables
    int choice;
    int radius;
    int circleArea;
    
    //Rectangle Variables
    int length;
    int width;
    int rectangleArea;
    
    //Triangle Variables
    int base;
    int height;
    int triangleArea;
    
    //User chooses a choice
    cout << "Geometry Calculator\n";
    cout << "1. Area of a circle \n";
    cout << "2. Area of a rectangle \n";
    cout << "3. Area of a triangle \n";
    cout << "4. Quit \n";
    cout << "PLease enter your choice: ";
    cin >> choice;
    
    //Different scenarios depend on user's selection
    switch (choice)
    {
        case CIRCLE_AREA : cout << "Please enter the radius: ";
                             cin >> radius;
                             if (radius < 0)
                             {
                             cout << "Negative number is not accepted.";
                             }
                             else
                             {circleArea = PI * pow (radius, 2);
                             cout << "The area of the circle is: " << circleArea << endl;
                             }
                             break;
        case RECTANGLE_AREA : cout << "Please enter the length: ";
                                cin >> length;
                                cout << "Please enter the width: ";
                                cin >> width;
                                if (length < 0 && width < 0)
                                {
                                cout << "Negavtive numbers are not accepted.";
                                }
                                else
                                {
                                rectangleArea = length * width;
                                cout << "The area of the rectangle is: " << rectangleArea << endl;
                                }
                                break;
        case TRIANGLE_AREA : cout << "Please enter the base: ";
                               cin >> base;
                               cout << "Please enter the height: ";
                               cin >> height;
                               if (base < 0 && height < 0)
                               {
                                   cout << "Negative numbers are not accepted.";
                               }
                               else
                               {
                               triangleArea = base * height * 0.5;
                               cout << "The area of the triangle is: " << triangleArea << endl;
                               }
                               break;
        case QUIT : cout << "Program has ended."; 
                      break;
        default : cout << "Please try again.";              
                               
                            
                                
    }
    return 0;
    
}
