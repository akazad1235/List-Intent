package com.example.akazad.countryprofile;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    private Button bangladeshButton, pakistanButton, indiaButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshButton=findViewById(R.id.bangladeshId);
        pakistanButton=findViewById(R.id.pakistanId);
        indiaButton=findViewById(R.id.indiaId);

        bangladeshButton.setOnClickListener(this);
        pakistanButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.bangladeshId){

            Intent intent=new Intent(this, ProfileDetails.class);
            intent.putExtra("name", "bangladesh");
            startActivity(intent);
        }
        if (v.getId()==R.id.pakistanId){

            Intent intent=new Intent(this, ProfileDetails.class);
            intent.putExtra("name", "pakistan");
            startActivity(intent);
        }
        if (v.getId()==R.id.indiaId){

            Intent intent=new Intent(this, ProfileDetails.class);
            intent.putExtra("name", "india");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBulder;
        alertDialogBulder=new AlertDialog.Builder(MainActivity.this);
        alertDialogBulder.setIcon(R.drawable.warning);
        alertDialogBulder.setTitle(R.string.title);
        alertDialogBulder.setMessage(R.string.massge_text);
        alertDialogBulder.setCancelable(false);
        alertDialogBulder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });
        alertDialogBulder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                dialog.cancel();
            }
        });
                AlertDialog alertDialog=alertDialogBulder.create();
                alertDialog.show();
    }
}
