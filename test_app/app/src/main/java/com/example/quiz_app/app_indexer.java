package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class app_indexer extends AppCompatActivity {
//    All_in_one_1.0
    int Color = 0;
    ImageButton quiz,text_play,Mantra_play,key_value1,sahi_pad,body,tree,vyakrana,worker,animals;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_indexer);
        getSupportActionBar().hide();
        quiz=findViewById(R.id.quiz);
        sahi_pad=findViewById(R.id.sahitya_padya);
        body=findViewById(R.id.body);
        tree=findViewById(R.id.tree);
        vyakrana=findViewById(R.id.vyakaran);
        worker=findViewById(R.id.works);
        animals=findViewById(R.id.animals);
//        text_play=findViewById(R.id.text_play);
//        Mantra_play=findViewById(R.id.mantra_play);
//        key_value1=findViewById(R.id.key_value1);


        String str = getResources().getString(R.string.body);
        String str2 = getResources().getString(R.string.tree);
        String str3 = getResources().getString(R.string.pattanam);
        String str4 = getResources().getString(R.string.animal);
        String str5 = getResources().getString(R.string.wear);
        String str6 = getResources().getString(R.string.verb);
        String str7 = getResources().getString(R.string.vyakaranam);
        String str8 = getResources().getString(R.string.tarkaha);
        String str12 = getResources().getString(R.string.tarka2);
        String str9 = getResources().getString(R.string.vibhakti_prakaranam);
        String str10 = getResources().getString(R.string.samasa);
        String str11 = getResources().getString(R.string.shivadha);
        String indra1=getResources().getString(R.string.indra_sandesh);
        String dushta2=getResources().getString(R.string.dushtadaman);
        String kali3=getResources().getString(R.string.kalivimarsh);
        String guru4=getResources().getString(R.string.gurupranati);
        String shishya5=getResources().getString(R.string.shishyatrayam);
        String vikra6=getResources().getString(R.string.vikramoudaryam);
        String gogra7=getResources().getString(R.string.gograhan);
        String alankar8=getResources().getString(R.string.alankara);
        String alankar9=getResources().getString(R.string.alankara_lakshan);

        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app_indexer.this,MainActivity.class);
                intent.putExtra("sahi_padya",getResources().getStringArray(R.array.omx));
                intent.putExtra("strings",new String[]{str3,str5,});
                startActivity(intent);
            }
        });

        sahi_pad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app_indexer.this,MainActivity.class);
                intent.putExtra("sahi_padya",getResources().getStringArray(R.array.sahity2_padya_gadya));
                intent.putExtra("strings",new String[]{indra1,dushta2,kali3,guru4,shishya5,vikra6,gogra7,alankar8,alankar9});
                startActivity(intent);
            }
        });


        body.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app_indexer.this,MainActivity.class);
                intent.putExtra("sahi_padya",getResources().getStringArray(R.array.body));
                intent.putExtra("strings",new String[]{str});
                startActivity(intent);
            }
        });

        tree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app_indexer.this,MainActivity.class);
                intent.putExtra("sahi_padya",getResources().getStringArray(R.array.tree));
                intent.putExtra("strings",new String[]{str2});
                startActivity(intent);
            }
        });

        vyakrana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app_indexer.this,MainActivity.class);
                intent.putExtra("sahi_padya",getResources().getStringArray(R.array.vyakaran));
                intent.putExtra("strings",new String[]{str7,str9,str10});
                startActivity(intent);
            }
        });

        worker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app_indexer.this,MainActivity.class);
                intent.putExtra("sahi_padya",getResources().getStringArray(R.array.worker));
                intent.putExtra("strings",new String[]{str6});
                startActivity(intent);
            }
        });
        animals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(app_indexer.this,MainActivity.class);
                intent.putExtra("sahi_padya",getResources().getStringArray(R.array.animals));
                intent.putExtra("strings",new String[]{str4});
                startActivity(intent);
            }
        });


//        text_play.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(app_indexer.this,Mantra_play.class);
//                startActivity(intent);
//            }
//        });
//        Mantra_play.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(app_indexer.this,rec_play.class);
//                startActivity(intent);
//            }
//        });
//        key_value1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(app_indexer.this,MainActivity2.class);
//                startActivity(intent);
//            }
//        });
//

    }
}