public class equipo {

// clase de equipos
    String placa;
    String marca;
    String nombre;
    String funcion;
    String estado;
    String FechaMantenimiento;

    //constructro parametros

    public equipo(String placa , String marca, String nombre, String funcion, String estado, String FechaMantenimiento) {
        this.placa = placa;
        this.marca = marca;
        this.nombre = nombre;
        this.funcion = funcion;
        this.estado = estado;
        this.FechaMantenimiento = FechaMantenimiento;

    }
    // getter and setter del equipo
    public String getPlaca() { return placa; } 
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getFuncion() { return funcion; }
    public void setFuncion(String funcion) { this.funcion = funcion; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getFechaMantenimiento() { return FechaMantenimiento; }
    public void setFechaMantenimiento(String FechaMantenimiento) { this.FechaMantenimiento = FechaMantenimiento; }





}
