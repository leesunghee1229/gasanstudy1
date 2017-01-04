package kr.pcsa.gasanstudy01;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import kr.pcsa.gasanstudy01.model.BaseBean;

/**
 * Created by chogoon on 2017. 1. 3..
 */

public class DetaulActvity extends BaseActivity{

    private BaseBean bean;
    TextView name;
    ProgressBar progress;

    @Override
    protected void defaultSetup() {
        try {
            bean = (BaseBean) getIntent().getSerializableExtra("param");
        }catch (Exception e){
            Toast.makeText(getContext(), "error", Toast.LENGTH_SHORT).show();
            finish();
        }
    }

    @Override
    protected void onCreateOnBase(Bundle savedInstanceState) {
        setContentView(R.layout.activity_intro);
        name = (TextView) findViewById(R.id.name_);
        progress = (ProgressBar) findViewById(R.id.progress_);
        progress.setVisibility(View.VISIBLE);
        /** 네트워크 통신
         *  스레드 bean.id
         * onResponse();
         * */

        WebView webView = new WebView(getContext());
        webView.getSettings().setJavaScriptEnabled(true);
    }

    private void onResponse(BaseBean bean){
        name.setText(bean.name);
        progress.setVisibility(View.GONE);
    }
















}
