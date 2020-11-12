package com.roob.module1.month11;


import java.util.ArrayList;
import java.util.List;


public class PerceptronClassifier {
    public static double c = 0.5;//自定义c的值
    public static List<Double> resultList = new ArrayList<>();//存放内积的list

    public static void listAdd1(List<Double> x, double[] w) {
        int n = w.length;
        for (int i = 0; i < n; i++) {
            x.add(w[i]);
        }
    }

    public static void listAdd2(List<Double> x, double[] w) {
        int n = w.length;
        for (int i = 0; i < n; i++) {
            x.add(-w[i]);
        }
    }

    public static List<Double> getNewW(List<Double> x, List<Double> w) {//求内积
        int n = x.size();
        double result = 0;
        List<Double> newW = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result = x.get(i) * w.get(i) + result;
        }
        resultList.add(result);//存放内积

        if (result <= 0) {
            for (int i = 0; i < n; i++) {
                newW.add(c * x.get(i) + w.get(i));
            }
        } else if (result > 0) {
            for (int i = 0; i < n; i++) {
                newW.add(w.get(i));
            }
        }
        return newW;//返回一个新的变量
    }

    public static void round(List<Double> w1, List<Double> w2, List<Double> w3, List<Double> w4, List<Double> w5, List<Double> w6, List<Double> w7, List<Double> w8, List<Double> x1, List<Double> x2, List<Double> x3, List<Double> x4, List<Double> x5, List<Double> x6, List<Double> x7, List<Double> x8) {
        w2.clear();
        w2.addAll(getNewW(x1, w1));
        w3.clear();
        w3.addAll(getNewW(x2, w2));
        w4.clear();
        w4.addAll(getNewW(x3, w3));
        w5.clear();
        w5.addAll(getNewW(x4, w4));
        w6.clear();
        w6.addAll(getNewW(x5, w5));
        w7.clear();
        w7.addAll(getNewW(x6, w6));
        w8.clear();
        w8.addAll(getNewW(x7, w7));
        w1.clear();
        w1.addAll(getNewW(x8, w8));
    }


    public static void main(String[] args) {
        double[] w11 = {0, 0, 0, 1};
        double[] w12 = {1, 0, 0, 1};
        double[] w13 = {1, 0, 1, 1};
        double[] w14 = {1, 1, 0, 1};
        double[] w21 = {0, 0, 1, 1};
        double[] w22 = {0, 1, 1, 1};
        double[] w23 = {0, 1, 0, 1};
        double[] w24 = {1, 1, 1, 1};
        List<Double> x1 = new ArrayList<>();
        List<Double> x2 = new ArrayList<>();
        List<Double> x3 = new ArrayList<>();
        List<Double> x4 = new ArrayList<>();
        List<Double> x5 = new ArrayList<>();
        List<Double> x6 = new ArrayList<>();
        List<Double> x7 = new ArrayList<>();
        List<Double> x8 = new ArrayList<>();
        listAdd1(x1, w11);
        listAdd1(x2, w12);
        listAdd1(x3, w13);
        listAdd1(x4, w14);
        listAdd2(x5, w21);
        listAdd2(x6, w22);
        listAdd2(x7, w23);
        listAdd2(x8, w24);

        List<Double> w1 = new ArrayList<>();
        List<Double> w2 = new ArrayList<>();
        List<Double> w3 = new ArrayList<>();
        List<Double> w4 = new ArrayList<>();
        List<Double> w5 = new ArrayList<>();
        List<Double> w6 = new ArrayList<>();
        List<Double> w7 = new ArrayList<>();
        List<Double> w8 = new ArrayList<>();
        w1.add(-1.0);
        w1.add(-2.0);
        w1.add(-2.0);
        w1.add(0.0);
        int count_Number = 0;//计数
        while (true) {
            count_Number++;
            round(w1, w2, w3, w4, w5, w6, w7, w8, x1, x2, x3, x4, x5, x6, x7, x8);//执行一次迭代
            int n = resultList.size();
            boolean b = (resultList.get(n - 8) > 0) & (resultList.get(n - 1) > 0) & (resultList.get(n - 2) > 0) & (resultList.get(n - 3) > 0) & (resultList.get(n - 4) > 0) & (resultList.get(n - 5) > 0) & (resultList.get(n - 6) > 0) & (resultList.get(n - 7) > 0);
            if (b) {
                System.out.println("------------------------------");
                System.out.println("迭代结束：");
                System.out.println("结果为：");
                System.out.print("[");
                for (int i = 0; i < w1.size() - 1; i++) {

                    System.out.print(w1.get(i) + ",");
                }
                System.out.println(w1.get(w1.size() - 1) + "]");
                break;
            } else {
                System.out.println("这是第" + count_Number + "次迭代，目前w1为：");
                System.out.print("[");
                for (int i = 0; i < w1.size() - 1; i++) {
                    System.out.print(w1.get(i) + ",");
                }
                System.out.println(w1.get(w1.size() - 1) + "]");
            }

        }
    }
}
