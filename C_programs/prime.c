#include<stdio.h>
int main()
{
    int n,i,j=0;
    printf("enter the number...");
    scanf("%d",&n);
    for(i=2;i<n;i++)
    {
        if(n%i==0)
        {
            j=1;
            break;
        }
    }
    if(j==0)
    {
        printf("it is a prime number");
    }
    else
    {
        printf("it is not a prime number");
    }
    return 0;
}