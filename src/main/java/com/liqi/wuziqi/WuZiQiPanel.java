package com.liqi.wuziqi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by liqi on 2016/4/24.
 */
public class WuZiQiPanel extends View{

    private int mPanelWidth;
    private float mLineHeight;
    private int MAX_LINE = 10;

    public WuZiQiPanel(Context context, AttributeSet attrs) {
        super(context, attrs);
        setBackgroundColor(0x44ff0000);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);

        int heightSize = MeasureSpec.getSize(heightMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);

        int width = Math.min(widthSize,heightSize);

        if(widthMode == MeasureSpec.UNSPECIFIED)
        {
            width = heightSize;
        }else if (heightMode == MeasureSpec.UNSPECIFIED)
        {
            width = widthSize;
        }
        setMeasuredDimension(width,width);
    }
}
