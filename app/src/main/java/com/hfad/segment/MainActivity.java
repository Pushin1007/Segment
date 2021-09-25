package com.hfad.segment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateSegments(View view) {


    }
}
//public class Segment_Calculator {
//    public static void main(String[] args) {
//        double a = 30 * (3.14 / 180);
//        double r = 50;
//        double b = 10;
//
//        segment(30, 100, 10);
//        segment(30, 150, 10);
//
//    }
//
//    public static void segment(double a, double d, double b) {
//        double l;
//        double h;
//        double r = d / 2;
//        System.out.printf("Количесто сегментов = %.0f \nДиаметр кольца = %.1fмм \nТолщина кольца = %.1fмм \n ", (360 / a), d, b);
//        a = a * (Math.PI / 180);
//        l = 2 * Math.tan(a / 2) * r;
//        System.out.printf("Длина сегмента = %.1fмм \n ", l);
//        h = r - (r - b) * Math.cos(a / 2);
//        System.out.printf("Высота сегмента = %.1fмм \n ", h);
//        System.out.println();
//    }
//
//
//}