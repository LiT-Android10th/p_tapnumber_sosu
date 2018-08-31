package com.example.mizuki.kikazei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    int seikai;
    TextView textView;
    Random rand = new Random();
    String number;

    int[] sosu = {1009, 1013, 1019, 1021, 1031, 1039, 1049, 1051, 1061, 1063, 1069, 1087, 1091, 1093, 1097, 1103, 1109, 1117, 1123, 1129, 1151, 1153, 1163, 1171, 1181, 1187, 1193, 1201, 1213, 1217, 1223, 1229, 1231, 1237, 1249, 1259, 1277, 1279, 1283, 1289, 1291, 1297, 1301, 1303, 1307, 1319, 1321, 1327, 1361, 1367, 1373, 1381, 1399, 1409, 1423, 1427};

    int[] hairetu = new int[4];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);

        start();
    }

    public void start() {

        int randomNumber = rand.nextInt(56);
        int number = sosu[randomNumber];
        this.number = String.valueOf(number);
        textView.setText(String.valueOf(number));

        hairetu[3] = number % 10;
        number = number / 10;

        hairetu[2] = number % 10;
        number = number / 10;

        hairetu[1] = number % 10;
        number = number / 10;
        hairetu[0] = number % 10;

        seikai = 0;
    }

    public void number1(View v) {
        if (hairetu[seikai] == 1) {
            number = number.substring(1);
            textView.setText(String.valueOf(number));
            seikai = seikai + 1;

            if (seikai == 4) {
                start();
            }
        } else {
            Toast.makeText(this, "数字が違うよ！！", Toast.LENGTH_SHORT).show();
        }
    }

    public void number2(View v) {

        if (hairetu[seikai] == 2) {
            number = number.substring(1);
            textView.setText((String.valueOf(number)));
            seikai = seikai + 1;

            if (seikai == 4) {
                start();
            }
        } else {
            Toast.makeText(this, "数字が違うよ！！", Toast.LENGTH_SHORT).show();
        }

    }

    public void number3(View v) {


        if (hairetu[seikai] == 3) {
            number = number.substring(1);
            textView.setText((String.valueOf(number)));
            seikai = seikai + 1;

            if (seikai == 4) {
                start();
            }
        } else {
            Toast.makeText(this, "数字が違うよ！！", Toast.LENGTH_SHORT).show();
        }

    }

    public void number4(View v) {

        if (hairetu[seikai] == 4) {
            number = number.substring(1);
            textView.setText((String.valueOf(number)));
            seikai = seikai + 1;

            if (seikai == 4) {
                start();
            }
        } else {
            Toast.makeText(this, "数字が違うよ！！", Toast.LENGTH_SHORT).show();
        }
    }

    public void number5(View v) {

        if (hairetu[seikai] == 5) {
            number = number.substring(1);
            textView.setText((String.valueOf(number)));
            seikai = seikai + 1;

            if (seikai == 4) {
                start();
            }
        } else {
            Toast.makeText(this, "数字が違うよ！！", Toast.LENGTH_SHORT).show();
        }

    }

    public void number6(View v) {

        if (hairetu[seikai] == 6) {
            number = number.substring(1);
            textView.setText((String.valueOf(number)));
            seikai = seikai + 1;

            if (seikai == 4) {
                start();
            }
        } else {
            Toast.makeText(this, "数字が違うよ！！", Toast.LENGTH_SHORT).show();
        }

    }

    public void number7(View v) {

        if (hairetu[seikai] == 7) {
            number = number.substring(1);
            textView.setText((String.valueOf(number)));
            seikai = seikai + 1;

            if (seikai == 4) {
                start();
            }
        } else {
            Toast.makeText(this, "数字が違うよ！！", Toast.LENGTH_SHORT).show();
        }

    }

    public void number8(View v) {

        if (hairetu[seikai] == 8) {
            number = number.substring(1);
            textView.setText((String.valueOf(number)));
            seikai = seikai + 1;

            if (seikai == 4) {
                start();
            }
        } else {
            Toast.makeText(this, "数字が違うよ！！", Toast.LENGTH_SHORT).show();
        }

    }

    public void number9(View v) {

        if (hairetu[seikai] == 9) {
            number = number.substring(1);
            textView.setText((String.valueOf(number)));
            seikai = seikai + 1;

            if (seikai == 4) {
                start();
            }
        } else {
            Toast.makeText(this, "数字が違うよ！！", Toast.LENGTH_SHORT).show();
        }

    }

    public void number0(View v) {

        if (hairetu[seikai] == 0) {
            number = number.substring(1);
            textView.setText((String.valueOf(number)));
            seikai = seikai + 1;

            if (seikai == 4) {
                start();
            }
        } else {
            Toast.makeText(this, "数字が違うよ！！", Toast.LENGTH_SHORT).show();
        }

    }

}

