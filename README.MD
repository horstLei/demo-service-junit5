Arquillian / Junit5 Test on Wildfly with EJB Service and/or Rest in JakarteEE 8.0


to be able to access the local repo you have to add the file

~/.m2/settings-security.xml

<settingsSecurity>
    <master>OUTPUT OF THE COMMAND: mvn --encrypt-master-password</master>
</settingsSecurity>


# build

top level directory

mvn clean install -DskipTests

# test EJB

cd demo-test-ejb

execute single suite
mvn clean install -Parq-jboss-managed -Dtest=at.it4health.test.suite.DemoServiceSuiteTest


# test REST

cd demo-test-rest

