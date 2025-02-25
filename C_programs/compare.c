#include<stdio.h>
int main()
{
    int a,b,c;
    printf("enter three numbers which you want to compare.....\n");
    scanf("%d %d %d",&a,&b,&c);
    if (a>b && a>c)
    {
        printf("the biggest number is : %d",a);
    }
    else if (b>c && b>a)
    {
        printf("the biggest number is : %d",b);
    }
    else
    {
        printf("the biggest number is : %d",c);
    }
    return 0;
}