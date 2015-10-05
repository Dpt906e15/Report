@echo off
cls
cmd /c pdflatex report
cmd /c bibtex report
cmd /c bibtex report
cmd /c pdflatex report
cmd /c pdflatex report
del report.aux
del report.bbl
del report.blg
del report.out
del report.thm
del report.toc
del report.brf
move /Y report.log log
cmd /k