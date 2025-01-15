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

# The Wicket Maven Archetype for Sakai

The Sakai Wicket Maven Archetype allows you to generate a sample Sakai app via a single Maven command.

The app is based on [Apache Wicket](http://wicket.apache.org) which integrates nicely with Sakai.

The app demonstrates how to get a Sakai tool styled, internationalised and registered, setup your own APIs, wire them up with Spring and inject them via annotations.

The 1.1 and up releases also include multi database support via Spring JDBC. It could easily be used as a base for a real tool.

## Latest version

1.6.0, based on Wicket 6.25.0

## Getting started

Run the following and follow the prompts:
`mvn archetype:generate -DarchetypeGroupId=org.sakaiproject.maven-archetype -DarchetypeArtifactId=sakai-wicket-maven-archetype -DarchetypeVersion=1.6.0 -DgroupId=org.sakaiproject.example -DartifactId=exampleApp`

The output of the above command will produce a project that you can build and deploy to Sakai via `mvn clean install sakai:deploy` or add to Eclipse and extend.
