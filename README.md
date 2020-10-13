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
