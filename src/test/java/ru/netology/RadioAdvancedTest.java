package ru.netology;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioAdvancedTest {

    @Test
        //тест на проверка количества станций
    void shouldCheckNumbersOfStation() {
        RadioAdvanced radio = new RadioAdvanced(5);
        assertEquals(5, radio.getNumberOfStations());
    }

    @Test
        //тест на установку количества станций ниже значения количества станций по умолчанию
    void shouldSetNumbersOfStation() {
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setNumberOfStations(5);
        assertEquals(5, radio.getNumberOfStations());
    }

    @Test
        //тест на установку количества станций выше значения количества станций по умолчанию
    void shouldSetNumbersOfStationOverMax() {
        RadioAdvanced radio = new RadioAdvanced(10);
        radio.setNumberOfStations(15);
        assertEquals(15, radio.getNumberOfStations());
    }

    @Test
        //тест на установку отрицательного количества станций
    void shouldNotSetNumbersOfStationWithNegativeValues() {
        RadioAdvanced radio = new RadioAdvanced(5);
        radio.setNumberOfStations(-10);
        assertEquals(5, radio.getNumberOfStations());
    }

    @Test
        //тест на обнуление станции при значении выше макс.количества станций
    void shouldNotSetStationsIfStationsIsOverMax() {
        RadioAdvanced radio = new RadioAdvanced(90);
        radio.setCurrentStation(100);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
        //тест на обнуление станции при значении станции ниже мин.станции
    void shouldNotSetStationsIfStationsIsUnderMin() {
        RadioAdvanced radio = new RadioAdvanced(50);
        radio.setCurrentStation(-99);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
        // тест на выставление станции равной мин.станции
    void shouldSetStationsIfStationsIsMin() {
        RadioAdvanced radio = new RadioAdvanced(5);
        radio.setCurrentStation(0);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
        // тест на выставление станции равной макс.станции
    void shouldSetStationsIfStationsIsMax() {
        RadioAdvanced radio = new RadioAdvanced(20);
        radio.setCurrentStation(19);
        assertEquals(19, radio.getCurrentStation());
    }

    @Test
        // тест на уменьшение станции при станции равной мин.станции
    void shouldChangeOnPreviousRadioStationIfStationIsMin() {
        RadioAdvanced radio = new RadioAdvanced(5);
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.changeOnPreviousRadioStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
        // тест на уменьшение станции при станции равной макс.станции
    void shouldChangeOnPreviousRadioStationIfStationIsMax() {
        RadioAdvanced radio = new RadioAdvanced(10);
        int currentStation = 9;
        radio.setCurrentStation(currentStation);
        radio.changeOnPreviousRadioStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
        // тест на уменьшение станции при станции выше макс.станции
    void shouldChangeOnPreviousRadioStationIfStationIsOverMax() {
        RadioAdvanced radio = new RadioAdvanced(45);
        int currentStation = 50;
        radio.setCurrentStation(currentStation);
        radio.changeOnPreviousRadioStation();
        assertEquals(44, radio.getCurrentStation());
    }

    @Test
        //тест на уменьшение станции в пределах граничных значений
    void shouldChangeOnPreviousRadioStation() {
        RadioAdvanced radio = new RadioAdvanced(50);
        int currentStation = 25;
        radio.setCurrentStation(currentStation);
        radio.changeOnPreviousRadioStation();
        assertEquals(24, radio.getCurrentStation());
    }

    @Test
        //тест на уменьшение станции при отрицательном значении станции
    void shouldChangeOnPreviousRadioStationUnderMin() {
        RadioAdvanced radio = new RadioAdvanced(50);
        int currentStation = -49;
        radio.setCurrentStation(currentStation);
        radio.changeOnPreviousRadioStation();
        assertEquals(49, radio.getCurrentStation());
    }

    @Test
        //тест на уменьшение станции при значении станции равном кол-ву станций
    void shouldChangeOnPreviousRadioStationIfStationEquallyNumberOfStation() {
        RadioAdvanced radio = new RadioAdvanced(50);
        int currentStation = 50;
        radio.setCurrentStation(currentStation);
        radio.changeOnPreviousRadioStation();
        assertEquals(48, radio.getCurrentStation());
    }

    @Test
        //тест на увеличение станции в пределах граничных значений
    void shouldChangeOnNextRadioStation() {
        RadioAdvanced radio = new RadioAdvanced(75);
        int currentStation = 25;
        radio.setCurrentStation(currentStation);
        radio.changeOnNextRadioStation();
        assertEquals(26, radio.getCurrentStation());
    }

    @Test
        //тест на увеличение станции при отрицательном значении станции
    void shouldChangeOnNextRadioStationIfStationIsUnderZero() {
        RadioAdvanced radio = new RadioAdvanced(75);
        int currentStation = -25;
        radio.setCurrentStation(currentStation);
        radio.changeOnNextRadioStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
        // тест на увеличение станции при значении станции равной мин.станции
    void shouldChangeOnNextRadioStationIfStationIsMin() {
        RadioAdvanced radio = new RadioAdvanced(77);
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.changeOnNextRadioStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
        // тест на увеличение станции при значении станции равной макс.станции
    void shouldChangeOnNextRadioStationIfStationIsMax() {
        RadioAdvanced radio = new RadioAdvanced(77);
        int currentStation = 76;
        radio.setCurrentStation(currentStation);
        radio.changeOnNextRadioStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
        // тест на увеличение станции при значении станции выше макс. станции
    void shouldChangeOnNextRadioStationIfStationIsOverMax() {
        RadioAdvanced radio = new RadioAdvanced(100);
        int currentStation = 110;
        radio.setCurrentStation(currentStation);
        radio.changeOnNextRadioStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
        // тест на увеличение станции при значении станции равной кол-ву станций
    void shouldChangeOnNextStationIfStationIfEquallyNumberOfStation() {
        RadioAdvanced radio = new RadioAdvanced(15);
        int currentStation = 15;
        radio.setCurrentStation(currentStation);
        radio.changeOnNextRadioStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
        //тест на обнуление звука при превышении макс.значения звука
    void shouldNotSetVolumeIfVolumeIsOverMax() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(150);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
        //тест на обнуление звука при значении звука ниже мин.значения звука
    void shouldNotSetVolumeIfVolumeIsUnderMin() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = -100;
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
        // тест на увеличение значения звука, если звук равен макс.значению звука
    void shouldNotChangeVolumeIfVolumeIsMax() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = 100;
        radio.setCurrentVolume(currentVolume);
        radio.volumeUpForOne();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
        // тест на уменьшение значения звука, если звук равен мин.значению звука
    void shouldNotChangeVolumeIfVolumeIsMin() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = 0;
        radio.volumeDownForOne();
        radio.setCurrentVolume(currentVolume);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
        // тест на повышение звука в пределах граничных значений
    void volumeUpForOne() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = 55;
        radio.setCurrentVolume(currentVolume);
        radio.volumeUpForOne();
        assertEquals(56, radio.getCurrentVolume());
    }

    @Test
        // тест на уменьшение звука в пределах граничных значений
    void volumeDownForOne() {
        RadioAdvanced radio = new RadioAdvanced();
        int currentVolume = 47;
        radio.setCurrentVolume(currentVolume);
        radio.volumeDownForOne();
        assertEquals(46, radio.getCurrentVolume());
    }

    @Test
        // тест на выставление звука равному мин.значению звука
    void shouldSetVolumeIfVolumeIsMin() {
        RadioAdvanced radio = new RadioAdvanced();
        radio.setCurrentVolume(0);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
        // тест на выставление звука равному макс.значению звука
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
        RadioAdvanced Radio = new RadioAdvanced();
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