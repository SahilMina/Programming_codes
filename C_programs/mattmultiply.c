
#include<stdio.h>
int main()
{
    int a, b, c, i, j, k;

    printf("Enter the number of rows in Matrix 1: ");
    scanf("%d", &a);
    printf("Enter the number of columns in Matrix 1 (and rows in Matrix 2): ");
    scanf("%d", &b);
    printf("Enter the number of columns in Matrix 2: ");
    scanf("%d", &c);

    int mat1[a][b], mat2[b][c], mat3[a][c];

    printf("Enter values for Matrix 1:\n");
    for (i = 0; i < a; i++) {
        for (j = 0; j < b; j++) {
            printf("Matrix 1[%d][%d]: ", i, j);
            scanf("%d", &mat1[i][j]);
        }
    }

    printf("Enter values for Matrix 2:\n");
    for (i = 0; i < b; i++) {
        for (j = 0; j < c; j++) {
            printf("Matrix 2[%d][%d]: ", i, j);
            scanf("%d", &mat2[i][j]);
        }
    }

    for (i = 0; i < a; i++) {
        for (j = 0; j < c; j++) {
            mat3[i][j] = 0;
            for (k = 0; k < b; k++) {
                mat3[i][j] += mat1[i][k] * mat2[k][j];
            }
        }
    }

    printf("\nMatrix 1:\n");
    for (i = 0; i < a; i++) {
        for (j = 0; j < b; j++) {
            printf("%d ", mat1[i][j]);
        }
        printf("\n");
    }

    printf("\nMatrix 2:\n");
    for (i = 0; i < b; i++) {
        for (j = 0; j < c; j++) {
            printf("%d ", mat2[i][j]);
        }
        printf("\n");
    }

    printf("\nThe product of the matrices is:\n");
    for (i = 0; i < a; i++) {
        for (j = 0; j < c; j++) {
            printf("%d ", mat3[i][j]);
        }
        printf("\n");
    }

    return 0;
}
