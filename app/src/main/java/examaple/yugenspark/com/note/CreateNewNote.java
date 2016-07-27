package examaple.yugenspark.com.note;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateNewNote extends AppCompatActivity {

        DataBaseHelper mydb;
        EditText editTitle , editContent ;
        Button saveBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mydb = new DataBaseHelper(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_note);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editTitle = (EditText) findViewById(R.id.create_title);
        editContent = (EditText)findViewById(R.id.create_content);
        saveBtn = (Button)findViewById(R.id.save_to_db);
        AddData();
    }

    public void AddData()
    {
        saveBtn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                       boolean isInserted = mydb.insertData(editTitle.getText().toString() , editContent.getText().toString());

                        if(isInserted = true)
                        {
                            Toast.makeText(CreateNewNote.this , "Data Inserted" , Toast.LENGTH_LONG).show();
                        }
                        else
                        {
                            Toast.makeText(CreateNewNote.this , "Data Not Inserted" , Toast.LENGTH_LONG).show();
                        }

                    }
                }
        );
    }

}

