package com.example.bai_01;

public class tinh {
    float tong, hieu, tich, thuong, ucln;

    public float Tong (float a, float b){
        tong = a + b;
        return tong;
    }

    public float Hieu (float a, float b){
        hieu = a - b;
        return hieu;
    }

    public float Tich (float a, float b){
        tich = a * b;
        return tich;
    }

    public  float Thuong(float a, float b){
        if(b==0)
            return 0;
        else
            return thuong = a / b;
    }

    public float Ucln (float a, float b){
        if(a==0 || b == 0)
            return ucln = a + b ;
        while (a != b ){
            if(a > b)
                a -= b;
            else
                b -= a;
        }
        return ucln = a;
    }
}
