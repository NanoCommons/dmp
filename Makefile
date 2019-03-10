all: DMP.md

DMP.md: DMP.i.md
	@groovy createMarkdown.groovy DMP.i.md NanoCommons 731032 > DMP.md
