package com.example.dearapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{
    TextView textView;
    Button nikhil,gaurav,ankit,sharma,vishwajeet,rajat,satyam,deepak,kartavya,rakesh,daddy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        textView = (TextView)findViewById(R.id.textView);
        nikhil= (Button)findViewById(R.id.nikhil);
        gaurav = (Button)findViewById(R.id.gaurav);
        ankit = (Button)findViewById(R.id.ankit);
        sharma = (Button)findViewById(R.id.sharma);
        vishwajeet = (Button)findViewById(R.id.vishwajeet);
        rajat= (Button)findViewById(R.id.rajat);
        satyam= (Button)findViewById(R.id.satyam);
        deepak= (Button)findViewById(R.id.deepak);
        kartavya= (Button)findViewById(R.id.kartavya);
        rakesh= (Button)findViewById(R.id.rakesh);
        daddy= (Button)findViewById(R.id.daddy);


        nikhil.setOnClickListener(this);
        gaurav.setOnClickListener(this);
        ankit.setOnClickListener(this);
        sharma.setOnClickListener(this);
        vishwajeet.setOnClickListener(this);
        rajat.setOnClickListener(this);
        satyam.setOnClickListener(this);
        deepak.setOnClickListener(this);
        kartavya.setOnClickListener(this);
        rakesh.setOnClickListener(this);
        daddy.setOnClickListener(this);


        Toast.makeText(this,"Landed on Main3Activity",Toast.LENGTH_SHORT).show();

        Log.d("tag","In onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","In onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","In onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","In onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","In onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag","In onDestroy");
    }

    @Override
    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.nikhil:

                Intent intent2 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:6205088326"));
                startActivity(intent2);
                break;
            case R.id.gaurav:

                Intent intent3 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8009341247"));
                startActivity(intent3);
                break;
            case R.id.ankit:
                Intent intent4 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7366883760"));
                startActivity(intent4);
                break;

            case R.id.sharma:
                Intent intent5 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8209581858"));
                startActivity(intent5);
                break;
            case R.id.vishwajeet:
                Intent intent6 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9546246689"));
                startActivity(intent6);
                break;
            case R.id.rajat:
                Intent intent11 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:6204069692"));
                startActivity(intent11);
                break;
            case R.id.satyam:
                Intent intent12 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7004436061"));
                startActivity(intent12);
                break;
            case R.id.deepak:
                Intent intent13 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8528322954"));
                startActivity(intent13);
                break;
            case R.id.kartavya:
                Intent intent14 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7238010723"));
                startActivity(intent14);
                break;
            case R.id.rakesh:
                Intent intent15 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9953972508"));
                startActivity(intent15);
                break;
            case R.id.daddy:
                Intent intent16 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:7549894480"));
                startActivity(intent16);
                break;

        }

    }
}
