# Written by Steve Hawley and used inside Xamarin.Binding-Tools-for-Swift Interface Parser and edited to fit this project

### Local information to paste to Terminal to test [Temporary]
# export CLASSPATH=".:/Users/tjlambert/Documents/LanguageProject/Language/antlr/antlr-4.9.2-complete.jar:$CLASSPATH"
# alias antlr4='java -Xmx500M -cp "/Users/tjlambert/Documents/LanguageProject/Language/antlr/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.Tool'
# alias grun='java -Xmx500M -cp "/Users/tjlambert/Documents/LanguageProject/Language/antlr/antlr-4.9.2-complete.jar:$CLASSPATH" org.antlr.v4.gui.TestRig'

ANTLRJAR=antlr/antlr-4.9.2-complete.jar
ANTLR=java -jar $(ANTLRJAR)
CLASSPATH=.:$(ANTLRJAR)

GRAMMAR=Language.g4

CSOUTDIR=CSParser
JAVAOUTDIR=JavaParser
CSFINALOUTPUT=./GeneratedParser

JDK_VERSION=$(shell ls /usr/local/Cellar/openjdk | sort -V | tail -n 1)
JDK_PATH="/usr/local/Cellar/openjdk/$(JDK_VERSION)"
JAVA_HOME=$(JDK_PATH)

all: $(ANTLRJAR) cs

# download antlr on demand
$(ANTLRJAR):
	curl --location --create-dirs --output $(ANTLRJAR) https://www.antlr.org/download/antlr-4.9.2-complete.jar

# this just builds the grammar to verify that it's correct
# The output java files can be user with antlr's built-in tools for
# printing parse trees from test files

grammar: $(GRAMMAR) $(JAVAOUTDIR)
	$(ANTLR) -o $(JAVAOUTDIR) $(GRAMMAR)
	javac -classpath $(CLASSPATH) $(JAVAOUTDIR)/*.java

cs: grammar $(CSOUTDIR) $(CSFINALOUTPUT)
	$(ANTLR) -Dlanguage=CSharp -o $(CSOUTDIR) $(GRAMMAR)
	cp $(CSOUTDIR)/*.cs $(CSFINALOUTPUT)

$(JAVAOUTDIR):
	mkdir $@

$(CSOUTDIR):
	mkdir $@

$(CSFINALOUTPUT):
	mkdir -p $@

clean:
	rm -rf *.tokens *.interp $(JAVAOUTDIR) $(CSOUTDIR) $(CSFINALOUTPUT)/*.cs

squeakyclean: clean
	rm -rf antlr