public class PrintThreadName {
    private String thName;
    private Object lock = new Object();
    public PrintThreadName () {
        this.thName = "Default Name";
    }
    public PrintThreadName(String thName) {
        this.thName = thName;
    }
    public void setName(String thName) {
        this.thName = thName;
    }
    public void printName() {
        System.out.println(thName);
    }
}