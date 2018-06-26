package quickstart.kotlin.chapter4;

import java.awt.*;

public class LambdasJava {
    public void setClickListener() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.print("Clicked on: " + v.toString());
            }
        });
    }
}
