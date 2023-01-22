package weeked;

public class es2 {
    public static void main(String[] args) {
        /*
         *
         * Esercizio 2
            Scriviamo un'applicazione che:
            - in modo casuale estragga un numero tra 1 e 10 (uso    Math.random() )
            - estragga 50 numeri sempre compresi tra 1 e 10
            - conti quante volte c'è ail numero della prima estrazione tra quelli della seconda

            Implementazione:
            - Stampare i numeri estratti in blocchi da 10 (usando il metodo del resto)
         * */

        int estratti10[] = new int[10];
        int numeroRandom = (int) (1+Math.random()*11);
        char conteggioNumero = 0;

        for(int i = 0; i<estratti10.length;i++){
            estratti10[i] = (int) (1+Math.random()*11);
            int numeri = estratti10[i];
            System.out.println("Dieci nuemori: "+numeri+" ");
        }

        System.out.println(" ");
        int estratti50[] = new int[50];
        for(int i=0; i<estratti50.length;i++ ){
            estratti50[i]=(int) (1+Math.random()*11);

            if(i%10==0){
                System.out.println();
            }

            if(estratti50[i]==numeroRandom)
                conteggioNumero++;


            System.out.print(estratti50[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Il numero "+numeroRandom+" è presento nel secondo lancio "+conteggioNumero+" volte");








    }
}
