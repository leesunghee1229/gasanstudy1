package kr.pcsa.gasanstudy01;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by chogoon on 2016-12-30.
 */

public class IntroActivity extends BaseActivity {

    @Override
    protected void defaultSetup() {

    }

    @Override
    protected void onCreateOnBase(Bundle savedInstanceState) {
        setContentView(R.layout.activity_intro);

        mHandler.postDelayed(runMain, 1000);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        mHandler.removeCallbacks(runMain);
    }

    private Runnable runMain = new Runnable() {
        @Override
        public void run() {
            if (isFinishing()) return;
            Intent intent = new Intent(getContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    };
}
