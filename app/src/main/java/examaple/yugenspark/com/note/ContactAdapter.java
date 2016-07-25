
package examaple.yugenspark.com.note;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    private List<ContactInfo> contactList;

    public ContactAdapter(List<ContactInfo> contactList) {
        this.contactList = contactList;
    }


    @Override
    public int getItemCount() {
        return contactList.size();
    }

    @Override
    public void onBindViewHolder(ContactViewHolder contactViewHolder, int i) {
        ContactInfo ci = contactList.get(i);
        contactViewHolder.vTitleofnote.setText(ci.titlenote);
        contactViewHolder.vContent.setText(ci.contentnote);
        contactViewHolder.vTitle.setText(ci.titlenote);
    }

    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.cardview, viewGroup, false);

        return new ContactViewHolder(itemView);
    }

    public static class ContactViewHolder extends RecyclerView.ViewHolder {

        protected TextView vTitleofnote;
        protected TextView vContent;
        protected TextView vTitle;

        public ContactViewHolder(View v) {
            super(v);
            vTitleofnote =  (TextView) v.findViewById(R.id.txttitle);
            vContent = (TextView)  v.findViewById(R.id.txtcontent);
            vTitle = (TextView) v.findViewById(R.id.title);
        }
    }
}