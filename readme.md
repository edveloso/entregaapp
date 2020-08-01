Adicionando modulos no jboss cli

module add --name=com.mysql --resources=/repository/mysql/mysql-connector-java/8.0.20/mysql-connector-java-8.0.20.jar --dependencies=javax.api,javax.transaction.api

removendo modulos 
 module remove --name=com.mysql

adicionando o jdbc-driver
 /subsystem=datasources/jdbc-driver=mysql2:add(driver-name=mysql2,driver-module-name=com.mysql,driver-xa-datasource-class-name=com.mysql.cj.jdbc.MysqlXADataSource)

removendo o jdbc-driver
/subsystem=datasources/jdbc-driver=mysql2:remove

criando o datasource

 data-source add --name=entregaappDS --jndi-name=java:jboss/datasources/entregaappDS --driver-name=mysql2 --connection-url=jdbc:mysql://localhost:3306/entregadb?createDatabaseIfNotExist=true --user-name=root --password=xxxxx --min-pool-size=10 --max-pool-size=20
 
 
 removendo o datasource

 data-source remove --name=entregaappDS
 
  