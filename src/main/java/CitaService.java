import java.time.LocalDate;

public class CitaService {

    public static String validar(String codigo, String nombre, String documento, LocalDate fecha) {

        if (!codigo.matches("C\\d{3}")) {
            return "Ingrese un código de cita válido";
        }

        if (!nombre.matches("[a-zA-Z]{5,}")) {
            return "El nombre del paciente debe tener al menos cinco caracteres alfabéticos";
        }
        if (!documento.matches("\\d{8}")) {
            return "Ingrese un número de documento válido";
        }

        return "La cita ha sido registrada correctamente";
    }
}
