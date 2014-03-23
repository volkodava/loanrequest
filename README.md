loanrequest
===========

Fixed and adopted sample application from Activiti in Action book to version 5.14

NOTES
===========
Ant build.xml file in the root directory of application used to generate a BAR file containing the process definition.
When we run create.loanrequest Ant target, a BAR file is created in the dist directory that contains the loan request process definition.
In the same directory, a JAR file containing the Java service task class is created.
To run the example, you have to copy the newly created loanrequest.jar file to the
webapps/activiti-explorer/WEB-INF/lib directory of the Tomcat distribution in Activiti (inside the apps folder).
Now that you have the Java classes on the Tomcat classpath and you’ve created a
BAR file with the loan request process definition, you can deploy the loan request example to the Activiti Engine.