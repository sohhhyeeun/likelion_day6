package com.ll;

public class toString {
    public static void main(String[] args) {
        사람 a사람1 = new 사람("홍길동", 23);
        사람 a사람2 = new 사람("홍길순", 22);
        System.out.println(a사람1);
        System.out.println(a사람2);
    }
}
class 사람 extends Object {
    String 이름;
    int 나이;
    사람(String 이름, int 나이) {
        this.이름 = 이름;
        this.나이 = 나이;
    }

    @Override
    public String toString() {
        return "사람[이름=" + 이름 + ",나이=" + 나이 + "]";
    }
}
