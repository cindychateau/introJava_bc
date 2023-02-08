class TestVehiculo {

    public static void main (String[] args) {

        //Crear un vehiculo
        Vehiculo auto1 = new Vehiculo(); //hacemos una nueva instancia
        //auto1.anio = 2001;
        auto1.setAnio(2001);
        //auto1.marca = "Honda";
        auto1.setMarca("Honda");
        // auto1.modelo = "Civic";
        // auto1.color = "blanco";
        // auto1.ruedas = 4;

        System.out.println("Marca Auto1:"+ auto1.getMarca());

        System.out.println("Cantidad de V:" + Vehiculo.getCantidadVehiculos());

        //Creamos un auto2
        // Vehiculo auto2 = new Vehiculo();
        // auto2.anio = 2018;
        // auto2.marca = "Mazda";
        // auto2.modelo = "CX-3";
        // auto2.color = "azul";
        // auto2.ruedas = 4;

        // System.out.println("Marca Auto2:"+ auto2.marca);

        //Creamos auto3
        Vehiculo auto3 = new Vehiculo("Honda");

        //Creamos auto4
        Vehiculo auto4 = new Vehiculo("Honda", "rojo");

        System.out.println("Cantidad de V:" + Vehiculo.getCantidadVehiculos());

    }
}