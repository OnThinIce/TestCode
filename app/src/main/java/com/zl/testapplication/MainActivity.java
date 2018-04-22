package com.zl.testapplication;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.yqritc.recyclerviewflexibledivider.HorizontalDividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<TestModel> testList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initTests();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        TestAdapter testAdapter = new TestAdapter(testList);
        recyclerView.setAdapter(testAdapter);
        testAdapter.setOnItemClickListener(new TestAdapter.OnItemClickListener() {
            @Override
            public void onClick(View view, int position) {
                jumpTestPage(position);
            }
        });
        recyclerView.addItemDecoration(new HorizontalDividerItemDecoration.Builder(this)
                .color(Color.BLUE)
                .sizeResId(R.dimen.divider)
                .marginResId(R.dimen.left_margin, R.dimen.right_margin)
                .build());


    }

    private void jumpTestPage(int position) {
        switch (position) {
            case 0:
                //跳转Fragment生命周期测试页面
                startActivity(new Intent(MainActivity.this, FragmentLifeActivity.class));
                break;
            case 1:
                //跳转子线程更新View测试页面
                startActivity(new Intent(MainActivity.this, ThreadTestActivity.class));
                break;
            case 2:
                //跳转Service测试页面
                startActivity(new Intent(MainActivity.this, ServiceTestActivity.class));
                break;
            default:
                break;
        }
    }

    private void initTests() {
        TestModel testModel1 = new TestModel("Fragment生命周期", R.drawable.hj1);
        testList.add(testModel1);
        TestModel testModel2 = new TestModel("子线程更新View", R.drawable.hj2);
        testList.add(testModel2);
        TestModel testModel3 = new TestModel("开启服务and绑定服务", R.drawable.hj3);
        testList.add(testModel3);
        TestModel testModel4 = new TestModel("Fragment生命周期", R.drawable.hj4);
        testList.add(testModel4);
        TestModel testModel5 = new TestModel("Fragment生命周期", R.drawable.hj5);
        testList.add(testModel5);
        TestModel testModel6 = new TestModel("Fragment生命周期", R.drawable.hj6);
        testList.add(testModel6);
        TestModel testModel7 = new TestModel("Fragment生命周期", R.drawable.hj7);
        testList.add(testModel7);
        TestModel testModel8 = new TestModel("Fragment生命周期", R.drawable.hj8);
        testList.add(testModel8);
        TestModel testModel9 = new TestModel("Fragment生命周期", R.drawable.hj9);
        testList.add(testModel9);
        TestModel testModel20 = new TestModel("Fragment生命周期", R.drawable.hj10);
        testList.add(testModel20);
        TestModel testModel21 = new TestModel("Fragment生命周期", R.drawable.hj11);
        testList.add(testModel21);
        TestModel testModel22 = new TestModel("Fragment生命周期", R.drawable.hj12);
        testList.add(testModel22);
        TestModel testModel23 = new TestModel("Fragment生命周期", R.drawable.hj13);
        testList.add(testModel23);
        TestModel testModel24 = new TestModel("Fragment生命周期", R.drawable.hj14);
        testList.add(testModel24);
        TestModel testModel25 = new TestModel("Fragment生命周期", R.drawable.hj15);
        testList.add(testModel25);
        TestModel testModel26 = new TestModel("Fragment生命周期", R.drawable.hj16);
        testList.add(testModel26);
        TestModel testModel27 = new TestModel("Fragment生命周期", R.drawable.hj17);
        testList.add(testModel27);
        TestModel testModel28 = new TestModel("Fragment生命周期", R.drawable.hj18);
        testList.add(testModel28);
        TestModel testModel29 = new TestModel("Fragment生命周期", R.drawable.hj19);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
        testList.add(testModel29);
    }
}
