package za.ac.nwu.ac.domain.exception;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ExceptionForDomainClassesTest {
    ExceptionForDomainClasses testExceptionForAllDomain = new ExceptionForDomainClasses();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown()
    {

    }
    @Test
    public void ExceptionHandlerTest()
    {
            testExceptionForAllDomain.ExceptionHandler();
    }
}