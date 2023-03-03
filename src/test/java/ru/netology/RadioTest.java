package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    // Переключается после 9 на 0
    @Test
    public void shouldNextNumberStationAfter9() {
        {
            Radio radio = new Radio();
            radio.setCurrentStation(9);
            radio.nextStation();

            int expected = 0;
            int actual = radio.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }
    }

    // Переключение каналов +1
    @Test
    public void shouldNextNumberStation() {
        {
            Radio radio = new Radio();
            radio.setCurrentStation(3);
            radio.nextStation();

            int expected = 4;
            int actual = radio.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }
    }

    // Переключается после 9 на 0
    @Test
    public void shouldPreviosNumberStationBefor0() {
        {
            Radio radio = new Radio();
            radio.setCurrentStation(0);
            radio.prevStation();

            int expected = 9;
            int actual = radio.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }
    }

    // Переключение каналов -1
    @Test
    public void shouldBeforNumberStation() {
        {
            Radio radio = new Radio();
            radio.setCurrentStation(5);
            radio.prevStation();

            int expected = 4;
            int actual = radio.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }
    }

    // Номер станции
    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);

    }

    // Громкость с 10 остается 10
    @Test
    public void shouldStopVolumeAfter10() {
        {
            Radio radio = new Radio();

            radio.setCurrentVolume(10);
            radio.upVolume();

            int expected = 10;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }
    }

    // Увеличение громкости на 1
    @Test
    public void shouldUpVolume() {
        {
            Radio radio = new Radio();
            radio.setCurrentVolume(6);
            radio.upVolume();

            int expected = 7;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }
    }

    // Громкость с 0 остается 0
    @Test
    public void shouldStopVolumeBefor0() {
        {
            Radio radio = new Radio();

            radio.setCurrentVolume(0);
            radio.downVolume();

            int expected = 0;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }
    }

    // Уменьшение громкости на 1
    @Test
    public void shouldDownVolume() {
        {
            Radio radio = new Radio();
            radio.setCurrentVolume(6);
            radio.downVolume();

            int expected = 5;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }
    }
}
