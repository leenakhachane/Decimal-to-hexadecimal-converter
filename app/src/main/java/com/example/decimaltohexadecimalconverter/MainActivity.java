package com.example.decimaltohexadecimalconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText input, output;
    Button submit, reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = (EditText) findViewById(R.id.editText);
        output = (EditText) findViewById(R.id.output);
        submit = (Button) findViewById(R.id.submit);

     // It is set so that when the user clicks on submit button, the data
// gets send in the function created below which will convert it and then// show the answer to the user in the output
submit.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {

// Creating a string method argument
String string = input.getText().toString();
// Here, we are parsing a string
// method argument into an integer object
int i = Integer.parseInt(string);
// Converts and stores it in the form of string
String hexadecimal = Integer.toHexString(i);
// second edit text that we created
output.setText(hexadecimal);
}
});

// Here, we will define a function which will 
// clear the whole text and reset it
reset = (Button) findViewById(R.id.reset);
reset.setOnClickListener(new View.OnClickListener() {

public void onClick(View v) {
input.setText("");
output.setText("");
}
});
    }
}