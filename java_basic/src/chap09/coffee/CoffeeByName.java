package chap09.coffee;

import javax.naming.spi.ObjectFactory;
import javax.sound.midi.VoiceStatus;

public class CoffeeByName {
    public Object name;

    public CoffeeByName(Object name) {
        this.name = name;
    }

    public void ready(){
        System.out.println("커피 준비 완료 : " + name);
    }
}
