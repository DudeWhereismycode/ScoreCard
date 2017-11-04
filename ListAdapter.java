import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by John on 04/11/2017.
 */

public class ListAdapter extends BaseAdapter{
    private final Context mContext;
    private final Hole[] mHoles;

    public ListAdapter (Context context, Hole[] holes) {
        mContext = context;
        mHoles = holes;
    }
    @Override
    public int getCount() {
        return mHoles.lenght;
    }

    @Override
    public Object getItem(int i) {
        return mHoles[position];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item,null);
        }
        return null;
    }
    private static class ViewHolder {
        TextView holeLabel;
        TextView strokeCount;
        Button removeStrokeButton;
        Button addStrokeButton;

    }
}