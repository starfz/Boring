package com.susion.boring.music.itemhandler;

import android.app.Activity;
import android.support.v4.util.Pair;
import android.view.View;
import android.widget.TextView;

import com.susion.boring.R;
import com.susion.boring.base.SimpleItemHandler;
import com.susion.boring.base.ViewHolder;
import com.susion.boring.music.activity.LocalMusicActivity;
import com.susion.boring.music.activity.MyMusicCollectActivity;
import com.susion.boring.music.model.MusicPageConstantItem;
import com.susion.boring.utils.MusicLoader;
import com.susion.boring.utils.TransitionHelper;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by susion on 17/1/21.
 */
public class MusicPageConstantIH extends SimpleItemHandler<MusicPageConstantItem> {

    public static final int LOCAL_MUSIC = 1;
    public static final int MY_COLLECT = 2;
    private MusicPageConstantItem mData;
    private TextView tvItem;

    @Override
    public void onBindDataView(final ViewHolder vh, MusicPageConstantItem data, int position) {
        mData = data;
        vh.getImageView(R.id.item_music_page_constant_iv_icon).setImageResource(data.iconId);
        tvItem = vh.getTextView(R.id.item_music_page_constant_tv_item);
        tvItem.setText(data.item);
        if (data.type == LOCAL_MUSIC) {
            vh.getTextView(R.id.item_music_page_constant_tv_append_dec).setText("-_-?");

            Observable.create(new Observable.OnSubscribe<Integer>() {
                @Override
                public void call(Subscriber<? super Integer> subscriber) {
                    subscriber.onNext(MusicLoader.getInstance(mContext.getContentResolver()).getMusicList().size());
                    subscriber.onCompleted();
                }
            })
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(new Observer<Integer>() {
                @Override
                public void onNext(Integer musicNumber) {
                    vh.getTextView(R.id.item_music_page_constant_tv_append_dec).setText(""+musicNumber);
                }
                @Override
                public void onCompleted() {
                }
                @Override
                public void onError(Throwable e) {
                }
            });
        }


        if (data.type == MY_COLLECT) {
            vh.getTextView(R.id.item_music_page_constant_tv_append_dec).setText("15");
        }


    }

    @Override
    public int getLayoutResId() {
        return R.layout.item_music_page_constant;
    }

    @Override
    public void onClick(View view) {
        if (mData.type == LOCAL_MUSIC) {
            LocalMusicActivity.start((Activity) mContext);
        }

        if (mData.type == MY_COLLECT) {
            MyMusicCollectActivity.start(mContext);
        }
    }


}
