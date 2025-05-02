import java.sql.SQLOutput;

public class EnergyEfficiency {
    public static void main(String[] args) {
        //inicializar variables (del tipo que veas conveniente) para las calificaciones A, B, C, D, E, F y G
        // que correspondan a eficiencia energética e imprime en terminal concatenando cada string con cada
        // variable creada.

        char veryGood = 'A';
        char good = 'B';
        char fairlyGood = 'C';
        char neutral = 'D';
        char fairlyBad = 'E';
        char bad = 'F';
        char veryBad = 'G';

        //Reemplaza <very_good> concatenando el String con la variable creada. 
        System.out.println("Una calificación " + veryGood + " es muy buena.");

        //Reemplaza <good> concatenando el String con la variable creada. 
        System.out.println("Una calificación " + good + " es buena.");
        
        //Reemplaza <fairly_good> concatenando el String con la variable creada. 
        System.out.println("Una calificación " + fairlyGood + " es medianamente buena.");
        
        //Reemplaza <neutral> concatenando el String con la variable creada. 
        System.out.println("Una calificación " + neutral + " es neutral.");
        
        //Reemplaza <fairly_bad> concatenando el String con la variable creada. 
        System.out.println("Una calificación " + fairlyBad + " es medianamente mala.");
        
        //Reemplaza <bad> concatenando el String con la variable creada. 
        System.out.println("Una calificación " + bad + " es mala.");

        //Reemplaza <very_bad> concatenando el String con la variable creada.
        System.out.println("Una calificación " + veryBad + " es muy mala.");

    }
}
