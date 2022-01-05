package com.example.vineet.miniproject1;

import android.content.Intent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Fifth extends AppCompatActivity {
    Button b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33;
    EditText e6,e7,e8;
    TextView t7,t8,t9,t10;
    TextToSpeech ts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        b13=(Button)findViewById(R.id.button13);
        b14=(Button)findViewById(R.id.button14);
        b15=(Button)findViewById(R.id.button15);
        b16=(Button)findViewById(R.id.button16);
        b17=(Button)findViewById(R.id.button17);
        b18=(Button)findViewById(R.id.button18);
        b19=(Button)findViewById(R.id.button19);
        b20=(Button)findViewById(R.id.button20);
        b21=(Button)findViewById(R.id.button21);
        b22=(Button)findViewById(R.id.button22);
        b23=(Button)findViewById(R.id.button23);
        b24=(Button)findViewById(R.id.button24);
        b25=(Button)findViewById(R.id.button25);
        b26=(Button)findViewById(R.id.button26);
        b27=(Button)findViewById(R.id.button27);
        b28=(Button)findViewById(R.id.button28);
        b29=(Button)findViewById(R.id.button29);
        b30=(Button)findViewById(R.id.button30);
        b31=(Button)findViewById(R.id.button31);
        b32=(Button)findViewById(R.id.button32);
        b33=(Button)findViewById(R.id.button33);
        e6=(EditText)findViewById(R.id.editText6);
        e7=(EditText)findViewById(R.id.editText7);
        e8=(EditText)findViewById(R.id.editText8);
        t7=(TextView)findViewById(R.id.textView7);
        t8=(TextView)findViewById(R.id.textView8);
        t9=(TextView)findViewById(R.id.textView9);
        t10=(TextView)findViewById(R.id.textView10);
        ts=new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int i) {
                ts.setLanguage(Locale.ENGLISH);
                ts.setSpeechRate(0.9f);

            }
        });
        e6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        e6.setText(e6.getText()+"1");
                        ts.speak("One", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e6.setText(e6.getText()+"2");
                        ts.speak("Two", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e6.setText(e6.getText()+"3");
                        ts.speak("Three", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e6.setText(e6.getText()+"4");
                        ts.speak("Four", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b18.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e6.setText(e6.getText()+"5");
                        ts.speak("FIve", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e6.setText(e6.getText()+"6");
                        ts.speak("Six", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e6.setText(e6.getText()+"7");
                        ts.speak("Seven", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e6.setText(e6.getText()+"8");
                        ts.speak("Eight", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b23.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e6.setText(e6.getText()+"9");
                        ts.speak("Nine", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b25.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e6.setText(e6.getText()+".");
                        ts.speak("Dot", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b26.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e6.setText(e6.getText()+"0");
                        ts.speak("Zero", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b27.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e6.setText("");
                    }
                });
                b32.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        String str = e6.getText().toString();
                        if (str.length() > 1) {
                            str = str.substring(0, str.length() - 1);
                            e6.setText(str);
                        } else if (str.length() <= 1) {
                            e6.setText("0");
                        }
                    }
                });
            }
        });
        //e2 starts
        e7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view)
                    {
                        e7.setText(e7.getText()+"1");
                        ts.speak("One", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e7.setText(e7.getText()+"2");
                        ts.speak("Two", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e7.setText(e7.getText()+"3");
                        ts.speak("Three", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b17.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e7.setText(e7.getText()+"4");
                        ts.speak("Four", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b18.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e7.setText(e7.getText()+"5");
                        ts.speak("FIve", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b19.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e7.setText(e7.getText()+"6");
                        ts.speak("Six", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b21.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e7.setText(e7.getText()+"7");
                        ts.speak("Seven", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b22.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e7.setText(e7.getText()+"8");
                        ts.speak("Eight", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b23.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e7.setText(e7.getText()+"9");
                        ts.speak("Nine", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b25.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e7.setText(e7.getText()+".");
                        ts.speak("Dot", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b26.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e7.setText(e7.getText()+"0");
                        ts.speak("Zero", TextToSpeech.QUEUE_FLUSH,null);
                    }
                });
                b27.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        e7.setText("");
                    }
                });
                b32.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {


                        String str = e6.getText().toString();
                        if (str.length() > 1) {
                            str = str.substring(0, str.length() - 1);
                            e7.setText(str);
                        } else if (str.length() <= 1) {
                            e7.setText("0");
                        }
                    }
                });
            }
        });
        b27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e8.setText("");
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1+f2;
                String s3=Float.toString(f3);
                e8.setText(s3);
                ts.speak("The Answer is "+s3, TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(Fifth.this, "The answer is"+ s3, Toast.LENGTH_SHORT).show();
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1-f2;
                String s3=Float.toString(f3);
                e8.setText(s3);
                ts.speak("The Answer is "+s3, TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(Fifth.this, "The answer is"+ s3, Toast.LENGTH_SHORT).show();
            }
        });
        b24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1*f2;
                String s3=Float.toString(f3);
                e8.setText(s3);
                ts.speak("The Answer is "+s3, TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(Fifth.this, "The answer is"+ s3, Toast.LENGTH_SHORT).show();
            }
        });
        b28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Float f1=Float.parseFloat(s1);
                Float f2=Float.parseFloat(s2);
                Float f3=f1/f2;
                String s3=Float.toString(f3);
                e8.setText(s3);
                ts.speak("The Answer is "+s3, TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(Fifth.this, "The answer is"+ s3, Toast.LENGTH_SHORT).show();
            }
        });
        b29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Double f1=Double.parseDouble(s1);
                Double f2=Double.parseDouble(s2);
                Double f3=Math.sin(f1+f2);
                String s3=Double.toString(f3);
                e8.setText(s3);
                ts.speak("The Answer is "+s3, TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(Fifth.this, "The answer is"+ s3, Toast.LENGTH_SHORT).show();
            }
        });
        b30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Double f1=Double.parseDouble(s1);
                Double f2=Double.parseDouble(s2);
                Double f3=Math.tan(f1+f2);
                String s3=Double.toString(f3);
                e8.setText(s3);
                ts.speak("The Answer is "+s3, TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(Fifth.this, "The answer is"+ s3, Toast.LENGTH_SHORT).show();
            }
        });


        b31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=e6.getText().toString();
                String s2=e7.getText().toString();
                Double f1=Double.parseDouble(s1);
                Double f2=Double.parseDouble(s2);
                Double f3=Math.cos(f1+f2);
                String s3=Double.toString(f3);
                e8.setText(s3);
                ts.speak("The Answer is "+s3, TextToSpeech.QUEUE_FLUSH,null);
                Toast.makeText(Fifth.this, "The answer is"+ s3, Toast.LENGTH_SHORT).show();
            }
        });
        b33.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        Intent i=new Intent(Fifth.this,Fourth.class);
            startActivity(i);
            finish();
    }
});

    }
}
