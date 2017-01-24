package Projet;


class NoeudArbre{
  Comparable Info;
  boolean complet=false;
  NoeudArbre FD;
  NoeudArbre FG;
  public NoeudArbre(Comparable O){
    Info = O;
    FG = null;
    FD = null;
  }
  public String toString(){
    StringBuffer s = new StringBuffer(); //cr�ation d'un buffer
    if (this!=null){
      s.append(Info);  //on ajoute la valeur de l'arbre
      if ((this.FG!=null) || (this.FD!=null)){ //si il ya un fils
        s.append('('); //on ouvre une parenth�se
        if (this.FG!=null)
        //si fils gauche on l'ajoute et on appelle la m�thode dessus
        s.append(FG.toString());
        //on ajoute une virgule
        s.append(',');
        if (this.FD!=null)
          //si fils droit on l'ajoute et on appelle la m�thode dessus
          s.append(FD.toString());
          //on referme la parenth�se
        s.append(')');
      }
    }
    String S = new String(s); //on cr�e un objet de type String avec ce buffer
    return S;  //on le renvoie
  }
}
