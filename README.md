# Question 1

Given the following matrix:
* A	C	A	F	F	F	F
* A	C	C	C	C	E	E
* A	D	D	A	C	E	D
* B	B	B	A	A	A	D
* A	B	B	B	D	D	D

Write a program to find the largest connected block of a given type.  A block is connected if its neighbouring cell,
horizontally or vertically, has the same value. Two cells aren’t neighbouring if they are touching each other diagonally.
In the above example, the largest connected block is for B with 6.


# Solution

Please execute mvn test to see the different scenarios.
The test has been provided using TDD and BDD.
For many people BDD is less verbose than TDD.
