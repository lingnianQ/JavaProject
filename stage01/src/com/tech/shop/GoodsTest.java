package com.tech.shop;

import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args) {
        Goods[] shopCar = new Goods[50];
        //while循环使得不断给用户提示输入
        while (true) {
            System.out.println("输入如下命令：");
            System.out.println("添加商品：add");
            System.out.println("查询商品：query");
            System.out.println("修改商品数量：update");
            System.out.println("结算商品金额：pay");
            Scanner sc = new Scanner(System.in);
            System.out.println("请你输入命令：");
            String command = sc.next();
            //switch匹配命令操作
            switch (command) {
                case "add":
                    add(shopCar, sc);
                    break;
                case "query":
                    query(shopCar);
                    break;
                case "update":
                    update(shopCar, sc);
                    break;
                case "pay":
                    pay(shopCar);
                    break;
                default:
                    System.out.println("命令错误");
            }
        }
    }

    //添加商品函数
    public static void add(Goods[] shopCar, Scanner sc) {
        System.out.println("输入购买商品的编号：");
        int id = sc.nextInt();
        System.out.println("输入购买商品名称：");
        String name = sc.next();
        System.out.println("输入购买商品数量：");
        int buyNumber = sc.nextInt();
        System.out.println("输入购买商品价格：");
        double price = sc.nextDouble();

        //将商品封装为一个对象
        Goods g = new Goods();
        g.id = id;
        g.name = name;
        g.buyNumber = buyNumber;
        g.price = price;

        //存入数组
        for (int i = 0; i < shopCar.length; i++) {
            if (shopCar[i] == null) {
                shopCar[i] = g;
                break;
            }
        }
        System.out.println("商品：" + g.name + "添加完成！");
    }

    //查询商品函数
    public static void query(Goods[] shopCar) {
        System.out.println("-----------购物车信息---------");
        System.out.println("编号\t\t名称\t\t价格\t\t购买数量");
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                System.out.println(g.id + "\t\t" + g.name + "\t\t" + g.price + "\t\t" + g.buyNumber);
            } else {
                break;
            }
        }

    }

    //修改商品购买数量函数
    public static void update(Goods[] shopCar, Scanner sc) {
        System.out.println("输入修改商品的id");
        int id = sc.nextInt();
        Goods g = getGoodsById(shopCar, id);
        if (g == null) {
            System.out.println("sorry，无该商品");
        } else {
            System.out.println("输入：" + g.name + "商品最新购买数量");
            int buyNumber = sc.nextInt();
            g.buyNumber = buyNumber;
            System.out.println("修改成功");
            query(shopCar);
        }
    }

    //定义一个getGoodsById函数来确认输入id是否存在与匹配
    public static Goods getGoodsById(Goods[] shopCar, int id) {
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {

                if (g.id == id) {
                    return g;
                }
            } else {
                return null;
            }
        }
        return null;
    }

    //计算总金额函数
    public static void pay(Goods[] shopCar) {
        double sum = 0;
        for (int i = 0; i < shopCar.length; i++) {
            Goods g = shopCar[i];
            if (g != null) {
                sum += (g.buyNumber * g.price);
            } else {
                break;
            }
        }
        System.out.println("购物车总金额：" + sum);
    }
}
