package sb.com.starter;

public class ConsoleLogger implements ILogger{
    @Override
    public String writeLog() {
        System.out.println("LOG");
        return "LOG";
    }
}
