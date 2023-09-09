import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     bubble(create());
    }
    public static int[] create(){
        int [] mass = new int[6];
        for (int i = 0; i < mass.length; i++) {
            mass[i]= (int) (Math.random()*21-10); //генерирует числа от -10 до 10
        }
        System.out.println(Arrays.toString(mass));
        return mass;
    }
    public static void bubble(int [] mass) {
        boolean sorting=false;
        int a;
        while (! sorting){
            sorting=true;
            for (int i = 0; i < mass.length-1; i++) {
                if (mass[i]>mass[i+1]){
                    sorting=false;
                    a=mass[i];
                    mass[i]=mass[i+1];
                    mass[i+1]=a;
                }
            }
        }
        System.out.println("отсортированный массив - " + Arrays.toString(mass));
    }
}
