//return & with arguments
#include <stdio.h>
int add(int a,int b)
{
    int c;
    c=a+b;
    return c;
}
int main()
{
    int a,b,c;
    printf("enter the value of a....");
    scanf("%d",&a);
    printf("enter the value of b....");
    scanf("%d",&b);
    c=add(a,b);
    printf("\n the sum is:%d",c);
    return 0;
}