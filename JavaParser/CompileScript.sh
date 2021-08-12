#! /bin/bash

# Run "chmod 755 CompileScript.sh" for permissions
export CLASSPATH=".:/Users/tjlambert/Documents/LanguageProject/Language/antlr/antlr-4.9.2-complete.jar:$CLASSPATH"

FILES="$@"
for file in $FILES
do
echo "Compiling $file"
java -Xmx500M -cp "/Users/tjlambert/Documents/LanguageProject/Language/antlr/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig TJ file -gui $file
done
