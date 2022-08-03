
import java.util.*;
import java.lang.*;
import java.io.*;


class word {
    private String c;
    private char[] cc;

    public word(String c) {
        this.c = c;
        this.cc = new char[c.length()];
        for (int i = 0; i < c.length(); i++) {
            cc[i] = c.charAt(i);
        }
    }

    public String getWord() {
        return c;
    }

    public int getIndex(char[] f, char ff) {
        for (int i = 0; i < f.length; i++) {
            if (f[i] == ff) {
                return i;
            }
        }
        return ff;
    }

    public void getInfo(String a) {
        char[] aa = new char[a.length()];
        for (int i = 0; i < c.length(); i++) {
            aa[i] = a.charAt(i);
        }


        for (int i = 0; i < aa.length; i++) {
            CharSequence y = new StringBuilder(1).append(aa[i]);
            if (c.contains(y)) {
                if (cc[i] == aa[i]) {
                    System.out.print('T');
                }

                else {
                    System.out.print('M');
                }
            }

            else {
                System.out.print('F');
            }
        }
    }
}

class test {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  
        word w = new word("plane");

        System.out.print("Is it your first time here? (Y/N): ");
        char ans = input.next().charAt(0);

        if (ans == 'Y') {
            System.out.println("Enter a word with 5 letters. T means that your input exists in the word to find and you have guessed its correct index as well.");
            System.out.println("Meanwhile, M means that your input char clearly exists in the word, but you better place it at some other index. \nF means that it doesn't even exists in the word.");
            System.out.print("now let's make a guess: ");
        }

        else {
            System.out.print("make a guess: ");
        }

        for (int i = 0; i < 6; i++) {
            
            String g = input.next();
            w.getInfo(g);
            if (g.equals(w.getWord())) {
                System.out.println("\nCongraturations! you got the answer.");
                break;
            }
            else {
                System.out.println("\nTry again. Your next guess: ");
            }
            
        }

        input.close();



        
    }
}
