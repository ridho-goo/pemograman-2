/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Asus A408
 */
public class Samsung implements Phone {

    private int volume = 50;
    private boolean isPowerOn = false;

    public void powerOn() {
        isPowerOn = true;
        System.out.println("Samsung menyala...");
    }

    public void powerOff() {
        isPowerOn = false;
        System.out.println("Samsung mati...");
    }

    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
            }
            System.out.println("Volume Samsung: " + volume);
        } else {
            System.out.println("Hidupkan dulu Samsung-nya!");
        }
    }

    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
            }
            System.out.println("Volume Samsung: " + volume);
        } else {
            System.out.println("Hidupkan dulu Samsung-nya!");
        }
    }

    public int getVolume() {
        return volume;
    }
}
