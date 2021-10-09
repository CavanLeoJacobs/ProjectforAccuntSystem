package za.ac.nwu.ac.repo.exception;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class ExceptionForRepositoryClassesTest {
    ExceptionForRepositoryClasses exceptionHandlerRepository= new ExceptionForRepositoryClasses();
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown()
    {
    }
    @Test
    public void ExceptionForRepository()
    {
        exceptionHandlerRepository.ExceptionHandlerRepository();
    }


}