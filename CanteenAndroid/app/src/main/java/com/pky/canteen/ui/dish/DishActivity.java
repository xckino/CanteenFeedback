package com.pky.canteen.ui.dish;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.pky.canteen.R;
import com.pky.canteen.base.activity.BaseActivity;

public class DishActivity extends BaseActivity<DishModel, DishView> {
    @Override
    protected int getLayoutId() {
        return R.layout.activity_dish_details;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        map("id", getIntent().getIntExtra("id", 0));
        super.onCreate(savedInstanceState);
        hideActionBar();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("id", map("id"));
    }

    public static void start(Context context, int dishId) {
        Intent intent = new Intent(context, DishActivity.class);
        intent.putExtra("id", dishId);
        context.startActivity(intent);
    }
}
