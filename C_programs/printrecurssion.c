#include<stdio.h>
void numb(int n)
{
    if(n>20)
    {
        return;
    }
    printf("%d\t",n);
    numb(n+1);
}
int main()
{
    int n=10;
    numb(n);
    return 0;
}