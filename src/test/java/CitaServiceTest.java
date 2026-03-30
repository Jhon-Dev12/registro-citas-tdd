import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CitaServiceTest
{
    @Test
    void test1_codigoValido() {
        String resultado = CitaService.validar(
                "C123",
                "Carlos",
                "12345678",
                LocalDate.now().plusDays(1)
        );

        assertEquals("La cita ha sido registrada correctamente", resultado);
    }

}