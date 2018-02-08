package com.example.nancy.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.nancy.numbershapes.NumberShape;



public class MainActivity extends AppCompatActivity {
    EditText mUserNumber;
    Button mGetShape;

   public void getShape(View view){

       String message = "";

       //Don't need the below if statement since now user can't click the button without entering something
//       if(userNumber.getText().toString().isEmpty()){
//           message = "Please enter a number";
//       }
//       else {

           NumberShape myNumber = new NumberShape();
           myNumber.number = Integer.parseInt(mUserNumber.getText().toString());
           Boolean isTriangular = myNumber.isTriangular(myNumber.number);
           Boolean isSquare = myNumber.isSquare(myNumber.number);

           if (isTriangular & isSquare) {
               message = myNumber.number + " is both Triangular and Square";
           } else if (isTriangular & !isSquare) {
               message = myNumber.number + " is Triangular";
           } else if (!isTriangular & isSquare) {
               message = myNumber.number + " is Square";
           } else {
              message = " is neither Triangular nor Square";
           }


       Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();

   }

    public void addTextChangeListener(EditText inputField, final Button btn){
        inputField.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if(s.toString().equals("")){
                    btn.setEnabled(false);
                } else {
                    btn.setEnabled(true);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

            }

        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mUserNumber =(EditText)findViewById(R.id.numberInput);
        mGetShape = (Button)findViewById(R.id.getShape);
        mGetShape.setEnabled(false);
        addTextChangeListener(mUserNumber,mGetShape);

    }
}
