package com.ll;

public class objectNequals {
    public static void main(String[] args) {
        사람 a사람1 = new 사람("홍길동", 22);
        사람 a사람2 = new 사람("홍길동", 22);

        if ( a사람1.equals("ㅋㅋ") )
        {
            System.out.println("거짓1");
        }

        if ( a사람1 == a사람2) 
        {
            System.out.println("참1");
        }

        if ( a사람1.equals(a사람2) ) //동치성 비교가 아닌 동등성(둘의 스펙 비교) 비교
        {
            System.out.println("참1");
        }
    }
}

class 사람 {
    String 이름;
    int 나이;
    사람(String 이름, int 나이) {
        this.이름 = 이름;
        this.나이 = 나이;
    }

    @Override
    public boolean equals(Object o) {
        if ( o instanceof 사람 == false ) {
            return false;
        }

        사람 other = (사람)o;

        if ( !이름.equals(other.이름) ) {
            return false;
        }

        if ( this.나이 != other.나이 ) {
            return false;
        }

        return true;
    }
}

