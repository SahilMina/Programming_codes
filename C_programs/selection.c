#include<stdio.h>
int main()
{
    int n,i,j,k;
    printf("enter the number of elements to be sorted: ");
    scanf("%d",&n);
    int a[n];
    printf("enter the elements :\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                k = a[i];
                a[i] = a[j];
                a[j] = k;
            }
        }
    }
    printf("the sorted array is:\n");
    for(i=0;i<n;i++)
    {
        printf("%d ",a[i]);
    }
    return 0;
}