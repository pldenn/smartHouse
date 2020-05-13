package ru.netology.domain;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 10;
    private int minVolume = 0;

    public void nextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        this.currentStation = ++currentStation;
    }

    public void prevStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        this.currentStation = --currentStation;
    }

    public void volumeUp() {
        if (currentVolume == maxVolume) {
            return;
        }
        this.currentVolume = ++currentVolume;
    }

    public void volumeDown() {
        if (currentVolume == minVolume) {
            return;
        }
        this.currentVolume = --currentVolume;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume)
            return;
        if (currentVolume < minVolume)
            return;
        this.currentVolume = currentVolume;

    }
}
