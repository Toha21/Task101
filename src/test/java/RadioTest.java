import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test

    public void nextLastStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void nextExceedsStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void nextStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.next();

        int actual = radio.getCurrentStation();
        int expected = 8;
        assertEquals(actual, expected);
    }

    @Test
    public void prevToLastTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(actual, expected);
    }

    @Test
    public void negativeStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 9;
        assertEquals(actual, expected);
    }

    @Test
    public void prevStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(2);
        radio.prev();

        int actual = radio.getCurrentStation();
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test

    public void increaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(actual, expected);
    }

    @Test
    public void decreaseVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void maxVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;
        assertEquals(actual, expected);
    }

    @Test
    public void exceedingTheMaxVolumeTest2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);

        radio.increaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void negativeVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        radio.decreaseVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;
        assertEquals(actual, expected);
    }

}
