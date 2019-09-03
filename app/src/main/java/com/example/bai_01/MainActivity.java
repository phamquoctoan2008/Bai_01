package com.example.bai_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText edt_soa, edt_sob;
    TextView txtView_ketqua;
    Button btn_tong, btn_hieu, btn_tich, btn_thuong, btn_ucln,btn_thoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_soa = findViewById(R.id.edittext_soa);
        edt_sob = findViewById(R.id.edittext_sob);
        txtView_ketqua = findViewById(R.id.textview_ketqua);
        btn_tong = findViewById(R.id.button_tong);
        btn_hieu = findViewById(R.id.button_hieu);
        btn_tich = findViewById(R.id.button_tich);
        btn_thuong = findViewById(R.id.button_thuong);
        btn_ucln = findViewById(R.id.button_ucln);
        btn_thoat = findViewById(R.id.button_thoat);

        btn_thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btn_tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(edt_soa.getText().toString());
                float b = Float.parseFloat(edt_sob.getText().toString());
                tinh t = new tinh();
                float data= t.Tong(a,b);
                txtView_ketqua.setText(""+data);
            }
        });

        btn_hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(edt_soa.getText().toString());
                float b = Float.parseFloat(edt_sob.getText().toString());
                tinh t = new tinh();
                float data = t.Hieu(a,b);
                txtView_ketqua.setText(""+data);
            }
        });

        btn_tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(edt_soa.getText().toString());
                float b = Float.parseFloat(edt_sob.getText().toString());
                tinh t = new tinh();
                float data = t.Tich(a,b);
                txtView_ketqua.setText(""+data);
            }
        });

        btn_thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(edt_soa.getText().toString());
                float b = Float.parseFloat(edt_sob.getText().toString());
                tinh t = new tinh();
                float data = t.Thuong(a,b);
                txtView_ketqua.setText(""+data);
            }
        });

        btn_ucln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float a = Float.parseFloat(edt_soa.getText().toString());
                float b = Float.parseFloat(edt_sob.getText().toString());
                tinh t = new tinh();
                float data = t.Ucln(a,b);
                txtView_ketqua.setText(""+data);
            }
        });
    }
}
