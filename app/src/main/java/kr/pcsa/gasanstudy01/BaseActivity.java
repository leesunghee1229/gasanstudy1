package kr.pcsa.gasanstudy01;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by chogoon on 2016-12-30.
 */

public abstract class BaseActivity extends AppCompatActivity implements View.OnClickListener {

    private Context mContext;
    protected Handler mHandler = new Handler();

    /** onCreate에서 미리 해야된일 */
    protected abstract void defaultSetup();

    /** 실제 onCreate */
    protected abstract void onCreateOnBase(Bundle savedInstanceState);


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContext(this);
        defaultSetup();
        onCreateOnBase(savedInstanceState);
    }

    @Override
    public void onClick(View view) {

    }

    public final void setContext(Context mContext) {
        this.mContext = mContext;
    }

    public Context getContext() {
        return mContext;
    }
}
