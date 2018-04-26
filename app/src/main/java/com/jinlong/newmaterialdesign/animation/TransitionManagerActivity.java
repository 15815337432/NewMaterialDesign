package com.jinlong.newmaterialdesign.animation;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.transition.AutoTransition;
import android.support.transition.ChangeBounds;
import android.support.transition.ChangeClipBounds;
import android.support.transition.ChangeScroll;
import android.support.transition.Explode;
import android.support.transition.Fade;
import android.support.transition.Scene;
import android.support.transition.Slide;
import android.support.transition.TransitionManager;
import android.support.transition.TransitionSet;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.jinlong.newmaterialdesign.R;

/**
 * 这个适用于展示TransitionManager的动画效果
 */
public class TransitionManagerActivity extends AppCompatActivity {

    private ConstraintLayout mCl_root;
    private TextView mTvText;
    private Scene mScene1;
    private Scene mScene2;
    private boolean isScene2;//这个标识是显示的是否是Scene2的页面

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_manager);
    }

    /**
     * 操作单独View的
     */
    public void handleView(View view) {
        Intent intent = new Intent(this, HandleViewActivity.class);
        startActivity(intent);
    }

    /**
     * 操作Scene的
     */
    public void handleScene(View view) {
        Intent intent = new Intent(this, SceneActivity.class);
        startActivity(intent);
    }

//
//    /**
//     * 初始化Scene
//     */
//    private void initScene() {
//        FrameLayout layout = findViewById(R.id.rl_root);
//        mScene1 = Scene.getSceneForLayout(layout, R.layout.scene1, this);
//        mScene2 = Scene.getSceneForLayout(layout, R.layout.scene2, this);
//        TransitionManager.go(mScene1);
//    }
//
//    public void animation(View view) {
//        mCl_root = findViewById(R.id.cl_root);
//        mTvText = findViewById(R.id.tv_text);
//        Slide slide = new Slide();
////        Explode explode = new Explode();
//        Fade fade = new Fade();
//        TransitionSet transitionSet = new TransitionSet();
//        transitionSet.addTransition(slide);
//        transitionSet.addTransition(fade);
//
//        TransitionManager.beginDelayedTransition(mCl_root, transitionSet);
//
//        if (mTvText.getVisibility() == View.VISIBLE) {
//            mTvText.setVisibility(View.GONE);
//        } else {
//            mTvText.setVisibility(View.VISIBLE);
//        }
//    }
//
//    public void scene(View view) {
//        TransitionManager.go(isScene2 ? mScene1 : mScene2, new ChangeBounds());
//        isScene2 = !isScene2;
//    }
}
