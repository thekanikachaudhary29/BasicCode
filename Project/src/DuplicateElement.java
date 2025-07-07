//import java.util.Arrays;
//import java.util.HashSet;
//
//public class DuplicateElement {
//    public static void main(String[] args) {
//        String str[] = {"Kanika", "Hina", "Kanika", "Saurabh", "Hina"};
//        System.out.println(Arrays.toString(str));
////        Boolean flag = true;
////        for(int i=0; i<str.length; i++) {
////            for(int j=i+1; j<str.length; j++) {
////             if(str[i]==str[j]) {
////                System.out.println("Found Duplicate element"+str[i]);
////                 flag = false;
////                 System.out.println(""+flag);
////             }
////            }
////        }
////        if (flag == true) {
////            System.out.println("Duplicate element not found" );
////        }
//        Boolean flag = false;
//        HashSet<String>langs = new HashSet();
////        for(String l : str) {
////             System.out.println(langs.add(l));
////             flag = true;
////        }
//        for(String l : str) {
//            // add() returns false if l is already in the set, meaning duplicate found
//            if (!langs.add(l)) {
//                flag = true;  // Duplicate found
//            }
//        }
//        if(flag == false) {
//            System.out.println("Duplicate Not found");
//        } else {
//            System.out.println("Duplicate found");
//        }
//
//    }
//}
import java.util.Arrays;
import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {
        String str[] = {"Kanika", "Hina", "Kanika", "Saurabh", "Hina"};
        System.out.println(Arrays.toString(str));

        boolean flag = false;
        HashSet<String> langs = new HashSet<>();

        for(String l : str) {
            // add() returns false if l is already in the set, meaning duplicate found
            if (!langs.add(l)) {
                flag = true;  // Duplicate found
            }
        }

        if(flag == false) {
            System.out.println("Duplicate Not found");
        } else {
            System.out.println("Duplicate found");
        }
    }
}
