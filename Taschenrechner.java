import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.02.2013
  * @author 
  */

public class Taschenrechner extends Frame {
  // Anfang Attribute
  private JTextField zahl1 = new  JTextField();
  private JTextField zahl2 = new JTextField();
  private JButton plus = new JButton();
  private JButton mal = new JButton();
  private JButton minus = new JButton();
  private JButton geteilt = new JButton();
  private JButton kgv = new JButton();
  private JButton ggt = new JButton();
  private JButton modus = new JButton();
  private JButton prim = new JButton();
  private JLabel Ergebnis = new JLabel();
  private JLabel Hinweis = new JLabel();
  double a,b;
  int ga,gb;
  Rechner r; //Referenzvariable erzeugen
  // Ende Attribute
  
  public Taschenrechner(String title) { 
      

    // Frame-Initialisierung
    super(title);
    addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent evt) { dispose(); }
    });
    int frameWidth = 500; 
    int frameHeight = 250;
    setSize(frameWidth, frameHeight);
    Font f = new Font("Monospaced", Font.BOLD, 28);
    Font f2 = new Font("Monospaced", Font.BOLD, 18);
    setResizable(true);
    Panel cp = new Panel(null);
    add(cp);
    // Anfang Komponenten
    
    cp.setBackground(Color.WHITE);
    zahl1.setBounds(32, 48, 75, 25);
    
    zahl1.setText("");
    cp.add(zahl1);
    zahl2.setBounds(32, 96, 75, 25);
    zahl2.setText("");
    cp.add(zahl2); 
    
    plus.setBounds(152, 48, 50, 35);
    plus.setText("+");
    plus.setFont(f);
    plus.setMargin(new Insets(2, 2, 2, 2));
    plus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        plus_ActionPerformed(evt);
      }
    });
    cp.add(plus);
    
    mal.setBounds(224, 48, 50, 35);
    mal.setText("*");
    mal.setFont(f);
    mal.setMargin(new Insets(2, 2, 2, 2));
    mal.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        mal_ActionPerformed(evt);
      }
    });
    cp.add(mal);
    
    minus.setBounds(152, 96, 50, 35);
    minus.setText("-");
    minus.setFont(f);
    minus.setMargin(new Insets(2, 2, 2, 2));
    minus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        minus_ActionPerformed(evt);
      }
    });
    cp.add(minus);
    
    geteilt.setBounds(224, 96, 50, 35);
    geteilt.setText("/");
    geteilt.setFont(f);
    geteilt.setMargin(new Insets(2, 2, 2, 2));
    geteilt.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        geteilt_ActionPerformed(evt);
      }
    });
    cp.add(geteilt);
    
    kgv.setBounds(296, 96, 70, 35);
    kgv.setText("kgV");
    kgv.setFont(f2);
    kgv.setMargin(new Insets(2, 2, 2, 2));
    kgv.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        kgv_ActionPerformed(evt);
      }
    });
    cp.add(kgv);
    
    ggt.setBounds(296, 48, 70,35 );
    ggt.setText("ggT");
    ggt.setFont(f2);
    ggt.setMargin(new Insets(2, 2, 2, 2));
    ggt.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        ggt_ActionPerformed(evt);
      }
    });
    cp.add(ggt);
    

    modus.setBounds(370, 48, 70,35 );
    modus.setText("Bin");
    modus.setFont(f2);
    modus.setMargin(new Insets(2, 2, 2, 2));
    modus.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        modus_ActionPerformed(evt);
      }
    });
    cp.add(modus);
  
    prim.setBounds(370, 96, 70,35 );
    prim.setText("Prim");
    prim.setFont(f2);
    prim.setMargin(new Insets(2, 2, 2, 2));
    prim.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        prim_ActionPerformed(evt);
      }
    });
    cp.add(prim);
    
    
    Ergebnis.setBounds(32, 152, 301, 35);
    Ergebnis.setFont(f);
    Ergebnis.setText("= ");
    cp.add(Ergebnis);
    
    Hinweis.setBounds(32, 10, 450, 35);
    Hinweis.setText("Bitte Zahlen eingeben. Achtung: Punkt statt Komma. Prim nur 1. Zahl");
    cp.add(Hinweis);
    // Ende Komponenten
    
    setVisible(true);
    
    r = new Rechner();
  } // end of public Taschenrechner
  
  // Anfang Methoden
  public void plus_ActionPerformed(ActionEvent evt) {
     // TODO hier Quelltext einf?gen
     if (getz() ){
     double e = a +b;
     Ergebnis.setText("= "+ e); 
    }
     else Ergebnis.setText("Zahlen eingeben");
  } // end of plus_ActionPerformed
  
  public void mal_ActionPerformed(ActionEvent evt) {
     // TODO hier Quelltext einf?gen
     if (getz() ){
     double e = a *b;
     Ergebnis.setText("= "+ e); 
      }
     else Ergebnis.setText("Zahlen eingeben");
  } // end of mal_ActionPerformed
  
  public void minus_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf?gen
     if (getz() ){
    double e = a -b;
    Ergebnis.setText("= "+ e); 
     }
     else Ergebnis.setText("Zahlen eingeben");
  } // end of minus_ActionPerformed
  
  public void geteilt_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einf?gen
      if (getz() ){
    double e = a /b;
    Ergebnis.setText("= "+ e); 
     }
     else Ergebnis.setText("Zahlen eingeben");
  } // end of geteilt_ActionPerformed
 
  
  // end of ggt_Act 
  public void kgv_ActionPerformed(ActionEvent evt) {
      if (getz() ){
    int e = r.berechneKGV (ga, gb);
     Ergebnis.setText("= "+ e); 
      }
     else Ergebnis.setText("Zahlen eingeben");
  } // end of kgv_ActionPerformed
  
  public void ggt_ActionPerformed(ActionEvent evt) {
  if (getz() ){
   int e = r.berechneGGT(ga, gb);    
    Ergebnis.setText("= "+ e); 
     }
     else Ergebnis.setText("Zahlen eingeben");
}

public void modus_ActionPerformed(ActionEvent evt) {
  if (getz() ){
//     int e =  ga%gb;    
//     Ergebnis.setText("= "+ e); 
    String  bin = r.berechneBin(ga); ;
    Ergebnis.setText("= "+ bin); 
     }
     else Ergebnis.setText("Zahlen eingeben");
}

public void prim_ActionPerformed(ActionEvent evt) {
   if ( !zahl1.getText().isEmpty() ){
    int a = Integer.parseInt(zahl1.getText() ); 
   
    boolean pz = r.istPrimzahl(a);
      if (pz)  Ergebnis.setText("Ja"); 
      else Ergebnis.setText("Nein"); 
    }
    else Ergebnis.setText("1. Zahl eingeben");
}


    
  private boolean getz()
  {   
       if (zahl1.getText().isEmpty() && zahl2.getText().isEmpty()) return false;
      
      if (!zahl1.getText().isEmpty()) {
        a =  Double.parseDouble(zahl1.getText() ); //Kommazahl f?r Rechnungen
        ga = Integer.parseInt(zahl1.getText() ); //Ganze Zahl f?r ggt, Mod ...
    }
 
     if (!zahl2.getText().isEmpty()) {
       b  = Double.parseDouble(zahl2.getText() );
       gb = Integer.parseInt(zahl2.getText() );
      }
        else { 
        Ergebnis.setText(Ergebnis.getText() +" 2. Zahl fehlt.");
        }
    
     return true;   
    }
        
        

  
  
  public static void main(String[] args) {
    new Taschenrechner("Taschenrechner");

  } // end of main
  
  
} // end of class Taschenrechner
