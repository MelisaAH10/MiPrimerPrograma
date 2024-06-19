package CLASE27;

import java.util.ArrayList;
import java.util.HashSet;

public class GestorDeContactos {
    private ArrayList<Contacto> contactosArrayList;
    private HashSet<Contacto> contactosHashSet;

    public GestorDeContactos() {
        contactosArrayList = new ArrayList<>();
        contactosHashSet = new HashSet<>();
    }

    public void agregarContactoArrayList(Contacto contacto) {
        if (!contactosArrayList.contains(contacto)) {
            contactosArrayList.add(contacto);
        }
    }

    public void eliminarContactoArrayList(Contacto contacto) {
        contactosArrayList.remove(contacto);
    }

    public void agregarContactoHashSet(Contacto contacto) {
        contactosHashSet.add(contacto);
    }

    public void eliminarContactoHashSet(Contacto contacto) {
        contactosHashSet.remove(contacto);
    }

    public void mostrarContactosArrayList() {
        for (Contacto contacto : contactosArrayList) {
            System.out.println(contacto);
        }
    }

    public void mostrarContactosHashSet() {
        for (Contacto contacto : contactosHashSet) {
            System.out.println(contacto);
        }
    }
}
