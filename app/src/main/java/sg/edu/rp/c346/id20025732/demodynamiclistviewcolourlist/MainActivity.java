package sg.edu.rp.c346.id20025732.demodynamiclistviewcolourlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.editTextColour);
        btn = findViewById(R.id.buttonAddItem);
        lv = findViewById(R.id.listviewColour);

        ArrayList<String> alColors;
        ArrayAdapter<String>aaColors;

        alColors = new ArrayList<>();
        alColors.add("Red");
        alColors.add("Orange");

        aaColors = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,alColors);

        lv.setAdapter(aaColors);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String colour = et.getText().toString();
                int pos = Integer.parseInt(et.getText().toString());
                alColors.add(pos,colour);
                aaColors.notifyDataSetChanged();
            }
        });

    }
}