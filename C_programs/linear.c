#include <stdio.h>

int main() 
{
    int arr[10] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};    
    int key, i, found = 0;
    printf("Enter the element to search for: ");
    scanf("%d", &key);
    for(i = 0; i < 10; i++)
     {
        if(arr[i] == key)
        {
            found = 1;
            break;
        }
    }

    if(found==0)
    {
        printf("Element %d not found in the array.\n", key);
    }
    else
    {
         printf("Element %d found at index %d.\n", key, i);
    }

    return 0;
}