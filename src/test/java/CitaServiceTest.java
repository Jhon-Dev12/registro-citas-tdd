import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CitaServiceTest
{
    @Test
    @DisplayName("Prueba con código de cita válido")
    void test1_codigoValido() {
        String resultado = CitaService.validar(
                "C123",
                "Carlos",
                "12345678",
                LocalDate.now().plusDays(1)
        );

        assertEquals("La cita ha sido registrada correctamente", resultado);
    }

    @Test
    @DisplayName("Prueba con código de cita inválido")
    void test2_codigoInvalido() {
        String resultado = CitaService.validar(
                "1234",
                "Carlos",
                "12345678",
                LocalDate.now().plusDays(1)
        );

        assertEquals("Ingrese un código de cita válido", resultado);
    }

    @Test
    @DisplayName("Nombre inválido")
    void test3_nombreInvalido() {
        String resultado = CitaService.validar(
                "C123",
                "Alex",
                "12345678",
                LocalDate.now().plusDays(1)
        );

        assertEquals("El nombre del paciente debe tener al menos cinco caracteres alfabéticos", resultado);
    }

    @Test
    @DisplayName("Documento inválido")
    void test4_documentoInvalido() {
        String resultado = CitaService.validar(
                "C123",
                "Carlos",
                "1234678",
                LocalDate.now().plusDays(1)
        );

        assertEquals("Ingrese un número de documento válido", resultado);
    }

    @Test
    @DisplayName("Fecha inválida")
    void test5_fechaInvalida() {
        String resultado = CitaService.validar(
                "C123",
                "Carlos",
                "12345678",
                LocalDate.now()   
        );

        assertEquals("La fecha de la cita debe ser posterior a la fecha actual", resultado);
    }


}