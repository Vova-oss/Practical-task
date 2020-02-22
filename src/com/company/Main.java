package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите максимальное число символов");
        Scanner in= new Scanner(System.in);
        int m=in.nextInt();
        Stack stack=new Stack(m);
        String[] Arr = new String[m];
        for (int i=0;i<m ; i++){
            Arr[i]=in.next();
        }


        stack.addElement(Arr[0]);
        for (int i=1;i<m;i++){
            boolean k=false;
            while(stack.top>-1 ) {
                boolean f=true;
                String value = stack.readTop();
                if (Arr[i].equals("}") && value.equals("{")) {
                     stack.deleteElement();k=true;
                    f = false;
                }
                if (Arr[i].equals(")") && value.equals("(")) {
                    stack.deleteElement();k=true;
                    f = false;
                }
                if (Arr[i].equals("]") && value.equals("[")) {
                    stack.deleteElement();k=true;
                    f = false;
                }
                if(f)break;
            }
            if(!k){stack.addElement(Arr[i]);}
        }

        if(stack.isEmpty()){System.out.print("Последовательность верная");}
        if(!stack.isEmpty()){System.out.print("Последовательность неверна");}

    }

}

class Stack {
    private int mSize;
    private String[] stackArray;
    int top;

    public Stack(int m) {
        this.mSize = m;
        stackArray = new String[mSize];
        top = -1;
    }

    public void addElement(String element) {
        stackArray[++top] = element;
    }

    public String deleteElement() {
        return stackArray[top--];
    }

    public String readTop() {
        return stackArray[top];

    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == mSize - 1);
    }
}