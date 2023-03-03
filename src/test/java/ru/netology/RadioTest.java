package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio();

    @Test
    public void newSetters (){
        Radio radio = new Radio(46);
        Assertions.assertEquals(46, radio.getQuantityStation());
        Assertions.assertEquals(45,radio.getMaxStationNumber());
    }

    @Test // Переключается после max на 0
    public void shouldNextNumberStationAfterMax() {
        {
            radio.setCurrentStation(9);
            radio.nextStation();
            int expected = 0;
            int actual = radio.getCurrentStation();
            Assertions.assertEquals(expected, actual);
        }
    }

    @Test  //Переключение каналов +1
    public void shouldNextNumberStation() {
        {
            radio.setCurrentStation(6);
            radio.nextStation();
            int expected = 7;
            int actual = radio.getCurrentStation();
            Assertions.assertEquals(expected, actual);
        }
    }

    @Test //Переключение с 0 на max
    public void shouldPreviosNumberStationBefor0() {
        {
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
        {
            radio.setCurrentStation(5);
            int expected = 5;
            int actual = radio.getCurrentStation();
            Assertions.assertEquals(expected, actual);
        }

    }



    // Громкость с 10 остается 10
    @Test
    public void shouldStopVolumeAfter10() {
        {
            radio.setCurrentVolume(100);
            radio.upVolume();
            int expected = 100;
            int actual = radio.getCurrentVolume();
            Assertions.assertEquals(expected, actual);
        }
    }

    // Увеличение громкости на 1
    @Test
    public void shouldUpVolume() {
        {
            Radio radio = new Radio();
            radio.setCurrentVolume(25);
            radio.upVolume();

            int expected = 26;
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
            radio.setCurrentVolume(48);
            radio.downVolume();

            int expected = 47;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }
    }
}
