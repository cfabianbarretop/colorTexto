package textocolor;

public class Imprimir {
    public static void info(Object objeto){
        System.out.println("\033[32m"+objeto);
    }
    public static void err(Object objeto){
        System.out.println("\u001B[31m"+objeto);
    }
    public static void adv(Object objeto){
        System.out.println("\u001B[33m"+objeto);
    }
    public static void sal(Object objeto){
        System.out.println("\033[37m"+objeto);
    }
    public static void til(Object objeto){
        System.out.println("\033[35m"+objeto);
    }
    public static void conf(Object objeto){
        System.out.println("\033[34m"+objeto);
    }
}
