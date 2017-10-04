package edu.berkeley.path.hellosomebody;

/**
 * Created by brian on 9/29/17.
 */

import edu.berkeley.path.somebody.*;

public class Hello {


    public static void main(String[] args)
    {
        Someone messageTarget = new Someone();
        String target = printTarget(messageTarget);

    }

    protected static String printTarget(Someone targetSomeone){
        String target = targetSomeone.getTarget();
        String message = "Hello " + target;
        System.out.println(message);
        return target;
    }

}
