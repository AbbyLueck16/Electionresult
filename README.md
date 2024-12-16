# Electionresult
This repository includes a file "Task5_Election.java" that was created for an assignment in CISC 230.

This program: 
- Gets input from the user for the number of votes each candidate received for each area
- Calculates each candidates winning percentage, the number of areas they won in, and the number of areas that were a tie
- Displays the results

## Installation
This program requires a java development environment and a Java runtime to run. 

## Usage
Compile the program
```java
javac Task5_Election.java
```
Run the program
```java
java Task5_Election
```

Inputs:

1. The user is first asked if there are any areas to process (enter y for yes, n for no).
2. For each area:
- Enter the number of votes received by Mr. A.
-  Enter the number of votes received by Mr. B.
3. When all areas are processed, the program will calculate and display the results.

### Example Run
```java
Election Day Vote Counting Program

Are there any areas to process? (y/n)y  
Please enter the results from the next area  
Votes for Mr. A: 100  
Votes for Mr. B: 10   
Are there any areas to process? y  
Please enter the results from the next area  
Votes for Mr. A: 15  
Votes for Mr. B: 200  
Are there any areas to process? y  
Please enter the results from the next area  
Votes for Mr. A: 100  
Votes for Mr. B: 100  
Are there any areas to process? n  

Mr. A's got 215 votes or 40.95238%  
Mr. B's got 310 votes or 59.047623%  
Mr. A won 1 areas.  
Mr. B won 1 areas.  
1 areas were tied.  
```
## Limitations and possible improvements 
This code was created for a class and therefore had to meet the requirements given in the assignment instructions. If this code were to be used for real election calculations, the names of the candidates should be entered, and more specific terms should be used (such as swtiching "areas" to "counties").
