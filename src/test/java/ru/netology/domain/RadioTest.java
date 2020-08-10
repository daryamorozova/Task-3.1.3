package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldNextRadiostation() {
        Radio radio = new Radio();

        assertEquals(5, radio.nextRadiostation(4));
        assertEquals(0, radio.nextRadiostation(9));
        assertEquals(9, radio.nextRadiostation(10));
        assertEquals(0, radio.nextRadiostation(-10));
    }

    @Test
    public void shouldPrevRadiostation() {
        Radio radio = new Radio();

        assertEquals(4, radio.prevRadiostation(5));
        assertEquals(9, radio.prevRadiostation(0));
        assertEquals(9, radio.prevRadiostation(10));
        assertEquals(0, radio.prevRadiostation(-10));
    }



}