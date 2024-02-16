/*
 *
 * Author : Aysha-Thikra
 * Email : ayshathelegendary@gmail.com
 * Date : 16/02/2024
 * Description : Generating Multiplication Table for the entered number
 * 
 */

#include <iostream>

using namespace std;

int main() {
    int number;

    cout << "Enter a number to generate its multiplication table: ";
    cin >> number;

    cout << "Multiplication Table of " << number << ":\n";
    for (int i = 1; i <= 10; ++i) {
        cout << number << " * " << i << " = " << number * i << endl;
    }

    return 0;
}

 