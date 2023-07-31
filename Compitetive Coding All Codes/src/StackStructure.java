package Compitetive.ProgramingClasses;

import java.util.Scanner;

public class StackStructure {
    private int pointer = -1;
    private int[] stack;
    private int size;
    public StackStructure(int size){
        stack = new int[size];
        this.size = size;
    }
    void push(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to push: ");
        int temp = sc.nextInt();
        if(pointer == size-1){
            System.out.println("Stack is full");
            return;
        }else{
            stack[++pointer]= temp;
        }
    }
    void pop(){
        if(pointer == -1){
            System.out.println("Popping is not possible.");
        }else{
            pointer--;
        }
    }
    void print(){
        for(int i = pointer ; i>=0 ; i--){
            System.out.print(stack[i]+" ");
        }
    }
    boolean isEmpty(){
        if(pointer == -1){
            return true;
        }
        return false;
    }
    boolean isFull(){
        if(pointer == size-1){
            return true;
        }
        return false;
    }
}
class StackTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no");
        int num = sc.nextInt();
        StackStructure st = new StackStructure(num);
        for(int i = 0 ; i<num ; i++){
            st.push();
        }
//        st.push();
//        for(int i = 0 ; i<num ; i++){
//            st.pop();
//        }
//        st.pop();
        System.out.println("stack printing");
        st.print();
    }
}
