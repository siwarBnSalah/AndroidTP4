package fr.iutlan.xmen;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import fr.iutlan.xmen.databinding.XMenBinding;

public class XMenViewHolder extends RecyclerView.ViewHolder {
    private final XMenBinding ui;

    public XMenViewHolder(@NonNull XMenBinding ui) {
        super(ui.getRoot());
        this.ui = ui;
    }

    public void setXMen(XMen xmen) {
        ui.nom.setText(xmen.getNom());
        ui.image.setImageResource(xmen.getIdImage());
        // Ajoutez d'autres mises à jour pour les vues manquantes (alias, description, pouvoirs, etc.)
    }
}
