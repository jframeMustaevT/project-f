package ru.mustaevtt.fix.demo.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HorseServiceTest {

    @Test
    public void getCountTest1() throws Exception {
        HorseService horseService = new HorseService();
        int width = 10;
        int height = 14;
        String start = "B1";
        String end = "A3";
        assertEquals(1, horseService.count(width, height, start, end));
    }

    @Test
    public void getCountTest2() throws Exception {
        HorseService horseService = new HorseService();
        int width = 3;
        int height = 3;
        String start = "A1";
        String end = "B2";
        assertEquals("-1", Integer.toString(horseService.count(width, height, start, end)));
    }

    @Test
    public void getCountTest3() throws Exception {
        HorseService horseService = new HorseService();
        int width = 2;
        int height = 2;
        String start = "A1";
        String end = "A2";
        assertEquals("-1", Integer.toString(horseService.count(width, height, start, end)));
    }

    @Test
    public void getCountTest4() throws Exception {
        HorseService horseService = new HorseService();
        int width = 12;
        int height = 12;
        String start = "E6";
        String end = "J10";
        assertEquals(3, horseService.count(width, height, start, end));
    }

    @Test
    public void getCountTest5() throws Exception {
        HorseService horseService = new HorseService();
        int width = 3;
        int height = 3;
        String start = "A1";
        String end = "A1";
        assertEquals(0, horseService.count(width, height, start, end));
    }

    @Test
    public void getCountTest6() throws Exception {
        HorseService horseService = new HorseService();
        int width = 12;
        int height = 12;
        String start = "E6";
        String end = "A2";
        assertEquals(4, horseService.count(width, height, start, end));
    }

    @Test
    public void getCountTest7() throws Exception {
        HorseService horseService = new HorseService();
        int width = 12;
        int height = 12;
        String start = "E6";
        String end = "K1";
        assertEquals(5, horseService.count(width, height, start, end));
    }
}