import java.util.ArrayList; //Importando la librería para utilizar la variable tipo objeto de arreglo
public class IntroAJava {

    public static void main(String[] args) {

        System.out.println("¡Hola mundo!");

        //Variables primitivas
        int miNumero; //Podemos declarar una variable sin establecer su valor
        miNumero = 400; //Después asignarle el valor
        double pi = 3.1416; //Podemos declarar y asignar un valor en la misma línea
        boolean bool = true; //true o false
        char singleChar = 'A'; //1 caracter

        String multiplesChars = "ABC"; //Múltiples caracteres/cadenas

        //Variables tipo objeto -> Métodos o funciones pre-hechas
        Integer myInt = 5000;
        Double myDouble = 5.99;
        Character myChar = 'A';

        System.out.println(miNumero);
        System.out.println(myInt);

        String myString = myInt.toString(); //Haciendo mi myInt en texto
        System.out.println(myString.length());

        //Cadenas - Strings
        String cadena = "Buenos días a todos mis Compañeros";
        int length = cadena.length(); //La longitud de mi texto
        System.out.println("La longitud de la cadena es: " + length);
        char letra = cadena.charAt(1); //Me regresa el char que se encuentra en la posición solicitada
        System.out.println(letra);

        int a = cadena.indexOf("Buenos"); //Regresa la posición en la que se encuentra la palabra "Buenos"
        System.out.println(a);
        int b = cadena.indexOf("compañeros");
        System.out.println(b);

        System.out.println(cadena.toLowerCase()); //Minúsculas
        System.out.println(cadena.toUpperCase()); //Mayúsculas

        String str1 = "Mi nombre es ";
        String str2 = "Elena de Troya";
        String str3 = str1.concat(str2); //Concatenar
        System.out.println(str3);

        String x = "hola";
        String y = "hola";
        System.out.println(x.equals(y)); //Comparar

        //Arreglos 
        int[] myArray; 
        myArray = new int[5]; //Inicializando mi arreglo con 5 posiciones
        myArray[0] = 4;
        myArray[1] = 8;
        myArray[2] = 8;
        myArray[3] = 5;
        myArray[4] = 9;

        //myArray[5] = 10; -> Excepción java.lang.ArrayIndexOutOfBoundsException al ejecutar

        System.out.println(myArray[2]);

        int[] myArray2 = {4, 8, 8, 5, 9};

        //myArray2[5] = 10;

        ArrayList<Integer> myArray3 = new ArrayList<Integer>();
        myArray3.add(10);


        //Condicionales y Operadores
        boolean llueve = true;
        boolean soleado = false;

        if(llueve) {
            System.out.println("Lleva un paraguas.");
        }

        if(soleado) {
            System.out.println("Ponte bloqueador");
        } else {
            System.out.println("Disfruta tu día");
        }

        llueve = false;
        soleado = true;

        if(llueve) {
            System.out.println("Lleva un paraguas.");
        } else if(soleado) {
            System.out.println("Ponte bloqueador");
        } else {
            System.out.println("Disfruta tu día");
        }

        int num1 = 10;
        int num2 = 6;
        if(num1 != num2) { // == IGUAL, != DIFERENTES, > MAYOR QUE, < MENOR QUE, >= MAYOR O IGUAL, <= MENOR O IGUAL
            System.out.println("Los numeros son distintos");
        }

        llueve = true;
        soleado = false;
        if(llueve && soleado) { //&& - Queremos que AMBAS condicionales se cumplan
            System.out.println("Busca el arcoiris");
        }

        if(llueve || soleado) { // || - Que se cumpla al menos una de la condicionales
            System.out.println("Quizás llueve, quizás está soleado, no lo sé.");
        }

        // if(llueve || (num1 != num2) || (num1 < num2)) {

        // }

        //Switch
        int dia = 5;
        if(dia == 1) {
            System.out.println("Lunes");
        } else if(dia == 2) {
            System.out.println("Martes");
        } else if(dia == 3) {
            System.out.println("Miércoles");
        }

        switch(dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("¿Qué día es entonces?");
        }

        //OPERADOR TERNARIO -> (condicional) ? "Si se cumple" : "No se cumple"
        System.out.println(llueve ? "Lleva tu paraguas" : "Ten un lindo día!");

        //BUCLES - Ciclos
        /*
        i = 0
        foo
        i = 1
        foo
        i = 2
        foo
        i = 3
        foo
        i = 4
        -------
        i = 6
        foo
        i = 7
         */
        int i = 0;
        while(i < 7) {
            System.out.println("foo");
            i++; //me va a aumentar en 1 la variable i
        }

        /*
        j = 0
        bar
        j = 1
        bar
        j = 2
        bar
        -------
        j = 6
        bar
        j = 7
         */
        for(int j=0; j < 7; j++) {
            System.out.println("bar");
        }

        int inicio = 0;
        int fin = 10;
        while (inicio < fin) {
            System.out.println("Inicio: "+inicio+" Final:"+fin);
            inicio++; //Aumentamos en 1
            fin -= 2; //Reducimos en 2
        }
 
    }

}