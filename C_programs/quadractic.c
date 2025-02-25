#include <stdio.h>
#include <math.h>

void compute_roots(float a, float b, float c) {
    if (a == 0) {
        printf("Coefficient 'a' cannot be zero in a quadratic equation.\n");
        return;
    }
    
    float discriminant = b * b - 4 * a * c;
    
    if (discriminant > 0) {
        float root1 = (-b + sqrt(discriminant)) / (2 * a);
        float root2 = (-b - sqrt(discriminant)) / (2 * a);
        printf("The roots are real and distinct: %.2f and %.2f\n", root1, root2);
    } else if (discriminant == 0) {
        float root = -b / (2 * a);
        printf("The roots are real and equal: %.2f\n", root);
    } else {
        float real_part = -b / (2 * a);
        float imaginary_part = sqrt(-discriminant) / (2 * a);
        printf("The roots are complex: %.2f ± %.2fi\n", real_part, imaginary_part);
    }
}

int main() {
    float a, b, c;
    printf("Enter coefficient a: ");
    scanf("%f", &a);
    printf("Enter coefficient b: ");
    scanf("%f", &b);
    printf("Enter coefficient c: ");
    scanf("%f", &c);
    
    compute_roots(a, b, c);
    
    return 0;
}
