package joaopaulo.com.br.emformaagora;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_EXERCICIO_TITULO = "titulo.Extra.Exercicio";
    public static final String EXERCICIO_PESO = "Levantamento de Pessos";
    public static final String EXERCICIO_YOGA = "Yoga";
    public static final String EXERCICIO_CARDIO = "Cardio";
    public Intent mensageiro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout pesobtn = (RelativeLayout) findViewById(R.id.peso);
        RelativeLayout yogabtn = (RelativeLayout) findViewById(R.id.yoga);
        RelativeLayout cardiobtn = (RelativeLayout) findViewById(R.id.cardio);

        //

        pesobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregarDetalhesAtividade(MainActivity.EXERCICIO_PESO);
            }
        });

        yogabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregarDetalhesAtividade(MainActivity.EXERCICIO_YOGA);
            }
        });

        cardiobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                carregarDetalhesAtividade(MainActivity.EXERCICIO_CARDIO);
            }
        });
    }

    public void carregarDetalhesAtividade(String nomeDaAtividade){
        mensageiro = new Intent(getApplicationContext(), DetalhesActivity.class);
        mensageiro.putExtra(MainActivity.EXTRA_EXERCICIO_TITULO,nomeDaAtividade);
        startActivity(mensageiro);
    }
}
