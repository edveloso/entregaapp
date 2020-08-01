# Comandos do Jboss cli

### Adicionando modulos no jboss cli

module add --name=com.mysql --resources=/repository/mysql/mysql-connector-java/8.0.20/mysql-connector-java-8.0.20.jar --dependencies=javax.api,javax.transaction.api

### Removendo modulos 

module remove --name=com.mysql

### Adicionando o jdbc-driver

/subsystem=datasources/jdbc-driver=mysql2:add(driver-name=mysql2,driver-module-name=com.mysql,driver-xa-datasource-class-name=com.mysql.cj.jdbc.MysqlXADataSource)

### Removendo o jdbc-driver

/subsystem=datasources/jdbc-driver=mysql2:remove

### Criando o datasource

 data-source add --name=entregaappDS --jndi-name=java:jboss/datasources/entregaappDS --driver-name=mysql2 --connection-url=jdbc:mysql://localhost:3306/entregadb?createDatabaseIfNotExist=true --user-name=root --password=xxxxx --min-pool-size=10 --max-pool-size=20
 
 
 ### Removendo o datasource

 data-source remove --name=entregaappDS
 
 
 ### Repositorio forkado com commandos do jboss-cli
 
 https://github.com/edveloso/jboss-cli-snippets-compilation/blob/master/README.md
 
 
  
