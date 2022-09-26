# TestVagrant_Test project

##### Technologies Used in TestVagrant_Project
* Java
* Cucumber
* Junit
* Gradle

To add project in your local, clone the repository from github and update all the dependencies accordingly
```$xslt
git clone https://github.com/vvekvarma9/TestVagrant_Project.git
git checkout master

To check whether the build is success or not

run command : ./gradlew build
```


##### To Run test :

From Command line(Added a cucumberTest task which can used to run tests from command-liine interface)

```$xslt
./gradlew cucumberTest -Pfeature=<feature path>
./gradlew cucumberTest -Ptags=<Tags available in project>
./gradlew cucumberTest -Pfeature=<feature path> -Ptags=<Tags available in project>
```
Example:

```$xslt
./gradlew cucumberTest -Ptags=@TestVagrant1
./gradlew cucumberTest -Pfeature=features/TeamRCD.feature
./gradlew cucumberTest -Pfeature=features/TeamRCD.feature -Ptags=@TestVagrant1
```

##### Test can also be run from Configuraions of IDE
* Click on Add configurations
* Add new JUNIT configuations
* Add all the fields accordingly based on the project

##### Cucumber Reports dependency is used to generate reports
* Path : target/cucumber 
* For now html & Json reports are generated.
* html reports can open in any browser

