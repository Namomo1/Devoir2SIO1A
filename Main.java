import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int choix = 0;
        do
        {
            do
            {
                System.out.println("1 : Exercice 1");
                System.out.println("2 : Exercice 2");
                System.out.println("0 : Quitter le programme");
                System.out.print("Votre choix : ");
                choix = input.nextInt();

            }while(choix < 0 || choix > 2);

            switch(choix)
            {
                case 1 :
                    // Ne pas effacer cette ligne
                    int[] tabExo1 = new int[5];

                    Random rand = new Random();

                    int somme = 0;
                    boolean contientUn = false;

                    System.out.print("Contenu du tableau : ");

                    for (int i = 0; i < 5; i++) {
                        tabExo1[i] = rand.nextInt(6) + 1;
                        System.out.print(tabExo1[i] + "-");

                        somme += tabExo1[i];

                        if (tabExo1[i] == 1) {
                            contientUn = true;
                        }
                    }

                    System.out.println("\nSomme du tableau = " + somme);


                    if (somme >= 18 && contientUn == false) {
                        System.out.println("Partie gagnée ");
                    } else {
                        System.out.println("Partie perdue ");
                    }



                    break;
                case 2 :
                    // Ne pas effacer cette ligne
                    int[] scoresPossibles = new int[]{0,15,30,40};

                    // Voici des exemples de parties que vous pourrez tester
                    String[] partie = new String[]{"A","B","B","A","A","A"};
                    //String[] partie = new String[]{"A","B","B","A","A","B","A","B","B","A","B","B"};
                    //String[] partie = new String[]{"B","B","B","B"};
                    //String[] partie = new String[]{"B","B","A","A","A","B","A","B","A","A"};

                    // A vous de jouer

                    break;
                case 0 :
                    System.out.println("FIN DU PROGRAMME");
                    break;
            }
        }while(choix!=0);
    }
}
