//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int len = args.length;
        if(len == 0){
            System.out.println("No Value Provided");
        }
        else {
            System.out.println("List of Arguments");
            for(int i=0; i< len; i++){
                System.out.println(args[i]);
            }
        }
    }
}