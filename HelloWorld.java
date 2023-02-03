class HelloWorld {

    /*
    Tipo de función: public, private, protected
    STATIC - Pendiente
    Tipo de valor de retorno: String, int, double. Si NO regresa nada es void
    Nombre de la función
    (Parámetros que vamos a recibir junto con el tipo de variable)
     */
    public static String hola() {
        return "¡Hola mundo!";
    }

    /* SOBRECARGA */
    //nombre = "Elena"
    public static String hola(String nombre) {
        return "Hola "+nombre;
    }
    
    //nombre = "Elena"
    //apellido = "De Troya"
    public static String hola(String nombre, String apellido) {
        return "Hola "+nombre+" "+apellido;
    }

    public static String hola(String nombre, int edad) {
        return "Hola "+nombre+ " con edad de: "+edad;
    }

    public static void hola_void(){
        System.out.println("Hola en void");
        System.out.println("Hola en void 2");
    }


}