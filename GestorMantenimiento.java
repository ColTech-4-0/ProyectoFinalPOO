import java.util.ArrayList;

public class GestorMantenimiento {

    private ArrayList<IngenieroTecnico> ingenierosTecnicos;
    private ArrayList<IngenieroLider> ingenierosLideres;
    private ArrayList<Administrador> administradores;
    private ArrayList<EnfermeraJefe> enfermerasJefe;

    public GestorMantenimiento() {
        ingenierosTecnicos = new ArrayList<>();
        ingenierosLideres = new ArrayList<>();
        administradores = new ArrayList<>();
        enfermerasJefe = new ArrayList<>();
    }

    public void registrarIngenieroTecnico(IngenieroTecnico ingeniero) {
        ingenierosTecnicos.add(ingeniero);
        System.out.println("Ingeniero técnico registrado: " + ingeniero.nickname);
    }

    public void registrarIngenieroLider(IngenieroLider lider) {
        ingenierosLideres.add(lider);
        System.out.println("Ingeniero líder registrado: " + lider.nickname);
    }

    public void registrarAdministrador(Administrador admin) {
        administradores.add(admin);
        System.out.println("Administrador registrado: " + admin.nickname);
    }

    public void registrarEnfermeraJefe(EnfermeraJefe enfermera) {
        enfermerasJefe.add(enfermera);
        System.out.println("Enfermera jefe registrada: " + enfermera.nickname);
    }

    public ArrayList<IngenieroTecnico> getIngenierosTecnicos() { return ingenierosTecnicos; }
    public ArrayList<IngenieroLider> getIngenierosLideres() { return ingenierosLideres; }
    public ArrayList<Administrador> getAdministradores() { return administradores; }
    public ArrayList<EnfermeraJefe> getEnfermerasJefe() { return enfermerasJefe; }
}