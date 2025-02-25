#include<stdio.h>
int main()
{
   int a, b;
   printf("Enter the number of rows: ");
   scanf("%d", &a);
   printf("Enter the number of columns: ");
   scanf("%d", &b);
   
   int matrix[a][b], transpose[b][a];
   int i, j;
   for(i = 0; i < a; i++) 
   {
      for(j = 0; j < b; j++)
       {
         printf("Enter value for matrix[%d][%d]: ", i, j);
         scanf("%d", &matrix[i][j]);
       }
   }
   printf("Original Two Dimensional array elements:\n");
   for(i = 0; i < a; i++)
    {
      for(j = 0; j < b; j++)
      {
         printf("%d ", matrix[i][j]);
      }
      printf("\n"); 
    }
   for(i = 0; i < a; i++) 
   {
      for(j = 0; j < b; j++) 
      {
         transpose[j][i] = matrix[i][j];
      }
   }
   printf("Transpose of the Two Dimensional array:\n");
   for(i = 0; i < b; i++) 
   {
      for(j = 0; j < a; j++)
      {
         printf("%d ", transpose[i][j]);
      }
      printf("\n"); 
   }
      return 0;
}