package com.example.devise_conv;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner sp1,sp2;
    EditText ed1;
    Button bt1;
    TextView res;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.txtamount);
        sp1=findViewById(R.id.spfrom);
        sp2=findViewById(R.id.spto);
        bt1=findViewById(R.id.btn1);
        res=findViewById(R.id.res);
        String[] from = {"Usd","Mad","Euro"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);
        String[] to = {"Usd","Mad","Euro"};
        ArrayAdapter ad2 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad2);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double tot;
                Double amount=Double.parseDouble(ed1.getText().toString());
                if(sp1.getSelectedItem().toString()=="Usd" &&sp2.getSelectedItem().toString()=="Mad" ){
                    tot=amount*10.12;
                    res.setText("resultat= "+tot.toString());
                }
                else if(sp1.getSelectedItem().toString()=="Usd" &&sp2.getSelectedItem().toString()=="Usd" ){
                    tot=amount;
                   res.setText("resultat= "+tot.toString());
                }
                else if(sp1.getSelectedItem().toString()=="Usd" &&sp2.getSelectedItem().toString()=="Euro" ){
                    tot=amount*0.92;
                    res.setText("resultat= "+tot.toString());                }
                else if(sp1.getSelectedItem().toString()=="Mad" &&sp2.getSelectedItem().toString()=="Usd" ){
                    tot=amount*0.099;
                    res.setText("resultat= "+tot.toString());                }
                else if(sp1.getSelectedItem().toString()=="Mad" &&sp2.getSelectedItem().toString()=="Mad" ){
                    tot=amount;
                    res.setText("resultat= "+tot.toString());                }
                else if(sp1.getSelectedItem().toString()=="Mad" &&sp2.getSelectedItem().toString()=="Euro" ){
                    tot=amount*0.091;
                    res.setText("resultat= "+tot.toString());                }
                else if(sp1.getSelectedItem().toString()=="Euro" &&sp2.getSelectedItem().toString()=="Usd" ){
                    tot=amount*1.08;
                    res.setText("resultat= "+tot.toString());                }
                else if(sp1.getSelectedItem().toString()=="Euro" &&sp2.getSelectedItem().toString()=="Mad" ){
                    tot=amount*10.94;
                    res.setText("resultat= "+tot.toString());                }
                else if(sp1.getSelectedItem().toString()=="Euro" &&sp2.getSelectedItem().toString()=="Euro" ){
                    tot=amount;
                    res.setText("resultat= "+tot.toString());                }

            }
        });

    }
}