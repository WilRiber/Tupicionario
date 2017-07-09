package ribeiro.willian.com.br.tupicionario;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Willian on 31/10/2016.
 */

public class ItemAdapter extends ArrayAdapter<Item> {


    private int backgroundColor;

    public ItemAdapter(Context context, ArrayList<Item> list, int backgroundColor){
        super(context, 0, list);
        this.backgroundColor = backgroundColor;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemView = convertView;
         if (itemView == null){
             itemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);

         }

        Item item = getItem(position);

        TextView titulo = (TextView) itemView.findViewById(R.id.Item_titulo);
        titulo.setText(item.getTitulo());

        TextView desc = (TextView) itemView.findViewById(R.id.Item_desc);
        titulo.setText(item.getDescricao());

        ImageView icone = (ImageView) itemView.findViewById(R.id.item_icone);
        icone.setImageResource(item.getImagem());

        LinearLayout layoutTextos = (LinearLayout) itemView.findViewById(R.id.item_layout_textos);
        int cor = ContextCompat.getColor(getContext(), backgroundColor);
        layoutTextos.setBackgroundColor(cor);


        return itemView;
    }
}

