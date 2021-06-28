package android.homework.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

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
        String a = (String) textView.getText();
        switch (v.getId()){
            case R.id.buttonDel:
                if (a.length() > 0)
                textView.setText(a.substring(0, a.length() - 1));
                break;
            case R.id.buttonCE:
                textView.setText("");
                break;
            case R.id.buttonC:
                textView.setText("");
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
                textView.setText(a + "/");
                break;
            case R.id.buttonMultiply:
                textView.setText(a + "*");
                break;
            case R.id.buttonMinus:
                textView.setText(a + "-");
                break;
            case R.id.buttonPlus:
                textView.setText(a + "+");
                break;
            case R.id.buttonNegativePositive:
                Toast.makeText(getApplicationContext(),"Пока не придумал как", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buttonPoint:
                textView.setText(a + ".");
                break;
            case R.id.buttonEqually:
                textView.setText("Все посчитано\n=)");
                break;
        }
    }
}