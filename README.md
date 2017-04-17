# apache-spark-source-eclipse-setup
* Step 1: Install Bash on Windows 10 https://www.howtogeek.com/249966/how-to-install-and-use-the-linux-bash-shell-on-windows-10/
* Step 2: Download Source code from github https://github.com/apache/spark/tree/v2.1.0
* Step 3: Open powershell, go to code directory, run command "mvn clean package eclipse:eclipse" http://www.beingsoftwareprofessional.com/2016/02/15/apache-spark-building-applications-with-maven-eclipse/
* Step 4: Import projects by using "Maven existing projects"
* Step 5: Remove build path entries missing issue, in Build path
* Step 6: In Build path, Change JRE System Library to JDK 1.8 directly instead of default "JavaSE-1.*"
* Step 7: In all projects, if any includes genereted code, add Source Folder for generated code
* Step 8: Using Ubuntu Bash(installed at step 1), cd build, then run command "spark-build-info 2.10 2.10"(2.10 could be other version number you checked out), the file "spark-version-info.properties" will be generated in folder build/2.10. Then copy this properties file to example/src/main/resources/
