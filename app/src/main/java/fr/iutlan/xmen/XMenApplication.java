package fr.iutlan.xmen;

import android.app.Application;
import android.content.res.Resources;
import android.content.res.TypedArray;

import java.util.ArrayList;
import java.util.List;

public class XMenApplication extends Application {
    // variable globale de l'application : la liste des XMen
    private final List<XMen> liste = new ArrayList<>();

    // initialisation du contexte
    @Override
    public void onCreate() {
        super.onCreate();
        // accès aux ressources
        Resources res = getResources();

        // Récupération des tableaux depuis res/values/arrays.xml
        final String[] noms = res.getStringArray(R.array.noms);
        final String[] alias = res.getStringArray(R.array.alias);
        final String[] descriptions = res.getStringArray(R.array.descriptions);
        final String[] pouvoirs = res.getStringArray(R.array.pouvoirs);

        // Récupération du tableau d'images
        TypedArray images = res.obtainTypedArray(R.array.idimages);

        // Initialisation de la liste à partir des ressources
        for (int i = 0; i < noms.length; ++i) {
            // constructeur avec tous les paramètres
            XMen xm = new XMen(
                    noms[i],
                    alias[i],
                    descriptions[i],
                    pouvoirs[i],
                    images.getResourceId(i, R.drawable.undef)
            );
            // ajout du XMen à la liste
            liste.add(xm);
        }

        // libérer certaines ressources explicitement
        images.recycle();
    }

    // Accesseur public (getter) sur la variable liste
    public List<XMen> getListe() {
        return liste;
    }
}
