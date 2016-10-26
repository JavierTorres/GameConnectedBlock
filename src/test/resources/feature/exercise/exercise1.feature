Feature: Test Exercise1

  Scenario: Empty matrix
    Given the following matrix with 0 columns for the given type A
      |  |
    When finding the largest connected block
    Then the result should be 0

  Scenario: All the same
    Given the following matrix with 3 columns for the given type A
      | A |	A |	A |
      | A |	A |	A |
    When finding the largest connected block
    Then the result should be 6

  Scenario: Character not found
    Given the following matrix with 7 columns for the given type Z
      | A |	C |	A |	F |	F |	F |	F |
      | A |	C |	C |	C |	C |	E |	E |
      | A |	D |	D |	A |	C |	E |	D |
      | B |	B |	B |	A |	A |	A |	D |
      | A |	B |	B |	B |	D |	D |	D |
    When finding the largest connected block
    Then the result should be 0

  Scenario: Test A
    Given the following matrix with 7 columns for the given type A
      | A |	C |	A |	F |	F |	F |	F |
      | A |	C |	C |	C |	C |	E |	E |
      | A |	D |	D |	A |	C |	E |	D |
      | B |	B |	B |	A |	A |	A |	D |
      | A |	B |	B |	B |	D |	D |	D |
    When finding the largest connected block
    Then the result should be 4

  Scenario: Test for B
    Given the following matrix with 7 columns for the given type B
      | A |	C |	A |	F |	F |	F |	F |
      | A |	C |	C |	C |	C |	E |	E |
      | A |	D |	D |	A |	C |	E |	D |
      | B |	B |	B |	A |	A |	A |	D |
      | A |	B |	B |	B |	D |	D |	D |
    When finding the largest connected block
    Then the result should be 6

  Scenario: Test for C
    Given the following matrix with 7 columns for the given type C
      | A |	C |	A |	F |	F |	F |	F |
      | A |	C |	C |	C |	C |	E |	E |
      | A |	D |	D |	A |	C |	E |	D |
      | B |	B |	B |	A |	A |	A |	D |
      | A |	B |	B |	B |	D |	D |	D |
    When finding the largest connected block
    Then the result should be 6

  Scenario: Test for D
    Given the following matrix with 7 columns for the given type D
      | A |	C |	A |	F |	F |	F |	F |
      | A |	C |	C |	C |	C |	E |	E |
      | A |	D |	D |	A |	C |	E |	D |
      | B |	B |	B |	A |	A |	A |	D |
      | A |	B |	B |	B |	D |	D |	D |
    When finding the largest connected block
    Then the result should be 5

  Scenario: Test for E
    Given the following matrix with 7 columns for the given type E
      | A |	C |	A |	F |	F |	F |	F |
      | A |	C |	C |	C |	C |	E |	E |
      | A |	D |	D |	A |	C |	E |	D |
      | B |	B |	B |	A |	A |	A |	D |
      | A |	B |	B |	B |	D |	D |	D |
    When finding the largest connected block
    Then the result should be 3

  Scenario: Test for F
    Given the following matrix with 7 columns for the given type F
      | A |	C |	A |	F |	F |	F |	F |
      | A |	C |	C |	C |	C |	E |	E |
      | A |	D |	D |	A |	C |	E |	D |
      | B |	B |	B |	A |	A |	A |	D |
      | A |	B |	B |	B |	D |	D |	D |
    When finding the largest connected block
    Then the result should be 4