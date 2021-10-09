package za.ac.nwu.ac.web.sb.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class ExceptionForAllWarTest {
    ExceptionForAllWar exceptionForAllWar=new  ExceptionForAllWar();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown()
    {
    }

    @Test
   public void ExceptionHandlerTestWar()
    {
        exceptionForAllWar.ExceptionHandlerWar();
    }

}