package com.hfad.segment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateSegments(View view) {

        EditText numSeg = findViewById(R.id.numSeg);
        EditText diamEdit = findViewById(R.id.diamEdit);
        EditText widthEdit = findViewById(R.id.widthEdit);


        Double a=0.0; //угол сегмента в радианах
        Double aGrad=0.0; //угол сегмента в градусах
        Double l=0.0; // длина сегмента
        Double h=0.0; //высота сегмента
        Double r= Double.parseDouble(String.valueOf(diamEdit.getText())) / 2;

        aGrad = 360/Double.parseDouble(String.valueOf(numSeg.getText()));

        a = aGrad * (Math.PI / 180);
        l = 2 * Math.tan(a / 2) * r;
        h = r - (r - Double.parseDouble(String.valueOf(widthEdit.getText()))) * Math.cos(a / 2);

        TextView angleCalc = findViewById(R.id.angleCalc);
        TextView lengthCalc = findViewById(R.id.lengthCalc);
        TextView widthCalc = findViewById(R.id.widthCalc);

        //str = new DecimalFormat("#.0#").format(d)

        angleCalc.setText(new DecimalFormat("#.0#").format(aGrad));
        lengthCalc.setText(new DecimalFormat("#.0#").format(l));
        widthCalc.setText(new DecimalFormat("#.0#").format(h));



    }
}
