## Install Groovy on Windows

1. Go here http://groovy-lang.org/download.html

2. Click Windows Installer and click next a bunch of times until it is installed.

---

## Install Groovy on Ubuntu 20.04

### Install Open JDK
Install OpenJDK 14 version
`sudo apt install openjdk-14-jdk*`
`sudo apt install openjdk-14-jre*`

edit your .bashrc file
`vi ~/.bashrc`
add the following 2 lines to the end of the file
```
export JAVA_HOME=/usr/lib/jvm/java-14-openjdk-amd64/
export PATH=$JAVA_HOME/bin:$PATH
```

Source .bashrc so changes take effect
`source ~/.bashrc`

### Install Groovy 3.x
`sudo snap install groovy --classic`

---

## Install Groovy on Mac
1. Update Java to at least Java 7 in the System Preferences Java Control Panel

2. Type in Terminal /usr/libexec/java_home -V
to get something like
1.7.0_55, x86_64:	"Java SE 7"	/Library/Java/JavaVirtualMachines/jdk1.7.0_55.jdk/Contents/Home

3. Type in terminal export JAVA_HOME=`/usr/libexec/java_home -v 1.7.0_55, x86_64`

4. Type in terminal java -version and make sure you have at least Java 7

5. Install HomeBrew at http://brew.sh/

6. Type in terminal brew install groovy

---

### Update Atom for Groovy
In Atom Open Command Palette -> Install Packages Themes -> Type `language-groovy` and install

---

## Run Groovy code
Groovy files have the extension `.groovy`. You can run a groovy file at the terminal with:
`groovy myfile.groovy`

---

## Using this tutorial

This tutorial is a reformatting of the [groovy tutorial from Derek Banas](https://www.newthinktank.com/2016/04/groovy-tutorial/). If you have at least one programming language under your belt, you should be able to look at the code examples in each chapter to figure out the basics. 

---

## Nextflow 

If you're going through this tutorial to familiarive yourself groovy before learning nextflow, you will be fine going through chapters 1 to 12. 
