class Vehiculo {

    private int anio;
    private String marca;
    private String modelo;
    private String color;
    private int ruedas;

    //Una variable estática se comparte entre todas las instancias de la clase
    private static int cantidadVehiculos = 0;

    //Método constructor: es aquel método que se encarga de inicializar nuestra instancia.
    public Vehiculo() {
        cantidadVehiculos++;
    }

    /* SOBRECARGA */
    /*
    marca = "Honda";
    auto3.marca = "Honda";
     */
    public Vehiculo(String marca) {
        //Configurar el atributo de marca al valor del parámetro de marca
        this.marca = marca;
        cantidadVehiculos++;
    }
    /*
    marca = "Honda"
    color = "rojo"
    auto4.marca = "Honda"
    auto4.color = "rojo"
     */
    public Vehiculo(String marca, String color) {
        this.marca = marca;
        this.color = color;
        cantidadVehiculos++;
    }

    public int getAnio() {
        return this.anio;
    }
    //anio = 2001
    //auto1.anio = 2001
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMarca(){
        return this.marca;
    }
    //marca = "Honda"
    //auto1.marca = "Honda"
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getRuedas() {
        return this.ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public static int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

}