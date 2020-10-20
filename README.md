# Date Calculator : Problem

You are tasked with calculating the number of full days elapsed in between start and end dates. The first and the last day are considered partial days and never counted.

Following this logic, an experiment that has run from 1972-11-07 to 1972-11-08 should return 0, because there are no fully elapsed days contained in between those dates, and 2000-01-01 to 2000-01-03 should return 1. The solution needs to cater for all valid dates between 1901-01-01 and 2999-12-31.

Implement a command line based system with at least one way of providing input and output on the terminal. Although it should obvious, make sure the solution compiles and works.

Although any dates specified within the valid date range listed above should work, here are a few test cases to validate the output of your program.

# TEST CASES
1. 1983-06-02 – 1983-06-22: 19 days
2. 1984-07-04 – 1984-12-25: 173 days
3. 1989-01-03 – 1983-08-03: 1979 days

# Assumptions
- Since the program performs a simple date calculation, there is no need to write web or api application. This is simple java class.
- No extensive exception handing is required. The program covers basic error handling and validations.

## Technologies
  1. Java Runtine Environment 1.8

## Instructions
Program Compile

```
192-168-1-110:Qantas jaykishanparikh$ javac DateCalculator.java
```

Run Java Program 

```
192-168-1-110:Qantas jaykishanparikh$ java DateCalculator 1983-06-02 1983-06-22
19
192-168-1-110:Qantas jaykishanparikh$ java DateCalculator 1984-07-04 1984-12-25
173
192-168-1-110:Qantas jaykishanparikh$ java DateCalculator 1989-01-03 1983-08-03
1979
192-168-1-110:Qantas jaykishanparikh$ java DateCalculator 1972-11-07 1972-11-08
0
192-168-1-110:Qantas jaykishanparikh$ java DateCalculator 1972-11-07 1972-11-07
0
```
 
