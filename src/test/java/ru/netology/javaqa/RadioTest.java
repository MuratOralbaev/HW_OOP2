package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.Radio;


public class RadioTest {
    @Test
    public void shouldSetRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(3);
        int expected = 3;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetOffRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(10);
        int expected = 0;
        int actual = radio.getCurrentRadiostation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldOffRadiostation() {
        Radio radio = new Radio();
        radio.setCurrentRadiostation(-3);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetNextRadiostation() {
        Radio radio = new Radio();
        radio.setNextRadiostation(0);
        int expected = 1;
        int actual = radio.getNextRadiostation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetAboveNextRadiostation() {
        Radio radio = new Radio();
        radio.setNextRadiostation(10);
        int expected = 0;
        int actual = radio.getNextRadiostation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetPrevRadiostation() {
        Radio radio = new Radio();
        radio.setPrevRadiostation(0);
        int expected = 9;
        int actual = radio.getPrevRadiostation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetUnderPrevRadiostation(){
        Radio radio = new Radio();
        radio.setPrevRadiostation(10);
        int expected = 9;
        int actual = radio.getPrevRadiostation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetOffVolume() {
        Radio radio =  new Radio();
        radio.setCurrentVolume(120);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldOffVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-2);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetIncreaseVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(45);
        int expected = 46;
        int actual = radio.getIncreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetAboveIncreaseVolume() {
        Radio radio = new Radio();
        radio.setIncreaseVolume(102);
        int expected = 0;
        int actual = radio.getIncreaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetDecreaseVolume() {
        Radio radio = new Radio();
        radio.setDecreaseVolume(67);
        int expected = 66;
        int actual = radio.getDecreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetUnderDecreaseVolume() {
        Radio radio = new Radio();
        radio.setDecreaseVolume(101);
        int expected = 0;
        int actual = radio.getDecreaseVolume();
        Assertions.assertEquals(expected, actual);
    }
}
