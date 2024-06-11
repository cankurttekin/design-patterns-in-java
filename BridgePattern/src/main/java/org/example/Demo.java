package org.example;

import org.example.devices.Device;
import org.example.devices.Radio;
import org.example.devices.Tv;
import org.example.remotes.AdvancedRemote;
import org.example.remotes.BasicRemote;
import org.example.remotes.Remote;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Bridge Pattern ...\n");
        Device myTv = new Tv();
        Device myRadio = new Radio();

        myTv.printStatus();

        BasicRemote myBasicRemote = new BasicRemote(myTv);
        AdvancedRemote myAdvancedRemote = new AdvancedRemote(myTv);
        myBasicRemote.volumeDown();
        myBasicRemote.channelDown();
        myTv.printStatus();

        myAdvancedRemote.mute();
        myTv.printStatus();

    }

}
