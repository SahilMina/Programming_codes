//sum of two arrays
#include <stdio.h>
int main() 
{
int a,b,i,j,s1=0,s2=0,sum;
printf("enter the size of array 1\n");
scanf("%d",&a);
int arr1[a];
printf("enter the elements \n");
for(i=0;i<a;i++)
 {
     scanf("%d",&arr1[i]);
 }
 for(i=0;i<a;i++)
 {
     s1=s1+arr1[i];
 }
 printf("enter the size of array 2\n");
scanf("%d",&b);
int arr2[b];
printf("enter the elements \n");
for(j=0;j<b;j++)
{
    scanf("%d",&arr2[j]);
}
for(j=0;j<b;j++)
{
    s2=s2+arr2[j];
}
sum=s1+s2;
printf("\nthe summation of array1: %d ",s1);
printf("\nthe summation of array1: %d ",s2);
printf("\nthe sum of both arrays is: %d",sum);
return 0;
}