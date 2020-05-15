public class SingletonPatternMain {

    public static void main(String[] args){
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        singletonPattern.showMessage();
    }
}
