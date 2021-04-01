package com.example.mvp_sederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.example.mvp_sederhana.Presenter.MainPresenterImp;
import com.example.mvp_sederhana.Presenter.MainView;

    public class MainActivity extends AppCompatActivity implements MainView {
    private EditText edtAlas,edtTinggi,edtPanjang,edtLebar;
    private Button btnHitungluas,btnHitungkeliling;
    private TextView tvHasilluas,tvHasilkeliling;
    private MainPresenterImp presenterImp;




        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtAlas = findViewById(R.id.edt_alas);
        edtTinggi = findViewById(R.id.edt_tinggi);
        edtLebar = findViewById(R.id.edt_Lebar);
        edtPanjang = findViewById(R.id.edt_panjang);
        btnHitungluas = findViewById(R.id.btn_hitung_luas);
        btnHitungkeliling = findViewById(R.id.btn_hitung_keliling);
        tvHasilluas = findViewById(R.id.tv_hasilLuas);
        tvHasilkeliling = findViewById(R.id.tv_hasilKeliling);

        initPresenter();


        btnHitungluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Double alas = Double.valueOf(edtAlas.getText().toString());
            Double tinggi =Double.valueOf(edtTinggi.getText().toString());
            presenterImp.hitungLuas(alas,tinggi);

            }
        });

        btnHitungkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double panjang = Double.valueOf(edtPanjang.getText().toString());
                Double lebar = Double.valueOf(edtLebar.getText().toString());
                presenterImp.hitungKeliling(panjang,lebar);
            }
        });


    }

        private void initPresenter() { presenterImp = new MainPresenterImp(this); }

        @Override
        public void UpdateTextHasilluas(Double luas) {tvHasilluas.setText(luas.toString()); }

        @Override
        public void UpdateTextHasilkeliling(Double keliling) { tvHasilkeliling.setText(keliling.toString()); }
    }