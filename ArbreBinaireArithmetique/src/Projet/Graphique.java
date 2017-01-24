package Projet;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Graphique extends JFrame {
  JPanel contentPane;
  ExpressionInfixée expr;
  Object [] [] DonneTableau=new Object[6][6];
  String[] NomColonne = {"1", "2"};
  ArbreExpression arbre=new ArbreExpression(java.lang.String.class);
  DessinArbre v=new DessinArbre(arbre);
  JMenuBar jMenuBar1 = new JMenuBar();
  JMenu jMenuFile = new JMenu();
  JMenuItem jMenuFileExit = new JMenuItem();
  JMenu jMenuHelp = new JMenu();
  JMenuItem jMenuHelpAbout = new JMenuItem();
  JPanel Panneau = new JPanel();
  JTextField exp = new JTextField();
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  JButton jButton4 = new JButton();
  JButton jButton5 = new JButton();
  JButton jButton6 = new JButton();
  JButton jButton7 = new JButton();
  JButton jButton8 = new JButton();
  JButton jButton9 = new JButton();
  JButton jButton10 = new JButton();
  JButton jButton11 = new JButton();
  JButton jButton12 = new JButton();
  JButton jButton13 = new JButton();
  JButton jButton14 = new JButton();
  JButton jButton15 = new JButton();
  JButton jButton16 = new JButton();
  JButton jButton17 = new JButton();
  JButton jButton18 = new JButton();
  JButton jButton19 = new JButton();
  JButton jButton110 = new JButton();
  BorderLayout borderLayout1 = new BorderLayout();
  JLabel jLabel1 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel6 = new JLabel();
  JLabel jLabel7 = new JLabel();
  JLabel jLabel8 = new JLabel();
  JLabel jLabel9 = new JLabel();
  JLabel jLabel10 = new JLabel();
  JLabel jLabel11 = new JLabel();
  JLabel jLabel12 = new JLabel();
  JLabel jLabel13 = new JLabel();

  //Construct the frame
  public Graphique() {
    enableEvents(AWTEvent.WINDOW_EVENT_MASK);
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
  //Component initialization
  private void jbInit() throws Exception  {
    contentPane = (JPanel) this.getContentPane();
    contentPane.setLayout(null);
    this.setSize(new Dimension(1012, 638));
    this.setTitle("Arbre D'expression Arithmétique");
    jMenuFile.setText("Fichier");
    jMenuFileExit.setText("Quitter");
    jMenuFileExit.addActionListener(new
    Graphique_jMenuFileExit_ActionAdapter(this));
    jMenuHelp.setText("?");
    jMenuHelpAbout.setText("A Propos...");
    jMenuHelpAbout.addActionListener(new
    Graphique_jMenuHelpAbout_ActionAdapter(this));
    Panneau.setBackground(Color.black);
    Panneau.setBounds(new Rectangle(99, 1, 808, 406));
    Panneau.setLayout(borderLayout1);
    exp.setFont(new java.awt.Font("Dialog", 1, 15));
    exp.setForeground(Color.blue);
    exp.setEditable(false);
    exp.setBounds(new Rectangle(660, 432, 229, 26));
    exp.setText("");
    jButton1.setBounds(new Rectangle(660, 496, 43, 28));
    jButton1.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton1.setActionCommand("1");
    jButton1.setText("1");
    jButton1.addActionListener(new Graphique_jButton1_actionAdapter(this));
    jButton2.setText("2");
    jButton2.addActionListener(new Graphique_jButton2_actionAdapter(this));
    jButton2.setActionCommand("1");
    jButton2.setBounds(new Rectangle(704, 496, 43, 28));
    jButton2.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton3.setText("3");
    jButton3.addActionListener(new Graphique_jButton3_actionAdapter(this));
    jButton3.setActionCommand("1");
    jButton3.setBounds(new Rectangle(748, 496, 43, 28));
    jButton3.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton4.setText("4");
    jButton4.addActionListener(new Graphique_jButton4_actionAdapter(this));
    jButton4.setActionCommand("1");
    jButton4.setBounds(new Rectangle(660, 528, 43, 28));
    jButton4.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton5.setText("5");
    jButton5.addActionListener(new Graphique_jButton5_actionAdapter(this));
    jButton5.setActionCommand("1");
    jButton5.setBounds(new Rectangle(704, 528, 43, 28));
    jButton5.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton6.setText("6");
    jButton6.addActionListener(new Graphique_jButton6_actionAdapter(this));
    jButton6.setActionCommand("1");
    jButton6.setBounds(new Rectangle(748, 528, 43, 28));
    jButton6.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton7.setText("7");
    jButton7.addActionListener(new Graphique_jButton7_actionAdapter(this));
    jButton7.setActionCommand("1");
    jButton7.setBounds(new Rectangle(660, 556, 43, 28));
    jButton7.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton8.setText("8");
    jButton8.addActionListener(new Graphique_jButton8_actionAdapter(this));
    jButton8.setActionCommand("1");
    jButton8.setBounds(new Rectangle(704, 556, 43, 28));
    jButton8.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton9.setText("9");
    jButton9.addActionListener(new Graphique_jButton9_actionAdapter(this));
    jButton9.setActionCommand("1");
    jButton9.setBounds(new Rectangle(748, 556, 43, 28));
    jButton9.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton10.setText("0");
    jButton10.addActionListener(new Graphique_jButton10_actionAdapter(this));
    jButton10.setActionCommand("1");
    jButton10.setBounds(new Rectangle(748, 584, 43, 28));
    jButton10.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton11.setText("+/-");
    jButton11.addActionListener(new Graphique_jButton11_actionAdapter(this));
    jButton11.setActionCommand("1");
    jButton11.setBounds(new Rectangle(660, 584, 88, 28));
    jButton11.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton12.setText("(");
    jButton12.addActionListener(new Graphique_jButton12_actionAdapter(this));
    jButton12.setActionCommand("1");
    jButton12.setBounds(new Rectangle(799, 496, 43, 28));
    jButton12.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton13.setText(")");
    jButton13.addActionListener(new Graphique_jButton13_actionAdapter(this));
    jButton13.setActionCommand("1");
    jButton13.setBounds(new Rectangle(848, 496, 43, 28));
    jButton13.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton14.setText("+");
    jButton14.addActionListener(new Graphique_jButton14_actionAdapter(this));
    jButton14.setActionCommand("1");
    jButton14.setBounds(new Rectangle(799, 526, 43, 28));
    jButton14.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton15.setText("-");
    jButton15.addActionListener(new Graphique_jButton15_actionAdapter(this));
    jButton15.setActionCommand("1");
    jButton15.setBounds(new Rectangle(848, 526, 43, 28));
    jButton15.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton16.setText("*");
    jButton16.addActionListener(new Graphique_jButton16_actionAdapter(this));
    jButton16.setActionCommand("1");
    jButton16.setBounds(new Rectangle(799, 555, 43, 28));
    jButton16.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton17.setText("/");
    jButton17.addActionListener(new Graphique_jButton17_actionAdapter(this));
    jButton17.setActionCommand("1");
    jButton17.setBounds(new Rectangle(848, 555, 43, 28));
    jButton17.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton18.setBounds(new Rectangle(799, 584, 92, 28));
    jButton18.setFont(new java.awt.Font("Monospaced", 1, 12));
    jButton18.setActionCommand("1");
    jButton18.setText("=");
    jButton18.addActionListener(new Graphique_jButton18_actionAdapter(this));
    jButton19.setBounds(new Rectangle(660, 464, 132, 28));
    jButton19.setFont(new java.awt.Font("SansSerif", 1, 16));
    jButton19.setActionCommand("1");
    jButton19.setText("CE");
    jButton19.addActionListener(new Graphique_jButton19_actionAdapter(this));
    jButton110.setBounds(new Rectangle(799, 464, 90, 28));
    jButton110.setFont(new java.awt.Font("SansSerif", 1, 15));
    jButton110.setActionCommand("1");
    jButton110.setText("<---");
    jButton110.addActionListener(new Graphique_jButton110_actionAdapter(this));
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 14));
    jLabel1.setText("Expression infixée:");
    jLabel1.setBounds(new Rectangle(21, 454, 142, 26));
    jLabel2.setBounds(new Rectangle(21, 478, 154, 26));
    jLabel2.setText("Expression Préfixée:");
    jLabel2.setFont(new java.awt.Font("Dialog", 1, 14));
    jLabel3.setBounds(new Rectangle(23, 500, 148, 26));
    jLabel3.setText("Forme Parenthésée:");
    jLabel3.setFont(new java.awt.Font("Dialog", 1, 14));
    jLabel4.setBounds(new Rectangle(22, 524, 126, 26));
    jLabel4.setText("Parcours Préfixé:");
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 14));
    jLabel6.setFont(new java.awt.Font("Dialog", 1, 14));
    jLabel6.setText("ParcoursPostfixé:");
    jLabel6.setBounds(new Rectangle(18, 568, 130, 26));
    jLabel7.setFont(new java.awt.Font("Dialog", 1, 14));
    jLabel7.setText("Parcours Infixé:");
    jLabel7.setBounds(new Rectangle(21, 545, 117, 26));
    jLabel8.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel8.setForeground(Color.blue);
    jLabel8.setText("");
    jLabel8.setBounds(new Rectangle(169, 454, 538, 23));
    jLabel9.setBounds(new Rectangle(182, 479, 467, 23));
    jLabel9.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel9.setForeground(Color.blue);
    jLabel9.setText("");
    jLabel10.setBounds(new Rectangle(178, 503, 474, 23));
    jLabel10.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel10.setForeground(Color.blue);
    jLabel10.setText("");
    jLabel11.setBounds(new Rectangle(149, 525, 504, 23));
    jLabel11.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel11.setForeground(Color.blue);
    jLabel11.setText("");
    jLabel12.setBounds(new Rectangle(138, 546, 518, 23));
    jLabel12.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel12.setForeground(Color.blue);
    jLabel12.setText("");
    jLabel13.setBounds(new Rectangle(146, 569, 536, 23));
    jLabel13.setFont(new java.awt.Font("Dialog", 1, 13));
    jLabel13.setForeground(Color.blue);
    jLabel13.setText("");
    contentPane.setBackground(Color.lightGray);
    jMenuFile.add(jMenuFileExit);
    jMenuHelp.add(jMenuHelpAbout);
    jMenuBar1.add(jMenuFile);
    jMenuBar1.add(jMenuHelp);
    contentPane.add(Panneau, null);
    contentPane.add(jLabel3, null);
    contentPane.add(jLabel4, null);
    contentPane.add(jLabel2, null);
    contentPane.add(jLabel1, null);
    contentPane.add(jLabel6, null);
    contentPane.add(jLabel7, null);
    contentPane.add(jLabel8, null);
    contentPane.add(jLabel9, null);
    contentPane.add(jLabel10, null);
    contentPane.add(jLabel11, null);
    contentPane.add(jLabel12, null);
    contentPane.add(jLabel13, null);
    contentPane.add(exp, null);
    contentPane.add(jButton1, null);
    contentPane.add(jButton19, null);
    contentPane.add(jButton110, null);
    contentPane.add(jButton13, null);
    contentPane.add(jButton12, null);
    contentPane.add(jButton3, null);
    contentPane.add(jButton2, null);
    contentPane.add(jButton5, null);
    contentPane.add(jButton4, null);
    contentPane.add(jButton6, null);
    contentPane.add(jButton14, null);
    contentPane.add(jButton15, null);
    contentPane.add(jButton17, null);
    contentPane.add(jButton16, null);
    contentPane.add(jButton9, null);
    contentPane.add(jButton8, null);
    contentPane.add(jButton7, null);
    contentPane.add(jButton11, null);
    contentPane.add(jButton10, null);
    contentPane.add(jButton18, null);
    this.setJMenuBar(jMenuBar1);
    exp.setText("( 12 + 9 )");
   v.arbre=new ArbreExpression(java.lang.String.class);
expr=new ExpressionInfixée(exp.getText());
    int i=0;
     Panneau.add(new JScrollPane(v),BorderLayout.CENTER);
    while(i<expr.Préfixée().length()){
     String c=this.Extraire(i,expr.Préfixée());
     v.ajoute(c);
      i+=c.length()+1;
    }
    jLabel8.setText(exp.getText());
    jLabel9.setText(expr.Préfixée());
    jLabel10.setText(v.arbre.Ref_Racine.toString());
    jLabel11.setText(v.arbre.PreOrdre());
    jLabel12.setText(v.arbre.InOrdre());
    jLabel13.setText(v.arbre.PostOrdre());


  }
  //File | Exit action performed
  public void jMenuFileExit_actionPerformed(ActionEvent e) {
    System.exit(0);
  }
  //Help | About action performed
  public void jMenuHelpAbout_actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(this,"Arbre D'expression Arithmétique"+
    								"\nRealisé par:"+
    								"\nADOLPHE Barclay,"+
    								"\nMORISSEAU Zephir,"+
    								"\nFOURRIEN Jerry Dudeley"+
    								"\net LAURORE Judersen"
                                  ,"\nArbre D'expression Arithmétique"
                                  ,JOptionPane.INFORMATION_MESSAGE);
  }
  //Overridden so we can exit when window is closed
  protected void processWindowEvent(WindowEvent e) {
    super.processWindowEvent(e);
    if (e.getID() == WindowEvent.WINDOW_CLOSING) {
      jMenuFileExit_actionPerformed(null);
    }
  }
  protected void paintComponent(Graphics g)
    {
      g.drawImage(new ImageIcon(getClass().getResource("font.jpg"))
                  .getImage(),0,0,null);

    }

  void jButton1_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+"1");
  }

  void jButton2_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+"2");
  }

  void jButton3_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+"3");
  }

  void jButton4_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+"4");
  }

  void jButton5_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+"5");
  }

  void jButton6_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+"6");
  }

  void jButton7_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+"7");
  }

  void jButton8_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+"8");
  }

  void jButton9_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+"9");
  }

  void jButton10_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+"0");
  }

  void jButton19_actionPerformed(ActionEvent e) {
exp.setText("");
  }

  void jButton11_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+"-");
  }

  void jButton12_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+"( ");
  }

  void jButton13_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+" )");
  }

  void jButton14_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+" + ");
  }

  void jButton15_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+" - ");
  }

  void jButton16_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+" * ");
  }

  void jButton17_actionPerformed(ActionEvent e) {
exp.setText(exp.getText()+" / ");
  }

  void jButton110_actionPerformed(ActionEvent e) {
exp.setText(exp.getText().substring(0,exp.getText().length()-1));
  }
  private String Extraire(int pos,String ch){
        String res="";
        int i=pos;
        boolean stop=false;
        while((stop==false)&&(i<ch.length())){
          if(ch.charAt(i)==' '){
            stop=true;
          }else
            res=res+ch.charAt(i);
            i++;
        }
        return res;
      }

  void jButton18_actionPerformed(ActionEvent e) throws PileVideException,
      PileSaturéeException, TypeIncompatibleException,
      TypeIncompatibleException, ArbreSatureException {

    v.arbre=new ArbreExpression(java.lang.String.class);
expr=new ExpressionInfixée(exp.getText());
    int i=0;
     Panneau.add(new JScrollPane(v),BorderLayout.CENTER);
    while(i<expr.Préfixée().length()){
     String c=this.Extraire(i,expr.Préfixée());
     v.ajoute(c);
      i+=c.length()+1;
    }
    jLabel8.setText(exp.getText());
    jLabel9.setText(expr.Préfixée());
    jLabel10.setText(v.arbre.Ref_Racine.toString());
    jLabel11.setText(v.arbre.PreOrdre());
    jLabel12.setText(v.arbre.InOrdre());
    jLabel13.setText(v.arbre.PostOrdre());
  }
}

class Graphique_jMenuFileExit_ActionAdapter
    implements ActionListener {
  Graphique adaptee;

  Graphique_jMenuFileExit_ActionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuFileExit_actionPerformed(e);
  }
}

class Graphique_jMenuHelpAbout_ActionAdapter
    implements ActionListener {
  Graphique adaptee;

  Graphique_jMenuHelpAbout_ActionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jMenuHelpAbout_actionPerformed(e);
  }
}

class Graphique_jButton1_actionAdapter
    implements java.awt.event.ActionListener{
  Graphique adaptee;

  Graphique_jButton1_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }

}

class Graphique_jButton2_actionAdapter
    implements java.awt.event.ActionListener{
  Graphique adaptee;

  Graphique_jButton2_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}

class Graphique_jButton3_actionAdapter
    implements java.awt.event.ActionListener{
  Graphique adaptee;

  Graphique_jButton3_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton3_actionPerformed(e);
  }
}

class Graphique_jButton4_actionAdapter
    implements java.awt.event.ActionListener{
  Graphique adaptee;

  Graphique_jButton4_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton4_actionPerformed(e);
  }
}

class Graphique_jButton5_actionAdapter
    implements java.awt.event.ActionListener{
  Graphique adaptee;

  Graphique_jButton5_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton5_actionPerformed(e);
  }
}

class Graphique_jButton6_actionAdapter
    implements java.awt.event.ActionListener{
  Graphique adaptee;

  Graphique_jButton6_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton6_actionPerformed(e);
  }
}

class Graphique_jButton7_actionAdapter
    implements java.awt.event.ActionListener{
  Graphique adaptee;

  Graphique_jButton7_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton7_actionPerformed(e);
  }
}

class Graphique_jButton8_actionAdapter
    implements java.awt.event.ActionListener{
  Graphique adaptee;

  Graphique_jButton8_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton8_actionPerformed(e);
  }
}

class Graphique_jButton9_actionAdapter
    implements java.awt.event.ActionListener{
  Graphique adaptee;

  Graphique_jButton9_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton9_actionPerformed(e);
  }
}

class Graphique_jButton10_actionAdapter
    implements java.awt.event.ActionListener{
  Graphique adaptee;

  Graphique_jButton10_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton10_actionPerformed(e);
  }
}

class Graphique_jButton19_actionAdapter
      implements java.awt.event.ActionListener{
  Graphique adaptee;

  Graphique_jButton19_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton19_actionPerformed(e);
  }
}

class Graphique_jButton11_actionAdapter
    implements java.awt.event.ActionListener{
  Graphique adaptee;

  Graphique_jButton11_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton11_actionPerformed(e);
  }
}

class Graphique_jButton12_actionAdapter
    implements java.awt.event.ActionListener{
  Graphique adaptee;

  Graphique_jButton12_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton12_actionPerformed(e);
  }
}

class Graphique_jButton13_actionAdapter
    implements java.awt.event.ActionListener{
  Graphique adaptee;

  Graphique_jButton13_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton13_actionPerformed(e);
  }
}

class Graphique_jButton14_actionAdapter
    implements java.awt.event.ActionListener {
  Graphique adaptee;

  Graphique_jButton14_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton14_actionPerformed(e);
  }
}

class Graphique_jButton15_actionAdapter
    implements java.awt.event.ActionListener {
  Graphique adaptee;

  Graphique_jButton15_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton15_actionPerformed(e);
  }
}

class Graphique_jButton16_actionAdapter
    implements java.awt.event.ActionListener {
  Graphique adaptee;

  Graphique_jButton16_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton16_actionPerformed(e);
  }
}

class Graphique_jButton17_actionAdapter
    implements java.awt.event.ActionListener {
  Graphique adaptee;

  Graphique_jButton17_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton17_actionPerformed(e);
  }
}

class Graphique_jButton110_actionAdapter
    implements java.awt.event.ActionListener {
  Graphique adaptee;

  Graphique_jButton110_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton110_actionPerformed(e);
  }
}

class Graphique_jButton18_actionAdapter
    implements java.awt.event.ActionListener {
  Graphique adaptee;

  Graphique_jButton18_actionAdapter(Graphique adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {

        try {
          adaptee.jButton18_actionPerformed(e);
        }
        catch (ArbreSatureException ex) {
        }
        catch (TypeIncompatibleException ex) {
        }
        catch (PileSaturéeException ex) {
        }
        catch (PileVideException ex) {
        }


  }
}