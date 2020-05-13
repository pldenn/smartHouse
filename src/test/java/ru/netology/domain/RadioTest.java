package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldNextStation() {
        Radio radio = new Radio();
        radio.maxStation = 9;
        radio.minStation = 0;
        radio.currentStation = 8;
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldPrevStation() {
        Radio radio = new Radio();
        radio.maxStation = 9;
        radio.minStation = 0;
        radio.currentStation = 1;
        radio.prevStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldUnderStation() {
        Radio radio = new Radio();
        radio.maxStation = 9;
        radio.minStation = 0;
        radio.currentStation = 0;
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldOverStation() {
        Radio radio = new Radio();
        radio.maxStation = 9;
        radio.minStation = 0;
        radio.currentStation = 9;
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldUnderLimitStation() {
        Radio radio = new Radio();
        radio.maxStation = 9;
        radio.minStation = 0;

        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldOverLimitStation() {
        Radio radio = new Radio();
        radio.maxStation = 9;
        radio.minStation = 0;
        radio.setCurrentStation(10);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldCurrentStation() {
        Radio radio = new Radio();
        radio.maxStation = 9;
        radio.minStation = 0;
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void shouldVolumeUp() {
        Radio radio = new Radio();
        radio.maxVolume = 10;
        radio.minVolume = 0;
        radio.currentVolume = 9;
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeDown() {
        Radio radio = new Radio();
        radio.maxVolume = 10;
        radio.minVolume = 0;
        radio.currentVolume = 1;
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeOver() {
        Radio radio = new Radio();
        radio.maxVolume = 10;
        radio.minVolume = 0;
        radio.currentVolume = 10;
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeUnder() {
        Radio radio = new Radio();
        radio.maxVolume = 10;
        radio.minVolume = 0;
        radio.currentVolume = 0;
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeCurrent() {
        Radio radio = new Radio();
        radio.maxVolume = 10;
        radio.minVolume = 0;
        radio.currentVolume = 3;
        assertEquals(3, radio.getCurrentVolume());
    }
}