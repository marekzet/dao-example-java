# dao-example-java
Demonstration of DAO pattern in Java.

## DAO
DAO is a pattern used interchangeably with Repository. The purpose of DAO is to abstract database code from the rest of the application. In comparison to Repository DAO provides access to single entity and defines standard operations to be performed on a model class (entity).

To implement DAO we need 3 objects:
* DAO interface - defines the operations to be performed on a model object or objects [EmployeeDAO](https://github.com/marekzet/dao-example-java/blob/master/src/mz/dao/core/EmployeeDAO.java)
* DAO implementation - implements DAO interface. Contains logic and code required to access data [EmployeeDAOImpl](https://github.com/marekzet/dao-example-java/blob/master/src/mz/dao/core/EmployeeDAOImpl.java)
* Model object - POJO class with accessors representing database table [Employee](https://github.com/marekzet/dao-example-java/blob/master/src/mz/dao/core/Employee.java)

## DAO vs Repository
From my point of view Repository is a pattern which resides close to the domain layer and it should be considered as part of Domain Driven Design. For more information about Domain Driven Design see [this article](http://culttt.com/2014/11/12/domain-model-domain-driven-design/).

In contrast to DAO, Repository provides access to Aggregate Roots not single entities and hides internal object state from the client. According to Martin Fowler, [Repositories acts as collection of in-memory domain objects](http://martinfowler.com/eaaCatalog/repository.html). Operations performed by Repositories expresses domain specific concepts. See [Ubiquitous Language](http://martinfowler.com/bliki/UbiquitousLanguage.html).
