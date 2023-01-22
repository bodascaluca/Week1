public class Main {
    static float prezzo = 12.5F;// Questa è globale
    /*
    * metodo principale di Java / Java essenod che un linguaggio compilato quando lo runniamo prima lo deve trasformare in qualcosa
    * che la macchina lo può leggere. Java fa parte dei linguaggi interpretati, si bas su un softweare interprete
    * Il file che andiamo a scrivere che ha un estenssione .java non è eseguibile così com'è, ma per farlo funzionare abbiamo installato
    * l'ambiente di sviluppo java il JDK (Java developed Kit). Il JDK è un iseme di software che contengo diverse sotto implementazioni
    *  in cui c'è anchje il compilatore. Quando andaimo a proddure questo file qua (psvm) lo dobbismo andare a compliare quindi a trasformare
    * non è un eseguibile finale, ma un file .class. Quando andiamo a compilare si producce dentro questa struttura di cartelle in un altra
    * cartella che viene creatra in quel momento questi file che hanno questa estenssione .class finale e la parte iniziale è uguale a quando
     abbiamo iniziato a scrivere questo file. Questo file,class (main.class) continee una serie di istruzioni che sono capibili alla java
     * virtual machine. La Java virtual machine prende il file.class e lo trasforma nell'eseguibile per il sistema per cui è stato installato (mac, windows,linux).
     */

    /*
    * Quando lanciamo questo main.class, dobbiamo far in modo che parta e sappia da dove partire. Per standardizzare allo stesso modo ed è stato implementato
    * questo metodo main.
    * Questo metodo è publico, public indicatore di visibilità ed è possibile da vedere anche da questa classe essendo public.
    * Static è un altro indicatore di visibilità
    * Satic ci permette di andare ad usare il codice che si trova all'interno di questo metodo senza ad andare a creare un oggetto.
    * Quando noi abbiamo creato la classe dobbiamo renderla concreta traformando nei oggetti. C'è la possibilità di  andare a richiamre questi metodi
    *  senza dover creare un oggetto. Per far questo marchiamo con uno static, il metodo e richiamabile in questo caso un nome che è main.
    *
    * Senza ad andare a chiamare l'oggetto il quale di solito vengono richimati i metodi.
    * E' la stessa java virtual machine che dall'esterno richiama il metodo main, ed è per questo è public, è static perché non creiamo
    * prima gli oggetti, lo chiamo così com'è (non passa nella fase della creazione degli oggetti). Viene preso come punto di partenza
    *
    *   VOID
    *   Si mette questo perché non si deve tornare niente quando si chiama.
    *
    *   Quando eseguiamo il metodo ci possono essere dei errori e ci vengono mandati dei messaggi con il punto dell'errore che vengono
    *  intercettati dalla java virtual machine.
    * Nel momento in cui esce dal blocco del metodo vengono distutti tutte le variabili e in più produce un messaggio di stato che ha un
    * valore numerico zero(vuol dire che il metodo è stato completto e chiuso bene )
    *
    *  String[] args è un altro escamotage che hanno dato per poter far partire l'applicazione. Nel terminale --> java Main (lo mando in esecuzione)
    * Io dentro main posso passare dei valore (Anche stringa) che poi servono a main per poter conettersi al server.  -java Main 10
    * Significa che posso ad esmpio args[0] = "5"; il 10 di prima viene raccolto e po inizializzato.
    * String[] identifica un array
    *
    * Potrebbe essere considerato tutto il codice che sto scrivendo dentro il metodo main è un array con nome args. args è
    * dichiarato nel metodo, ma non viene richiamto, args si usa per convenzione.
    * */

    public static void main(String[] args) {
        args[0] = "5";

        /*
        Java è tipizzato quindi oltre il nome anche che cos'è.
        * Numerico: intero                 decimale
        *          byte,short, int,long    flot-double
        * --> +    long + int = long (doveva essere per forza long)
        *          byte + short = int (Il compilatore vuole questo anche se short è più grande di byte)
        *          float genera 6/7 cifre dopo la virgola
        *          double genera 14/15 cifre dopo la virgola
        *
        * */
        //Il colore è diverso e quindi è diverso dalla prima riga 2
        float prezzo = 10.5F; //Per forza da mettere la f se no ci da errore
        //Non è globale
        char carattere = 'c'; // Può essere solo una lettera
        char carratere2 = 100 ; // Puo essere un intero valore numerico in cui coripsonde la lettera asseconda di una tabella . Ci permmette di gestire 65525 caratteri
        // Posso sommare due numeri char e ottenere un numero che corisponde a una lettera

        String cognome = "kkkkkkk";
        /*Non sono tipi primitivi come le variabili numeriche e i valori di tipo char sono dei tipi di dato che vengono gestite da una classe
         che  è appunto la classe String. Una serie di istruzioni che sono state racchiudse all'interno di una struttura cher contine queste istruzzioni cioè la clsse String
         Queste classi conterrano dei metodi e possimao applicare questi metodi alla stringa (tutto in maiuscolo, in minuscolo, spezzare la parolo ogni..)
         * */

        // Non sono priomitive, sono tipi di dato che vengono gestite da una classse chiamata String. E' un tipo di dato comolesso. Essendo unaclasse possiamo avere dei metodi
        //le Stringhe risolvono delle problematiche attraverso i metodi
        // i nomei non posso essere spezati/ non si puo ussare "-", Si usa il camel case
        final String MARCO= "MArco"; // NOn posso andare a modificare questo dato rimane così per sempre
        // Scritto in maiuscolo è una costante e si scrive così

        // Tutto ciò che è dichiarato dentro il merodo esistono solo dentro il metodo
        //strutture di controllo --> selezione e interazione
            //Selezione --> if()     or switch
    }

          void stampa(int a){
            // Istruzioni di stampa / prezzo si vede solo all'interno del metodo se non dobbiamo dichiararla fuori dai metodi
              prezzo = 0;
              a++; // a=a+1;
    }
    // Per eviatare l'esecuzione sequenziale ttramite le struttorre di controllo

    /*
    Int vs integer
    https://www.zoomingin.net/differenze-tra-int-ed-integer-in-java/
    Un int è un primitivo, Non si tratta di un oggetto.
    Un int può essere utilizzato per calcolare i numeri interi compresi tra:

    -2,147,483,648 e +2,147,483,647.
    Come sappiamo un int sono 32 bit di informazione. Il valore che assume una variabile dichiarata come int può essere modificata nel corso del programma

    INTEGER
     l’Integer. Ora abbiamo a che fare con un oggetto.
    Al suo interno l’Integer contiene un campo intero

    L’Integer è immutabile: l’unico modo per cambiargli il valoreè quello di creare un nuovo oggetto Integer per mezzo del comando

    new Integer
    */



}