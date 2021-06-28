package android.homework.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    float first = 0F;
    float second = 0F;
    int action = 0;
    int nP = 0;
    int point = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bDel = findViewById(R.id.buttonDel);
        Button bCE = findViewById(R.id.buttonCE);
        Button bC = findViewById(R.id.buttonC);
        Button b1 = findViewById(R.id.buttonOne);
        Button b2 = findViewById(R.id.buttonTwo);
        Button b3 = findViewById(R.id.buttonThree);
        Button b4 = findViewById(R.id.buttonFour);
        Button b5 = findViewById(R.id.buttonFive);
        Button b6 = findViewById(R.id.buttonSix);
        Button b7 = findViewById(R.id.buttonSeven);
        Button b8 = findViewById(R.id.buttonEight);
        Button b9 = findViewById(R.id.buttonNine);
        Button b0 = findViewById(R.id.buttonZero);
        Button bSlash = findViewById(R.id.buttonSlash);
        Button bMultiply = findViewById(R.id.buttonMultiply);
        Button bMinus = findViewById(R.id.buttonMinus);
        Button bPlus = findViewById(R.id.buttonPlus);
        Button bNegativePositive = findViewById(R.id.buttonNegativePositive);
        Button bPoint = findViewById(R.id.buttonPoint);
        Button bEqually = findViewById(R.id.buttonEqually);

        bDel.setOnClickListener(this);
        bCE.setOnClickListener(this);
        bC.setOnClickListener(this);
        bC.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        bSlash.setOnClickListener(this);
        bMultiply.setOnClickListener(this);
        bMinus.setOnClickListener(this);
        bPlus.setOnClickListener(this);
        bNegativePositive.setOnClickListener(this);
        bPoint.setOnClickListener(this);
        bEqually.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView textView = findViewById(R.id.textView);
        TextView textView2 = findViewById(R.id.textView2);
        String a = (String) textView.getText();
        String b = (String) textView2.getText();
        switch (v.getId()) {
            case R.id.buttonDel:
                if (a.length() > 0){
                    int i = a.length() - 1;
                    if (a.charAt(i) == '-'){
                        nP = 0;
                    }
                    if (a.charAt(i) == '.'){
                        point = 0;
                    }
                    textView.setText(a.substring(0, a.length() - 1));
                }
                break;
            case R.id.buttonCE:
                textView.setText("");
                action = 0;
                point = 0;
                nP = 0;
                break;
            case R.id.buttonC:
                textView.setText("");
                textView2.setText("");
                action = 0;
                point = 0;
                nP = 0;
                break;
            case R.id.buttonOne:
                textView.setText(a + "1");
                break;
            case R.id.buttonTwo:
                textView.setText(a + "2");
                break;
            case R.id.buttonThree:
                textView.setText(a + "3");
                break;
            case R.id.buttonFour:
                textView.setText(a + "4");
                break;
            case R.id.buttonFive:
                textView.setText(a + "5");
                break;
            case R.id.buttonSix:
                textView.setText(a + "6");
                break;
            case R.id.buttonSeven:
                textView.setText(a + "7");
                break;
            case R.id.buttonEight:
                textView.setText(a + "8");
                break;
            case R.id.buttonNine:
                textView.setText(a + "9");
                break;
            case R.id.buttonZero:
                textView.setText(a + "0");
                break;
            case R.id.buttonSlash:
                if (a.length() != 0) {
                    first = Float.parseFloat(a);
                    action = 1;
                    nP = 0;
                    point = 0;
                    textView2.setText(a + " / ");
                    textView.setText("");
                    break;
                } else {
                    break;
                }
            case R.id.buttonMultiply:
                if (a.length() != 0) {
                    first = Float.parseFloat(a);
                    action = 2;
                    nP = 0;
                    point = 0;
                    textView2.setText(a + " * ");
                    textView.setText("");
                    break;
                } else {
                    break;
                }
            case R.id.buttonMinus:
                if (a.length() != 0) {
                    first = Float.parseFloat(a);
                    action = 3;
                    nP = 0;
                    point = 0;
                    textView2.setText(a + " - ");
                    textView.setText("");
                    break;
                } else {
                    break;
                }
            case R.id.buttonPlus:
                if (a.length() != 0) {
                    first = Float.parseFloat(a);
                    action = 4;
                    nP = 0;
                    point = 0;
                    textView2.setText(a + " + ");
                    textView.setText("");
                    break;
                } else {
                    break;
                }
            case R.id.buttonNegativePositive:
                if (nP == 0) {
                    textView.setText("-" + a);
                    nP = 1;
                } else {
                    textView.setText(a.substring(1));
                    nP = 0;
                }
                break;
            case R.id.buttonPoint:
                if (a.length() > 0 && point == 0) {
                    if (nP != 1) {
                        textView.setText(a + ".");
                        point = 1;
                        break;
                    } else if (a.length() > 1) {
                        textView.setText(a + ".");
                        point = 1;
                        break;
                    }
                    break;
                } else {
                    break;
                }
            case R.id.buttonEqually:
                float answer = 0F;
                if (action == 0) {
                    Toast.makeText(getApplicationContext(), "Выберите действие", Toast.LENGTH_SHORT).show();
                    break;
                } else if (action == 1) {
                    if(a.length() == 0) {
                        break;
                    } else {
                        second = Float.parseFloat(a);
                        answer = first / second;
                    }
                } else if (action == 2) {
                    if(a.length() == 0) {
                        break;
                    } else {
                        second = Float.parseFloat(a);
                        answer = first * second;
                    }
                } else if (action == 3) {
                    if(a.length() == 0) {
                        break;
                    } else {
                        second = Float.parseFloat(a);
                        answer = first - second;
                    }
                } else if (action == 4) {
                    if(a.length() == 0) {
                        break;
                    } else {
                        second = Float.parseFloat(a);
                        answer = first + second;
                    }
                }
                point = 0;
                nP = 0;
                action = 0;
                textView.setText("= " + answer);
                textView2.setText(b + a);
                break;
        }
    }
}