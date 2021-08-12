EXAMPLES:=$(wildcard ../Examples/*.tj)
EXAMPLES1:=$(wildcard ../Examples/Comments1.tj)

export CLASSPATH=".:/Users/tjlambert/Documents/LanguageProject/Language/antlr/antlr-4.9.2-complete.jar"

all: newTests

tests: $(EXAMPLES)
	$(foreach file, $(EXAMPLES) \
	echo $(file) \
	&& java -Xmx500M -cp "/Users/tjlambert/Documents/LanguageProject/Language/antlr/antlr-4.9.2-complete.jar:$(CLASSPATH)" org.antlr.v4.gui.TestRig TJ file -gui $(file)\
	)

newTests:
	echo "New tests example set: $(EXAMPLES)"
	eval './CompileScript.sh $(EXAMPLES)'