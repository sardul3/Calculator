package p.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private Button add;
    private Button sub;
    private Button divide;
    private Button clearScreen;
    private Button multiply;
    private TextView result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.editText);
        num2 = (EditText) findViewById(R.id.editText2);
        add = (Button) findViewById(R.id.button6);
        sub = (Button) findViewById(R.id.button7);
        divide = (Button) findViewById(R.id.button8);
        multiply = (Button) findViewById(R.id.button10);
        clearScreen = (Button) findViewById(R.id.button13);
        result = (TextView) findViewById(R.id.textView2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(num1.getText().length()>0 && (num2.getText().length()>0)){
                    double first = Double.parseDouble(num1.getText().toString());
                    double second = Double.parseDouble(num2.getText().toString());
                    double value = first + second;
                    result.setText(Double.toString(value));
                }
                else
                    Toast.makeText(MainActivity.this, "Please enter valid inputs", Toast.LENGTH_LONG).show();

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().length() > 0 && (num2.getText().length() > 0)) {
                    double first = Double.parseDouble(num1.getText().toString());
                    double second = Double.parseDouble(num2.getText().toString());
                    double value = first - second;
                    result.setText(Double.toString(value));
                }
                else
                    Toast.makeText(MainActivity.this, "Please enter valid inputs", Toast.LENGTH_LONG).show();
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().length() > 0 && (num2.getText().length() > 0)) {
                    double first = Double.parseDouble(num1.getText().toString());
                    double second = Double.parseDouble(num2.getText().toString());
                    double value = first / second;
                    result.setText(Double.toString(value));
                }
                else
                    Toast.makeText(MainActivity.this, "Please enter valid inputs", Toast.LENGTH_LONG).show();
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num1.getText().length() > 0 && (num2.getText().length() > 0)) {
                    double first = Double.parseDouble(num1.getText().toString());
                    double second = Double.parseDouble(num2.getText().toString());
                    double value = first * second;
                    result.setText(Double.toString(value));
                }
                else
                    Toast.makeText(MainActivity.this, "Please enter valid inputs", Toast.LENGTH_LONG).show();
            }

        });

        clearScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1.setText("");
                num2.setText("");
                result.setText("0.00");
                num1.requestFocus();
            }
        });


    }
}
