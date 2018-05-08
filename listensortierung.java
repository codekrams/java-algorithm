
package listensortierung;


public class ListenSortierung {
    public static void main(String[] args) {
        int [] test = {9,8,7,6,5};
        
        System.out.print("Input: ");
        for (int i=0; i<test.length; i++) {    
            System.out.print(test[i]);
        }
        System.out.println();
        
        sortierung(test);
                    
        System.out.print("Output: ");
        for (int j=0; j<test.length; j++) {
            System.out.print(test[j]);
        }
        
        System.out.println();
    }
    
public static int [] sortierung (int[] liste) {
    int listenplatz = 0; 
    for (int i=1; i<liste.length; i++) {
        for(int j=0; j<liste.length-i; j++) { 
            if (liste[j]>liste[j+1]) {
            listenplatz = liste[j];
            liste[j]=liste[j+1];
            liste[j+1]=listenplatz;
            }
            for (int k=0; k<liste.length; k++){ //ist nur die Zwischenausgabe, um zu überprüfen, ob die Schritte wirklich so ablaufen
                System.out.print(liste[k]);
            }
            System.out.println(); //Bestandteil der Zwischenausgabe zwischen Input und Output
        }
        System.out.println(); //Bestandteil der Zwischenausgabe zwischen Input und Ouptut
    }
    return liste;
}    
    
}