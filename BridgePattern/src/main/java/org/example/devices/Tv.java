package org.example.devices;

public class Tv implements Device {
    private boolean status = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return this.status;
    }

    @Override
    public void enable() {
        this.status = true;
    }

    @Override
    public void disable() {
        this.status = false;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent >= 100) {
            this.volume = 100;
        } else if (percent <= 0) {
            this.volume = 0;
        } else {
            this.volume = percent;
        }
    }

    @Override
    public int getChannel() {
        return this.channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("---------");
        System.out.println("i am tv.");
        System.out.println("i am " + (status ? "enabled" : "disabled"));
        System.out.println("current volume is " + this.volume);
        System.out.println("current channel is " + this.channel);
        System.out.println("---------");
    }
}
