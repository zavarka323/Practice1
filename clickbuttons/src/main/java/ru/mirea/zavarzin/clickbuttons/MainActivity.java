package ru.mirea.zavarzin.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button buttonOK;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut=(TextView) findViewById(R.id.tvOut);
        buttonOK=(Button) findViewById(R.id.btnOk);
        buttonCancel=(Button) findViewById(R.id.btnCancel);
        /* ПЕРВЫЙ СПОСОБ
        View.OnClickListener oclBtnOk=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Pressed OK");
            }
        };
        buttonOK.setOnClickListener(oclBtnOk);
         View.OnClickListener oclBtnCancel=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOut.setText("Pressed Cancel");
            }
        };
        buttonCancel.setOnClickListener(oclBtnCancel);
        */

    }
    //ВТОРОЙ СПОСОБ
    public void btnOkClicked(View view)
    {
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
        tvOut.setText("Pressed OK");
    }
    public void  btnCancelClicked(View view)
    {
        Toast.makeText(this, "Ещё один способ!", Toast.LENGTH_SHORT).show();
        tvOut.setText("Pressed CANCEL");
    }
}
