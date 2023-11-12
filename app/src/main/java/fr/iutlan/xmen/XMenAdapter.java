package fr.iutlan.xmen;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import fr.iutlan.xmen.databinding.XMenBinding;

public class XMenAdapter extends RecyclerView.Adapter<XMenViewHolder>{
    private final List<XMen> liste;

    // Constructeur prenant une liste en paramètre
    public XMenAdapter(List<XMen> liste) {
        this.liste = liste;
    }

    // Méthode getItemCount
    @Override
    public int getItemCount() {
        return liste.size();
    }

    // Méthode onCreateViewHolder
    @NonNull
    @Override
    public XMenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        XMenBinding ui = XMenBinding.inflate(
                LayoutInflater.from(parent.getContext()),
                parent,
                false
        );
        return new XMenViewHolder(ui);
    }

    // Méthode onBindViewHolder
    @Override
    public void onBindViewHolder(@NonNull XMenViewHolder holder, int position) {
        holder.setXMen(liste.get(position));
    }
}
