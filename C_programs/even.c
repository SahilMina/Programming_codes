#include<stdio.h>
int main()
{
    int i,j;
    printf ("enter till where you want.....");
    scanf("%d",&i);
    for(j=0;j<=i;j++)
    {
        if(j%2==0)
        {
           printf("%d ",j);         
         }
     }
  return 0;   
 } 