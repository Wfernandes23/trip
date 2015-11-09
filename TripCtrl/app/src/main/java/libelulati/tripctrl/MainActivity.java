package libelulati.tripctrl;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView main_novousuario = (TextView)findViewById(R.id.tx_main_novousuario);
        EditText main_email = (EditText)findViewById(R.id.ed_main_email);
        EditText main_senha = (EditText)findViewById(R.id.ed_main_senha);
        TextView main_esquecisenha = (TextView)findViewById(R.id.tx_main_esquecisenha);
        Button main_entrar = (Button)findViewById(R.id.bt_main_entrar);

        main_novousuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it_main_novousuario = new Intent(MainActivity.this, NovoUsuarioActivity.class);
                startActivity(it_main_novousuario);
            }
        });

        main_esquecisenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it_main_esquecisenha = new Intent(MainActivity.this, EsqueciSenhaActivity.class);
                startActivity(it_main_esquecisenha);
            }
        });

    }

}
