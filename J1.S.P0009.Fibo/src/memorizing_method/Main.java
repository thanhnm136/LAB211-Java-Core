/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorizing_method;

/**
 *
 * @author Minh Thanh
 */
public class Main {
    public static void main(String[] args) {
        FiboView view = new FiboView();
        FiboCalculator cal = new FiboCalculator();
        int n = 45;
        int[] arr = cal.fib1(n);
        view.displayFiboSequences(arr);
        view.displayFiboSequences2();
    }
}
