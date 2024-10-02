package com.example.zadaniamob5idalej;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    CheckBox checkboxDelivery, checkboxGiftWrap, checkboxInsurance;
    TextView totalCost;


    final int dostawa = 20;
    final int opakowanie = 10;
    final int ubez = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        checkboxDelivery = findViewById(R.id.checkbox_delivery);
        checkboxGiftWrap = findViewById(R.id.checkbox_gift_wrap);
        checkboxInsurance = findViewById(R.id.checkbox_insurance);
        totalCost = findViewById(R.id.total_cost);


        checkboxDelivery.setOnCheckedChangeListener((buttonView, isChecked) -> obliczwartosc());
        checkboxGiftWrap.setOnCheckedChangeListener((buttonView, isChecked) -> obliczwartosc());
        checkboxInsurance.setOnCheckedChangeListener((buttonView, isChecked) -> obliczwartosc());
    }


    private void obliczwartosc() {
        int wartosc = 0;


        if (checkboxDelivery.isChecked()) {
            wartosc += dostawa;
        }
        if (checkboxGiftWrap.isChecked()) {
            wartosc += opakowanie;
        }
        if (checkboxInsurance.isChecked()) {
            wartosc += ubez;
        }


        totalCost.setText("Suma: " + wartosc + " zł");
    }
}
