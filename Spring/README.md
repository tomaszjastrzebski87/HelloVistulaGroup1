# Introduction to Spring Framework

This repository contains solution of the task 1 from the file named "PIERWSZE APLIKACJE PRZY UŻYCIU
FRAMEWORKA SPRING (BOOT)".

## Steps to run

1. Preparing the project according to the instructions sent by the lecturer. In this case it looks as following:

![Preparation](project-java-spring-tjastrz/images/preparation.png)

2. Unpacking a downloaded file.

3. Opening IDEA IntelliJ, chosing new -> project from existing sources and pointing the file in the unpacked folder:

![Opening](project-java-spring-tjastrz/images/opening.png)

4. IDE should load all required files then. After entering code as written below project may be run. We can also see warning about not finding templates, but it will be changed in next steps:

![Initial](project-java-spring-tjastrz/images/initial.png)

5. Creating package controller, new class in it - HelloController and entering the code:

![Controller1](project-java-spring-tjastrz/images/controller1.png)

6. Running the program, opening network browser and entering: 

```
http://localhost:8080
```

7. The result:

![Firstresult](project-java-spring-tjastrz/images/firstresult.png)

8. Changing HelloController and adding greeting.html:

![Controller2](project-java-spring-tjastrz/images/controller2.png)

![Greeting](project-java-spring-tjastrz/images/greeting.png)

9. Running the program again, opening network browser and entering: 

```
http://localhost:8080/greeting?name=Vistula
```

10. Enjoying the final result:

![Greeting](project-java-spring-tjastrz/images/finalresult.png)

#### Worth noting

The folder structure is actually:

![Static1](project-java-spring-tjastrz/images/static1.png)

However, in the IDE resources folder shows "static.images", which may be misleading. Please keep that in mind. 

![Static2](project-java-spring-tjastrz/images/static2.png)


## Contributing

Please open an issue first to discuss what you would like to change or / and add.

### Project image source

[Vistula University](https://vistula.edu.pl/promotion/zyczymy-optymizmu-pozytywnej-energii-i-realizacji-planow)
