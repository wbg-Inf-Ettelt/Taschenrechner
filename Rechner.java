
/**
 * Beschreiben Sie hier die Klasse Rechner.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Rechner
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen


    /**
     * Konstruktor f?r Objekte der Klasse Rechner
     */
    public Rechner()
    {
        // Instanzvariable initialisieren
  
    }

    
    public boolean istPrimzahl(int n)
   {
     int i, t;
     boolean teilbar = false;
     i = 2;
        while ( (i < n) && !teilbar)
        {
            t = n;
            do
            {
                t = t - i;
            }
            while (t > 0);
            if (t == 0)
                teilbar = true;
            else
                i = i + 1;
        }
    return!teilbar;
  }
  
  public int folge(int n)
  {
    if (n==0) return 1;
    return folge(n-1) +n;
    
    }
  
    public String berechneBin(int ga) {
  
      String  bin ="";
//ga ist eine ganze Zahl
while (ga >0)
    {
       int e =  ga%2;   
        bin = e + bin;
        ga = Math.abs(ga/2);
    }
        return "= "+ bin;
        }
        
     public int berechneGGT(int a, int b) {
         while (a % b != 0) {
             int rest = a % b; a = b;
             b = rest;
            }
        return b; 
    } 
      public int berechneKGV(int a, int b) {
         /**
         * Hier die Bestimmung des KGV einf?gen!
         * Es gilt:
         *  ggt * kgv = a * b 
         */
         int ggt = berechneGGT(a,b);
         int kgv = a*b/ggt;
        return kgv; 
    }
    
    
}
