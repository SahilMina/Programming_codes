#include <stdio.h>

// Function to reverse a number
int reverseNumber(int num) {
    int reversed = 0;
    while (num > 0) {
        reversed = reversed * 10 + num % 10;
        num /= 10;
    }
    return reversed;
}

int main() {
    int num, reversed;
    
    // Input from user
    printf("Enter a positive integer: ");
    scanf("%d", &num);
    
    // Check for valid input
    if (num < 0) {
        printf("Invalid input! Please enter a positive integer.\n");
        return 1;
    }
    
    // Compute reverse
    reversed = reverseNumber(num);
    
    // Display results
    printf("Reversed number: %d\n", reversed);
    if (num == reversed) {
        printf("The number is a palindrome.\n");
    } else {
        printf("The number is not a palindrome.\n");
    }
    
    return 0;
}
