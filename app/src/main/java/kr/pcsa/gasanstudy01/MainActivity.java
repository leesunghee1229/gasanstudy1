package kr.pcsa.gasanstudy01;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    private final int[] menuRes = {R.string.list_view };

    private ListView mListView;
    private ArrayAdapter mAdapter;
    private List<String> mTitleList;

    @Override
    protected void defaultSetup() {
        mTitleList = new ArrayList();
        for (int res : menuRes){
            mTitleList.add(getString(res));
        }

    }

    @Override
    protected void onCreateOnBase(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.list_view_);
        mAdapter = new ArrayAdapter<>(getContext(), R.layout.call_main_list_item, R.id.title_, mTitleList);
        mListView.setAdapter(mAdapter);
    }
}
