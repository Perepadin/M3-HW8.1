package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {

    @Test
    void shouldSetNumbersOfStation() {
        RadioAdvanced radio = new RadioAdvanced();
        int numbersOfStations = 10;
        radio.setNumbersOfStations(numbersOfStations);
        assertEquals(10, radio.getNumbersOfStations());
    }

    @Test
    void shouldSetCurrentRadioStationBackToZero() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentStation = 15;
        radio.setCurrentStation(currentStation);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationsIfStationsIsOverMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(150);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetStationsIfStationsIsUnderMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(-99);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationsIfStationsIsMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetStationsIfStationsIsMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentStation(10);
        assertEquals(10, radio.getCurrentStation());
    }


    @Test
    void shouldChangeOnPreviousRadioStationIfStationIsMin() {
        RadioAdvanced radio = new RadioAdvanced(0, 0);
        radio.changeOnPreviousRadioStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void shouldNotChangeOnNextRadioStationIfStationIsMax() {
        RadioAdvanced radio = new RadioAdvanced(10, 0);
        radio.changeOnNextRadioStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldChangeOnPreviousRadioStation() {
        RadioAdvanced radio = new RadioAdvanced(1, 0);
        radio.changeOnPreviousRadioStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldChangeOnNextRadioStation() {
        RadioAdvanced radio = new RadioAdvanced(8, 0);
        radio.changeOnNextRadioStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldNotSetVolumeIfVolumeIsOverMax() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = 150;
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNotSetVolumeIfVolumeIsUnderMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(-100);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMax() {
        RadioAdvanced radio = new RadioAdvanced(0, 100);
        radio.volumeUpForOne();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        RadioAdvanced radio = new RadioAdvanced(0, 0);
        radio.volumeDownForOne();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void volumeUpForOne() {
        RadioAdvanced radio = new RadioAdvanced(0, 8);
        radio.volumeUpForOne();
        assertEquals(9, radio.getCurrentVolume());
    }

    @Test
    void volumeDownForOne() {
        RadioAdvanced radio = new RadioAdvanced(0, 7);
        radio.volumeDownForOne();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(100);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldCreate() {
        RadioAdvanced Radio = new RadioAdvanced();
    }

    @Test
    public void shouldUseArgsConstructor() {
        RadioAdvanced Radio = new RadioAdvanced(10, 0, 10, 0, 0, 100, 0);
        assertEquals(10, Radio.getNumbersOfStations());
        assertEquals(10, Radio.getMaxStation());
        assertEquals(0, Radio.getMinStation());
        assertEquals(0, Radio.getCurrentStation());
        assertEquals(100, Radio.getMaxVolumeLevel());
        assertEquals(0, Radio.getMinVolumeLevel());
        assertEquals(0, Radio.getCurrentVolume());
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