package weeked;

public class es1 {

    public static void main(String[] args) {
    /*
    *Esercizio 1
        Creare un programma che conti quante lettere ci sono in una frase, compresi gli spazi
        e specifichi quante sono le vocali e quante le consonanti.

        Implementazione:
        - per le vocali si possono contare le singole vocali.

        ************************************************************************************
    * */

        String frase = "Ciao Marco ";
        String fraseT = frase.trim().toLowerCase() ;
        System.out.println("La frese dopo i metodi è "+fraseT);
        int conteggio = frase.length();
        System.out.println("La parola contiene " + conteggio + " caratteri");

        char array[] = frase.toCharArray();
        char vocali[] ={'a','e','i','o','u'};

        /*for (int lettere : array) {
            System.out.println("Le lettere sono: " + lettere);
        }*/

        byte conteggioVocali= 0;
        byte conteggioConsonanti = 0;

        byte conteggioA= 0;
        byte conteggioE= 0;
        byte conteggioI= 0;
        byte conteggioO= 0;
        byte conteggioU= 0;

        for (int j = 0; j < array.length; j++) {
            char vedo = array[j];
            System.out.println("Lettera "+vedo);

            if(vedo == 'a'){
               conteggioVocali++;
               conteggioA++;
            } else if(vedo == 'e'){
                conteggioVocali++;
                conteggioE++;
            } else if(vedo == 'i') {
                conteggioVocali++;
                conteggioI++;
            }else if(vedo == 'o') {
                conteggioVocali++;
                conteggioO++;
            }else if(vedo == 'u') {
                conteggioVocali++;
                conteggioU++;
            }else if (vedo != ' '){
                conteggioConsonanti++;
            }
        }

        System.out.println("Le vocali sono "+conteggioVocali);
        System.out.println("Le consonanti sono "+conteggioConsonanti);

        System.out.println("Le a sono "+conteggioA);
        System.out.println("Le e sono "+conteggioE);
        System.out.println("Le i sono "+conteggioI);
        System.out.println("Le o sono "+conteggioO);
        System.out.println("Le u sono "+conteggioU);

    }
}
