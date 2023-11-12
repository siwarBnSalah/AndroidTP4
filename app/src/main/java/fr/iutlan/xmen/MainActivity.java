package fr.iutlan.xmen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

import fr.iutlan.xmen.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // interface utilisateur
    private ActivityMainBinding ui;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());

        // Obtenez la liste depuis l'application
        XMenApplication application = (XMenApplication) getApplication();
        List<XMen> liste = application.getListe();

        // Créez l'adaptateur
        XMenAdapter adapter = new XMenAdapter(liste);

        // Fournissez l'adaptateur au RecyclerView
        ui.recycler.setAdapter(adapter);

        // Indiquez au RecyclerView que la taille des éléments est fixe
        ui.recycler.setHasFixedSize(true);

        // Définissez le LayoutManager (LinearLayoutManager dans cet exemple)
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        ui.recycler.setLayoutManager(lm);

        // Ajoutez des lignes de séparation entre les éléments
        DividerItemDecoration dividerItemDecoration =
                new DividerItemDecoration(this, DividerItemDecoration.VERTICAL);
        ui.recycler.addItemDecoration(dividerItemDecoration);
    }
}