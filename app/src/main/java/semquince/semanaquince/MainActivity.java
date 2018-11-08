package semquince.semanaquince;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    FirebaseDatabase db;
    DatabaseReference dr;

    Button btnGerman, btnSergio, btnGustavo, btnHumberto, btnIvan;
    TextView tvGerman, tvSergio, tvGustavo, tvHumberto, tvIvan, tvVotos;
    int german, sergio, gustavo, humberto, ivan, votos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = FirebaseDatabase.getInstance();
        dr = db.getReference();

        btnGerman = findViewById(R.id.btn_german);
        btnGustavo = findViewById(R.id.btn_gustavo);
        btnSergio = findViewById(R.id.btn_sergio);
        btnHumberto = findViewById(R.id.btn_huberto);
        btnIvan = findViewById(R.id.btn_ivan);

        tvGerman = findViewById(R.id.tv_german);
        tvGustavo = findViewById(R.id.tv_gustavo);
        tvSergio = findViewById(R.id.tv_sergio);
        tvHumberto = findViewById(R.id.tv_humberto);
        tvIvan = findViewById(R.id.tv_ivan);
        tvVotos = findViewById(R.id.tv_votos);

        btnGerman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                german += 1;
                votos += 1;



                tvGerman.setText(german+"votos");
            }
        });

        btnGustavo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gustavo += 1;
                votos += 1;

                tvGustavo.setText(gustavo+"votos");
            }
        });

        btnSergio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sergio += 1;
                votos += 1;
            }
        });

        btnHumberto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                humberto += 1;
                votos += 1;
            }
        });

        btnIvan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ivan += 1;
                votos += 1;
            }
        });

        tvVotos.setText("Votos: "+votos);
    }
}
