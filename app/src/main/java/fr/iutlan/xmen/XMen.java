package fr.iutlan.xmen;

import androidx.annotation.DrawableRes;

import org.jetbrains.annotations.Contract;
// est utilisée pour indiquer au compilateur de ne pas générer de warnings pour les éléments spécifiés.
// Dans le contexte Android, elle est souvent utilisée pour éviter les avertissements concernant des éléments
// qui pourraient sembler inutilisés,
// mais qui sont nécessaires pour des raisons spécifiques, comme les callbacks pour les activités Android.
@SuppressWarnings("unused")
// l'annotation est utilisée au niveau de la classe pour indiquer au compilateur de ne pas générer de warning
// pour les éléments non utilisés (comme les champs, les méthodes, etc.) dans cette classe.
public class XMen {
    // variables représentant les informations
    private String nom;
    // TODO ajouter les champs manquants : alias,...

    private String alias;
    private String description;
    private String pouvoirs;
    private @DrawableRes int idImage;
//est une annotation utilisée dans le contexte de développement Android pour indiquer que la valeur annotée doit
// être une référence à une ressource de type Drawable.




    // constructeur avec paramètre

    public XMen(String nom, String alias, String description, String pouvoirs, int idImage) {
        this.nom = nom;
        this.alias = alias;
        this.description = description;
        this.pouvoirs = pouvoirs;
        this.idImage = idImage;
    }


//Getter et Setter

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPouvoirs() {
        return pouvoirs;
    }

    public void setPouvoirs(String pouvoirs) {
        this.pouvoirs = pouvoirs;
    }

    // Getter pour idImage
    public @DrawableRes int getIdImage() {
        return idImage;
    }

    // Setter pour idImage
    public void setIdImage(@DrawableRes int idImage) {
        this.idImage = idImage;
    }

    public XMen()
    {
        nom = "inconnu";
        this.idImage = R.drawable.undef;
    }

}
