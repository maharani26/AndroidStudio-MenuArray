package id.sch.smktelkom_mlg.www.array;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnSubmit;
    EditText editNama, editTahun;
    Spinner spKota, spProvinsi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit = findViewById(R.id.btnSubmit);
        editNama = findViewById(R.id.editNama);
        editTahun = findViewById(R.id.editTahun);
        spKota = findViewById(R.id.spKota);
        spProvinsi = findViewById(R.id.spProvinsi);
        txtHasil = findViewById(R.id.txtHasil);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editNama.getText().toString();
                int tahun = Integer.parseInt(editTahun.getText().toString());
                int usia = 2019 - tahun;
                txtHasil.setText("Nama Anda " + nama + "\n" + "Anda Berusia " + usia + "Tahun " + "\n" +
                        "Anda berasal dari Provinsi " + spProvinsi.getSelectedItem().toString() + "\n" +
                        "Kota " + spKota.getSelectedItem().toString());

            }
        });
    }
}
