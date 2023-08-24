package chap08;

import chap07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이"; //public
        b1.getResolution(); //default (같은 패키지)
        b1.getPrice(); //private
        b1.getColor(); //protected

    }
}
