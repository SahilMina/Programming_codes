#include <stdio.h>

int main() {
    int rows, num = 1;
    
    // Input from user
    printf("Enter the number of rows for Floyd's Triangle: ");
    scanf("%d", &rows);
    
    // Generate Floyd's Triangle
    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= i; j++) {
            printf("%d ", num);
            num++;
        }
        printf("\n");
    }
    
    return 0;
}
