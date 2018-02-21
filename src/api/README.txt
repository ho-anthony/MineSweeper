This is the folder where Javadoc files will reside.  Note that the Java
sources to be documented are one folder up from this one.  From a terminal
shell, you will change to this directory and run the javadoc command like so:

$ cd <project path>/src/edu/balboa/apcs/MineSweeper/api
$ javadoc ../*.java

Remember that you will need to add the resulting files to the git 
repository after they are generated.  While still in the api directory:

$ git add .
$ git commit -m "YOUR COMMENT HERE"
$ git push
