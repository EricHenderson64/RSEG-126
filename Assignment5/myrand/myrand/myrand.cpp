// myrand.cpp : This file contains the 'main' function. Program execution begins and ends there.
//

#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <sstream>

int main(int argc, char* argv[])
{
    int input; //Holds amount of random numbers to generate

    // if no arguments are passed, defalt to 1
    if (argc == 1)
    {
        input = 1;
    }
    else if (argc == 2)
    {
        std::istringstream iss(argv[1]);

        // check the argument is a number
        if (iss >> input)
        {
            // Conversion successful
        }
        else {
            std::cout << "Argument must be an integer";
            exit(1);
        }
    }
    else 
    {
        std::cout << "Too many command line args, only pass in 1";
        exit(1);
    }

    srand(time(NULL));

    if (input < 1) {
        std::cout << "Argument must be greater than 0";
        exit(1);
    }

    for (int i = 0; i < input; i++)
    {
        int num = rand();
        std::cout << num << '\n';
    }
}

// Run program: Ctrl + F5 or Debug > Start Without Debugging menu
// Debug program: F5 or Debug > Start Debugging menu

// Tips for Getting Started: 
//   1. Use the Solution Explorer window to add/manage files
//   2. Use the Team Explorer window to connect to source control
//   3. Use the Output window to see build output and other messages
//   4. Use the Error List window to view errors
//   5. Go to Project > Add New Item to create new code files, or Project > Add Existing Item to add existing code files to the project
//   6. In the future, to open this project again, go to File > Open > Project and select the .sln file
