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

    public void setCurrentStation (int newCurrentStation) {

        currentStation = newCurrentStation;
    }

    public void nextStation (int currentStation) {
        if (currentStation >= maxStationNumber) {
            setCurrentStation(minStationNumber);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }
    public void prevStation (int currentStation) {
        if (currentStation <= minStationNumber) {
            setCurrentStation(maxStationNumber);
        }else {
            setCurrentStation(currentStation - 1);
        }

    }
    // ГРОМКОСТЬ
    public void setCurrentVolume (int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void upVolume (int currentVolume) {
        if (currentVolume >= maxVolume) {
            setCurrentVolume(maxVolume);
        } else {
            setCurrentVolume(currentVolume + 1);
        }
    }
    public void downVolume (int currentVolume) {
        if (currentVolume <= minVolume) {
            setCurrentVolume(minVolume);
        } else setCurrentVolume(currentVolume - 1);
    }
}