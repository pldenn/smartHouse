package ru.netology.domain;

public class Radio {
    int currentStation;
    int currentVolume;
    int maxStation;
    int minStation;
    int maxVolume;
    int minVolume;

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
        this.currentVolume = currentVolume;

    }
}
