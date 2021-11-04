package edu.hanu.hellojapan;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    int[] list = {R.id.charA,
            R.id.charI,
            R.id.charU,
            R.id.charE,
            R.id.charO,
            R.id.charKa,
            R.id.charKi,
            R.id.charKu,
            R.id.charKe,
            R.id.charKo,
            R.id.charSa,
            R.id.charShi,
            R.id.charSu,
            R.id.charSe,
            R.id.charSo,
            R.id.charTa,
            R.id.charChi,
            R.id.charTsu,
            R.id.charTe,
            R.id.charTo,
            R.id.charNa,
            R.id.charNi,
            R.id.charNu,
            R.id.charNe,
            R.id.charNo,
            R.id.charHa,
            R.id.charHi,
            R.id.charFu,
            R.id.charHe,
            R.id.charHo,
            R.id.charMa,
            R.id.charMi,
            R.id.charMu,
            R.id.charMe,
            R.id.charMo,
            R.id.charYa,
            R.id.charYu,
            R.id.charYo,
            R.id.charRa,
            R.id.charRi,
            R.id.charRu,
            R.id.charRe,
            R.id.charRo,
            R.id.charWa,
            R.id.charWo,
            R.id.charN};

    int[] list_of_hira = {R.drawable.a1,
            R.drawable.i1,
            R.drawable.u1,
            R.drawable.e1,
            R.drawable.o1,
            R.drawable.ka1,
            R.drawable.ki1,
            R.drawable.ku1,
            R.drawable.ke1,
            R.drawable.ko1,
            R.drawable.sa1,
            R.drawable.shi1,
            R.drawable.su1,
            R.drawable.se1,
            R.drawable.so1,
            R.drawable.ta1,
            R.drawable.chi1,
            R.drawable.tsu1,
            R.drawable.te1,
            R.drawable.to1,
            R.drawable.na1,
            R.drawable.ni1,
            R.drawable.nu1,
            R.drawable.ne1,
            R.drawable.no1,
            R.drawable.ha1,
            R.drawable.hi1,
            R.drawable.fu1,
            R.drawable.he1,
            R.drawable.ho1,
            R.drawable.ma1,
            R.drawable.mi1,
            R.drawable.mu1,
            R.drawable.me1,
            R.drawable.mo1,
            R.drawable.ya1,
            R.drawable.yu1,
            R.drawable.yo1,
            R.drawable.ra1,
            R.drawable.ri1,
            R.drawable.ru1,
            R.drawable.re1,
            R.drawable.ro1,
            R.drawable.wa1,
            R.drawable.wo1,
            R.drawable.n1};

    int[] list_of_kata = {R.drawable.a2,
            R.drawable.i2,
            R.drawable.u2,
            R.drawable.e2,
            R.drawable.o2,
            R.drawable.ka2,
            R.drawable.ki2,
            R.drawable.ku2,
            R.drawable.ke2,
            R.drawable.ko2,
            R.drawable.sa2,
            R.drawable.shi2,
            R.drawable.su2,
            R.drawable.se2,
            R.drawable.so2,
            R.drawable.ta2,
            R.drawable.chi2,
            R.drawable.tsu2,
            R.drawable.te2,
            R.drawable.to2,
            R.drawable.na2,
            R.drawable.ni2,
            R.drawable.nu2,
            R.drawable.ne2,
            R.drawable.no2,
            R.drawable.ha2,
            R.drawable.hi2,
            R.drawable.fu2,
            R.drawable.he2,
            R.drawable.ho2,
            R.drawable.ma2,
            R.drawable.mi2,
            R.drawable.mu2,
            R.drawable.me2,
            R.drawable.mo2,
            R.drawable.ya2,
            R.drawable.yu2,
            R.drawable.yo2,
            R.drawable.ra2,
            R.drawable.ri2,
            R.drawable.ru2,
            R.drawable.re2,
            R.drawable.ro2,
            R.drawable.wa2,
            R.drawable.wo2,
            R.drawable.n2};

    int[] list_of_pronunciation = {R.raw.a,
            R.raw.i,
            R.raw.u,
            R.raw.e,
            R.raw.o,
            R.raw.ka,
            R.raw.ki,
            R.raw.ku,
            R.raw.ke,
            R.raw.ko,
            R.raw.sa,
            R.raw.shi,
            R.raw.su,
            R.raw.se,
            R.raw.so,
            R.raw.ta,
            R.raw.chi,
            R.raw.tsu,
            R.raw.te,
            R.raw.to,
            R.raw.na,
            R.raw.ni,
            R.raw.nu,
            R.raw.ne,
            R.raw.no,
            R.raw.ha,
            R.raw.hi,
            R.raw.fu,
            R.raw.he,
            R.raw.ho,
            R.raw.ma,
            R.raw.mi,
            R.raw.mu,
            R.raw.me,
            R.raw.mo,
            R.raw.ya,
            R.raw.yu,
            R.raw.yo,
            R.raw.ra,
            R.raw.ri,
            R.raw.ru,
            R.raw.re,
            R.raw.ro,
            R.raw.wa,
            R.raw.wo,
            R.raw.n};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton[] list_of_imageButton = new ImageButton[list.length];
        for (int i = 0; i < list.length; i++) {
            list_of_imageButton[i] = findViewById(list[i]);
        }

        // pronounce a selected character
        for(int i = 0; i < list_of_imageButton.length; i++) {
            int j = i;
            list_of_imageButton[i].setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this, list_of_pronunciation[j]);
                    mediaPlayer.start();
                }
            });
        }
    }

    public void onCharacterClick (View view) {
        ImageButton[] list_of_imageButton = new ImageButton[list.length];
        for (int i = 0; i < list.length; i++) {
            list_of_imageButton[i] = findViewById(list[i]);
        }

        if (view == findViewById(R.id.btnHiragana)) {
            findViewById(R.id.hiragana).animate().alpha(1).setDuration(300);
            findViewById(R.id.katakana).animate().alpha(0).setDuration(300);

            for (int i = 0; i < list.length; i++) {
                int j = i;
                list_of_imageButton[i].animate().rotationYBy(360).setDuration(300).withStartAction(new Runnable() {
                    @Override
                    public void run() {
                        list_of_imageButton[j].setImageResource(list_of_hira[j]);
                    }
                });
            }
        } else if (view == findViewById(R.id.btnKatakana)) {
            findViewById(R.id.katakana).animate().alpha(1).setDuration(300);
            findViewById(R.id.hiragana).animate().alpha(0).setDuration(300);

            for (int i = 0; i < list.length; i++) {
                int j = i;
                list_of_imageButton[i].animate().rotationYBy(360).setDuration(300).withStartAction(new Runnable() {
                    @Override
                    public void run() {
                        list_of_imageButton[j].setImageResource(list_of_kata[j]);
                    }
                });
            }
        }
    }
}