package zadanie33;

import java.util.Stack;

public class Main {

        public static void main(String[] args) throws Exception {
            System.out.println("=====Program parowanie nawiasów=====");
            CharStackArray stack = new CharStackArray(10);
            stack.balanceSymbol("(2 * (3.4 - (-7)/2)*(a-2)/(b-1))") ;
            stack.display();

        }

    }

    class CharStackArray {
        private char[] array;
        private int top;
        private int capacity;

        public CharStackArray(int cap) {
            capacity = cap;
            array = new char[capacity];
            top = -1;
        }

        public void push(char data) {
            array[++top] = data;
        }

        public char pop() {
            return array[top--];
        }

        public void display() {
            for (int i = 0; i <= top; i++) {
                System.out.print(array[i] + "->");
            }
        }

        public char peek() throws Exception {
            return array[top];
        }

        /*Call this method by passing a string expression*/
        public void balanceSymbol(String str) {
            try {
                char[] arr = str.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == '[' || arr[i] == '{' || arr[i] == '(')
                        push(arr[i]);
                    else if (arr[i] == '}' && peek() == '{')
                        pop();
                    else if (arr[i] == ']' && peek() == '[')
                        pop();
                    else if (arr[i] == ')' && peek() == '(')
                        pop();
                }
                if (isEmpty()) {
                    System.out.println("Dobrze sparowany");
                } else {
                    System.out.println("Zle sparowany");
                }
            } catch (Exception e) {
                System.out.println("Zle sparowany");
            }

        }

        public boolean isEmpty() {
            return (top == -1);
        }
    }

