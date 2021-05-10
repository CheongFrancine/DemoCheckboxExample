package sg.edu.rp.c346.id20020509.democheckboxexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled = findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textView);

        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MainActivity", "Inside onClick");
                Toast.makeText(MainActivity.this,
                        "Are you happy?",
                        Toast.LENGTH_LONG).show();
                if(cbEnabled.isChecked()) {
                    double pay = calcPay(100,20);
                    tvShow.setText("Discount given, pay " + pay);
                }
                else {
                    double pay = calcPay(100,0);
                    tvShow.setText("No discount, pay " + pay);
                }


            }
        });


    }

    private double calcPay(double price, double discount) {
        return price * (1 - discount/100);
    }

}