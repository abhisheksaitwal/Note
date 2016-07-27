package examaple.yugenspark.com.note;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.TitleViewHolder> {

    private List<TitleInfo> titleList;

    public TitleAdapter(List<TitleInfo> titleList) {
        this.titleList = titleList;
    }


    @Override
    public int getItemCount() {
        return titleList.size();
    }

    @Override
    public void onBindViewHolder(TitleViewHolder contactViewHolder, int i) {
        TitleInfo ci = titleList.get(i);
        contactViewHolder.vTitleofnote.setText(ci.titlenote);
        contactViewHolder.vContent.setText(ci.contentnote);
        contactViewHolder.vTitle.setText(ci.titlenote);
    }

    @Override
    public TitleViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.cardview, viewGroup, false);

        return new TitleViewHolder(itemView);
    }

    public static class TitleViewHolder extends RecyclerView.ViewHolder {

        protected TextView vTitleofnote;
        protected TextView vContent;
        protected TextView vTitle;

        public TitleViewHolder(View v) {
            super(v);
            vTitleofnote =  (TextView) v.findViewById(R.id.txttitle);
            vContent = (TextView)  v.findViewById(R.id.txtcontent);
            vTitle = (TextView) v.findViewById(R.id.title);
        }
    }
}