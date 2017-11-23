package com.wulee.selectabletext;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class SelectableTextView extends AppCompatTextView {

    private SelectableTextHelper mSelectableTextHelper;
    private int selectedColor;
    private int cursorHandleColor;

    public SelectableTextView(Context context) {
        super(context);
    }

    public SelectableTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs);
    }

    public SelectableTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    private void init(Context context,AttributeSet attrs){
        TypedArray ta = context.obtainStyledAttributes(attrs, R.styleable.SelectableTextView);

        selectedColor = ta.getColor(R.styleable.SelectableTextView_selected_color, ContextCompat.getColor(context,R.color.colorAccent));
        cursorHandleColor = ta.getColor(R.styleable.SelectableTextView_cursor_handle_color, ContextCompat.getColor(context,R.color.colorAccent));

        mSelectableTextHelper = new SelectableTextHelper.Builder(this)
                .setSelectedColor(selectedColor)
                .setCursorHandleSizeInDp(20)
                .setCursorHandleColor(cursorHandleColor)
                .build();
    }


    public void setSelectedColor(int selectedColor) {
        this.selectedColor = selectedColor;
    }

    public void setCursorHandleColor(int cursorHandleColor) {
        this.cursorHandleColor = cursorHandleColor;
    }

}
