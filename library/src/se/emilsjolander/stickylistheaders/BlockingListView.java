package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class BlockingListView extends ListView {

    private boolean mBlockLayoutChildren;
 
    public BlockingListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BlockingListView(Context context) {
        super(context);
    }
 
    public void setBlockLayoutChildren(boolean block) {
        mBlockLayoutChildren = block;
    }
 
    @Override
    protected void layoutChildren() {
        if (!mBlockLayoutChildren) {
            super.layoutChildren();
        }
    }    
}
