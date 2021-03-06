package com.nodlee.theogony.loader;

import android.content.Context;

import com.nodlee.amumu.bean.Champion;
import com.nodlee.theogony.db.ChampionManager;

/**
 * Created by Vernon Lee on 15-12-13.
 */
public class ChampionLoader extends DataLoader<Champion> {
    private Context mCtx;
    private int mCid;

    public ChampionLoader(Context context, int cid) {
        super(context);
        mCtx = context;
        mCid = cid;
    }

    @Override
    public Champion loadInBackground() {
        return ChampionManager.getInstance(mCtx).get(mCid);
    }
}
