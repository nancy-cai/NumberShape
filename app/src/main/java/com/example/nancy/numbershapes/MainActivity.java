package com.example.nancy.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nancy.numbershapes.NumberShape;



public class MainActivity extends AppCompatActivity {

   public void getShape(View view){
       EditText userNumber =(EditText)findViewById(R.id.numberInput);
       NumberShape myNumber = new NumberShape();
       myNumber.number = Integer.parseInt(userNumber.getText().toString());
       Boolean isTriangular = myNumber.isTriangular(myNumber.number);
       Boolean isSquare = myNumber.isSquare(myNumber.number);

       if(isTriangular & isSquare ){
           Toast.makeText(MainActivity.this, myNumber.number +" is both Triangular and Square", Toast.LENGTH_SHORT).show();
       }else if(isTriangular & !isSquare){
           Toast.makeText(MainActivity.this, myNumber.number +" is Triangular", Toast.LENGTH_SHORT).show();
       }else if(!isTriangular & isSquare){
           Toast.makeText(MainActivity.this, myNumber.number +" is Square", Toast.LENGTH_SHORT).show();
       }else{
           Toast.makeText(MainActivity.this, myNumber.number +" is neither Triangular or Square", Toast.LENGTH_SHORT).show();
       }

   }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
