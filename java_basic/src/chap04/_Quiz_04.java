package chap04;

import javax.swing.text.StyledEditorKit;

public class _Quiz_04 {
    public static void main(String[] args) {
        int fee = 0;
        int time = 10;
        boolean small = true;
        boolean disabled = false;

        for (int i = 0; i < time ; i++) {
            fee += 4000;
            if(fee >= 30000){
                fee = 30000;
                if (small || disabled) {
                    fee /= 2;
                }
                break;
            }
        }

        System.out.println(fee);

    }
}
