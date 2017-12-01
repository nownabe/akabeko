JAVA    = java
KOTLINC = $(HOME)/.sdkman/candidates/kotlin/1.2.0/bin/kotlinc
SOURCE  = HelloWorld.kt
JAR     = HelloWorld.jar

.PHONY: run
run: $(JAR)
	$(JAVA) -jar $(JAR)

$(JAR):
	$(KOTLINC) $(SOURCE) -include-runtime -d $(JAR)
