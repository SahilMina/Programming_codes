#include <stdio.h>
int add()
{
    int a,b,c;
    printf("enter the value of a....");
    scanf("%d",&a);
    printf("enter the value of b....");
    scanf("%d",&b);
    c=a+b;
    return c;
}
int main()
{
    int c;
    c= add();
    printf("the sum is %d",c);
    return 0;
}