package com.example.uibasic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTwo:
                //System.out.println();
                Toast.makeText(this, "Toast poruka", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnHello:
                Toast.makeText(this, "Hello Button", Toast.LENGTH_SHORT).show();
                TextView txtWelcome1 = findViewById(R.id.txtWelcome);
                txtWelcome1.setText("Hello Božo");
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //Code*********************************************
/*
    public void  onHelloBtnClick(View view) {
        TextView txtWelcome1 = findViewById(R.id.txtWelcome);
        txtWelcome1.setText("Hello Božo");
    }
*/
    //Drugi naćin*******************************************
//        Button btnTwo = findViewById(R.id.btnTwo);
//        btnTwo.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {//
//            }
//        });

        //Treći naćin*******************************************
        Button btnTwo = findViewById(R.id.btnTwo);
        btnTwo.setOnClickListener(this);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);

        btnHello.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Dugi pritisak", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

}
}