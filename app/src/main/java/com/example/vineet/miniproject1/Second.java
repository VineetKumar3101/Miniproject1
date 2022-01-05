package com.example.vineet.miniproject1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Second extends AppCompatActivity {
    EditText e3,e4,e5;
    Button b1,b2;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        e5=(EditText)findViewById(R.id.editText5);
        t1=(TextView)findViewById(R.id.textView2);
        e5.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
        b1=(Button) findViewById(R.id.button3);
        b2=(Button) findViewById(R.id.button4);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(Second.this,MainActivity.class);
                startActivity(j);
                finish();

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e3.getText().toString();
                String s2=e4.getText().toString();
                String s3=e5.getText().toString();
                if(s1.equals("")||s2.equals("")||s3.equals(""))
                {
                    Toast.makeText(Second.this, "Please Fill All", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    SQLiteDatabase sql=openOrCreateDatabase("gla",MODE_PRIVATE,null);
                    sql.execSQL("create table if not exists student (name varchar,email varchar,password varchar)");
                    String s4="select * from student where name='"+s1+"' and email='"+s2+"'";
                    Cursor c1=sql.rawQuery(s4,null); //to store value
                    if(c1.getCount()>0)
                    {
                        Toast.makeText(Second.this, "users already exists", Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        sql.execSQL("insert into student values('"+s1+"','"+s2+"','"+s3+"')");
                        Toast.makeText(Second.this, "database updated", Toast.LENGTH_SHORT).show();
                        Intent m=new Intent(Second.this,MainActivity.class);
                        startActivity(m);
                        finish();
                    }
                }
            }
        });
    }
}
