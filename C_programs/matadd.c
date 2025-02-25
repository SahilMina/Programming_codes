#include<stdio.h>
int main()
{
    int a, b, i, j;
    printf("Enter the number of rows: ");
    scanf("%d", &a);
    printf("Enter the number of columns: ");
    scanf("%d", &b);
    int mat1[a][b], mat2[a][b], mat3[a][b];   
    for (i = 0; i < a; i++) 
    {
        for (j = 0; j < b; j++) 
        {
            printf("Enter value for matrix 1[%d][%d]: ", i, j);
            scanf("%d", &mat1[i][j]);
        }
    }
    for (i = 0; i < a; i++) 
    {
        for (j = 0; j < b; j++)
        {
            printf("Enter value for matrix 2[%d][%d]: ", i, j);
            scanf("%d", &mat2[i][j]);
        }
    }
    printf("\nMatrix 1:\n");
    for (i = 0; i < a; i++)
    {
        for (j = 0; j < b; j++)
        {
            printf("%d ", mat1[i][j]);
        }
        printf("\n");
    }
    printf("\nMatrix 2:\n");
    for (i = 0; i < a; i++) 
    {
        for (j = 0; j < b; j++) 
        {
            printf("%d ", mat2[i][j]);
        }
        printf("\n");
    }
    for (i = 0; i < a; i++)
    {
        for (j = 0; j < b; j++)
        {
            mat3[i][j] = mat1[i][j] + mat2[i][j];
        }
    }
    printf("\nThe sum of the matrices:\n");
    for (i = 0; i < a; i++) 
    {
        for (j = 0; j < b; j++)
        {
            printf("%d ", mat3[i][j]);
        }
        printf("\n");
    }

    return 0;
}