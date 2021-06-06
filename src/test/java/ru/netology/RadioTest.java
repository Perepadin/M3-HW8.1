package ru.netology;

import org.junit.jupiter.api.Disabled;
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
        assertNull(radio.name);
        assertEquals(9, radio.MaxStation);
        assertEquals(0, radio.MinStation);
        assertEquals(0, radio.currentStation);
        assertFalse(radio.on);
    }

    @Test
    @Disabled
    public void shouldThrowNPE() {
        Radio radio = new Radio();
        assertEquals(0, radio.name.length());
    }

    @Test
    public void shouldChangeFields() {
        Radio radio = new Radio();
        assertEquals(0, radio.currentStation);
        radio.currentStation = -10;
        assertEquals(-10, radio.currentStation);
    }
}