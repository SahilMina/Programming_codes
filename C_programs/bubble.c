#include<stdio.h>

int main() 
{
    int a, i, j, k;
    printf("Enter the number of elements: ");
    scanf("%d", &a);

    int x[a];
    printf("Enter the elements to be sorted:\n");
    for(i = 0; i < a; i++)
     {
        scanf("%d", &x[i]);
     }

    for(i = 0; i < a - 1; i++) 
    {
        for(j = 0; j < a - i - 1; j++)
         {
            if(x[j] > x[j + 1]) 
            {
                k = x[j];
                x[j] = x[j + 1];
                x[j + 1] = k;
            }
        }
    }

    printf("The sorted array is:\n");
    for(i = 0; i < a; i++) 
    {
        printf("%d ", x[i]);
    }
    printf("\n");

    return 0;
}
