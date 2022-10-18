import java.util.Scanner;

public class tema1JB {

    public class Main {
        public static void main(String[] args) {
            ex1();
            ex2();
            ex3();
            ex4();
            ex5();
            ex6();
            ex7();
            ex8();


        }
        static void ex1() {
            //a.1. Scrieti un program care afiseaza “Imi place Java”
            System.out.println("Exercitiul a.1. - Java Basic 1");
            System.out.println("I like Java");
        }
        static String ex1CuString() {
            //a.1. Scrieti un program care afiseaza “Imi place Java”
            System.out.println("Exercitiul a.1. - Java Basic 1");
            return "Imi place Java";
        }

        static void ex2() {
            //a.2. Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”
            System.out.println("Exercitiul a.2. - Java Basic 1");

            System.out.println("Cursul acesta este foarte fain!");
            System.out.println("Cursul acesta este foarte fain!");
            System.out.println("Cursul acesta este foarte fain!");
            System.out.println("Cursul acesta este foarte fain!");
            System.out.println("Cursul acesta este foarte fain!");
            System.out.println("Cursul acesta este foarte fain!");

        }

        static void ex2Plus() {
            //a.2. Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”
            System.out.println("Exercitiul a.2. - Java Basic 1");

            for(int i = 0; i < 6; i++) {
                System.out.println("Cursul acesta este foarte fain!");
            }

        }

        static void ex2Personal() {
            //a.2. Scrieti un program care afiseaza de 6 ori propozitia “Cursul acesta este foarte fain!”
            System.out.println("Exercitiul a.2. - Java Basic 1");
            int i = 0;
            while (i < 6) {
                System.out.println("Cursul acesta este foarte fain!");
                i++;
            }
        }

        static void ex3() {
            //a.3. Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
            System.out.println("Exercitiul a.3. - Java Basic 1");

            int varstaAna = 24;
            int varstaDavid = varstaAna -6;
            System.out.println("Varsta lui David este: " + varstaDavid);

        }

        static void ex3Personal() {
            //a.3. Ana are 24 de ani. Fratele ei, David, e cu 6 ani mai mic. Scrieti un program care afiseaza varsta lui David.
            System.out.println("Exercitiul a.3. - Java Basic 1");

            int a = 24; //varsta Anei
            int b = 6;  //diferenta de varsta intre frati
            int c = a - b; //varsta lui David
            System.out.println("Varsta Anei: " + a);
            System.out.println("Diferenta de ani dintre frati (Ana e sora mai mare): " + b);
            System.out.println("Varsta lui David este: " + c);
        }


        static void ex4() {
            //a.4. Scrieti un program in care cititi o propozitie de la tastatura.
            System.out.println("Exercitiul a.4. - Java Basic 1");
            Scanner myScanner = new Scanner(System.in);
            String text = myScanner.nextLine();
            System.out.println(text);
        }


        static void ex4Personal() {
            //a.4. Scrieti un program in care cititi o propozitie de la tastatura.
            System.out.println("Exercitiul a.4. - Java Basic 1");

            String propozitie;
            Scanner citire = new Scanner(System.in);
            System.out.println("O propozitie de la tastatura");
            propozitie = citire.nextLine();
        }
        static int ex5() {
            //Scrieti un program in care definiti 3 variabile in metoda “myVariables”, un int, un String si un boolean, apoi apelati metoda din metoda “main”.
            System.out.println("Exercitiul a.5. - Java Basic 1");
            int a;
            String b;
            boolean c;
            return 1;
        }

        static boolean ex6() {
            //Scrieti un program in care creati o metoda unde cititi 2 numere de la tastatura, le stocati in variabile, si dupa ce le-ati citit, afisati-le pe ecran.
            System.out.println("Exercitiul a.6. - Java Basic 1");

            Scanner myScanner = new Scanner(System.in);
            System.out.println("Introduceti primul numar: ");
            int scannerNumar1 = myScanner.nextInt();
            //trece la urmatoarea linie
            myScanner.nextLine();
            System.out.println("Introduceti al doilea numar: ");
            int scannerNumar2 = myScanner.nextInt();
            System.out.println("Numarul 1 este " + scannerNumar1 + ".  " + "Numarul 2 este " + scannerNumar2);
            return true;
        }

        static void ex7() {
            //Scrieti un program incare cititi de la tastatura un numar, si calculati:

            // - rezultatul sumei cu 5

            // - rezultatul scaderii cu 12.3

            // - rezultatul inmultirii cu -3.2

            // - rezultatul impartirii cu 4

            // - rezultatul modulului cu 6

            System.out.println("Exercitiul a.7. - Java Basic 1");

            System.out.println("Cititi de la tastatura un numar si calculati:");
            Scanner myScanner = new Scanner(System.in);
            int x = myScanner.nextInt();
            int suma = x + 5;
            System.out.println("Adunati cu 5, adunarea este: " + suma);
            double scadere = (double) x - 12.3; //trebuie sa ii facem un casting lui x in double; casting = transformare;
            System.out.println("Scadeti cu 12.3, rezultat dupa scadere este: " + scadere);
            double inmultire = (double) x * -3.2;
            System.out.println("Inmultiti cu -3.2, rezultat dupa inmultire este " + inmultire);
            int impartire = x / 4;
            System.out.println("Impartiti la 4, rezultatul impartirii este " + impartire);
            int restImpartire = x % 6;
            System.out.println("Restul impartirii la 6 este " + restImpartire);
        }

        static String ex8() {
            //Stergeti un singur comment din programul acesta in asa fel incat rezultatul afisat sa fie 12 si 2:

//               public class Solution {

//                         public static void main(String[] args) {

//                                     int x = 2;

//                                     int y = 12;


//                                     // y = x * y;

//                                     // y = x + y;


//                                     x = y - x;

//                                     y = y - x;

//                                     System.out.println(x);
//                                     System.out.println(y);
//                         }
// }
            System.out.println("Exercitiul a.8. - Java Basic 1");

            int x = 2;
            int y = 12;

            //y * x = y;
            y = y + x;

            x = y - x;
            y = y - x;

            System.out.println(x);
            System.out.println(y);
            return "Felicitari!";
        }
    }

    }
