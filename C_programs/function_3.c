#include<stdio.h>
void add()
{
    int a,b,c;
    printf("enter the value of a....");
    scanf("%d",&a);
    printf("enter the value of b....");
    scanf("%d",&b);
    c=a+b;
    printf("\n the sum is:%d",c);
}
int main()
{
    add();
    return 0;
}