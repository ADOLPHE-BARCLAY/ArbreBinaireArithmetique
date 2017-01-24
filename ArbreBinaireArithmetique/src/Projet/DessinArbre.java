package Projet;


import javax.swing.*;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;

/**
* Composant dessinant un arbre
*/
public class DessinArbre extends JComponent
{
    //ArbreExpression a dessiné
  ArbreExpression arbre;
    //Dimension par défaut
    private Dimension dimension=new Dimension(200,200);


     //Crée le composant

    public DessinArbre(ArbreExpression Arbre)
    {
      arbre=Arbre;
    setForeground(Color.BLACK);
    setBackground(Color.lightGray);
    setFont(new Font("Dialog",Font.PLAIN,25));
    setPreferredSize(dimension);
    }


   //Ajoute une donnée à l'arbre

    public void ajoute(Comparable donnee) throws ArbreSatureException,
      TypeIncompatibleException {
    arbre.Insérer(donnee);
    }

    //Hauteur du texte en pixel
    private int hauteurTexte(FontMetrics fm)
    {
    return fm.getHeight();
    }

    //Largeur de la chaine en pixel
    private int largeurTexte(FontMetrics fm,String chaine)
    {
    return fm.stringWidth(chaine);
    }

    //Décalage qu'il faut appliquer pour positioné le texte en hauteur
    private int decalageTexte(FontMetrics fm)
    {
    return fm.getAscent();
    }

    //Ecrit la chaine centre selon x, à la hauteur y
    private void ecrireCentrer(int x,int y,String chaine,Graphics g
                               ,FontMetrics fm)
    {
    int lg=largeurTexte(fm,chaine);
    g.drawString(chaine,x-lg/2,y+decalageTexte(fm));
    }

    // Dessine le composant
    protected void paintComponent(Graphics g)
    {
    //Vide le composant
    g.setColor(getBackground());
    g.fillRect(0,0,getWidth(),getHeight());
    //Intialise la fonction de mesure,la police et la couleur d'écriture
    FontMetrics fm=getFontMetrics(getFont());
    g.setFont(getFont());
    g.setColor(getForeground());
    //Intialise la position de départ
    int x=0;
    int y=0;
    int larg=getWidth();
    int haut=hauteurTexte(fm);
    g.drawImage(new ImageIcon(getClass().getResource("font.jpg"))
                .getImage(),0,0,null);
    //Dessine l'arbre
    dessine(g,arbre.Ref_Racine,x,y,larg,haut,fm);
    }
    //g : Graphics permétant de dessiner
    //abo : NoeudArbre à dessiner
    //x : abscisse minimale du rectangle de dessin
    //y : ordonée du dessin
    //larg : largeur reservée au dessin
    //haut : hauteur d'une chaine de caractères
    //fm : Mesusreur de chaîne de caractères
    private void dessine(Graphics g,NoeudArbre abe,int x,int y,int larg
                         ,int haut,FontMetrics fm)
    {

    //Initialise
    int lg=larg/2;
    int mx=x+lg;
    //Ecrit la racine
    ecrireCentrer(mx,y,abe.Info.toString(),g,fm);
    //Incrèmente y
    y += haut;
    //On dessine, si il existe, le coté gauche
    NoeudArbre gauche=abe.FG;
    if(gauche!=null)
    {
        //on dessine un lien entre la racine et la branche gauche
        g.drawLine(mx,y,x+lg/2,y+20);
        //On dessine la branche gauche
        dessine(g,gauche,x,y+20,lg,haut,fm);
    }
    //On dessine, si il existe, le coté droit
    NoeudArbre droit=abe.FD;
    if(droit!=null)
    {
        //on dessine un lien entre la racine et la branche droite
        g.drawLine(mx,y,mx+lg/2,y+20);
        //On dessine la branche droite
        dessine(g,droit,mx,y+20,lg,haut,fm);
    }
    }

    /**
     * Donne la dimension optimale au composant
     */


    //Cacul la largeur minimale d'un arbre
    private int calculLarg(NoeudArbre abe,FontMetrics fm)
    {
    //On intialise avec la largeur de la racine
    int lg=largeurTexte(fm,abe.Info.toString());
    //On calcul largeur de la partie gauche
    int g=0;
    NoeudArbre ga=abe.FG;
    if(ga!=null)
        g=calculLarg(ga,fm);
    //On calcul largeur de la partie droite
    int d=0;
    NoeudArbre dr=abe.FD;
    if(dr!=null)
        d=calculLarg(dr,fm);
    //On en déduit la rgeur des deux réunis
    int s=2*Math.max(d,g)+5;
    //On renvoie la largeur minimale pour un affichage lisible
    return Math.max(lg,s);
    }

}
