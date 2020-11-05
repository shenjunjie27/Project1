package com.roob.module1.date918;

import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;

public class Kmeans {
    int number;// 分成多少类
    int m;// 迭代的次数
    int Length;// 数据集的长度，本次数据为10
    Random random;//随机对象
    ArrayList<float[]> data;// 存放输入数据的链表
    ArrayList<float[]> center;// 存放质心的链表
    ArrayList<ArrayList<float[]>> type; // 存放各类
    ArrayList<Float> errorSqure;// 误差平方和

    public void setNumber(int number) {//setter函数
        this.number = number;
    }

    public Vector<Integer> getRandomNumberNoRepeat(int n, int max) {//获取n个0到max的随机整数（不包括max）
        Random r = new Random();
        Vector<Integer> v = new Vector<Integer>();
        int count = 0;
        while (count < n) {
            int number = r.nextInt(max);//判断number是否在集合中存在
            if (!v.contains(number)) {//不在集合中，那么添加这个元素
                v.add(number);
                count++;
            }
        }
        return v;
    }

    public void initCenter() {//获取初始聚类中心,在初始的点中随机选择n个点作为初始聚类中心
        ArrayList<float[]> center0 = new ArrayList<>();
        Vector v = getRandomNumberNoRepeat(this.number, this.data.size());
        for (int i = 0; i < v.size(); i++) {
            int p = (int) v.get(i);
            center0.add(data.get(p));
        }
        this.center = center0;
    }

    public float distance(float[] a, float[] b) {
        float x = a[0] - b[0];
        float y = a[1] - b[1];
        float z = x * x + y * y;
        float z0 = (float) Math.sqrt(z);
        return z0;
    }

    public int minDistance(float[] distance) {
        float minDistance = distance[0];
        int minLocation = 0;
        for (int i = 1; i < distance.length; i++) {
            if (distance[i] < minDistance) {
                minDistance = distance[i];
                minLocation = i;
            } else if (distance[i] == minDistance) {
                if (random.nextInt(10) < 5) {
                    minLocation = i;
                }
            }
        }
        return minLocation;
    }

    public void typeSet() {
        float[] distance = new float[number];
        for (int i = 0; i < Length; i++) {
            for (int j = 0; j < number; j++) {
                distance[j] = distance(data.get(i), center.get(j));
            }
            int minLocation = minDistance(distance);
            type.get(minLocation).add(data.get(i));
        }
    }

    public float errorSquare(float[] a, float[] b) {
        float x = a[0] - b[0];
        float y = a[1] - b[1];
        return (x * x + y * y);
    }

    public void calculateErrorSqure() {
        float a = 0;
        for (int i = 0; i < type.size(); i++) {
            for (int j = 0; j < type.get(i).size(); j++) {
                a += errorSquare(type.get(i).get(j), center.get(i));
            }
        }
        errorSqure.add(a);
    }

    public void getNewCenter() {//获取新的质心
        for (int i = 0; i < number; i++) {
            int n = type.get(i).size();
            if (n != 0) {
                float[] newCenter = {0, 0};
                for (int j = 0; j < n; j++) {
                    newCenter[0] += type.get(i).get(j)[0];
                    newCenter[1] += type.get(i).get(j)[1];
                }
                newCenter[0] = newCenter[0] / n;
                newCenter[1] = newCenter[1] / n;
                center.set(i, newCenter);
            }
        }
    }

    public void printMission(ArrayList<float[]> dataArray, String Name) {//输出打印用
        for (int i = 0; i < dataArray.size(); i++) {
            System.out.println(Name + "[" + i + "]=("
                    + dataArray.get(i)[0] + "," + dataArray.get(i)[1] + ")");
        }
        System.out.println("---------------------------------------");
    }

    public void kmeansAlgorithm() {
        m = 0;
        random = new Random();
        Length = data.size();
        initCenter();
        ArrayList<ArrayList<float[]>> type0 = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            type0.add(new ArrayList<>());
        }
        type = type0; // 类别初始化
        errorSqure = new ArrayList<>();//初始化
        while (true) {
            typeSet(); // 生成类别
            calculateErrorSqure();// 计算误差平方和
            if (m > 0) {//直到质心不再变化 break
                if (errorSqure.get(m) - errorSqure.get(m - 1) == 0) {
                    break;
                }
            }
            getNewCenter();// 得到新质心
            m++;
            type.clear(); // 清空
            ArrayList<ArrayList<float[]>> type1 = new ArrayList<>();
            for (int i = 0; i < number; i++) {
                type1.add(new ArrayList<>());
            }
            type = type1;
        }
    }

    public static void main(String[] args) {
        Kmeans kmeansObject = new Kmeans();
        kmeansObject.setNumber(3);//设置分的组数
        ArrayList<float[]> dataInput = new ArrayList<>();
        dataInput.add(new float[]{0, 0});
        dataInput.add(new float[]{3, 8});
        dataInput.add(new float[]{2, 2});
        dataInput.add(new float[]{1, 1});
        dataInput.add(new float[]{5, 3});
        dataInput.add(new float[]{4, 8});
        dataInput.add(new float[]{6, 4});
        dataInput.add(new float[]{5, 4});
        dataInput.add(new float[]{6, 4});
        dataInput.add(new float[]{7, 5});
        kmeansObject.data = dataInput;//输入数据
        kmeansObject.kmeansAlgorithm();//执行算法
        ArrayList<ArrayList<float[]>> result = kmeansObject.type;//得到结果
        System.out.println("分类结果:");
        for (int i = 0; i < result.size(); i++) {
            kmeansObject.printMission(result.get(i), "点[" + i + "]");
        }
    }

}