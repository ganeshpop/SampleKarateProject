package com.ganesh;

import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;

public class TestRunner {

    @Test
    public Karate getDetailsTest(){
        return Karate.run("features/getRequest").relativeTo(getClass());
//        return Karate.run("classpath:com/ganesh/resources/getRequest");

    }
}
