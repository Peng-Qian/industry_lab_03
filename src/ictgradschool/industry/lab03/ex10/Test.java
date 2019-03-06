package ictgradschool.industry.lab03.ex10;

public class Test {

    public void start(){
        String[] stringsA = new String[]{"A","B","C"};
        printArray(stringsA);
        String[] stringsB = new String[]{"D","F","G"};
        String[] stringsC = new String[3];
        printArray(stringsB);
        printArray(stringsC);
        stringsC=stringsA;
        printArray(stringsA);
        printArray(stringsB);
        printArray(stringsC);
        stringsC[1]="H";
        printArray(stringsA);
        printArray(stringsB);
        printArray(stringsC);
    }

    public void printArray(String[] strings){
        for(int i=0;i<strings.length;i++){
            System.out.print("["+strings[i]+"] ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Test demo = new Test();
        demo.start();
    }
}
