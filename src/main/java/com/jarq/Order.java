package com.jarq;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private int id;

    private String date;
    private String order1;
    private String order2;
    private String order3;
    private String order4;
    private String order5;
    private String order6;
    private int number1;
    private String order7;
    private double number2;
    private double number3;
    private double number4;
    private String order8;
    private int number5;
    private String order9;

    public Order() {
    }

    public Order(String date, String order1, String order2, String order3, String order4, String order5, String order6, int number1, String order7, double number2, double number3, double number4, String order8, int number5, String order9) {
        this.date = date;
        this.order1 = order1;
        this.order2 = order2;
        this.order3 = order3;
        this.order4 = order4;
        this.order5 = order5;
        this.order6 = order6;
        this.number1 = number1;
        this.order7 = order7;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
        this.order8 = order8;
        this.number5 = number5;
        this.order9 = order9;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrder1() {
        return order1;
    }

    public void setOrder1(String order1) {
        this.order1 = order1;
    }

    public String getOrder2() {
        return order2;
    }

    public void setOrder2(String order2) {
        this.order2 = order2;
    }

    public String getOrder3() {
        return order3;
    }

    public void setOrder3(String order3) {
        this.order3 = order3;
    }

    public String getOrder4() {
        return order4;
    }

    public void setOrder4(String order4) {
        this.order4 = order4;
    }

    public String getOrder5() {
        return order5;
    }

    public void setOrder5(String order5) {
        this.order5 = order5;
    }

    public String getOrder6() {
        return order6;
    }

    public void setOrder6(String order6) {
        this.order6 = order6;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public String getOrder7() {
        return order7;
    }

    public void setOrder7(String order7) {
        this.order7 = order7;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getNumber3() {
        return number3;
    }

    public void setNumber3(double number3) {
        this.number3 = number3;
    }

    public double getNumber4() {
        return number4;
    }

    public void setNumber4(double number4) {
        this.number4 = number4;
    }

    public String getOrder8() {
        return order8;
    }

    public void setOrder8(String order8) {
        this.order8 = order8;
    }

    public int getNumber5() {
        return number5;
    }

    public void setNumber5(int number5) {
        this.number5 = number5;
    }

    public String getOrder9() {
        return order9;
    }

    public void setOrder9(String order9) {
        this.order9 = order9;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", order1='" + order1 + '\'' +
                ", order2='" + order2 + '\'' +
                ", order3='" + order3 + '\'' +
                ", order4='" + order4 + '\'' +
                ", order5='" + order5 + '\'' +
                ", order6='" + order6 + '\'' +
                ", number1=" + number1 +
                ", order7='" + order7 + '\'' +
                ", number2=" + number2 +
                ", number3=" + number3 +
                ", number4=" + number4 +
                ", order8='" + order8 + '\'' +
                ", number5=" + number5 +
                ", order9='" + order9 + '\'' +
                '}';
    }
}
