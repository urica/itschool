# ITSchool

*This document will help you set up the environment for the Java course.*

### 1. Install Java 17 on your machine
- Download the installer from: https://download.oracle.com/java/17/archive/jdk-17.0.10_windows-x64_bin.exe
- Install Java from the installer
- Check that Java was correctly installed by opening a terminal and writing `java -version`

### 2. Install IntelliJ
- Download the installer from: https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC
- Install IntelliJ from the installer

### 3. Install GIT
- Download the Git installer from: https://github.com/git-for-windows/git/releases/download/v2.45.2.windows.1/Git-2.45.2-64-bit.exe
- Install Git from the installer

### 4. Clone the Course Repository
- Open a terminal or command prompt
- Navigate to the directory where you want to clone the repository
- Run the following command: `git clone git@github.com:urica/itschool.git`

### 5. Open the Project in IntelliJ
- Launch IntelliJ
- Click on "Open" and navigate to the directory where you cloned the repository
- Select the project folder and click "Open"

### 6. Set up the Project SDK
- In IntelliJ, go to "File" > "Project Structure" > "Project"
- Under "Project SDK," select the Java 17 installation you downloaded earlier
- Click "OK" to apply the changes

### 7. Run the Sample Application
- In the project explorer, locate the `Main.java` file in the `src` directory
- Right-click on the `Main.java` file and select "Run 'Main.main()'"
- The sample application should now be running, and you should see the output in the console

If you encounter any issues or have additional questions, please don't hesitate to ask your instructor or refer to the course materials.