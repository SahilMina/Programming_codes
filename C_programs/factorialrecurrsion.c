#include<stdio.h>
int fact(int n)
{
    int c;
    if(n==0||n==1)
    {
        return 1;
    }
      c=n*fact(n-1);
      return c;
}
int main()
{
    int n,c;
    printf("\n enter the number whose factorial you want\n");
    scanf("%d",&n);
    c=fact(n);
    printf("%d",c);
    return 0;
}