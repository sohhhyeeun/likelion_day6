package com.ll;

public class toString {
    public static void main(String[] args) {
        n사람 a사람1 = new n사람("홍길동", 22);
        n사람 a사람2 = new n사람("홍길동", 22);

        if ( a사람1.equals("ㅋㅋ") )
        {
            System.out.println("거짓1");
        }

        if ( a사람1.equals(a사람2) )
        {
            System.out.println("참1");
        }
    }
}

class n사람 {
    String 이름;
    int 나이;

    n사람(String 이름, int 나이) {
        this.이름 = 이름;
        this.나이 = 나이;
    }

    @Override
    public boolean equals(Object o) {
        // 사람인지 먼저 체크
        if ( o instanceof n사람 == false ) {
            return false;
        }

        n사람 other = (n사람)o;

        if ( 이름.equals(other.이름) == false ) {
            return false;
        }

        if ( this.나이 != other.나이 ) {
            return false;
        }

        return true;
    }
}


