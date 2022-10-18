package tema2.adelina;

import java.util.*;

import static java.lang.System.in;

public class Tema2 {

        public static void main(String[] args) {

        }

        static void ex1Personal() {
//                Citit un numar de la tastatura si stocati valoarea lui intr-o variabila. Generati
//            un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila. Daca numarul
//            introdus de la tastatura este mai mic decat numarul random generat, afisati mesajul
//            “Numarul introdus este mai mic decat <numar_random>” (inserati valoarea numarului random
//            generat in textul afisat).
            System.out.println("Tema 2 - exercitiul B1");
            Scanner scanner = new Scanner(in);
            System.out.println("Cititi un numar de la tastatura:");
            int numar = scanner.nextInt();
            scanner.nextLine();

            Random random = new Random();
            int numar_random = random.nextInt(1, 100);
            System.out.println("Numarul random generat este: " + numar_random);
            if (numar < numar_random) {
                System.out.println("Numarul introdus este mai mic decat numarul random generat!");
            } else {
                System.out.println("Numarul introdus este mai are decat numarul random generat!");
            }
        }


        static void ex1Retro6() {
//                Citit un numar de la tastatura si stocati valoarea lui intr-o variabila. Generati
//            un numar random intre 1 si 100 si stocati acel numar intr-o alta variabila. Daca numarul
//            introdus de la tastatura este mai mic decat numarul random generat, afisati mesajul
//            “Numarul introdus este mai mic decat <numar_random>” (inserati valoarea numarului random
//            generat in textul afisat).
            System.out.println("Tema 2 - exercitiul B1");
            System.out.println("Introduceti un numar de la tastatura si comparati cu numarul generat random");
            Scanner A = new Scanner(System.in);
            int A1 = A.nextInt();
            System.out.println("S-a introdus de la tastatura numarul: " + A1);
            Random Numar = new Random();
            int B = Numar.nextInt(1, 100);
            System.out.println("Numarul " + B + " este aleatoriu. ");
            if (A1 < B) {
                System.out.println("Numarul introdus este mai mic decat numarul generat random: " + A1 + " < " + B);
            } else {
                System.out.println("Numarul introdus este mai mare decat numarul generat random: " + B + "\n");
            }
        }


        static void ex2Personal() {
//          Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind
//      structura switch, daca s-a introdus un caracter anume, realizati operatia respectiva cu
//      cele 2 numere, si afisati rezultatul pe ecran:
//      -‘a’: adaugare
//      -‘s’: scadere
//      -‘i’: inmultire
//      -‘p’: impartire
//      -‘m’: modul
//          Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
            System.out.println("Tema 2 - exercitiul B2");
            System.out.println("Cititi un caracter de la tastatura: ");
            Scanner scanner = new Scanner(in);
            String caracter = scanner.next();
            System.out.println("Caracterul citit de la tastatura este: " + caracter);

            System.out.println("Cititi doua numere de la tastatura: ");
            int numar1 = scanner.nextInt();
            int numar2 = scanner.nextInt();
            System.out.println("Doua numere citite de la tastatura sunt: " + numar1 + " si " + numar2);

            //SWITCH
            String operator = "default";

            switch (operator) {
                case "a":
                    System.out.println("Adunarea numerelor citite de la tastatura este: " + (numar1 + numar2));
                    break;
                case "s":
                    System.out.println("Scaderea numerelor citite de la tastatura este: " + (numar1 - numar2));
                    break;
                case "i":
                    System.out.println("Inmultirea numerelor citite de la tastatura este: " + (numar1 * numar2));
                    break;
                case "p":
                    System.out.println("Impartirea numerelor citite de la tastaura este: " + (numar1 / numar2));
                    break;
                case "m":
                    System.out.println("Modulul numerelor citite de la tastatuta este: " + numar1 % numar2);
                default:
                    System.out.println("Nu exista operatiuni de efectuat!");
            }
        }


        static void ex2Retro6() {
//          Citit un caracter si 2 numere de la tastatura, si stocati-le in variabile. Folosind
//      structura switch, daca s-a introdus un caracter anume, realizati operatia respectiva cu
//      cele 2 numere, si afisati rezultatul pe ecran:
//      -‘a’: adaugare
//      -‘s’: scadere
//      -‘i’: inmultire
//      -‘p’: impartire
//      -‘m’: modul
//          Daca nu s-a introdus un caracter valid, afisati un mesaj de eroare.
            System.out.println("Introduceti un caracter si doua numere de la tastatura si comparati acestea cu valorile oferite");
            Scanner A = new Scanner(System.in);
            String A1 = A.next();
            System.out.println("S-a introdus de la tastatura caracterul: " + A1);
            Scanner B = new Scanner(System.in);
            int B1 = B.nextInt();
            System.out.println("S-a introdus de la tastatura primul numar: " + B1);
            Scanner C = new Scanner(System.in);
            int C1 = C.nextInt();
            int D; // rezultatul final
            System.out.println("S-a introdus de la tastatura al doilea numar: " + C1);

            switch (A1) {
                case "a":
                    D = B1 + C1;
                    System.out.println("Adauga valore= " + D);
                    break;
                case "s":
                    D = B1 - C1;
                    System.out.println("Scadere valoare= " + D);
                    break;
                case "i":
                    D = B1 * C1;
                    System.out.println("Inmultire valore = " + D);
                    break;
                case "p":
                    D = B1 / C1;
                    System.out.println("Impartire valoare = " + D);
                    break;
                case "m":
                    D = B1 % C1;
                    System.out.println("Modul valoare = " + D);
                    break;
                default:
                    System.out.println("Nu avem valoare corecta!");
            }
        }


        static void ex3Personal() {
            // Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente.
//        Initializati array-ul. Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.
            int[][] twoD_array = new int[3][5];
            twoD_array[0][0] = 6;
            twoD_array[0][1] = 7;
            twoD_array[0][2] = 17;
            twoD_array[0][3] = 1;
            twoD_array[0][4] = 19;
            twoD_array[1][0] = 25;
            twoD_array[1][1] = 15;
            twoD_array[1][2] = 16;
            twoD_array[1][3] = 32;
            twoD_array[1][4] = 55;
            twoD_array[2][0] = 29;
            twoD_array[2][1] = 30;
            twoD_array[2][2] = 2;
            twoD_array[2][3] = 11;
            twoD_array[2][4] = 44;

            System.out.println("Primele elemente sunt: " + twoD_array[0][0] + " si " + twoD_array[0][1] +
                    " iar ultimele elemente sunt: " + twoD_array[2][3] + " si " + twoD_array[2][4] + ".");
        }


        static void ex3Retro6() {
            //Definiti un array de 2 dimensiuni, fiecare dimensiune sa aiba cate 3, respectiv 5 elemente.
//        Initializati array-ul. Afisati primele si ultimele elemente din fiecare dimensiune pe ecran.
            System.out.println("Printam pe consola primele si ultimele elemente din fiecare dimensiune.");
            String[][] matr_2_dim = new String[3][5]; // array bidimensional
            matr_2_dim[0][0] = "prima valoare de pe primul rand";
            matr_2_dim[0][4] = "ultima valoare de pe primul rand";
            matr_2_dim[2][0] = "prima valoare de pe ultimul rand";
            matr_2_dim[2][4] = "ultima valoare de pe ultimul rand";
            System.out.println(matr_2_dim[0][0]);
            System.out.println(matr_2_dim[0][4]);
            System.out.println(matr_2_dim[2][0]);
            System.out.println(matr_2_dim[2][4]);
        }


        static void ex4Retro6() {  //personal nu am reusit sa rezolv complet
            //Definiti un array de char-uri. Iterati array-ul folosind structura for, si afisati pe ecran
            // cate al doilea caracter din sir.

            //Aici am incercam o rezolvare
            //char JavaCharArray[] = new char[];
//        for (char JavaCharArray = 0; JavaCharArray < 10; JavaCharArray++) {
//            if (JavaCharArray <= 10 && JavaCharArray >= 1) {
//                System.out.println("Afisati pe ecran cate al doilea carater din sir: " + JavaCharArray);
//            }
//        }
            System.out.println("Tiparim valorile termenilor secundari din lista de caractere");
            char[] arrayChar = new char[4];
            int i;
            arrayChar[0] = 'a';
            arrayChar[1] = 'z';
            arrayChar[2] = 'b';
            arrayChar[3] = 'x';
            for (i = 0; i < arrayChar.length - 1; i++) ;
            if (i % 2 == 0) ;
        }


        static void ex5Personal() {
            //Definiti un array de double, cu valori zecimale. Iterati array-ul folosind strutura for, si
            // daca un element este egal cu valoarea 4.5, afisati-l pe ecran. Daca un element este mai
            // mare decat 5, afisati mesajul “Element peste 5”.

            double doubleArray[] = {6.3, 4.9, 1.7, 1.2, 2.4, 1.2, 4.5, 5.8, 3.5, 3.1};
            for (int index = 0; index < doubleArray.length; index++) {
                System.out.println(doubleArray);
                if (index == (int) 4.5) {
                    System.out.println("4.5");
                } else if (index > 5) {
                    System.out.println("Element peste 5!");
                }
            }
        }


        static void ex5Retro6() {
            //Definiti un array de double, cu valori zecimale. Iterati array-ul folosind strutura for, si
            // daca un element este egal cu valoarea 4.5, afisati-l pe ecran. Daca un element este mai
            // mare decat 5, afisati mesajul “Element peste 5”.
            System.out.println("Tiparim valorile unei matrice pe care o iteram pentru a determina valorile ei.");
            double[] exercitiu1 = {-20, 15, -3, 4.3, 5, 3.2, 4.5, 6, 9};
//sortam inainte array
            for (int UltimulElement = exercitiu1.length - 1; UltimulElement >= 0; UltimulElement--) {
                for (int i = 0; i < UltimulElement; i++) {
//                if( exercitiu1[i] > exercitiu1[i+1]) {
//                    swap(exercitiu1, i, i+1);
//                }
                }
            }
            for (int i = 0; i < exercitiu1.length; i++) {
                System.out.println(exercitiu1[i]);
            }
            for (int i = 0; i < exercitiu1.length; i++) {
                double Numar = 4.5;
                if (Numar > exercitiu1[i]) {
                    System.out.println("Avem element mai mic ca 4.5" + exercitiu1[i]);
                } else if (Numar == exercitiu1[i]) {
                    System.out.println("Avem element egal cu 4.5" + exercitiu1[i]);
                } else {
                    System.out.println("Element mai mare sau egal cu 5." + exercitiu1[i]);
                }
            }
        }

        static void swap(int[] array, int i, int j) {
            if (i == j) {
                return;
            }
            double temporar = array[i];
            array[i] = array[j];
            array[j] = (int) temporar;
        }


        static void ex6Retro6() {
            // Definiti un array cu 9 elemente si parcugeti-l cu structura for (tipul de date este la alegere).
            // Daca iteratia este la indexul 2, sa se sara peste. Daca iteratia este la indexul 7, sa se opreasca
            // iteratia. Altfel, sa se afiseze mesajul “Index valid” pe ecran.
            System.out.println("Avem un sir de 9 elemente si sarim elementul 2.");
            int[] exercitiu = {10, -9, 3, 6, -3, 5, 7, 2, -10};
            for (int LastElemnet = exercitiu.length - 1; LastElemnet >= 0; LastElemnet--) {
                for (int i = 0; i < LastElemnet; i++) {
                    if (exercitiu[i] > exercitiu[i + 1]) {
                        swap(exercitiu, i, i + 1);
                    }
                }
            }
            for (int i = 0; i < exercitiu.length; i++) {
                System.out.println(exercitiu[i]);
            }
            for (int i = 0; i < exercitiu.length; i++) {
                int iteratie = i;
                if (iteratie == 1) {
                    System.out.println("Termen sarit!");
                    break;
                } else if (iteratie == 6) {
                    System.out.println("Iteratie orpita!");
                    return;
                } else {
                    System.out.println("Index valid!");
                }
            }
        }


        static int ex7Personal() {
            //Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
            List<Integer> numere = Arrays.asList(3, 45, 17, 15, 22);
            int sum = numere.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Suma tuturor elementelor este: " + sum);
            return sum;
        }

        static void ex7Retro6() {
            //Definiti o lista de Integer, de 5 elemente. Calculati suma tuturor elementelor.
            List<Integer> listInteger = Arrays.asList(1, 5, 10, 20, 100);
            //echivalent
//        List<Integer> integerList2 = new ArrayList<>();
//        listInteger.add(200);
            int sum = 0;
//        for (Integer numarul: listInteger) {
//            sum += numarul;
//        }
//        System.out.println("Suma = " + sum);
            //ECHIVALENT
            for (int i = 0; i < listInteger.size(); i++) {
                sum += listInteger.get(i);
            }
            System.out.println("Suma = " + sum);
        }


        static void ex8Personal() {
            //Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
            int[] arrayEx8 = new int[8];
            List<String> elemente = new ArrayList<>();
            if (arrayEx8 == null) {
                System.out.println("Array-ul definit este gol.");
            } else {
                System.out.println("Array-ul definit nu este gol.");
            }

            if (elemente.isEmpty()) {
                System.out.println("Lista definita este goala.");
            } else {
                System.out.println("Lista definita nu este goala.");
            }

        }


        static void ex8Retro6() {
            //Definiti un array si o lista. Determinati daca ele sunt goale sau nu.
            List<Integer> listText = new ArrayList<>();
            listText.add(2);
            System.out.println(listText.isEmpty());
            int[] arrayEx8 = new int[4];
            if (arrayEx8 == null) {
                System.out.println("Array-ul definit este gol.");
            } else {
                System.out.println("Array-ul definit nu este gol.");
            }
        }
}
