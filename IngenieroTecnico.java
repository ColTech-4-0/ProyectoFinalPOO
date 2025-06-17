
public class IngenieroTecnico extends Persona {
    
    private boolean permisos;
    private String FechaInicioContrato;
    private String FechaFinContrato;
    
    
    public IngenieroTecnico(String Nombre, int cedula, String nickname, String cargo) {
        super(Nombre, cedula, nickname, cargo);
        
        this.permisos = permisos;
        this.FechaInicioContrato = FechaInicioContrato;
        this.FechaFinContrato = FechaFinContrato;
    }
    
}
