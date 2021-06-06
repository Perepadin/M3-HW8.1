package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {

    @Test
    public void shouldGetAndSet() {
        RadioAdvanced radio = new RadioAdvanced();
        String expected = "radioMaximum";

        assertNull(radio.getName());
        radio.setName(expected);
        assertEquals(expected, radio.getName());
    }

    @Test
    public void shouldIncreaseVolume() {
        RadioAdvanced Radio = new RadioAdvanced();
        Radio.setMaxVolumeLevel(10);
        Radio.setMinVolumeLevel(0);
        Radio.setCurrentVolume(5);

        int expected = 6;
        assertEquals(expected, Radio.increaseVolume());
    }

    @Test
    public void shouldIncreaseVolumeMoreMax() {
        RadioAdvanced Radio = new RadioAdvanced();
        Radio.setCurrentVolume(11);

        int expected = 1;
        assertEquals(expected, Radio.increaseVolume());
    }

    @Test
    public void shouldIncreaseVolumeLessMin() {
        RadioAdvanced Radio = new RadioAdvanced();
        Radio.setCurrentVolume(-1);

        int expected = 1;
        assertEquals(expected, Radio.increaseVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        RadioAdvanced Radio = new RadioAdvanced();
        Radio.setCurrentVolume(10);

        int expected = 9;
        assertEquals(expected, Radio.decreaseVolume());
    }

    @Test
    public void shouldDecreaseVolumeMoreMax() {
        RadioAdvanced Radio = new RadioAdvanced();
        Radio.setCurrentVolume(11);

        int expected = 0;
        assertEquals(expected, Radio.decreaseVolume());
    }

    @Test
    public void shouldDecreaseVolumeLessMin() {
        RadioAdvanced Radio = new RadioAdvanced();
        Radio.setCurrentVolume(-5);

        int expected = 0;
        assertEquals(expected, Radio.decreaseVolume());
    }

    @Test
    public void shouldIncreaseStation() {
        RadioAdvanced Radio = new RadioAdvanced();
        Radio.setCurrentStation(9);
        Radio.setMinStation(0);
        Radio.setMaxStation(9);

        int expected = 0;
        assertEquals(expected, Radio.increaseStation());
    }

    @Test
    public void shouldIncreaseStationMoreMax() {
        RadioAdvanced Radio = new RadioAdvanced();
        Radio.setCurrentStation(11);

        int expected = 1;
        assertEquals(expected, Radio.increaseStation());
    }

    @Test
    public void shouldDecreaseStationLessMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(-10);

        int expected = 9;
        assertEquals(expected, radio.decreaseStation());
    }

    @Test
    public void shouldCreate() {
        RadioAdvanced Radio = new RadioAdvanced();
    }

    @Test
    public void shouldInitField() {
        RadioAdvanced Radio = new RadioAdvanced();
        assertNull(Radio.getName());
        assertEquals(9, Radio.getMaxStation());
        assertEquals(0, Radio.getMinStation());
        assertEquals(0, Radio.getCurrentStation());
        assertEquals(10, Radio.getMaxVolumeLevel());
        assertEquals(0, Radio.getMinVolumeLevel());
        assertEquals(0, Radio.getCurrentVolume());
        assertFalse(Radio.isOn());
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
        radio.currentStation = 5;
        assertEquals(5, radio.currentStation);
    }
}

