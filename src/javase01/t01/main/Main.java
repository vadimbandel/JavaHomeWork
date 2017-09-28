package javase01.t01.main;

import javase01.t01.logic.Logic;

public class Main {

    public static void main(String[] args) {
        Logic logic = new Logic();
        System.out.println(logic.method());
    }
}

//Команды, которые я вбивал в консоли:
//C:\Users\wlya\Documents\IdeaProjects\JavaHomeWork>md .\bin
//C:\Users\wlya\Documents\IdeaProjects\JavaHomeWork>javac -sourcepath .\src -d bin src\javase01\t01\main\Main.java
//C:\Users\wlya\Documents\IdeaProjects\JavaHomeWork>java -classpath .\bin javase01.t01.main.Main