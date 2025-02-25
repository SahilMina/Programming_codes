#include<stdio.h>
int main()
{
    int i,j,temp,sum=0;
    printf("enter the number...");
    scanf("%d",&i);
    temp=i;
    while(i>0)
    {
        j=i%10;
        sum=sum+(j*j*j);
        i=i/10;
    }
    if(temp==sum)
    {
        printf("it is an armstrong number");
    }
    else
    {
        printf("it is not an armstrong number");
    }
    return 0;
}