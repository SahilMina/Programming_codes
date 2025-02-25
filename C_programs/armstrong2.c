//armstrong number between a range
#include<stdio.h>
int main()
{
    int a,b,sum,temp,num1,num2,num;
    printf("enter the first number...");
    scanf("%d",&num1);
    printf("enter the last number...");
    scanf("%d",&num2);
   printf("the armstrong number between %d and %d are \n",num1,num2);
    for(a=num1;a<=num2;a++)
    {
        sum = 0;
        num = a;
        temp=num;
       
        while(num>0)
        {
            b=num%10;
            sum=sum+(b*b*b);
            num=num/10;
        }
        if(sum==temp)
        {
            printf("%d\n",temp);
        }
    }
    return 0;
}