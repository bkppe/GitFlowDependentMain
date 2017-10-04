package edu.berkeley.path.hellosomebody;

import edu.berkeley.path.somebody.Someone;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by brian on 10/3/17.
 */
public class HelloTest {

    @Test
    public void testResult()
    {
        Hello myTester = new Hello();
        Someone messageTarget = new Someone();
        String result = Hello.printTarget(messageTarget);
        assertTrue("Correct message", result == "brian");
    }



}