/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

/**
 *
 * @author Patiwet
 */
public class DynamicArray {
    private int[] arr;
    private int capacity;
    private int size; // Last element can be indexed at size-1

    public DynamicArray(int cap){ // Class Constructor
        arr = new int[cap];
        capacity = cap;
    }

    public void pushBack(int data){
        // FIXED THIS
        if ( size != capacity ){
            arr[size] = data ;
            size++ ;
        }else {
            int[] temparr = new int[2*capacity] ;
            for ( int i = 0 ; i < size ; i++ ){
                temparr[i] = arr[i] ;
            }
            capacity *= 2 ;
            arr = temparr ;
            arr[size] = data ;
            size++ ;
        }

    }
    public int popBack(){
        // FIXED THIS
        if ( isEmpty() ) {
            System.out.println("ERROR");
        }else {
            arr[size] = 0 ;
            size-- ;
            return arr[size];
        }
        return 0;
    }

    public int get(int i){
        // FIXED THIS
        if ( isEmpty() ) {
            System.out.println("ERROR");
            return 0 ;
        }else {
            return arr[i];
        }

    }
    public void set(int i, int value){
        // FIXED THIS
        if ( isEmpty() && i < 0 && i >= size ){
            System.out.println("ERROR");
        }else {
            arr[i] = value ;
        }

    }

    public void remove(int i){
        // FIXED THIS
        if ( isEmpty() && i < 0 && i >= size) {
            System.out.println("ERROR");
        }else {
            arr[i] = 0 ;
            //int[] temparr = arr ;
            for ( int j = i ; j < size ; j++ ){
                arr[i] = arr[i+1] ;
            }
        }
    }

    public boolean isEmpty(){
        // FIXED THIS
        return size == 0;
    }

    public int getSize(){
        // FIXED THIS
        return size;
    }

    public void printStructure(){
        // FIXED THIS
        System.out.print("Size = " + size + ", Cap = " + capacity + ", arr = [ " );
        for ( int i = 0 ; i < size ; i++ ) {
            if (i != (size-1 ) ) {
                System.out.print(arr[i] + " , ") ;
            } else {
                System.out.print(arr[i]);
                }
            }
            System.out.println(" ]");
        }

}
