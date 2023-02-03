class HelloWorldTest {

    //Método principal, se ejecuta a primera instancia al ejecutar nuestro código
    public static void main(String[] args) {

        HelloWorld helloApp = new HelloWorld(); //Inicializando la clase HelloWorld
        System.out.println(helloApp.hola()); //Imprimiendo "¡Hola mundo!"
        System.out.println(helloApp.hola("Elena")); //Imprimiendo "Hola Elena"
        System.out.println(helloApp.hola("Elena", "De Troya"));
        System.out.println(helloApp.hola("Elena", 18));

        helloApp.hola_void();

    }

}