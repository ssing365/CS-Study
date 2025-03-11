/**

📌 헷갈리는 핵심 개념 정리
✅ 메서드는 오버라이딩 시 "동적 바인딩"

실제 객체 타입(D)의 메서드를 실행
즉, a.getX()는 B 타입이지만 D의 getX()가 실행됨
✅ 변수(필드)는 선언된 타입 기준 ("정적 바인딩")

a.x는 B 타입으로 선언되었으므로 B의 x = 3을 참조
반면 b.x는 D 타입이므로 D의 x = 7을 참조

 */

 public class Main {
    public static void main(String[] args) {
        B a = new D();  // 부모 타입(B)으로 자식 객체(D) 생성
        D b = new D();  // 자식 타입(D)으로 자식 객체(D) 생성

        System.out.println(a.getX() + a.x + b.getX() + b.x);
    }
}

class B {
    int x = 3;  // 필드(멤버 변수)
    
    int getX() {  // 메서드
        return x * 2;
    }
}

class D extends B {
    int x = 7;  // 필드 (B의 x를 가리지 않음, 새로 선언된 변수)
    
    int getX() {  // 메서드 오버라이딩
        return x * 3;
    }
}
