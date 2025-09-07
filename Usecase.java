public class Usecase{
    public static void main(String[] args){
        String reset = "\u001B[0m";
        String red = "\u001B[41m";
        String blue = "\u001B[44m";
        System.out.println(red + "Hello World!" + reset);
        System.out.println(blue + "\nThis Thanksgiving I'm staying home." + reset);
    }
}