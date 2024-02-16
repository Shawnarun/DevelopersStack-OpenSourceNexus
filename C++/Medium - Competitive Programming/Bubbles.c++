/*
 * Author : KPriyandhini
 * Email : priyandhinip@gmail.com
 * Date : 16th of Feb 2024
 * Description : In this code provide by Bubble sort in C++
 */



#include <iostream>

void swap(int &a, int &b) {
    int temp = a;
    a = b;
    b = temp;
}

void bubbleSort(int arr[], int size) {
    for (int i = 0; i < size - 1; ++i) {
        for (int j = 0; j < size - i - 1; ++j) {
            if (arr[j] > arr[j + 1]) {
                swap(arr[j], arr[j + 1]);
            }
        }
    }
}

void printArray(int arr[], int size) {
    for (int i = 0; i < size; ++i) {
        std::cout << arr[i] << " ";
    }
    std::cout << std::endl;
}

int main() {
    const int size = 6;
    int arr[size] = {64, 34, 25, 12, 22, 11};

    std::cout << "Original array: ";
    printArray(arr, size);

    bubbleSort(arr, size);

    std::cout << "Sorted array: ";
    printArray(arr, size);

    return 0;
}
