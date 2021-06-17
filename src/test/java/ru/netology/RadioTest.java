package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldCreate() {
        Radio radio = new Radio();
    }

    @Test
    public void shouldInitFieldToZeroValues() {
        Radio radio = new Radio();
        assertEquals(9, radio.MaxStation);
        assertEquals(0, radio.MinStation);
        assertEquals(0, radio.currentStation);
        assertFalse(radio.on);
    }

    @Test
    public void shouldChangeFields() {
        Radio radio = new Radio();
        assertEquals(0, radio.currentStation);
        radio.currentStation = -10;
        assertEquals(-10, radio.currentStation);
    }
}