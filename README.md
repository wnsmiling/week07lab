mvn archetype:generate -DgroupId=com.example \ 
-DartifactId=JavaTest \
-DarchetypeArtifactId=maven-archetype-quickstart \
-DinteractiveMode=false



mvn clean
mvn compile
mvn exec:java