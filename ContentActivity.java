package com.example.maniraj1;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContentActivity extends AppCompatActivity {

    TextView sem1,sem2,sem3,sem4,sem5,sem6,sem7,sem8,la,physics,english,eg,pps,devc,beee,ec,ncc,mfcs,dldmp,dbms,dsc,coa,es,sme,daa,flat,os,mefa,gs,dccn,cd,se,ml,mad,python,ai,ms,ic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        TextView txtMarquee = (TextView) findViewById(R.id.marqueeText);

        txtMarquee.setSelected(true);

        sem1 = findViewById(R.id.sem1);
        la = findViewById(R.id.la);
        physics = findViewById(R.id.physics);
        english = findViewById(R.id.english);
        eg = findViewById(R.id.eg);
        pps= findViewById(R.id.pps);

        sem2 = findViewById(R.id.sem2);
        devc = findViewById(R.id.devc);
        beee = findViewById(R.id.beee);
        ec = findViewById(R.id.ec);
        ncc = findViewById(R.id.ncc);


        sem3 = findViewById(R.id.sem3);
        mfcs = findViewById(R.id.mfcs);
        dldmp = findViewById(R.id.dldmp);
        dbms = findViewById(R.id.dbms);
        dsc = findViewById(R.id.dsc);
        coa = findViewById(R.id.coa);
        es = findViewById(R.id.es);

        sem4 = findViewById(R.id.sem4);
        sme = findViewById(R.id.sme);
        daa = findViewById(R.id.daa);
        flat = findViewById(R.id.flat);
        os = findViewById(R.id.os);
        mefa = findViewById(R.id.mefa);
        gs = findViewById(R.id.gs);

        sem5 = findViewById(R.id.sem5);
        dccn = findViewById(R.id.dccn);
        cd = findViewById(R.id.cd);
        se = findViewById(R.id.se);
        ml = findViewById(R.id.ml);
        mad = findViewById(R.id.mad);
        ms = findViewById(R.id.ms);
        python = findViewById(R.id.python);
        ai = findViewById(R.id.ai);
        ic = findViewById(R.id.ic);

        sem6 = findViewById(R.id.sem6);
        sem7 = findViewById(R.id.sem7);
        sem8 = findViewById(R.id.sem8);



        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { gotoUrl("https://drive.google.com/drive/folders/1Tze-r7vLKQpQNQpim5g0KUD_1XJP1VO7?usp=sharing");
            }
        });


        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { gotoUrl("https://drive.google.com/drive/folders/1e1UDWI6Nls_2BaInBDMbQ3rnYxK8OnbB?usp=sharing");

            }
        });


        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { gotoUrl("https://drive.google.com/drive/folders/14R6COLt0jTYyJeOxvSOP5QuBQ4WWaQD-?usp=sharing");

            }
        });



        eg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { gotoUrl("https://drive.google.com/drive/folders/1acmDzqqDOkinHRFFebkExj3uBT9ws4L9?usp=sharing");
            }
        });




        pps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { gotoUrl("https://drive.google.com/drive/folders/12s6mAmPsVMDvotJLj0Ww8buuiPS8zh0S?usp=sharing");

            }
        });



        devc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { gotoUrl("https://drive.google.com/drive/folders/1WAp9Z-VFyKN3KHj9zBzvLI5O9h_lYtJU?usp=sharing");

            }
        });



        beee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { gotoUrl("https://drive.google.com/drive/folders/1DkWuAsHyTSah2lXDzSCur3apZqFaZJ5Z?usp=sharing");

            }
        });


        ec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { gotoUrl("https://drive.google.com/drive/folders/1DkWuAsHyTSah2lXDzSCur3apZqFaZJ5Z?usp=sharing");

            }
        });


        ncc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { gotoUrl("https://drive.google.com/drive/folders/1mwsZjG0qBLYFg5CtY4xkWh3rqS4v8CMQ?usp=sharing");

            }
        });



        mfcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { gotoUrl("https://drive.google.com/drive/u/1/folders/1_Fah2HTniUbNiOykCYeIPbS36bOxm8n7");
            }
        });

        dldmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1bKDZAzx4gdvCdOO6Iegk9h83yUsJwKtd");
            }
        });

        dbms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1zFXtZy0I9RPhUI2whOrHye-LedVkwnwD");
            }
        });

        dsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1h75D_kF08myydpAVLOiEldVrMI6kHPXk");
            }
        });

        coa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1YfS2YtqzjvHcxWdf25nyLlREwXtP5-60");
            }
        });

        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1OANQOBpRxoKEyq7hPWG0qBibu2X8uCKr");
            }
        });
        sme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1-X1dAAzLHSEwR--09zVuYjGRbu9WpDTJ");
            }
        });

        daa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/19OD5VtacGCOeIPd0pY_orPCgxXhsL6sS");
            }
        });

        flat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1FQolfx_e56HMSchjI494pGpuyYB3DePK");
            }
        });

        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1DevjCmbhEi7qCd8JYKYsLUV4Xxu0Tdil");
            }
        });

        mefa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1sRR6UMmCy05Xk0A_YhiowU6_J-7L1WlK");
            }
        });

        gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1ywZjWvPlgM6gVIkF3Zg6Dm-RAzQ47Wjv");
            }
        });

        dccn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1fT8N_65NxQTxGQG5ZYF9OuQzdRQrCzLv");
            }
        });

        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/19hm0ee1Il44dmBUqU7qwE9NtFf_Ax8OZ");
            }
        });
        se.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1XK-geuHbt8i6jxkyGq0rdSRdQQz23oxp");

            }
        });

        ml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1Bf6e9o-XNyBeihq3o3eSjj7EVRwhOymw");
            }
        });
        mad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1S-U0sS5K5heymhN_2R_nLp8aMjgEXzg5");

            }
        });

        ms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1TiBzKxE4w_2GZHaW9BDWrGS8YZy-45jZ");

            }
        });
        ic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/u/1/folders/1CGQQEep5PhZiVtphQWipaa1LlEBY2qmn");
            }
        });

    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
