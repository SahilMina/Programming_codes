//Prime numbers for a  range
#include <stdio.h>
int isPrime(int n)
{
    for(int a=2;a*a<=n;a++)
    {
        if(n%a==0)
        {
            return 0;
        }
    }
    return 1;
}
int main() 
{
    int n1,n2;
    printf("enter the first number\n");
    scanf("%d",&n1);
   printf("enter the second number\n");
    scanf("%d",&n2);
    printf("the prime number between %d and %d are \n",n1,n2);
    for(int i=n1;i<=n2;i++)
    {
        if(isPrime(i))
        {
            printf("%d ",i);
        }
    }
    return 0;
}