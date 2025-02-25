#include<stdio.h>
int main()
{
 int i,j,sum=0;
printf("enter the last number till where you want sum....");
scanf("%d",&i);
for (j=1;j<=i;j++)
{
    sum+=j;
}
printf("the sum is : %d",sum);
return 0;   
}