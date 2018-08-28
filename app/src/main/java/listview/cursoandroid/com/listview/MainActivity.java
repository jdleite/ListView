package listview.cursoandroid.com.listview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ListView listView;
    private String[] itens = {"São Paulo","Minas","Alagoas","Sergipe","Manaus","Amapa","Roraima","Santa Catarina","Rio"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lstId);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_list_item_1,android.R.id.text1,itens);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                int cdPos = position;
                String vlClica = listView.getItemAtPosition(cdPos).toString();
                Toast.makeText(getApplicationContext(),vlClica,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
