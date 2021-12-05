JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	main.java \
	Context.java \
	DoNothingState.java \
	GoingDownState.java \
	GoingUpState.java	\
	Mediator.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class

