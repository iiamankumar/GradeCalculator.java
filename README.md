GradeCalculator.java

A simple Java program that calculates a student's grade based on their marks and computes their percentage. This tool can be used by students, teachers, or anyone who needs a quick way to determine grades and percentages.

Features

Percentage Calculation: Calculates the total percentage based on marks obtained and maximum marks.
Grade Determination: Assigns a grade based on the calculated percentage using standard grading criteria.
Customizable: Easily modify the grading criteria or add additional features.
Getting Started

Prerequisites
To run this project, ensure you have the following installed:

Java Development Kit (JDK) (version 8 or higher)
A code editor or IDE (e.g., IntelliJ IDEA, Eclipse, or a text editor like VS Code).

How to Use

When you run the program, you will be prompted to:

Enter the marks obtained in each subject.
Enter the maximum marks for each subject.
The program will calculate and display:
Total marks obtained.
Total maximum marks.
Percentage.
Grade based on the percentage.

Grading Criteria (Default)
The program uses the following default grading criteria:

A: Percentage ≥ 85
B: 70 ≤ Percentage < 85
C: 50 ≤ Percentage < 70
D: 35 ≤ Percentage < 50
F: Percentage < 35
You can modify these thresholds in the program code as needed.

Code Overview

The GradeCalculator.java program consists of:

Variables:
totalMarksObtained: Tracks the sum of all marks obtained.
totalMaximumMarks: Tracks the sum of all maximum marks.
percentage: Calculates the percentage of marks obtained.
grade: Determines the grade based on the percentage.
Methods:
calculatePercentage(): Computes the percentage.
determineGrade(double percentage): Assigns a grade based on the percentage.
main(String[] args): Handles user input and displays results.
Future Enhancements

Potential updates to improve functionality:

Allow saving and exporting results to a file.
Include support for different grading systems (e.g., GPA or letter-based).
Validate user inputs to handle invalid data.
Add a graphical user interface (GUI) for ease of use.
