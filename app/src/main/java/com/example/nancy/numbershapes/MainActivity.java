package com.example.nancy.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

//    public Boolean isTriangular(int number){
//        int triNumber=1;
//        for (int i=1; i * (i+1)/2<=number; i++){
//            triNumber=i * (i+1)/2;
//            System.out.println(triNumber);
//
//            if(triNumber==number){
//                System.out.println("this is a tri no");
//                return true;
//            }
//
//        }
//        return false;
//    }
    int number;

    public Boolean isTriangular(int number){
        this.number=number;
        int i=1;
        int triNumber=1;
        while (triNumber<number){
            // triangular number = n* (n+1)/2
            // 1*(1+1)/2 = 1
            // 2*(2+1)/2 = 3
            triNumber=i * (i+1)/2;
            i++;
        }
        // The above loop create a series of triangular numbers. And here we compare whether the inpur number is
        // equal to one of the triangular number. If does, then return true
        if (triNumber ==number){
            return true;
        }else{
            return false;
        }
    }

    public Boolean isSquare(int number){
        this.number=number;
        // Math.sqrt returns the square root. since the square root of the number can be a non integer, it returns a double
        Double squareRoot = Math.sqrt(number);

        // Math.floor returns the rounded-down int of the double. The variable could have an int or double value,
        // but math.floor always has an int value, so if the variable is equal to Math.floor(variable),
        // then it must have an int value. If the number's square root is int, it means the number is a square no.
        //  i.e 25's root is 5, so 25 is a square no. 20's root is not an int, so it's not a square no.
        if(squareRoot == Math.floor(squareRoot)){
            return true;
        }else{
            return false;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
