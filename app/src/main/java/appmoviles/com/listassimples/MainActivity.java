package appmoviles.com.listassimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText nombreET;
    private Button agregarBtn;
    private ListView listaNombres;

    private ArrayAdapter<String> adapter;
    private ArrayList<String> nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreET = findViewById(R.id.nombreET);
        agregarBtn = findViewById(R.id.agregarBtn);
        listaNombres = findViewById(R.id.listaNombres);

        nombres = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nombres);
        listaNombres.setAdapter(adapter);

        agregarBtn.setOnClickListener(
                (v)->{
                    String nombre = nombreET.getText().toString();
                    nombres.add(nombre);
                    adapter.notifyDataSetChanged();
                }
        );
    }
}
