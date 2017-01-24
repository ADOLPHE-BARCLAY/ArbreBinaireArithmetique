package Projet;


public class ListeDoubleChainee implements Liste {
 public  static int max_size=100;
 Noeud t�te;
 Noeud queue;
 public int lg;
 public Class typeDesEl�ments;
  public ListeDoubleChainee(int n,Class c) {
   typeDesEl�ments=c;
   max_size=n;
  }
  public ListeDoubleChainee(Class c) {
    this(max_size,c);
   }
   public int taille(){return lg;}
   public Object r�cup�rer(int pos)
       throws PositionInvalideException,ListeVideException
   {
     if(vide())throw new ListeVideException();
    if(pos<1||pos>lg)throw new PositionInvalideException();
Noeud q=t�te;
     for(int i=1;i<pos;i++){
       q=q.succ;
     }
     return q.info;
   }
   public void ins�rer(int pos,Object o)
       throws PositionInvalideException,ListeSatureeException,TypeIncompatibleException
   {
     if(o.getClass()!=typeDesEl�ments)throw new
          TypeIncompatibleException();
    if(satur�e())throw new ListeSatureeException();
    if(pos<1||pos>lg+1)throw new
          PositionInvalideException();

     Noeud n=new Noeud(o);
     if(lg==0)t�te=queue=n;
     if(pos==1){
       t�te.prec=n;
       n.succ=t�te;
       t�te=n;
     }
     else
       if(pos==lg+1){
         queue.succ=n;
         n.prec=queue;
         queue=n;
       }
       else{
         Noeud p=null,q=t�te;
         for(int i=1;i<pos;i++){
           p=q;
           q=q.succ;
         }
         p.succ=n;n.prec=p;n.succ=q;q.prec=n;
       }
       lg++;
   }
   public void supprimer(int pos)
       throws PositionInvalideException,ListeVideException
   {
     if(vide())throw new ListeVideException();
  if(pos<1||pos>lg)throw new PositionInvalideException();
     if(lg==1)t�te=queue=null;
       else if(pos==1){
         t�te=t�te.succ;
         t�te.prec=null;
       }
       else if(pos==lg){
         queue=queue.prec;
         queue.succ=null;
       }
       else{
         Noeud q=t�te,p=null;
         for(int i=1;i<pos;i++){
           p=q;
           q=q.succ;
         }
         q.succ.prec=p;
         p.succ=q.succ;
       }
    lg--;
   }
   public boolean equals(Liste l)
       throws PositionInvalideException,TypeIncompatibleException,ListeVideException
   {
return this.equals(l);
   }
   public Liste copie(){
      return this;
   }
   public boolean vide(){
     return (taille()==0);
   }
   public boolean satur�e(){
     return (taille()==max_size);
   }
   public void affiche(){
     Noeud q=t�te;
     for(int i=1;i<=taille();i++){
      System.out.println(q.info);
      q=q.succ;
     }
   }
static public void main(String [] argv) throws TypeIncompatibleException,
      ListeSatureeException, PositionInvalideException, ListeVideException,
      PositionInvalideException {
     ListeDoubleChainee n=new ListeDoubleChainee(java.lang.Integer.class);
     for(int i=1;i<10;i++)

    {
      n.ins�rer(i, new Integer(i + 1));
    }

      System.out.print( (Integer) n.r�cup�rer(10));

   }
 }
