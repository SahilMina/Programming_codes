#include <stdio.h>
#include <string.h>

// Define structure for student data
struct Student {
    int id;
    char name[50];
    float marks[6];
    float attendance;
    float average;
};

// Function to calculate average marks
float calculateAverage(float marks[], int subjects) {
    float sum = 0;
    for (int i = 0; i < subjects; i++) {
        sum += marks[i];
    }
    return sum / subjects;
}

int main() {
    struct Student students[5];
    int numSubjects = 6;
    int topperIndex = 0, slowLearnerIndex = 0;
    
    // Input student details
    for (int i = 0; i < 5; i++) {
        printf("Enter details for student %d:\n", i + 1);
        printf("ID: ");
        scanf("%d", &students[i].id);
        printf("Name: ");
        scanf(" %[^"]s", students[i].name);
        printf("Enter marks for 6 subjects: ");
        for (int j = 0; j < numSubjects; j++) {
            scanf("%f", &students[i].marks[j]);
        }
        printf("Attendance Percentage: ");
        scanf("%f", &students[i].attendance);
        
        // Compute average marks
        students[i].average = calculateAverage(students[i].marks, numSubjects);
    }
    
    // Find topper and slow learner
    for (int i = 1; i < 5; i++) {
        if (students[i].average > students[topperIndex].average) {
            topperIndex = i;
        }
        if (students[i].average < students[slowLearnerIndex].average) {
            slowLearnerIndex = i;
        }
    }
    
    // Display results
    printf("\nTopper: %s (ID: %d) with average %.2f\n", students[topperIndex].name, students[topperIndex].id, students[topperIndex].average);
    printf("Slow Learner: %s (ID: %d) with average %.2f\n", students[slowLearnerIndex].name, students[slowLearnerIndex].id, students[slowLearnerIndex].average);
    
    return 0;
}
