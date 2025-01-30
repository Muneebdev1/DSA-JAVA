2001  mkdir dsa
 2002  cd dsa/
 2003  ls
 2004  clear
 2005  git init
 2006  ls -al
 2007  ls -a
 2008  touch code.java
 2009  rm code.java 
 2010  touch Readme.md
 2011  ls
 2012  git status
 2013  git add Readme.md 
 2014  git status
 2015  git commit -m "Empty File"
 2016  git status
 2017  vi Readme.md 
 2018  cat Readme.md 
 2019  git status
 2020  git add .
 2021  git status
 2022  git restore --staged Readme.md 
 2023  git status
 2024  git add .
 2025  git commit -m "The file has now my name in it"
 2026  git status
 2027  git log
 2028  clear
 2029  ls
 2030  rm Readme.md 
 2031  git status
 2032  git add .
 2033  git commit -m "The file is now deleted"
 2034  ls
 2035  git log
 2036  git reset 71f9b8096d750408fc13a4868be70966ebaa4168
 2037  git log
 2038  git status
 2039  git stash
 2040  git status
 2041  ls
 2042  cat Readme.md 
 2043  git status
 2044  git add .
 2045  git stash
 2046  ls
 2047  git status
 2048  git log
 2049  cat Readme.md 
 2050  git stash pop
 2051  cat Readme.md 
 2052  git stash
 2053  git stash clear
 2054  cat Readme.md 
 2055  git stash pop
 2056  clear
 2057  ls
 2058  git remote add origin https://github.com/Muneebdev1/DSA-JAVA.git
 2059  git remote -v
 2060  git push origin master
 2061  history
`