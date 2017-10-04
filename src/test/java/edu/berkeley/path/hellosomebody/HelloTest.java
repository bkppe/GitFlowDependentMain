package edu.berkeley.path.hellosomebody;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by brian on 10/3/17.
 */
class HelloTest {
    Hello myTester = new Hello();
    Result result = JunitCore.runClasses(Hello.class);
    assertTrue("Correct message", result == "Hello brian");


}