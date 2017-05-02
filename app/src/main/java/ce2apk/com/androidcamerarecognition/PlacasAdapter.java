package ce2apk.com.androidcamerarecognition;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by carlosbridi on 01/05/17.
 */

public class PlacasAdapter extends BaseAdapter {

    private Context fContext;
    private List<String> lista;

    public PlacasAdapter(Context context, List<String> lista){
        this.fContext = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        String placa = lista.get(position);
        LayoutInflater inflater = (LayoutInflater) fContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.layout_placasmodel, null);

        TextView txtPlacas = (TextView) view.findViewById(R.id.txtPlacaVeiculo);
        txtPlacas.setText(placa);

        return view;
    }
}
