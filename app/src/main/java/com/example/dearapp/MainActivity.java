package com.example.dearapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView textView;
    Button dialNumber,toast,showLocation,openWebPage,viewIntent,letsGetPro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView);
        dialNumber= (Button)findViewById(R.id.dialNumber);
        toast = (Button)findViewById(R.id.toast);
        showLocation = (Button)findViewById(R.id.showLocation);
        openWebPage = (Button)findViewById(R.id.openWebPage);
        viewIntent = (Button)findViewById(R.id.viewIntent);
        letsGetPro = (Button)findViewById(R.id.letsGetPro);

        dialNumber.setOnClickListener(this);
        toast.setOnClickListener(this);
        showLocation.setOnClickListener(this);
        openWebPage.setOnClickListener(this);
        viewIntent.setOnClickListener(this);
        letsGetPro.setOnClickListener(this);


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
// Better approach
    @Override
    public void onClick(View v){
        switch (v.getId())
        {
            case R.id.dialNumber:
                try{
                Intent intent = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(intent);}
                catch(Exception e){
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();}

                break;
            case R.id.toast:
                try{
                Intent intent1 = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent1);}
                catch(Exception e){
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();}
                break;
            case R.id.showLocation:
                try{
                Intent intent8 = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:25.6189921,85.1749185,17z"));
                startActivity(intent8);}
                catch(Exception e){
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();}
                break;

            case R.id.openWebPage:
                try{
                Intent intent9 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://facebook.com/"));
                startActivity(intent9);}
                catch(Exception e){
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();}
                break;

            case R.id.viewIntent:
                try{
                Intent intent10 = new Intent(Intent.ACTION_VIEW);
                startActivity(intent10);}
                catch(Exception e){
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();}
                break;

            case R.id.letsGetPro:
                try{
                Intent intent17 = new Intent(Intent.ACTION_VIEW,Uri.parse("http://Instagram.com/"));
                startActivity(intent17);}
                catch(Exception e){
                    Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show();}
                break;
        }

    }
}
