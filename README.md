# Proyecto com.bank/BancoRegional



## Configura datasource de Mysql 8

Configura el data source en payara 5 

```
<?xml version="1.0" encoding="UTF-8"?>
<persistence version="2.2" xmlns="http://java.sun.com/xml/ns/persistence" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd">
  <persistence-unit name="BankDB_PU" transaction-type="JTA">
    <jta-data-source>jdbc/BankDB</jta-data-source>
    <class>com.bank.bancoregional.api.repository.ClienteRepository</class>
    <class>com.bank.bancoregional.api.entity.Cliente</class>
    <exclude-unlisted-classes>false</exclude-unlisted-classes>
    <properties>
      <property name="javax.persistence.schema-generation.database.action" value="drop-and-create"/>
    </properties>
  </persistence-unit>
</persistence>
```


## Correr la aplicacion desde Netbeans 12

Arranca la aplicacion desde netbeans 12 

