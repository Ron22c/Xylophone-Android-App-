package com.ron.cranajit.xylophone;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final int NO_OF_SIMULTANIOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private SoundPool mSoundPool;
    private int mCsoundId;
    private int mDsoundId;
    private int mEsoundId;
    private int mFsoundId;
    private int mGsoundId;
    private int mAsoundId;
    private int mBsoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(NO_OF_SIMULTANIOUS_SOUNDS,AudioManager.STREAM_MUSIC,0);
        mCsoundId = mSoundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDsoundId = mSoundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mEsoundId = mSoundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFsoundId = mSoundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mGsoundId = mSoundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mAsoundId = mSoundPool.load(getApplicationContext(),R.raw.note6_a,1);
        mBsoundId = mSoundPool.load(getApplicationContext(),R.raw.note7_b,1);
    }
    public void playC(View v){

        Log.d("xylophone","plying C note");
        mSoundPool.play(mCsoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);
    }
    public void playD(View v){
        Log.d("xylophone","plying D note");
        mSoundPool.play(mDsoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playE(View v){
        Log.d("xylophone","plying E note");
        mSoundPool.play(mEsoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playF(View v){
        Log.d("xylophone","plying F note");
        mSoundPool.play(mFsoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playG(View v){
        Log.d("xylophone","plying G note");
        mSoundPool.play(mGsoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playA(View v){
        Log.d("xylophone","plying A note");
        mSoundPool.play(mAsoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }
    public void playB(View v){
        Log.d("xylophone","plying B note");
        mSoundPool.play(mBsoundId,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);

    }

}
