#include<stdio.h>
void add(int a,int b)
{
    int c;
    c=a+b;
    printf("the sum is :%d",c);
}
int main()
{
    int a,b;
    printf("enter the value of a....");
    scanf("%d",&a);
    printf("enter the value of b....");
    scanf("%d",&b);
    add(a,b);
    return 0;
}