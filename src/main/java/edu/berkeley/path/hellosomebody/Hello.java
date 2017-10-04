package edu.berkeley.path.hellosomebody;

/**
 * Created by brian on 9/29/17.
 */

import edu.berkeley.path.somebody.*;

public class Hello {

    public static void main(String[] args)
    {
        Someone messageTarget = new Someone();
        String message = "Hello " + messageTarget.getTarget();
        System.out.println(message);
    }

}
