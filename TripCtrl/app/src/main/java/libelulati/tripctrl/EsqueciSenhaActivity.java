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
import android.widget.RadioButton;

public class EsqueciSenhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci_senha);

        RadioButton es_enviarsms = (RadioButton)findViewById(R.id.rb_es_enviarsms);
        RadioButton es_enviaremail = (RadioButton)findViewById(R.id.rb_es_enviaremail);
        RadioButton es_enviarcodusuario = (RadioButton)findViewById(R.id.rb_es_codusuario);

        Button es_enviar = (Button)findViewById(R.id.bt_es_enviar);

        final EditText es_telefone = (EditText)findViewById(R.id.ed_es_telefone);
        final EditText es_email = (EditText)findViewById(R.id.ed_es_email);
        final EditText es_codusuario = (EditText)findViewById(R.id.ed_es_codusuario);

        es_telefone.setEnabled(false);
        es_email.setEnabled(false);
        es_codusuario.setEnabled(false);

        es_enviarsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                es_telefone.setEnabled(true);
                es_email.setEnabled(false);
                es_codusuario.setEnabled(false);

                es_telefone.requestFocus();
            }
        });

        es_enviaremail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                es_telefone.setEnabled(false);
                es_email.setEnabled(true);
                es_codusuario.setEnabled(false);

                es_email.requestFocus();
            }
        });

        es_enviarcodusuario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                es_telefone.setEnabled(false);
                es_email.setEnabled(false);
                es_codusuario.setEnabled(true);

                es_codusuario.requestFocus();
            }
        });

        es_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it_es_enviar = new Intent(EsqueciSenhaActivity.this, NovaSenhaActivity.class);
                startActivity(it_es_enviar);
            }
        });
    }

}
