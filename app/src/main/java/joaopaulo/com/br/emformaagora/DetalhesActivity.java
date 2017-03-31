package joaopaulo.com.br.emformaagora;

import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetalhesActivity extends AppCompatActivity {
    private TextView tituloActivity;
    private ImageView imgview;
    private LinearLayout mainBG;
    String titulo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        tituloActivity = (TextView) findViewById(R.id.textoTitulo);
        imgview = (ImageView) findViewById(R.id.imgExecicio);
        mainBG = (LinearLayout) findViewById(R.id.mainBG);

        titulo = (String) getIntent().getStringExtra(MainActivity.EXTRA_EXERCICIO_TITULO);

        if (titulo.equalsIgnoreCase(MainActivity.EXERCICIO_CARDIO)){
            tituloActivity.setText(titulo);
            imgview.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.heart));
            mainBG.setBackgroundColor(Color.parseColor("#FF6E8596"));
        }else if(titulo.equalsIgnoreCase(MainActivity.EXERCICIO_PESO)){
            tituloActivity.setText(titulo);
            imgview.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.weight));
            mainBG.setBackgroundColor(Color.parseColor("#3792d6"));
        }else if(titulo.equalsIgnoreCase(MainActivity.EXERCICIO_YOGA)){
            tituloActivity.setText(titulo);
            imgview.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.lotus));
            mainBG.setBackgroundColor(Color.parseColor("#FFCC4C96"));
        }



    }
}
