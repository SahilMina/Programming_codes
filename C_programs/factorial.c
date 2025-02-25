#include<stdio.h>
int main()
{
    int i,j;
    long int z=1;
    printf("enter the number whose factorial you want.....");
    scanf("%d",&i);
    for (j=1;j<=i;j++)
    {
        z=z*j;
    }
    printf("the factorial is:   %lu",z);
    return 0;
}