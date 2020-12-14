package com;

import org.junit.*;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.*;

public class CanvasTest {
    Canvas testCanvas1;

    @BeforeClass
    public static void setUpBefore() {
        System.out.println("** BEFORE CLASS **");
    }

    @Before
    public void setUp() {
        System.out.println("** BEFORE **");
        testCanvas1 = new Canvas();
    }


    @Test //PASSED
    public void testNumber() {
        System.out.println(testCanvas1.canvasNum);
    }

    @Test //PASSED
    public void testDraw() {
        testCanvas1.draw();
        System.out.println(testCanvas1.canvasNum);
    }

    @Test //PASSED
    public void testDelete() {
        testCanvas1.delete();
        System.out.println(testCanvas1.canvasNum);
    }

    @Test //PASSED
    public void testDrawDraw() {
        testCanvas1.draw();
        testCanvas1.draw();
        System.out.println(testCanvas1.canvasNum);
    }

    @Test //PASSED
    public void testDeleteDelete() {
        testCanvas1.delete();
        testCanvas1.delete();
        System.out.println(testCanvas1.canvasNum);
    }


    @After
    public void tearDown() {
        System.out.println("** AFTER **");
    }

    @AfterClass
    public static void tearDownAfter() {
        System.out.println("** AFTER CLASS **");
    }
}