package CLASE27;

import java.util.HashSet;

public class RegistroDeInvitados {
    private HashSet<String> invitados = new HashSet<>();

    public void agregarInvitado(String nombre) {
        String nombreFormateado = nombre.toLowerCase();
        invitados.add(nombreFormateado);
    }

    public void eliminarInvitado(String nombre) {
        String nombreFormateado = nombre.toLowerCase();
        invitados.remove(nombreFormateado);
    }

    public void mostrarInvitados() {
        for (String invitado : invitados) {
            System.out.println(invitado);
        }
    }
}