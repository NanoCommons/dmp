all: README.md DMP.md

%.md : %.i.md createMarkdown.groovy
	@echo "Creating $@"
	@groovy createMarkdown.groovy $< NanoCommons 731032 > $@
