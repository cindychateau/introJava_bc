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

    }

}