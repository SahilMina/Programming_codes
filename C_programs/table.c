#include<stdio.h>
void table(int a,int b)
{
    if(b>11)
    {
        return;
    }
    printf("%dx%d=%d\n",a,b,a*b);
    table(a,b+1);
}
int main()
{
    int a,b=1;
    printf("enter the number whose table you want : ");
    scanf("%d",&a);
    table(a,b);
    return 0;
}