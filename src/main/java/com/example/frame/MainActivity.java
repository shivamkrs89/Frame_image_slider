package com.example.frame;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity<images> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

int i=0;

 public int[] setimages = {
         R.drawable.grid,
            R.drawable.o,
            R.drawable.x
 }   ;


    public void ntap(View v)
    {
        i++;
        if(i>2)
            Toast.makeText(this,"No next images found",Toast.LENGTH_SHORT).show();

else {
            ImageView img = (ImageView) findViewById(R.id.imgs);
            img.setImageResource(setimages[i]);
        }

    }
    public void ptap(View v)
    {
        i--;
        if(i<0)
            Toast.makeText(this,"No previous images found",Toast.LENGTH_SHORT).show();
        else {
            ImageView img = (ImageView) findViewById(R.id.imgs);
            img.setImageResource(setimages[i]);
        }
    }








}
