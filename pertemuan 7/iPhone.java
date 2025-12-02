/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Asus A408
 */
public class iPhone implements Phone {

    private int volume = 50;
    private boolean isPowerOn = false;

    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone menyala...");
    }

    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone mati...");
    }

    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
            }
            System.out.println("Volume iPhone: " + volume);
        } else {
            System.out.println("Hidupkan dulu iPhone-nya!");
        }
    }

    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
            }
            System.out.println("Volume iPhone: " + volume);
        } else {
            System.out.println("Hidupkan dulu iPhone-nya!");
        }
    }

    public int getVolume() {
        return volume;
    }
}

