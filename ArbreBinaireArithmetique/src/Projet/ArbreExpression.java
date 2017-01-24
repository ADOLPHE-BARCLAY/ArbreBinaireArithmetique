package Projet;


public class ArbreExpression implements Arb_Exp{
  NoeudArbre Ref_Racine;
  int max_size;
  Class TypeEléments;
  private String Preordre="",Inordre="",Postordre="";
  public ArbreExpression(Class c,int TailleMax) {
    TypeEléments=c;
    max_size=TailleMax;
  }
  public ArbreExpression(Class c) {
    this(c,100);
  }
  private boolean Opérateur(Comparable e){
    //Retourne vrai si e est un opérateur faux sinon
    if(e.compareTo("+")==0||e.compareTo("-")==0||e.compareTo("*")==0||e.compareTo("/")==0)
      return true;
    else return false;
  }
  public void Insérer(Comparable x)throws
     TypeIncompatibleException,ArbreSatureException{
   //Insertion contiendra l'information sur l'endroit où x va étre insérer
   String Insertion="";
   if(Saturé())throw new ArbreSatureException();
   if(x.getClass()!=TypeEléments)throw new TypeIncompatibleException();
   //si la racine est vide elle contiendra x
   if(Ref_Racine==null){Ref_Racine=new NoeudArbre(x);}
   else{
     NoeudArbre p=Ref_Racine;
     NoeudArbre q=null,l=p;
     while(p!=null){
       q=p;
       //un noeud est complet si ses deux fils sont complet
       if(q.complet==false){l=p;p=p.FG;Insertion="a gauche";}//Le noeud de rcherche devient celui a gauche
         else {q=p;p=p.FD;Insertion="a droite";}//Le noeud de rcherche devient celui a droite
     }
     if((Insertion=="a gauche")&&(Opérateur(x)==true))
     {q.FG=new NoeudArbre(x);}
     else if((Insertion=="a gauche")&&(Opérateur(x)==false))
     {q.FG=new NoeudArbre(x);l.complet=true;}
     else if((Insertion=="a droite")&&(Opérateur(x)==true))
       {q.FD=new NoeudArbre(x);}
       else if((Insertion=="a droite")&&(Opérateur(x)==false))
       {q.FD=new NoeudArbre(x);l.complet=true;}
   }
 }

 public boolean Vide(){
   return Ref_Racine==null;
 }
 public boolean Saturé(){
   return Taille()==max_size;
 }
 private int Size(NoeudArbre N){
   if(N==null)return 0;
   else return(1+Size(N.FG)+Size(N.FD));
 }
 public int Taille(){
   return Size(Ref_Racine);
 }
 public void Afficher(int Ordre){
   switch (Ordre){
      case 1: AffichPreOrdre(Ref_Racine); break;
      case 2: AffichInOrdre(Ref_Racine); break;
      case 3: AffichPostOrdre(Ref_Racine); break;
      default : System.out.println("ordre incorrect");
    }

 }
 private void AffichPreOrdre(NoeudArbre N)
  {
    if (N != null){
      Preordre=Preordre+N.Info+" ";
      AffichPreOrdre(N.FG);
      AffichPreOrdre(N.FD);
    }
  }
  private void AffichInOrdre(NoeudArbre N){
    if(N != null){
      AffichInOrdre(N.FG);
      Inordre=Inordre+N.Info+" ";
      AffichInOrdre(N.FD);
    }
  }
  private void AffichPostOrdre(NoeudArbre N){
    if (N != null){
      AffichPostOrdre(N.FG);
      AffichPostOrdre(N.FD);
      Postordre=Postordre+N.Info+" ";
    }
  }



  public String PreOrdre(){
    this.AffichPreOrdre(Ref_Racine);
    return Preordre;
  }
  public String InOrdre(){
    this.AffichInOrdre(Ref_Racine);
    return Inordre;
  }
  public String PostOrdre(){
    this.AffichPostOrdre(Ref_Racine);
    return Postordre;
  }


}
