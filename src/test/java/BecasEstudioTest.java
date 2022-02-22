import ejercicioRecuperacion.BecaEstudio;
import ejercicioRecuperacion.Helpers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class BecasEstudioTest {
Helpers servicioMock = Mockito.mock(Helpers.class);

@BeforeAll
public static void before(){
    Helpers servicioMock = Mockito.mock(Helpers.class);
    MockedStatic<Helpers> mockedStatic =Mockito.mockStatic(Helpers.class);
    mockedStatic.when(()->Helpers.applicaBeca(12345)).thenReturn(true);
    mockedStatic.when(()->Helpers.applicaBeca(54321)).thenReturn(true);
    mockedStatic.when(()->Helpers.applicaBeca(11111)).thenReturn(false);
}

    @Test
    public void verifyAplicaBeca(){
    Mockito.when(servicioMock.getNota(12345)).thenReturn(95);
    BecaEstudio becaEstudio = new BecaEstudio(servicioMock);
    String actual =becaEstudio.recomendacionBeca(12345);
    String expected ="SI APLICA A BECA";
    Assertions.assertEquals(actual,expected,"EROOR");
    }

    @Test
    public void verifyNoAplicaBeca(){
        Mockito.when(servicioMock.getNota(54321)).thenReturn(50);
        BecaEstudio becaEstudio = new BecaEstudio(servicioMock);
        String actual =becaEstudio.recomendacionBeca(54321);
        String expected ="NO APLICA A BECA POR PROMEDIO ACADEMICO";
        Assertions.assertEquals(actual,expected,"EROOR");
    }

    @Test
    public void verifyAplicaBecaFalse(){
        Mockito.when(servicioMock.getNota(11111)).thenReturn(100);
        BecaEstudio becaEstudio = new BecaEstudio(servicioMock);
        String actual =becaEstudio.recomendacionBeca(12345);
        String expected ="SI APLICA A BECA";
        Assertions.assertEquals(actual,expected,"EROOR");
    }


}
