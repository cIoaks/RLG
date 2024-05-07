@echo off
javac -d bin commands\commands.java
javac -d bin randomizers\*.java
javac -d bin loadout\LoadoutRandomizer.java
java -cp bin loadout.LoadoutRandomizer
pause