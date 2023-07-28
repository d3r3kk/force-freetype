# force-freetype

Very basic java program to test libfreetype is available at runtime

Usage, JDK11:

```bash
mvn package
mvn exec:java
```

Usage, JDK17+ (some Linux don't have a JDK17+ compatible maven installed...):

```bash
mkdir -p $HOME/.my_maven
cd $HOME/.my_maven
mvn_current_version = "3.9.3" # current version of Maven is 3.9.3 at the time of writing this.
curl -O https://dlcdn.apache.org/maven/maven-3/3.9.3/binaries/apache-maven-$mvn_current_version-bin.tar.gz 
tar -xzf apache-maven-$mvn_current_version-bin.tar.gz
export PATH=$PWD/apache-maven-$mvn_current_version/bin:$PATH
cd path/to/force-freetype
mvn package
mvn exec:java
```
