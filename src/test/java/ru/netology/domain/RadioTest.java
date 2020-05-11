package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldNextStation() {
        Radio radio = new Radio();
        radio.currentStation = 8;
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    void shouldPrevStation() {
        Radio radio = new Radio();
        radio.currentStation = 1;
        radio.prevStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void shouldUnderStation() {
        Radio radio = new Radio();
        radio.currentStation = 0;
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }
    @Test
    void shouldOverStation() {
        Radio radio = new Radio();
        radio.currentStation = 9;
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void shouldUnderLimitStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(0, radio.getCurrentStation());
    }
    @Test
    void shouldOverLimitStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldVolumeUp() {
        Radio radio = new Radio();
        radio.currentVolume = 9;
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    void shouldVolumeDown() {
        Radio radio = new Radio();
        radio.currentVolume = 1;
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    void shouldVolumeOver() {
        Radio radio = new Radio();
        radio.currentVolume = 10;
        radio.volumeUp();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeUnder() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.volumeDown();
        assertEquals(0, radio.getCurrentVolume());
    }
}