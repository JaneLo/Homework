package com.company.Decomposition;

public class TestDecomposition {

    public static void main (String args []){
        int m = 10;
        int[] a = new int[100];
        dec(m, m, 0, a);
    }


    /*
      n - осталось набрать слагаемых на сумму n
      k - слагаемые не больше k
      i - номер очередного слагаемогo
    */
    static void dec(int n, int k, int i, int a[]) {
        if ( n < 0 ) return;
        if ( n == 0 ) {
           int j;
            System.out.print(a[0]);
            for (j = 1; j < i; j++) {
                System.out.print(" + " + a[j]);
            }
            System.out.println("\n");

        } else {
            if ( n - k >= 0) {
                a[i] = k; // фиксируем i-ое слагаемое
                dec(n - k, k, i + 1, a);
            }

            if ( k - 1 > 0) {
                dec(n, k - 1, i, a);
            }
        }
    }

}
