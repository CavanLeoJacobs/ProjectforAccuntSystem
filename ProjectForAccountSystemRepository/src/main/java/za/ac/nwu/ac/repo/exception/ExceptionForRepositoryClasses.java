package za.ac.nwu.ac.repo.exception;


import za.ac.nwu.ac.repo.config.RepositoryConfig;

public class ExceptionForRepositoryClasses {

    RepositoryConfig repositoryConfig= new RepositoryConfig();
    public void ExceptionHandlerRepository()
    {

        try
        {
            repositoryConfig.dataSource();
            repositoryConfig.buildJpaProperties();
           // repositoryConfig.transactionManager();
           // repositoryConfig.getJdbcTemplate();
           // repositoryConfig.exceptionTranslation();
           // repositoryConfig.entityManagerFactory();

        }
        catch (Exception error) {

            System.out.println(error.getMessage()+"\n");
            System.out.println("Failed to pass this test");
        }
    }
}
