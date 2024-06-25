package CLASE29;

public class ValidadorContrasena {

    public boolean esSegura(String contrasena) {
        return tieneLongitudCorrecta(contrasena) && tieneMayuscula(contrasena) && tieneMinuscula(contrasena) && tieneNumero(contrasena) && tieneCaracterEspecial(contrasena);
    }

    public boolean tieneLongitudCorrecta(String contrasena) {
        return contrasena.length() >= 8;
    }

    public boolean tieneMayuscula(String contrasena) {
        return contrasena.matches(".*[A-Z].*");
    }

    public boolean tieneMinuscula(String contrasena) {
        return contrasena.matches(".*[a-z].*");
    }

    public boolean tieneNumero(String contrasena) {
        return contrasena.matches(".*[0-9].*");
    }

    public boolean tieneCaracterEspecial(String contrasena) {
        return contrasena.matches(".*[!@#$%&*()_+=|<>?{}\\[\\]~-].*");
    }
}
