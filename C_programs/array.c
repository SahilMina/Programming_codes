#include<stdio.h>
int main()
{
    int i,n,sum=0;
    printf("enter the number of terms\n");
    scanf("%d",&n);
    int a[n];
    printf("enter the terms \n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("the array is \n");
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
    for(i=0;i<n;i++)
    {
        sum=sum+a[i];
    }
    printf("\nthe summation of the array is: %d",sum);
    return 0;
}