package org.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloMavenTest {

    @Test
    public void add() {
        System.out.println("jakfdjla语文");
        HelloMaven helloMaven = new HelloMaven();
        int add = helloMaven.add(10, 20);
        Assert.assertEquals(30,add);

    }
}