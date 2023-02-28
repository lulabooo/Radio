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

            radio.nextStation(9);

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
            radio.nextStation(7);

            int expected = 8;
            int actual = radio.getCurrentStation();

            Assertions.assertEquals(expected, actual);
        }
    }
    // Переключается после 9 на 0
    @Test
    public void shouldPreviosNumberStationBefor0() {
        {
            Radio radio = new Radio();

            radio.prevStation(0);

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

            radio.prevStation(5);

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

            radio.upVolume(10);

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

            radio.upVolume(6);

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

            radio.downVolume(0);

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

            radio.downVolume(6);

            int expected = 5;
            int actual = radio.getCurrentVolume();

            Assertions.assertEquals(expected, actual);
        }
    }
}
