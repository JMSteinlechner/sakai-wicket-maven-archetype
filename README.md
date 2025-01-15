# Getting started (for this fork)

The original repository did not work out of the box when trying to build for sakai 23-SNAPSHOT so i tried to fix all the erros. Seems to work for 23-SNAPSHOT with this version.

All you have to do:

```
git clone https://github.com/JMSteinlechner/sakai-wicket-maven-archetype

cd sakai-wicket-maven-archetype
mvn clean install
cd ..

# (replace exampleApp with your tools name)
mvn archetype:generate -DarchetypeGroupId=org.sakaiproject.maven-archetype -DarchetypeArtifactId=sakai-wicket-maven-archetype -DarchetypeVersion=1.7-SNAPSHOT -DgroupId=org.sakaiproject.exampleApp -DartifactId=exampleApp -DarchetypeCatalog=local
```

For additional information refer to the original git.
