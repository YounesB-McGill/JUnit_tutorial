# JUnit Tutorial

This is a simple tutorial for JUnit. For general information about unit testing in Java, see the
[JUnit User Guide](https://junit.org/junit5/docs/current/user-guide).
We provide more DPM-specific instructions [here](https://mcgill-dpm.github.io/website/JUnit).

## Code overview

The following files are included in this repo:

[`Main.java`](src/ca/mcgill/ecse211/project/Main.java) is a simple main class that
uses the logic in the `Point` class.

[`Point.java`](src/ca/mcgill/ecse211/project/Point.java) represents a point with _x_
and _y_ coordinates. This file contains a new method which we are asked to implement,
`makePointsFromString()` which takes in an input string and returns `Point`s with the
same coodinates. **This is what needs to be implemented and _tested_.**

[`TestPoint.java`](src/ca/mcgill/ecse211/test/TestPoint.java) is a test class, used
to test the `Point` class.

## Implementation steps

First, we need to understand the **requirements**. In this example, the requirement is to implement
a function that takes in an input string and figures out how to make `Point` objects from it (side note:
the technical term for figuring out what a string means is called _parsing_).
In the tutorial, we learned (by asking clarifying questions!) that we need to be able to handle any
whitespace, eg, we should treat `"(1,2), (3,5)"`, `"(1, 2), (3, 5)"`, and `"(1,2),(3,5)"` the same way.

Now that we know what needs to be done, we can come up with _test cases_ that **validate** any implementation
of this function. A test case is a given input/output pair that we use to verify a function's correctness.

Here are some example test cases:

```java
"(1,2)" -> List.of(new Point(1, 2))
"(1, 2), (3, 5)" -> List.of(new Point(1, 2), new Point(3, 5))
"(1, 2),(3,5),(-8, 6.5)" -> List.of(new Point(1, 2), new Point(3, 5), new Point(-8, 6.5))
```
Note that we have many test cases, including ones with negative numbers and with decimal points. We also
use many different spacing patterns, to make sure all of them can be handled. Note that we came up with these
test cases _before_ starting to implement our logic!

_After_ coming up with these test cases, we can **implement** the function and make sure we are passing the test cases
above. To run a JUnit test in Eclipse, right click it and select Run as > JUnit test.

Once we pass all tests, we should take a closer look at our tests to make sure we are not missing any edge cases.
What happens if the string is null or empty?

```java
"" -> List.of()  // empty list
null -> List.of()
```
After adding the null/empty checks, maybe we can say that our function is complete. Is there anything else we need to check for?


## Solution

A step-by-step solution can be found in the [solution](https://github.com/YounesB-McGill/JUnit_tutorial/tree/solution) branch of
this repository. Please attempt the tutorial before referring to the sample solution. Can you improve on the given solution?


