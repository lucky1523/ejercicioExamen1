import ejercicioRecuperacion.Helpers;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class BecasEstudioTest {
Helpers servicioMock = Mockito.mock(Helpers.class);

@BeforeAll
public static void before(){
    MockedStatic<>
}

@Test
public void verify(){
    Mockito.when(servicioMock.getNota())
}
}
