package com.example.persegipanjang;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements OnClickListener{
    TextView panjang;
    TextView lebar;
    TextView luas;
    TextView keliling ;
    RadioButton dtor;
    RadioButton rtod;
    Button count;


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.desain);

        panjang = (TextView)this.findViewById(R.id.panjang);
        lebar = (TextView)this.findViewById(R.id.lebar);
        keliling = (TextView)this.findViewById(R.id.keliling);
        luas = (TextView)this.findViewById(R.id.luas);

        dtor = (RadioButton)this.findViewById(R.id.dtor);
        dtor.setChecked(true);
        rtod = (RadioButton)this.findViewById(R.id.rtod);

        count = (Button)this.findViewById(R.id.count);
        count.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (dtor.isChecked()){
            convertToLuas();}
        if (rtod.isChecked()){
            convertToKeliling();}
    }

    protected void convertToLuas() {
        double val= Double.parseDouble(panjang.getText().toString());
        double val1= Double.parseDouble(lebar.getText().toString());
        luas.setText(Double.toString(val*val1));
    }

    protected void convertToKeliling() {
        double val= Double.parseDouble(panjang.getText().toString());
        double val1= Double.parseDouble(lebar.getText().toString());
        keliling.setText(Double.toString(2*val+2*val1));
    }

}
