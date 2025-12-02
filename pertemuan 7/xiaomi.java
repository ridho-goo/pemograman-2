/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan7;

/**
 *
 * @author Asus A408
 */
public class xiaomi implements Phone {

    private int volume = 50;
    private boolean isPowerOn = false;

    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi menyala...");
    }

    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi mati...");
    }

    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
            }
            System.out.println("Volume Xiaomi: " + volume);
        } else {
            System.out.println("Hidupkan dulu HP-nya!");
        }
    }

    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
            }
            System.out.println("Volume Xiaomi: " + volume);
        } else {
            System.out.println("Hidupkan dulu HP-nya!");
        }
    }

    public int getVolume() {
        return volume;
    }
}