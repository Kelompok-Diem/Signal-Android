package org.thoughtcrime.securesms.components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import org.thoughtcrime.securesms.R;

public class SearchCal extends LinearLayout{

    public SearchCal(Context context) {
        super(context);
        initialize();
    }

    public SearchCal(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }

    public SearchCal(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initialize();
    }

    private void initialize() {
        inflate(getContext(), R.layout.search_toolbar, this);
        setOrientation(VERTICAL);

        Toolbar toolbar = findViewById(R.id.toolbar);

        Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.ic_baseline_calendar_today_24);
        toolbar.setNavigationIcon(drawable);
        toolbar.setCollapseIcon(drawable);
        toolbar.inflateMenu(R.menu.conversation_list_search);
    }
}