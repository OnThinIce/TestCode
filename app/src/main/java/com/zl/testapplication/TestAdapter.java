package com.zl.testapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * 疑问：
 * 定义接口需不需要static？
 * 定义内部类需不要static（ViewHolder）？
 */
public class TestAdapter extends RecyclerView.Adapter<TestAdapter.ViewHolder> {

    private List<TestModel> mTestList;
    private static final int NORMAL_TYPE = 0;
    private static final int CHECK_TYPE = 1;

    private OnItemClickListener onItemClickListener;

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface OnItemClickListener {
        void onClick(View view, int position);
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 3 == 0) {
            return CHECK_TYPE;
        }
        return NORMAL_TYPE;
    }

    public TestAdapter(List<TestModel> mTestList) {
        this.mTestList = mTestList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (viewType == NORMAL_TYPE) {

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_item, parent, false);
            final ViewHolder holder = new ViewHolder(view);

            holder.testImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getAdapterPosition();
                    TestModel testModel = mTestList.get(position);
                    Toast.makeText(v.getContext(), "点击了" + testModel.getName() + "事件头像", Toast.LENGTH_SHORT).show();
                }
            });

            holder.testName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getAdapterPosition();
                    TestModel testModel = mTestList.get(position);
                    Toast.makeText(v.getContext(), "点击了" + testModel.getName() + "事件名字", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(v.getContext(), FragmentLifeActivity.class);
//                v.getContext().startActivity(intent);
                }
            });
            return holder;
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.test_check_item, parent, false);
            final CheckHolder holder = new CheckHolder(view);

            holder.testImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getAdapterPosition();
                    TestModel testModel = mTestList.get(position);
                    Toast.makeText(v.getContext(), "点击了选中项" + testModel.getName() + "事件头像", Toast.LENGTH_SHORT).show();
                }
            });

            holder.testName.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = holder.getAdapterPosition();
                    TestModel testModel = mTestList.get(position);
                    Toast.makeText(v.getContext(), "点击了选中项" + testModel.getName() + "事件名字", Toast.LENGTH_SHORT).show();
                }
            });
            return holder;
        }


    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TestModel testModel = mTestList.get(position);
        if (holder instanceof ViewHolder) {
            holder.testImage.setImageResource(testModel.getImageId());
            holder.testName.setText(testModel.getName());
        } else {
            holder.testImage.setImageResource(testModel.getImageId());
            holder.testName.setText("选中项：" + testModel.getName());
        }
    }

    @Override
    public int getItemCount() {
        return mTestList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView testImage;
        TextView testName;
        LinearLayout rootView;

        public ViewHolder(View itemView) {
            super(itemView);
            testImage = (ImageView) itemView.findViewById(R.id.test_image);
            testName = (TextView) itemView.findViewById(R.id.test_name);
            rootView = (LinearLayout) itemView.findViewById(R.id.root_view);
            rootView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (onItemClickListener != null) {
                onItemClickListener.onClick(itemView, getAdapterPosition());
            }
        }
    }

    class CheckHolder extends ViewHolder {

        public CheckHolder(View itemView) {
            super(itemView);
        }
    }
}
