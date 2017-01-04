package kr.pcsa.gasanstudy01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import kr.pcsa.gasanstudy01.model.BaseBean;

public class MainActivity extends BaseActivity {

    private final int[] menuRes = {R.string.list_view };

    private ListView mListView;
    private ArrayAdapter mAdapter;
    private List<BaseBean> mTitleList;

    @Override
    protected void defaultSetup() {
        mTitleList = new ArrayList();
        for (int res : menuRes){
//            mTitleList.add(getString(res));
            mTitleList.add(new BaseBean());
        }

    }

    @Override
    protected void onCreateOnBase(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.list_view_);
        mAdapter = new ArrayAdapter<>(getContext(), R.layout.call_main_list_item, R.id.title_, mTitleList);
        mListView.setAdapter(mAdapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                BaseBean bean = (BaseBean) parent.getItemAtPosition(position);
                Intent intent = new Intent(getContext(), DetaulActvity.class);
                intent.putExtra("param", bean);
                startActivity(intent);
            }
        });
        //Glide.with(getContext()).load("url").asGif().into(imageview);
    }
}
