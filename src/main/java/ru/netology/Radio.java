package ru.netology;

public class Radio {

    private int currentStation;
    private int minStationNumber = 0;
    private int maxStationNumber = 9;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 10;

    // СТАНЦИИ
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation >= maxStationNumber) {
            setCurrentStation(minStationNumber);
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation <= minStationNumber) {
            setCurrentStation(maxStationNumber);
        } else {
            currentStation = currentStation - 1;
        }

    }

    // ГРОМКОСТЬ
    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void upVolume() {
        if (currentVolume >= maxVolume) {
            setCurrentVolume(maxVolume);
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {
        if (currentVolume <= minVolume) {
            setCurrentVolume(minVolume);
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}