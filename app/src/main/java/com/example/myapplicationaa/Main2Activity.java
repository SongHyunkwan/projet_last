package com.example.myapplicationaa;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        int viewim = 0;

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int value = extras.getInt("key");
            viewim = value;
            //The key argument here must match that used in the other activity
        }

        TextView textTitle = (TextView)findViewById(R.id.textView);
        TextView textSinger = (TextView)findViewById(R.id.textView2);
        TextView textText = (TextView)findViewById(R.id.textView4);


        RelativeLayout ly = (RelativeLayout) findViewById(R.id.layoutView);

        if (viewim == 1) {
            ly.setBackgroundResource(R.drawable.top1);
            textTitle.setText("Day Day (Feat. 박재범)");
            textSinger.setText("BewhY (비와이)");
            textText.setText("한 번 돌아가 보자구\nyesterday day\n너가 바로 소녀였을 때에\n핑계만 가득했었지\n 미래에 대해 \n 소망과 두려움이\n 내 안에 공존했을 때에 \n yeah yeah 그때의\n 난 거짓말쟁이\n 나를 매번 속이며\n내 안엔 원하지도 않던\n 헛된 바램이");
        }
        if (viewim == 2) {
            ly.setBackgroundResource(R.drawable.top2);
            textTitle.setText("Why So Lonely");
            textSinger.setText("원더걸스");
            textText.setText("너와 입술이 닿을 때부터 \n 모든 게 달라질 줄 알았는데\n 별거 없어 넌 다른 게 없어\n 너와 보내는 주말 밤이\n 아주 달콤할 거라 믿었는데\n 별거 없어 넌 다를 게 없어\n 어이없어 영화에 나오는 예쁜 연인들처럼\n나나난난 그런 사랑을 원하는데\nBaby why I'm so lonely\n난 애타는데 넌 뭐니\nBaby no 내 마음이\n언제 널 떠나 버릴지 몰라");
        }
        if (viewim == 3) {
            ly.setBackgroundResource(R.drawable.top3);
            textTitle.setText("너 그리고 나 (NAVILLERA)");
            textSinger.setText("여자친구");
            textText.setText("알 수 있었어 널 본 순간 \n뭔가 특별하다는 걸\n눈빛 만으로도 느껴지니까 \n마음이 움직이는 걸\n나비처럼 날아 나나나 나빌레라 \n바람아 바람아 불어라\n 훨훨 날아가 \n 너에게로 다가갈 수 있도록 \n 하얀 진심을 담아\n새롭게 시작해 볼래 너 그리고 나 \n 사랑을 동경해 앞으로도 잘 부탁해 \n 모아둔 마음을 주겠어 그리고 나 \n 마냥 기다리진 않을래");
        }
        if (viewim == 4) {
            ly.setBackgroundResource(R.drawable.top4);
            textTitle.setText("I Like That");
            textSinger.setText("씨스타");
            textText.setText("남자는 똑같다는 게 \n 그 말이 이제 이해돼\n 감이 오질 않아 너란 놈 이젠\n 있다 없다 왔다 갔다 하는 너를 \n 내가 바꿀 수 있다 믿었던 게 \n 나 그게 참 바보 같아 오\n 내 걱정은 하지마 너 하나 없다고\n너만 사라지면 돼 그거면 충분해\n나몰래 찌르고 다닌 \n그 여자들이나 잘해줘\n 니가 좋아 널 사랑해 \n 너의 그 말 웃기지마");
        }
        if (viewim == 5) {
            ly.setBackgroundResource(R.drawable.top5);
            textTitle.setText("CHEER UP");
            textSinger.setText("TWICE (트와이스)");
            textText.setText("매일 울리는 벨벨벨\n 이젠 나를 배려 해줘\n 배터리 낭비하긴 싫어\n 자꾸만 봐 자꾸 자꾸만 와\n 전화가 펑 터질 것만 같아\n 몰라 몰라 숨도 못 쉰대\n나 때문에 힘들어\n 쿵 심장이 떨어진대 왜\n 걔 말은 나 너무 예쁘대\n 자랑 하는건 아니구\n 아 아까는 못 받아서 미안해\n친구를 만나느라 shy shy shy");
        }


        Button bbt = (Button)findViewById(R.id.button6);
        bbt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });

    }
}
