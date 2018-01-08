package id.co.djoendhie.project_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //data type
    String namaFirst = "Uda";
    String namaLast = "Ihsan";

    // declare wdget

    TextView txtWelcome;
    EditText etName, etSch;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.print("Full name : " + namaFirst + namaLast);
        //mangll
        txtWelcome = (TextView) findViewById(R.id.txtWelcome);
        etName = (EditText) findViewById(R.id.etName);
        etSch = (EditText) findViewById(R.id.etSch);
        button = (Button) findViewById(R.id.button);

        // axse btn submet
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                // ngambl nla dar et et td
                String nNama = etName.getText().toString();
                String nSchool = etSch.getText().toString();

                // menamplxan hasl x txt vew
                txtWelcome.setText("Hallo , " + nNama + " " + nSchool);

            }
        });

        //nample
//        txtWelcome.setText("Hy, " + namaFirst + " " + namaLast);

    }
}